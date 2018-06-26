// Generated from C:/Users/Nyuu-PC/Desktop/new/shell/JavaForBeginners\JavaForBeginners.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaForBeginnersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DATATYPE=6, INT=7, FLOAT=8, BOOLEAN=9, 
		STRING=10, VAR_NAME=11, COMMENT=12, SPACE=13, ASSIGN=14, SEMICOLON=15, 
		OPEN_FUNC_OR_COND=16, CLOSE_FUNC_OR_COND=17, GREATERTHAN=18, SMALLERTHAN=19, 
		GREATEROREQUALS=20, SMALLEROREQUALS=21, EQUALS=22, NOTEQUALS=23, AND=24, 
		OR=25, NOT=26, ABSOLUTE=27, EXTREME=28, PLUS=29, MINUS=30, MULTIPLY=31, 
		DIVIDE=32;
	public static final int
		RULE_parse = 0, RULE_code_block = 1, RULE_statement = 2, RULE_declare = 3, 
		RULE_assign_value = 4, RULE_if_statement = 5, RULE_condition_block = 6, 
		RULE_function_block = 7, RULE_variable_expression = 8, RULE_boolean_expression = 9, 
		RULE_atom = 10;
	public static final String[] ruleNames = {
		"parse", "code_block", "statement", "declare", "assign_value", "if_statement", 
		"condition_block", "function_block", "variable_expression", "boolean_expression", 
		"atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if_this_is_true'", "'else_if_this_is_true'", "'else_if_it_is_false'", 
		"'{'", "'}'", null, null, null, null, null, null, null, null, "'='", "';'", 
		"'('", "')'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", 
		"'!'", "'|'", "'$'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "DATATYPE", "INT", "FLOAT", "BOOLEAN", 
		"STRING", "VAR_NAME", "COMMENT", "SPACE", "ASSIGN", "SEMICOLON", "OPEN_FUNC_OR_COND", 
		"CLOSE_FUNC_OR_COND", "GREATERTHAN", "SMALLERTHAN", "GREATEROREQUALS", 
		"SMALLEROREQUALS", "EQUALS", "NOTEQUALS", "AND", "OR", "NOT", "ABSOLUTE", 
		"EXTREME", "PLUS", "MINUS", "MULTIPLY", "DIVIDE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaForBeginners.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaForBeginnersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaForBeginnersParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			code_block();
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATATYPE) {
				{
				{
				setState(25);
				statement();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public Assign_valueContext assign_value() {
			return getRuleContext(Assign_valueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				declare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				assign_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(JavaForBeginnersParser.DATATYPE, 0); }
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(DATATYPE);
			setState(36);
			match(VAR_NAME);
			setState(37);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_valueContext extends ParserRuleContext {
		public Variable_expressionContext Expression;
		public TerminalNode DATATYPE() { return getToken(JavaForBeginnersParser.DATATYPE, 0); }
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaForBeginnersParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
		public Assign_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAssign_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAssign_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAssign_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_valueContext assign_value() throws RecognitionException {
		Assign_valueContext _localctx = new Assign_valueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(DATATYPE);
			setState(40);
			match(VAR_NAME);
			setState(41);
			match(ASSIGN);
			setState(42);
			((Assign_valueContext)_localctx).Expression = variable_expression(0);
			setState(43);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Condition_blockContext cond_block;
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			((If_statementContext)_localctx).cond_block = condition_block();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(47);
				match(T__1);
				setState(48);
				condition_block();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(54);
				match(T__2);
				setState(55);
				function_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public Boolean_expressionContext Expression;
		public Function_blockContext sBlock;
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((Condition_blockContext)_localctx).Expression = boolean_expression(0);
			setState(59);
			((Condition_blockContext)_localctx).sBlock = function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_blockContext extends ParserRuleContext {
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
	 
		public Function_blockContext() { }
		public void copyFrom(Function_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionBlockContext extends Function_blockContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public FunctionBlockContext(Function_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_block);
		try {
			_localctx = new FunctionBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__3);
			setState(62);
			code_block();
			setState(63);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_expressionContext extends ParserRuleContext {
		public Variable_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_expression; }
	 
		public Variable_expressionContext() { }
		public void copyFrom(Variable_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomValueExpressionContext extends Variable_expressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomValueExpressionContext(Variable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAtomValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAtomValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAtomValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinExpressionContext extends Variable_expressionContext {
		public Variable_expressionContext leftExpression;
		public Token op;
		public Variable_expressionContext rightExpression;
		public List<Variable_expressionContext> variable_expression() {
			return getRuleContexts(Variable_expressionContext.class);
		}
		public Variable_expressionContext variable_expression(int i) {
			return getRuleContext(Variable_expressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JavaForBeginnersParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaForBeginnersParser.MINUS, 0); }
		public PlusMinExpressionContext(Variable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterPlusMinExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitPlusMinExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitPlusMinExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivModExpressionContext extends Variable_expressionContext {
		public Variable_expressionContext leftExpression;
		public Token op;
		public Variable_expressionContext rightExpression;
		public List<Variable_expressionContext> variable_expression() {
			return getRuleContexts(Variable_expressionContext.class);
		}
		public Variable_expressionContext variable_expression(int i) {
			return getRuleContext(Variable_expressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(JavaForBeginnersParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(JavaForBeginnersParser.DIVIDE, 0); }
		public MultDivModExpressionContext(Variable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterMultDivModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitMultDivModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitMultDivModExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_expressionContext variable_expression() throws RecognitionException {
		return variable_expression(0);
	}

	private Variable_expressionContext variable_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Variable_expressionContext _localctx = new Variable_expressionContext(_ctx, _parentState);
		Variable_expressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_variable_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomValueExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(66);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModExpressionContext(new Variable_expressionContext(_parentctx, _parentState));
						((MultDivModExpressionContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variable_expression);
						setState(68);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(69);
						((MultDivModExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
							((MultDivModExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						((MultDivModExpressionContext)_localctx).rightExpression = variable_expression(3);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinExpressionContext(new Variable_expressionContext(_parentctx, _parentState));
						((PlusMinExpressionContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variable_expression);
						setState(71);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(72);
						((PlusMinExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						((PlusMinExpressionContext)_localctx).rightExpression = variable_expression(2);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Boolean_expressionContext extends ParserRuleContext {
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
	 
		public Boolean_expressionContext() { }
		public void copyFrom(Boolean_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomCondExpressionContext extends Boolean_expressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomCondExpressionContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAtomCondExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAtomCondExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAtomCondExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends Boolean_expressionContext {
		public Boolean_expressionContext leftExpression;
		public Token op;
		public Boolean_expressionContext rightExpression;
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public TerminalNode SMALLEROREQUALS() { return getToken(JavaForBeginnersParser.SMALLEROREQUALS, 0); }
		public TerminalNode GREATEROREQUALS() { return getToken(JavaForBeginnersParser.GREATEROREQUALS, 0); }
		public TerminalNode SMALLERTHAN() { return getToken(JavaForBeginnersParser.SMALLERTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(JavaForBeginnersParser.GREATERTHAN, 0); }
		public ComparisonExpressionContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		return boolean_expression(0);
	}

	private Boolean_expressionContext boolean_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, _parentState);
		Boolean_expressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolean_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomCondExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(80);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonExpressionContext(new Boolean_expressionContext(_parentctx, _parentState));
					((ComparisonExpressionContext)_localctx).leftExpression = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(83);
					((ComparisonExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << SMALLERTHAN) | (1L << GREATEROREQUALS) | (1L << SMALLEROREQUALS))) != 0)) ) {
						((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(84);
					((ComparisonExpressionContext)_localctx).rightExpression = boolean_expression(2);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomexpressionContext extends AtomContext {
		public TerminalNode OPEN_FUNC_OR_COND() { return getToken(JavaForBeginnersParser.OPEN_FUNC_OR_COND, 0); }
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
		public TerminalNode CLOSE_FUNC_OR_COND() { return getToken(JavaForBeginnersParser.CLOSE_FUNC_OR_COND, 0); }
		public AtomexpressionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAtomexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAtomexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAtomexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomIntContext extends AtomContext {
		public TerminalNode INT() { return getToken(JavaForBeginnersParser.INT, 0); }
		public AtomIntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAtomInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAtomInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAtomInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomBooleanContext extends AtomContext {
		public TerminalNode BOOLEAN() { return getToken(JavaForBeginnersParser.BOOLEAN, 0); }
		public AtomBooleanContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAtomBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAtomBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAtomBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomStringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(JavaForBeginnersParser.STRING, 0); }
		public AtomStringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAtomString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAtomString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAtomString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomVarContext extends AtomContext {
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public AtomVarContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAtomVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAtomVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAtomVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomFloatContext extends AtomContext {
		public TerminalNode FLOAT() { return getToken(JavaForBeginnersParser.FLOAT, 0); }
		public AtomFloatContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAtomFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAtomFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAtomFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_FUNC_OR_COND:
				_localctx = new AtomexpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(OPEN_FUNC_OR_COND);
				setState(91);
				variable_expression(0);
				setState(92);
				match(CLOSE_FUNC_OR_COND);
				}
				break;
			case INT:
				_localctx = new AtomIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new AtomFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(FLOAT);
				}
				break;
			case BOOLEAN:
				_localctx = new AtomBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(BOOLEAN);
				}
				break;
			case VAR_NAME:
				_localctx = new AtomVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(VAR_NAME);
				}
				break;
			case STRING:
				_localctx = new AtomStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return variable_expression_sempred((Variable_expressionContext)_localctx, predIndex);
		case 9:
			return boolean_expression_sempred((Boolean_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean variable_expression_sempred(Variable_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolean_expression_sempred(Boolean_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\5\4$\n\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\64\n\7\f\7\16"+
		"\7\67\13\7\3\7\3\7\5\7;\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\nM\n\n\f\n\16\nP\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13X\n\13\f\13\16\13[\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\ff\n\f\3\f\2\4\22\24\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2!\"\3\2\37"+
		" \3\2\24\27\2h\2\30\3\2\2\2\4\36\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n)\3\2"+
		"\2\2\f/\3\2\2\2\16<\3\2\2\2\20?\3\2\2\2\22C\3\2\2\2\24Q\3\2\2\2\26e\3"+
		"\2\2\2\30\31\5\4\3\2\31\32\7\2\2\3\32\3\3\2\2\2\33\35\5\6\4\2\34\33\3"+
		"\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2\2 \36\3\2\2"+
		"\2!$\5\b\5\2\"$\5\n\6\2#!\3\2\2\2#\"\3\2\2\2$\7\3\2\2\2%&\7\b\2\2&\'\7"+
		"\r\2\2\'(\7\21\2\2(\t\3\2\2\2)*\7\b\2\2*+\7\r\2\2+,\7\20\2\2,-\5\22\n"+
		"\2-.\7\21\2\2.\13\3\2\2\2/\60\7\3\2\2\60\65\5\16\b\2\61\62\7\4\2\2\62"+
		"\64\5\16\b\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		":\3\2\2\2\67\65\3\2\2\289\7\5\2\29;\5\20\t\2:8\3\2\2\2:;\3\2\2\2;\r\3"+
		"\2\2\2<=\5\24\13\2=>\5\20\t\2>\17\3\2\2\2?@\7\6\2\2@A\5\4\3\2AB\7\7\2"+
		"\2B\21\3\2\2\2CD\b\n\1\2DE\5\26\f\2EN\3\2\2\2FG\f\4\2\2GH\t\2\2\2HM\5"+
		"\22\n\5IJ\f\3\2\2JK\t\3\2\2KM\5\22\n\4LF\3\2\2\2LI\3\2\2\2MP\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2O\23\3\2\2\2PN\3\2\2\2QR\b\13\1\2RS\5\26\f\2SY\3\2"+
		"\2\2TU\f\3\2\2UV\t\4\2\2VX\5\24\13\4WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z\25\3\2\2\2[Y\3\2\2\2\\]\7\22\2\2]^\5\22\n\2^_\7\23\2\2_f\3\2\2"+
		"\2`f\7\t\2\2af\7\n\2\2bf\7\13\2\2cf\7\r\2\2df\7\f\2\2e\\\3\2\2\2e`\3\2"+
		"\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\27\3\2\2\2\n\36#\65:LNY"+
		"e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}