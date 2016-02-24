grammar eloq;

file
: code
;

code
: statement code
| EOF                           // implicitly defined terminal
;

statement
: decl
| assign
| print
| intervalLoop
;

block
: (statement)*
;

decl
: 'var' ID
;

assign
: ID '=' expr
;

print
: 'print' expr
;

expr
: atomExpr
| addExpr
| mulExpr
;

addExpr
: atomExpr '+' expr
;

mulExpr
: atomExpr '*' expr
;

intervalLoop
: 'for' expr 'through' expr 'as' ID '{' block '}'
;

atomExpr
: ID
| INT
| '(' expr ')'
;

ID:	    ('a'..'z')+ ;
INT:	('0'..'9')+ ;
WS:	    [ \n\t\r;]+ -> skip ;