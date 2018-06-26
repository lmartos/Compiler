import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            String fileToParse = "examplePrograms/compiling/theLongestDecisions.jfb";
            //start parsing the given java for beginners file
            parse(fileToParse);
            //convert the resulting jasmin file to a java class
            jasminToClass(fileToParse.split("\\.")[0] + ".jasmin");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("[ERROR] Thread was interrupted check for programming errors or external interruption");
        } catch(IOException e){
            System.out.println("[ERROR] Unable to open file, check if file exists.");
            e.printStackTrace();
        }
    }

    /**
     * Parse the given jfb file
     */
    private static void parse(String filename) throws IOException {
        // Get the jasmin filename and java class from the given jfb filename
        String[] filenameParts = filename.split("\\.");
        String jasminFile = filenameParts[0] + ".jasmin";
        String className = filenameParts[0] + ".class";

        File jasmin = new File(jasminFile);
        File javaClass = new File(className);

        //delete previously generated java class files or jasmin files to ensure consistence.
        try{
            Files.deleteIfExists(jasmin.toPath());
            Files.deleteIfExists(javaClass.toPath());
        }catch(Exception e){
            //file was not found no action needed
        }
        // Create the antlr inputstream
        ANTLRInputStream inputStream = new ANTLRFileStream(filename);

        //instantiate the lexer, checker and parser
        JavaForBeginnersLexer lexer = new JavaForBeginnersLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JavaForBeginnersParser parser = new JavaForBeginnersParser(tokens);
        ParseTree tree = parser.parse();

        CodeChecker codeChecker = new CodeChecker();
        codeChecker.visit(tree);

        // generate the actual jasmin bytecode and finally write it to the jasmin file
        CodeGenerator codeGenerator = new CodeGenerator(jasminFile, codeChecker.getScopeTree(), codeChecker.getVariableAndFunctionTree(), codeChecker.getExpressionTypeTree(), codeChecker.getGlobalScope());
        codeGenerator.visit(tree);
        codeGenerator.getJasminWriter().flush();
        codeGenerator.getJasminWriter().close();
    }

    /**
     * Convert the given jasmin file to a java class file
     */
    public static void jasminToClass(String filename) throws IOException, InterruptedException{
        File jasminFile = new File(filename);
        ArrayList<String> commandList;
        if(filename.contains("/") || filename.contains("\\")){
            String nameToFind = "";
            if(filename.contains("/")){
                String[] split =  filename.split(("/"));
                nameToFind = split[split.length - 1];
            }else if(filename.contains("\\")){
                String[] split =  filename.split(("\\\\"));
                nameToFind = split[split.length - 1];
            }
            String outputDir = filename.substring(0, filename.indexOf(nameToFind));
            commandList = new ArrayList<String>(Arrays.asList("java", "-jar", "jasmin.jar", "-d", outputDir, "-g", "\"" + jasminFile.getAbsolutePath() + "\""));
        }else{
            commandList = new ArrayList<String>(Arrays.asList("java", "-jar", "jasmin.jar", "-g", "\"" + jasminFile.getAbsolutePath() + "\""));
        }
        ProcessBuilder pb = new ProcessBuilder(commandList);
        Process intermediaryProcess = pb.start();
        int intermediaryExitCode = intermediaryProcess.waitFor();

        System.exit(intermediaryExitCode);
    }
}
