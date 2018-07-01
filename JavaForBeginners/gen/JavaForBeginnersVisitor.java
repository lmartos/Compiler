// Generated from C:/Users/Nyuu-PC/Desktop/CompilerLaurensMartos/JavaForBeginners\JavaForBeginners.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaForBeginnersParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaForBeginnersVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(JavaForBeginnersParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(JavaForBeginnersParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaForBeginnersParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(JavaForBeginnersParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#assign_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_value(JavaForBeginnersParser.Assign_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#assign_value_by_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_value_by_method(JavaForBeginnersParser.Assign_value_by_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JavaForBeginnersParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#operator_with_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_with_method(JavaForBeginnersParser.Operator_with_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_statement(JavaForBeginnersParser.Read_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVar(JavaForBeginnersParser.PrintVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printText}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintText(JavaForBeginnersParser.PrintTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInt(JavaForBeginnersParser.PrintIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFloat(JavaForBeginnersParser.PrintFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printBool}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintBool(JavaForBeginnersParser.PrintBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printCalc}
	 * labeled alternative in {@link JavaForBeginnersParser#print_to_console}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCalc(JavaForBeginnersParser.PrintCalcContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(JavaForBeginnersParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(JavaForBeginnersParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(JavaForBeginnersParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(JavaForBeginnersParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionBlock}
	 * labeled alternative in {@link JavaForBeginnersParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(JavaForBeginnersParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JavaForBeginnersParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(JavaForBeginnersParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#function_execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_execution(JavaForBeginnersParser.Function_executionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(JavaForBeginnersParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#argument_execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_execution(JavaForBeginnersParser.Argument_executionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#argument_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_type(JavaForBeginnersParser.Argument_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomValueExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomValueExpression(JavaForBeginnersParser.AtomValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignCalculationExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignCalculationExpression(JavaForBeginnersParser.AssignCalculationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minminPlusPlusExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinminPlusPlusExpression(JavaForBeginnersParser.MinminPlusPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinExpression(JavaForBeginnersParser.PlusMinExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivModExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivModExpression(JavaForBeginnersParser.MultDivModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inverseAtom}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverseAtom(JavaForBeginnersParser.InverseAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notBool}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBool(JavaForBeginnersParser.NotBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomCondExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCondExpression(JavaForBeginnersParser.AtomCondExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolOrbool}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOrbool(JavaForBeginnersParser.BoolOrboolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JavaForBeginnersParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomConditionalCheck}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomConditionalCheck(JavaForBeginnersParser.AtomConditionalCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(JavaForBeginnersParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAndBool}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAndBool(JavaForBeginnersParser.BoolAndBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomexpression}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomexpression(JavaForBeginnersParser.AtomexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomInt}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomInt(JavaForBeginnersParser.AtomIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomFloat}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomFloat(JavaForBeginnersParser.AtomFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomBoolean}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomBoolean(JavaForBeginnersParser.AtomBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomVar}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomVar(JavaForBeginnersParser.AtomVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomString}
	 * labeled alternative in {@link JavaForBeginnersParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomString(JavaForBeginnersParser.AtomStringContext ctx);
}