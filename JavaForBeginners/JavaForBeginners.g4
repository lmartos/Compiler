grammar JavaForBeginners;

parse: function_execution* code_block EOF;

code_block: statement*;

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
ADDASSIGN: '+=' | '=+';
MINUSASSIGN: '-=' | '=-';
MULTIPLYASSIGN: '*=' | '=*';
DIVIDEASSIGN: '/=' | '=/';
MODULUS : '%';

PLUSPLUS: '++';
MINMIN: '--';

OPEN_FUNC_OR_COND : '(';
CLOSE_FUNC_OR_COND : ')';
RETURN: 'give_this_back';

statement: read_statement
 | declare
 | print_to_console
 | if_statement
 | for_statement
 | while_statement
 | call_function
 | assign_value
 | assign_value_by_method
 | operator
 | operator_with_method
 | variable_expression SEMICOLON;

declare: DATATYPE VAR_NAME SEMICOLON;
assign_value: DATATYPE VAR_NAME ASSIGN Expression=variable_expression SEMICOLON;
assign_value_by_method: DATATYPE VAR_NAME ASSIGN Expression=call_function;

operator: id=VAR_NAME ASSIGN Expression=variable_expression SEMICOLON;
operator_with_method: id=VAR_NAME ASSIGN Expression=call_function;

read_statement:VAR_NAME 'read_user_input_of_type('DATATYPE')' SEMICOLON;

print_to_console:'display_this('VAR_NAME')' SEMICOLON #printVar
 | 'display_this('STRING')' SEMICOLON #printText
 | 'display_this('INT')' SEMICOLON #printInt
 | 'display_this('FLOAT')' SEMICOLON #printFloat
 | 'display_this('boolean_expression')' SEMICOLON #printBool
 | 'display_this('variable_expression')' SEMICOLON #printCalc;

if_statement: 'if_this_is_true' cond_block=condition_block ('else_if_this_is_true' condition_block)* ('else_if_it_is_false' function_block)?;

while_statement: 'while_this_is_true' boolean_expression function_block;

for_statement: 'for_this_duration' (OPEN_FUNC_OR_COND (token=assign_value | verand=operator) boolean_expression SEMICOLON variable_expression CLOSE_FUNC_OR_COND) function_block;

condition_block: Expression=boolean_expression sBlock=function_block;

function_block: '{' code_block '}' #functionBlock;

function: '{' code_block RETURN? VAR_NAME? SEMICOLON? '}';

call_function: VAR_NAME OPEN_FUNC_OR_COND argument? CLOSE_FUNC_OR_COND SEMICOLON;
function_execution: DATATYPE 'function' VAR_NAME OPEN_FUNC_OR_COND argument_execution? CLOSE_FUNC_OR_COND function;

argument: (argument_type ',')* argument_type;
argument_execution: (DATATYPE argument_type ',')* DATATYPE argument_type;

argument_type: STRING | INT | FLOAT | BOOLEAN | VAR_NAME;

variable_expression: atom #atomValueExpression
 | leftExpression=variable_expression op=(MULTIPLY | DIVIDE | MODULUS )rightExpression=variable_expression #multDivModExpression
 | leftExpression=variable_expression op=(PLUS | MINUS) rightExpression=variable_expression #plusMinExpression
 | leftExpression=variable_expression op=(MULTIPLYASSIGN | DIVIDEASSIGN | MINUSASSIGN | ADDASSIGN) rightExpression=variable_expression #assignCalculationExpression
 | leftExpression=variable_expression op=(MINMIN | PLUSPLUS) #minminPlusPlusExpression;

boolean_expression: atom #atomCondExpression
 | leftExpression=boolean_expression op=(SMALLEROREQUALS | GREATEROREQUALS | SMALLERTHAN | GREATERTHAN) rightExpression=boolean_expression #comparisonExpression
 | leftExpression=boolean_expression op=(EQUALS | NOTEQUALS) rightExpression=boolean_expression #equalityExpression
 | orLeftExpression=boolean_expression OR orRightExpression=boolean_expression #boolOrbool
 | andLeftExpression=boolean_expression AND andRightExpression=boolean_expression #boolAndBool
 | NOT boolean_expression #notBool;

atom: OPEN_FUNC_OR_COND (boolean_expression | variable_expression) CLOSE_FUNC_OR_COND #atomexpression
 | INT     #atomInt
 | FLOAT   #atomFloat
 | BOOLEAN #atomBoolean
 | VAR_NAME #atomVar
 | STRING  #atomString;