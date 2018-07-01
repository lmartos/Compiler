// Generated from C:/Users/Nyuu-PC/Desktop/CompilerLaurensMartos/JavaForBeginners\JavaForBeginners.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaForBeginnersParser}.
 */
public interface JavaForBeginnersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(JavaForBeginnersParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(JavaForBeginnersParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(JavaForBeginnersParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(JavaForBeginnersParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaForBeginnersParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaForBeginnersParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(JavaForBeginnersParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(JavaForBeginnersParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#assign_value}.
	 * @param ctx the parse tree
	 */
	void enterAssign_value(JavaForBeginnersParser.Assign_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#assign_value}.
	 * @param ctx the parse tree
	 */
	void exitAssign_value(JavaForBeginnersParser.Assign_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#assign_value_by_method}.
	 * @param ctx the parse tree
	 */
	void enterAssign_value_by_method(JavaForBeginnersParser.Assign_value_by_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#assign_value_by_method}.
	 * @param ctx the parse tree
	 */
	void exitAssign_value_by_method(JavaForBeginnersParser.Assign_value_by_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JavaForBeginnersParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JavaForBeginnersParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#operator_with_method}.
	 * @param ctx the parse tree
	 */
	void enterOperator_with_method(JavaForBeginnersParser.Operator_with_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#operator_with_method}.
	 * @param ctx the parse tree
	 */
	void exitOperator_with_method(JavaForBeginnersParser.Operator_with_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(JavaForBeginnersParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(JavaForBeginnersParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void enterPrintVar(JavaForBeginnersParser.PrintVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void exitPrintVar(JavaForBeginnersParser.PrintVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printText}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void enterPrintText(JavaForBeginnersParser.PrintTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printText}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void exitPrintText(JavaForBeginnersParser.PrintTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void enterPrintInt(JavaForBeginnersParser.PrintIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void exitPrintInt(JavaForBeginnersParser.PrintIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void enterPrintFloat(JavaForBeginnersParser.PrintFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void exitPrintFloat(JavaForBeginnersParser.PrintFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printBool}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void enterPrintBool(JavaForBeginnersParser.PrintBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printBool}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void exitPrintBool(JavaForBeginnersParser.PrintBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printCalc}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void enterPrintCalc(JavaForBeginnersParser.PrintCalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printCalc}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 */
	void exitPrintCalc(JavaForBeginnersParser.PrintCalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(JavaForBeginnersParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(JavaForBeginnersParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(JavaForBeginnersParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(JavaForBeginnersParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(JavaForBeginnersParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(JavaForBeginnersParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(JavaForBeginnersParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(JavaForBeginnersParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionBlock}
	 * labeled alternative in {@link JavaForBeginnersParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(JavaForBeginnersParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionBlock}
	 * labeled alternative in {@link JavaForBeginnersParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(JavaForBeginnersParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JavaForBeginnersParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JavaForBeginnersParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(JavaForBeginnersParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(JavaForBeginnersParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#function_execution}.
	 * @param ctx the parse tree
	 */
	void enterFunction_execution(JavaForBeginnersParser.Function_executionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#function_execution}.
	 * @param ctx the parse tree
	 */
	void exitFunction_execution(JavaForBeginnersParser.Function_executionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(JavaForBeginnersParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(JavaForBeginnersParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#argument_execution}.
	 * @param ctx the parse tree
	 */
	void enterArgument_execution(JavaForBeginnersParser.Argument_executionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#argument_execution}.
	 * @param ctx the parse tree
	 */
	void exitArgument_execution(JavaForBeginnersParser.Argument_executionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForBeginnersParser#argument_type}.
	 * @param ctx the parse tree
	 */
	void enterArgument_type(JavaForBeginnersParser.Argument_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForBeginnersParser#argument_type}.
	 * @param ctx the parse tree
	 */
	void exitArgument_type(JavaForBeginnersParser.Argument_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomValueExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomValueExpression(JavaForBeginnersParser.AtomValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomValueExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomValueExpression(JavaForBeginnersParser.AtomValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignCalculationExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignCalculationExpression(JavaForBeginnersParser.AssignCalculationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignCalculationExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignCalculationExpression(JavaForBeginnersParser.AssignCalculationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minminPlusPlusExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void enterMinminPlusPlusExpression(JavaForBeginnersParser.MinminPlusPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minminPlusPlusExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void exitMinminPlusPlusExpression(JavaForBeginnersParser.MinminPlusPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinExpression(JavaForBeginnersParser.PlusMinExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinExpression(JavaForBeginnersParser.PlusMinExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivModExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpression(JavaForBeginnersParser.MultDivModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivModExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpression(JavaForBeginnersParser.MultDivModExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inverseAtom}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterInverseAtom(JavaForBeginnersParser.InverseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inverseAtom}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitInverseAtom(JavaForBeginnersParser.InverseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notBool}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterNotBool(JavaForBeginnersParser.NotBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notBool}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitNotBool(JavaForBeginnersParser.NotBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomCondExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomCondExpression(JavaForBeginnersParser.AtomCondExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomCondExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomCondExpression(JavaForBeginnersParser.AtomCondExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolOrbool}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolOrbool(JavaForBeginnersParser.BoolOrboolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolOrbool}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolOrbool(JavaForBeginnersParser.BoolOrboolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JavaForBeginnersParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JavaForBeginnersParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomConditionalCheck}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomConditionalCheck(JavaForBeginnersParser.AtomConditionalCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomConditionalCheck}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomConditionalCheck(JavaForBeginnersParser.AtomConditionalCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(JavaForBeginnersParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(JavaForBeginnersParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolAndBool}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolAndBool(JavaForBeginnersParser.BoolAndBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolAndBool}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolAndBool(JavaForBeginnersParser.BoolAndBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomexpression}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomexpression(JavaForBeginnersParser.AtomexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomexpression}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomexpression(JavaForBeginnersParser.AtomexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomInt}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomInt(JavaForBeginnersParser.AtomIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomInt}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomInt(JavaForBeginnersParser.AtomIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomFloat}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomFloat(JavaForBeginnersParser.AtomFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomFloat}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomFloat(JavaForBeginnersParser.AtomFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomBoolean}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomBoolean(JavaForBeginnersParser.AtomBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomBoolean}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomBoolean(JavaForBeginnersParser.AtomBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomVar}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomVar(JavaForBeginnersParser.AtomVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomVar}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomVar(JavaForBeginnersParser.AtomVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomString}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomString(JavaForBeginnersParser.AtomStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomString}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomString(JavaForBeginnersParser.AtomStringContext ctx);
}