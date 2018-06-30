// Generated from C:/Users/Nyuu-PC/Desktop/newnew/JavaForBeginners\JavaForBeginners.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DATATYPE=12, INT=13, FLOAT=14, BOOLEAN=15, STRING=16, 
		VAR_NAME=17, COMMENT=18, SPACE=19, ASSIGN=20, SEMICOLON=21, GREATERTHAN=22, 
		SMALLERTHAN=23, GREATEROREQUALS=24, SMALLEROREQUALS=25, EQUALS=26, NOTEQUALS=27, 
		AND=28, OR=29, NOT=30, ABSOLUTE=31, EXTREME=32, PLUS=33, MINUS=34, MULTIPLY=35, 
		DIVIDE=36, ADDASSIGN=37, MINUSASSIGN=38, MULTIPLYASSIGN=39, DIVIDEASSIGN=40, 
		MODULUS=41, PLUSPLUS=42, MINMIN=43, OPEN_FUNC_OR_COND=44, CLOSE_FUNC_OR_COND=45, 
		RETURN=46;
	public static final int
		RULE_parse = 0, RULE_code_block = 1, RULE_statement = 2, RULE_declare = 3, 
		RULE_assign_value = 4, RULE_assign_value_by_method = 5, RULE_operator = 6, 
		RULE_operator_with_method = 7, RULE_read_statement = 8, RULE_print_to_console = 9, 
		RULE_if_statement = 10, RULE_while_statement = 11, RULE_for_statement = 12, 
		RULE_condition_block = 13, RULE_function_block = 14, RULE_function = 15, 
		RULE_call_function = 16, RULE_function_execution = 17, RULE_argument = 18, 
		RULE_argument_execution = 19, RULE_argument_type = 20, RULE_variable_expression = 21, 
		RULE_boolean_expression = 22, RULE_atom = 23;
	public static final String[] ruleNames = {
		"parse", "code_block", "statement", "declare", "assign_value", "assign_value_by_method", 
		"operator", "operator_with_method", "read_statement", "print_to_console", 
		"if_statement", "while_statement", "for_statement", "condition_block", 
		"function_block", "function", "call_function", "function_execution", "argument", 
		"argument_execution", "argument_type", "variable_expression", "boolean_expression", 
		"atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'read_user_input_of_type('", "'display_this('", "'if_this_is_true'", 
		"'else_if_this_is_true'", "'else_if_it_is_false'", "'while_this_is_true'", 
		"'for_this_duration'", "'{'", "'}'", "'function'", "','", null, null, 
		null, null, null, null, null, null, "'='", "';'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'|'", "'$'", "'+'", "'-'", 
		"'*'", "'/'", null, null, null, null, "'%'", "'++'", "'--'", "'('", "')'", 
		"'give_this_back'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"DATATYPE", "INT", "FLOAT", "BOOLEAN", "STRING", "VAR_NAME", "COMMENT", 
		"SPACE", "ASSIGN", "SEMICOLON", "GREATERTHAN", "SMALLERTHAN", "GREATEROREQUALS", 
		"SMALLEROREQUALS", "EQUALS", "NOTEQUALS", "AND", "OR", "NOT", "ABSOLUTE", 
		"EXTREME", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "ADDASSIGN", "MINUSASSIGN", 
		"MULTIPLYASSIGN", "DIVIDEASSIGN", "MODULUS", "PLUSPLUS", "MINMIN", "OPEN_FUNC_OR_COND", 
		"CLOSE_FUNC_OR_COND", "RETURN"
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
		public List<Function_executionContext> function_execution() {
			return getRuleContexts(Function_executionContext.class);
		}
		public Function_executionContext function_execution(int i) {
			return getRuleContext(Function_executionContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					function_execution();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(54);
			code_block();
			setState(55);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					statement();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public Print_to_consoleContext print_to_console() {
			return getRuleContext(Print_to_consoleContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Assign_valueContext assign_value() {
			return getRuleContext(Assign_valueContext.class,0);
		}
		public Assign_value_by_methodContext assign_value_by_method() {
			return getRuleContext(Assign_value_by_methodContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Operator_with_methodContext operator_with_method() {
			return getRuleContext(Operator_with_methodContext.class,0);
		}
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				read_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				declare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				print_to_console();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				for_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				call_function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				assign_value();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
				assign_value_by_method();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(72);
				operator();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(73);
				operator_with_method();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(74);
				variable_expression(0);
				setState(75);
				match(SEMICOLON);
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
			setState(79);
			match(DATATYPE);
			setState(80);
			match(VAR_NAME);
			setState(81);
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
			setState(83);
			match(DATATYPE);
			setState(84);
			match(VAR_NAME);
			setState(85);
			match(ASSIGN);
			setState(86);
			((Assign_valueContext)_localctx).Expression = variable_expression(0);
			setState(87);
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

	public static class Assign_value_by_methodContext extends ParserRuleContext {
		public Call_functionContext Expression;
		public TerminalNode DATATYPE() { return getToken(JavaForBeginnersParser.DATATYPE, 0); }
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaForBeginnersParser.ASSIGN, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Assign_value_by_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_value_by_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAssign_value_by_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAssign_value_by_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAssign_value_by_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_value_by_methodContext assign_value_by_method() throws RecognitionException {
		Assign_value_by_methodContext _localctx = new Assign_value_by_methodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_value_by_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(DATATYPE);
			setState(90);
			match(VAR_NAME);
			setState(91);
			match(ASSIGN);
			setState(92);
			((Assign_value_by_methodContext)_localctx).Expression = call_function();
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

	public static class OperatorContext extends ParserRuleContext {
		public Token id;
		public Variable_expressionContext Expression;
		public TerminalNode ASSIGN() { return getToken(JavaForBeginnersParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((OperatorContext)_localctx).id = match(VAR_NAME);
			setState(95);
			match(ASSIGN);
			setState(96);
			((OperatorContext)_localctx).Expression = variable_expression(0);
			setState(97);
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

	public static class Operator_with_methodContext extends ParserRuleContext {
		public Token id;
		public Call_functionContext Expression;
		public TerminalNode ASSIGN() { return getToken(JavaForBeginnersParser.ASSIGN, 0); }
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Operator_with_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_with_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterOperator_with_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitOperator_with_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitOperator_with_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_with_methodContext operator_with_method() throws RecognitionException {
		Operator_with_methodContext _localctx = new Operator_with_methodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operator_with_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((Operator_with_methodContext)_localctx).id = match(VAR_NAME);
			setState(100);
			match(ASSIGN);
			setState(101);
			((Operator_with_methodContext)_localctx).Expression = call_function();
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

	public static class Read_statementContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public TerminalNode DATATYPE() { return getToken(JavaForBeginnersParser.DATATYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitRead_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitRead_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(VAR_NAME);
			setState(104);
			match(T__0);
			setState(105);
			match(DATATYPE);
			setState(106);
			match(CLOSE_FUNC_OR_COND);
			setState(107);
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

	public static class Print_to_consoleContext extends ParserRuleContext {
		public Print_to_consoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_to_console; }
	 
		public Print_to_consoleContext() { }
		public void copyFrom(Print_to_consoleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintVarContext extends Print_to_consoleContext {
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public PrintVarContext(Print_to_consoleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterPrintVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitPrintVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitPrintVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIntContext extends Print_to_consoleContext {
		public TerminalNode INT() { return getToken(JavaForBeginnersParser.INT, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public PrintIntContext(Print_to_consoleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterPrintInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitPrintInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitPrintInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintBoolContext extends Print_to_consoleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public PrintBoolContext(Print_to_consoleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterPrintBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitPrintBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitPrintBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFloatContext extends Print_to_consoleContext {
		public TerminalNode FLOAT() { return getToken(JavaForBeginnersParser.FLOAT, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public PrintFloatContext(Print_to_consoleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterPrintFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitPrintFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitPrintFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintTextContext extends Print_to_consoleContext {
		public TerminalNode STRING() { return getToken(JavaForBeginnersParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public PrintTextContext(Print_to_consoleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterPrintText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitPrintText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitPrintText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintCalcContext extends Print_to_consoleContext {
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public PrintCalcContext(Print_to_consoleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterPrintCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitPrintCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitPrintCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_to_consoleContext print_to_console() throws RecognitionException {
		Print_to_consoleContext _localctx = new Print_to_consoleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print_to_console);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new PrintVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__1);
				setState(110);
				match(VAR_NAME);
				setState(111);
				match(CLOSE_FUNC_OR_COND);
				setState(112);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new PrintTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__1);
				setState(114);
				match(STRING);
				setState(115);
				match(CLOSE_FUNC_OR_COND);
				setState(116);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new PrintIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(T__1);
				setState(118);
				match(INT);
				setState(119);
				match(CLOSE_FUNC_OR_COND);
				setState(120);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new PrintFloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__1);
				setState(122);
				match(FLOAT);
				setState(123);
				match(CLOSE_FUNC_OR_COND);
				setState(124);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new PrintBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(T__1);
				setState(126);
				boolean_expression(0);
				setState(127);
				match(CLOSE_FUNC_OR_COND);
				setState(128);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new PrintCalcContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				match(T__1);
				setState(131);
				variable_expression(0);
				setState(132);
				match(CLOSE_FUNC_OR_COND);
				setState(133);
				match(SEMICOLON);
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
		enterRule(_localctx, 20, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__2);
			setState(138);
			((If_statementContext)_localctx).cond_block = condition_block();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(139);
				match(T__3);
				setState(140);
				condition_block();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(146);
				match(T__4);
				setState(147);
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

	public static class While_statementContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__5);
			setState(151);
			boolean_expression(0);
			setState(152);
			function_block();
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

	public static class For_statementContext extends ParserRuleContext {
		public Assign_valueContext token;
		public OperatorContext verand;
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public TerminalNode OPEN_FUNC_OR_COND() { return getToken(JavaForBeginnersParser.OPEN_FUNC_OR_COND, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
		public TerminalNode CLOSE_FUNC_OR_COND() { return getToken(JavaForBeginnersParser.CLOSE_FUNC_OR_COND, 0); }
		public Assign_valueContext assign_value() {
			return getRuleContext(Assign_valueContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__6);
			{
			setState(155);
			match(OPEN_FUNC_OR_COND);
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATATYPE:
				{
				setState(156);
				((For_statementContext)_localctx).token = assign_value();
				}
				break;
			case VAR_NAME:
				{
				setState(157);
				((For_statementContext)_localctx).verand = operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(160);
			boolean_expression(0);
			setState(161);
			match(SEMICOLON);
			setState(162);
			variable_expression(0);
			setState(163);
			match(CLOSE_FUNC_OR_COND);
			}
			setState(165);
			function_block();
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
		enterRule(_localctx, 26, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((Condition_blockContext)_localctx).Expression = boolean_expression(0);
			setState(168);
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
		enterRule(_localctx, 28, RULE_function_block);
		try {
			_localctx = new FunctionBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__7);
			setState(171);
			code_block();
			setState(172);
			match(T__8);
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

	public static class FunctionContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(JavaForBeginnersParser.RETURN, 0); }
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__7);
			setState(175);
			code_block();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(176);
				match(RETURN);
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_NAME) {
				{
				setState(179);
				match(VAR_NAME);
				}
			}

			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(182);
				match(SEMICOLON);
				}
			}

			setState(185);
			match(T__8);
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

	public static class Call_functionContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public TerminalNode OPEN_FUNC_OR_COND() { return getToken(JavaForBeginnersParser.OPEN_FUNC_OR_COND, 0); }
		public TerminalNode CLOSE_FUNC_OR_COND() { return getToken(JavaForBeginnersParser.CLOSE_FUNC_OR_COND, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaForBeginnersParser.SEMICOLON, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(VAR_NAME);
			setState(188);
			match(OPEN_FUNC_OR_COND);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR_NAME))) != 0)) {
				{
				setState(189);
				argument();
				}
			}

			setState(192);
			match(CLOSE_FUNC_OR_COND);
			setState(193);
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

	public static class Function_executionContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(JavaForBeginnersParser.DATATYPE, 0); }
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public TerminalNode OPEN_FUNC_OR_COND() { return getToken(JavaForBeginnersParser.OPEN_FUNC_OR_COND, 0); }
		public TerminalNode CLOSE_FUNC_OR_COND() { return getToken(JavaForBeginnersParser.CLOSE_FUNC_OR_COND, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Argument_executionContext argument_execution() {
			return getRuleContext(Argument_executionContext.class,0);
		}
		public Function_executionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_execution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterFunction_execution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitFunction_execution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitFunction_execution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_executionContext function_execution() throws RecognitionException {
		Function_executionContext _localctx = new Function_executionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_execution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(DATATYPE);
			setState(196);
			match(T__9);
			setState(197);
			match(VAR_NAME);
			setState(198);
			match(OPEN_FUNC_OR_COND);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATATYPE) {
				{
				setState(199);
				argument_execution();
				}
			}

			setState(202);
			match(CLOSE_FUNC_OR_COND);
			setState(203);
			function();
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<Argument_typeContext> argument_type() {
			return getRuleContexts(Argument_typeContext.class);
		}
		public Argument_typeContext argument_type(int i) {
			return getRuleContext(Argument_typeContext.class,i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					argument_type();
					setState(206);
					match(T__10);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(213);
			argument_type();
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

	public static class Argument_executionContext extends ParserRuleContext {
		public List<TerminalNode> DATATYPE() { return getTokens(JavaForBeginnersParser.DATATYPE); }
		public TerminalNode DATATYPE(int i) {
			return getToken(JavaForBeginnersParser.DATATYPE, i);
		}
		public List<Argument_typeContext> argument_type() {
			return getRuleContexts(Argument_typeContext.class);
		}
		public Argument_typeContext argument_type(int i) {
			return getRuleContext(Argument_typeContext.class,i);
		}
		public Argument_executionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_execution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterArgument_execution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitArgument_execution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitArgument_execution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_executionContext argument_execution() throws RecognitionException {
		Argument_executionContext _localctx = new Argument_executionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argument_execution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					match(DATATYPE);
					setState(216);
					argument_type();
					setState(217);
					match(T__10);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(224);
			match(DATATYPE);
			setState(225);
			argument_type();
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

	public static class Argument_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JavaForBeginnersParser.STRING, 0); }
		public TerminalNode INT() { return getToken(JavaForBeginnersParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JavaForBeginnersParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaForBeginnersParser.BOOLEAN, 0); }
		public TerminalNode VAR_NAME() { return getToken(JavaForBeginnersParser.VAR_NAME, 0); }
		public Argument_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterArgument_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitArgument_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitArgument_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_typeContext argument_type() throws RecognitionException {
		Argument_typeContext _localctx = new Argument_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argument_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << VAR_NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class AssignCalculationExpressionContext extends Variable_expressionContext {
		public Variable_expressionContext leftExpression;
		public Token op;
		public Variable_expressionContext rightExpression;
		public List<Variable_expressionContext> variable_expression() {
			return getRuleContexts(Variable_expressionContext.class);
		}
		public Variable_expressionContext variable_expression(int i) {
			return getRuleContext(Variable_expressionContext.class,i);
		}
		public TerminalNode MULTIPLYASSIGN() { return getToken(JavaForBeginnersParser.MULTIPLYASSIGN, 0); }
		public TerminalNode DIVIDEASSIGN() { return getToken(JavaForBeginnersParser.DIVIDEASSIGN, 0); }
		public TerminalNode MINUSASSIGN() { return getToken(JavaForBeginnersParser.MINUSASSIGN, 0); }
		public TerminalNode ADDASSIGN() { return getToken(JavaForBeginnersParser.ADDASSIGN, 0); }
		public AssignCalculationExpressionContext(Variable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterAssignCalculationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitAssignCalculationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitAssignCalculationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinminPlusPlusExpressionContext extends Variable_expressionContext {
		public Variable_expressionContext leftExpression;
		public Token op;
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
		public TerminalNode MINMIN() { return getToken(JavaForBeginnersParser.MINMIN, 0); }
		public TerminalNode PLUSPLUS() { return getToken(JavaForBeginnersParser.PLUSPLUS, 0); }
		public MinminPlusPlusExpressionContext(Variable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterMinminPlusPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitMinminPlusPlusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitMinminPlusPlusExpression(this);
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
		public TerminalNode MODULUS() { return getToken(JavaForBeginnersParser.MODULUS, 0); }
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_variable_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomValueExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(230);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModExpressionContext(new Variable_expressionContext(_parentctx, _parentState));
						((MultDivModExpressionContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variable_expression);
						setState(232);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(233);
						((MultDivModExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULUS))) != 0)) ) {
							((MultDivModExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						((MultDivModExpressionContext)_localctx).rightExpression = variable_expression(5);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinExpressionContext(new Variable_expressionContext(_parentctx, _parentState));
						((PlusMinExpressionContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variable_expression);
						setState(235);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(236);
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
						setState(237);
						((PlusMinExpressionContext)_localctx).rightExpression = variable_expression(4);
						}
						break;
					case 3:
						{
						_localctx = new AssignCalculationExpressionContext(new Variable_expressionContext(_parentctx, _parentState));
						((AssignCalculationExpressionContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variable_expression);
						setState(238);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(239);
						((AssignCalculationExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDASSIGN) | (1L << MINUSASSIGN) | (1L << MULTIPLYASSIGN) | (1L << DIVIDEASSIGN))) != 0)) ) {
							((AssignCalculationExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(240);
						((AssignCalculationExpressionContext)_localctx).rightExpression = variable_expression(3);
						}
						break;
					case 4:
						{
						_localctx = new MinminPlusPlusExpressionContext(new Variable_expressionContext(_parentctx, _parentState));
						((MinminPlusPlusExpressionContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variable_expression);
						setState(241);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(242);
						((MinminPlusPlusExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUSPLUS || _la==MINMIN) ) {
							((MinminPlusPlusExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class NotBoolContext extends Boolean_expressionContext {
		public TerminalNode NOT() { return getToken(JavaForBeginnersParser.NOT, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public NotBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterNotBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitNotBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitNotBool(this);
			else return visitor.visitChildren(this);
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
	public static class EqualityExpressionContext extends Boolean_expressionContext {
		public Boolean_expressionContext leftExpression;
		public Token op;
		public Boolean_expressionContext rightExpression;
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(JavaForBeginnersParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(JavaForBeginnersParser.NOTEQUALS, 0); }
		public EqualityExpressionContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaForBeginnersListener ) ((JavaForBeginnersListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaForBeginnersVisitor ) return ((JavaForBeginnersVisitor<? extends T>)visitor).visitEqualityExpression(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_boolean_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
			case VAR_NAME:
			case OPEN_FUNC_OR_COND:
				{
				_localctx = new AtomCondExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249);
				atom();
				}
				break;
			case NOT:
				{
				_localctx = new NotBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(NOT);
				setState(251);
				boolean_expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new Boolean_expressionContext(_parentctx, _parentState));
						((ComparisonExpressionContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
						setState(254);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(255);
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
						setState(256);
						((ComparisonExpressionContext)_localctx).rightExpression = boolean_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(new Boolean_expressionContext(_parentctx, _parentState));
						((EqualityExpressionContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
						setState(257);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(258);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUALS || _la==NOTEQUALS) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						((EqualityExpressionContext)_localctx).rightExpression = boolean_expression(3);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public TerminalNode CLOSE_FUNC_OR_COND() { return getToken(JavaForBeginnersParser.CLOSE_FUNC_OR_COND, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Variable_expressionContext variable_expression() {
			return getRuleContext(Variable_expressionContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_atom);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_FUNC_OR_COND:
				_localctx = new AtomexpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(OPEN_FUNC_OR_COND);
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(266);
					boolean_expression(0);
					}
					break;
				case 2:
					{
					setState(267);
					variable_expression(0);
					}
					break;
				}
				setState(270);
				match(CLOSE_FUNC_OR_COND);
				}
				break;
			case INT:
				_localctx = new AtomIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new AtomFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(FLOAT);
				}
				break;
			case BOOLEAN:
				_localctx = new AtomBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(BOOLEAN);
				}
				break;
			case VAR_NAME:
				_localctx = new AtomVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				match(VAR_NAME);
				}
				break;
			case STRING:
				_localctx = new AtomStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
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
		case 21:
			return variable_expression_sempred((Variable_expressionContext)_localctx, predIndex);
		case 22:
			return boolean_expression_sempred((Boolean_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean variable_expression_sempred(Variable_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolean_expression_sempred(Boolean_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u011a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\2\3\3\7\3=\n\3\f\3\16\3@\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\3\f"+
		"\7\f\u0090\n\f\f\f\16\f\u0093\13\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\5\16\u00a1\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00b4\n\21"+
		"\3\21\5\21\u00b7\n\21\3\21\5\21\u00ba\n\21\3\21\3\21\3\22\3\22\3\22\5"+
		"\22\u00c1\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00cb\n\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00d3\n\24\f\24\16\24\u00d6\13\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00de\n\25\f\25\16\25\u00e1\13\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u00f6\n\27\f\27\16\27\u00f9\13\27\3\30"+
		"\3\30\3\30\3\30\5\30\u00ff\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0107"+
		"\n\30\f\30\16\30\u010a\13\30\3\31\3\31\3\31\5\31\u010f\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0118\n\31\3\31\2\4,.\32\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\t\3\2\17\23\4\2%&++\3\2#$\3\2\'"+
		"*\3\2,-\3\2\30\33\3\2\34\35\2\u012a\2\65\3\2\2\2\4>\3\2\2\2\6O\3\2\2\2"+
		"\bQ\3\2\2\2\nU\3\2\2\2\f[\3\2\2\2\16`\3\2\2\2\20e\3\2\2\2\22i\3\2\2\2"+
		"\24\u0089\3\2\2\2\26\u008b\3\2\2\2\30\u0098\3\2\2\2\32\u009c\3\2\2\2\34"+
		"\u00a9\3\2\2\2\36\u00ac\3\2\2\2 \u00b0\3\2\2\2\"\u00bd\3\2\2\2$\u00c5"+
		"\3\2\2\2&\u00d4\3\2\2\2(\u00df\3\2\2\2*\u00e5\3\2\2\2,\u00e7\3\2\2\2."+
		"\u00fe\3\2\2\2\60\u0117\3\2\2\2\62\64\5$\23\2\63\62\3\2\2\2\64\67\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\5\4\3\29"+
		":\7\2\2\3:\3\3\2\2\2;=\5\6\4\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?\5\3\2\2\2@>\3\2\2\2AP\5\22\n\2BP\5\b\5\2CP\5\24\13\2DP\5\26\f\2EP\5"+
		"\32\16\2FP\5\30\r\2GP\5\"\22\2HP\5\n\6\2IP\5\f\7\2JP\5\16\b\2KP\5\20\t"+
		"\2LM\5,\27\2MN\7\27\2\2NP\3\2\2\2OA\3\2\2\2OB\3\2\2\2OC\3\2\2\2OD\3\2"+
		"\2\2OE\3\2\2\2OF\3\2\2\2OG\3\2\2\2OH\3\2\2\2OI\3\2\2\2OJ\3\2\2\2OK\3\2"+
		"\2\2OL\3\2\2\2P\7\3\2\2\2QR\7\16\2\2RS\7\23\2\2ST\7\27\2\2T\t\3\2\2\2"+
		"UV\7\16\2\2VW\7\23\2\2WX\7\26\2\2XY\5,\27\2YZ\7\27\2\2Z\13\3\2\2\2[\\"+
		"\7\16\2\2\\]\7\23\2\2]^\7\26\2\2^_\5\"\22\2_\r\3\2\2\2`a\7\23\2\2ab\7"+
		"\26\2\2bc\5,\27\2cd\7\27\2\2d\17\3\2\2\2ef\7\23\2\2fg\7\26\2\2gh\5\"\22"+
		"\2h\21\3\2\2\2ij\7\23\2\2jk\7\3\2\2kl\7\16\2\2lm\7/\2\2mn\7\27\2\2n\23"+
		"\3\2\2\2op\7\4\2\2pq\7\23\2\2qr\7/\2\2r\u008a\7\27\2\2st\7\4\2\2tu\7\22"+
		"\2\2uv\7/\2\2v\u008a\7\27\2\2wx\7\4\2\2xy\7\17\2\2yz\7/\2\2z\u008a\7\27"+
		"\2\2{|\7\4\2\2|}\7\20\2\2}~\7/\2\2~\u008a\7\27\2\2\177\u0080\7\4\2\2\u0080"+
		"\u0081\5.\30\2\u0081\u0082\7/\2\2\u0082\u0083\7\27\2\2\u0083\u008a\3\2"+
		"\2\2\u0084\u0085\7\4\2\2\u0085\u0086\5,\27\2\u0086\u0087\7/\2\2\u0087"+
		"\u0088\7\27\2\2\u0088\u008a\3\2\2\2\u0089o\3\2\2\2\u0089s\3\2\2\2\u0089"+
		"w\3\2\2\2\u0089{\3\2\2\2\u0089\177\3\2\2\2\u0089\u0084\3\2\2\2\u008a\25"+
		"\3\2\2\2\u008b\u008c\7\5\2\2\u008c\u0091\5\34\17\2\u008d\u008e\7\6\2\2"+
		"\u008e\u0090\5\34\17\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0096\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7\7\2\2\u0095\u0097\5\36\20\2\u0096\u0094\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\27\3\2\2\2\u0098\u0099\7\b\2\2\u0099\u009a\5.\30\2\u009a"+
		"\u009b\5\36\20\2\u009b\31\3\2\2\2\u009c\u009d\7\t\2\2\u009d\u00a0\7.\2"+
		"\2\u009e\u00a1\5\n\6\2\u009f\u00a1\5\16\b\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5.\30\2\u00a3\u00a4\7\27"+
		"\2\2\u00a4\u00a5\5,\27\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\5\36\20\2\u00a8\33\3\2\2\2\u00a9\u00aa\5.\30\2\u00aa\u00ab\5\36"+
		"\20\2\u00ab\35\3\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af"+
		"\7\13\2\2\u00af\37\3\2\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b3\5\4\3\2\u00b2"+
		"\u00b4\7\60\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00b7\7\23\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00ba\7\27\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc!\3\2\2\2\u00bd\u00be"+
		"\7\23\2\2\u00be\u00c0\7.\2\2\u00bf\u00c1\5&\24\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c4\7\27"+
		"\2\2\u00c4#\3\2\2\2\u00c5\u00c6\7\16\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8"+
		"\7\23\2\2\u00c8\u00ca\7.\2\2\u00c9\u00cb\5(\25\2\u00ca\u00c9\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd\u00ce\5 \21"+
		"\2\u00ce%\3\2\2\2\u00cf\u00d0\5*\26\2\u00d0\u00d1\7\r\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5*"+
		"\26\2\u00d8\'\3\2\2\2\u00d9\u00da\7\16\2\2\u00da\u00db\5*\26\2\u00db\u00dc"+
		"\7\r\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e3\7\16\2\2\u00e3\u00e4\5*\26\2\u00e4)\3\2\2\2\u00e5\u00e6"+
		"\t\2\2\2\u00e6+\3\2\2\2\u00e7\u00e8\b\27\1\2\u00e8\u00e9\5\60\31\2\u00e9"+
		"\u00f7\3\2\2\2\u00ea\u00eb\f\6\2\2\u00eb\u00ec\t\3\2\2\u00ec\u00f6\5,"+
		"\27\7\u00ed\u00ee\f\5\2\2\u00ee\u00ef\t\4\2\2\u00ef\u00f6\5,\27\6\u00f0"+
		"\u00f1\f\4\2\2\u00f1\u00f2\t\5\2\2\u00f2\u00f6\5,\27\5\u00f3\u00f4\f\3"+
		"\2\2\u00f4\u00f6\t\6\2\2\u00f5\u00ea\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5"+
		"\u00f0\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8-\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb"+
		"\b\30\1\2\u00fb\u00ff\5\60\31\2\u00fc\u00fd\7 \2\2\u00fd\u00ff\5.\30\3"+
		"\u00fe\u00fa\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0108\3\2\2\2\u0100\u0101"+
		"\f\5\2\2\u0101\u0102\t\7\2\2\u0102\u0107\5.\30\6\u0103\u0104\f\4\2\2\u0104"+
		"\u0105\t\b\2\2\u0105\u0107\5.\30\5\u0106\u0100\3\2\2\2\u0106\u0103\3\2"+
		"\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"/\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010e\7.\2\2\u010c\u010f\5.\30\2\u010d"+
		"\u010f\5,\27\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\7/\2\2\u0111\u0118\3\2\2\2\u0112\u0118\7\17\2\2\u0113"+
		"\u0118\7\20\2\2\u0114\u0118\7\21\2\2\u0115\u0118\7\23\2\2\u0116\u0118"+
		"\7\22\2\2\u0117\u010b\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2"+
		"\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\61"+
		"\3\2\2\2\27\65>O\u0089\u0091\u0096\u00a0\u00b3\u00b6\u00b9\u00c0\u00ca"+
		"\u00d4\u00df\u00f5\u00f7\u00fe\u0106\u0108\u010e\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}