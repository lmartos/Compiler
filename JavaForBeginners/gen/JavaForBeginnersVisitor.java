// Generated from C:/Users/Nyuu-PC/Desktop/new/shell/JavaForBeginners\JavaForBeginners.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link JavaForBeginnersParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(JavaForBeginnersParser.If_statementContext ctx);
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
	 * Visit a parse tree produced by the {@code atomValueExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#variable_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomValueExpression(JavaForBeginnersParser.AtomValueExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code atomCondExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCondExpression(JavaForBeginnersParser.AtomCondExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link JavaForBeginnersParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(JavaForBeginnersParser.ComparisonExpressionContext ctx);
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