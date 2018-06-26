// Generated from C:/Users/Nyuu-PC/Desktop/new/shell/JavaForBeginners\JavaForBeginners.g4 by ANTLR 4.7
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