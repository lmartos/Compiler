grammar JavaForBeginners;

parse: code_block EOF;

code_block: statement*;

statement: declare
 | assign_value;

DATATYPE: ('text' | 'whole_number' | 'decimal' | 'condition' | 'nothing');

INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+;
BOOLEAN: 'true' | 'false';
STRING: '"' (~["\r\n] | '""')* '"';
VAR_NAME: [a-zA-Z] [a-zA-Z_0-9]*;

COMMENT: '#' ~[\r\n]* -> skip;
SPACE: [ \t\r\n] -> skip;

ASSIGN : '=';
SEMICOLON : ';';
OPEN_FUNC_OR_COND: '(';
CLOSE_FUNC_OR_COND: ')';


declare: DATATYPE VAR_NAME SEMICOLON;
assign_value: DATATYPE VAR_NAME ASSIGN Expression=variable_expression SEMICOLON;
if_statement: 'if_this_is_true' cond_block=condition_block ('else_if_this_is_true' condition_block)* ('else_if_it_is_false' function_block)?;

condition_block: Expression=boolean_expression sBlock=function_block;

function_block: '{' code_block '}' #functionBlock;

variable_expression: atom #atomValueExpression
 | leftExpression=variable_expression op=(MULTIPLY | DIVIDE )rightExpression=variable_expression #multDivModExpression
 | leftExpression=variable_expression op=(PLUS | MINUS) rightExpression=variable_expression #plusMinExpression;

 boolean_expression: atom #atomCondExpression
  | leftExpression=boolean_expression op=(SMALLEROREQUALS | GREATEROREQUALS | SMALLERTHAN | GREATERTHAN) rightExpression=boolean_expression #comparisonExpression;

GREATERTHAN : '>';
SMALLERTHAN : '<';
GREATEROREQUALS : '>=';
SMALLEROREQUALS : '<=';
EQUALS : '==';
NOTEQUALS : '!=';
AND: '&&';
OR: '||';
NOT: '!';
ABSOLUTE: '|';
EXTREME: '$';

PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';

atom: OPEN_FUNC_OR_COND  variable_expression CLOSE_FUNC_OR_COND #atomexpression
 | INT     #atomInt
 | FLOAT   #atomFloat
 | BOOLEAN #atomBoolean
 | VAR_NAME #atomVar
 | STRING  #atomString;