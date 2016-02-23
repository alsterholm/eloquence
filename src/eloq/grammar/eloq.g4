grammar eloq;

// Remove this header if using the default IntelliJ project layout
@header {
package eloq.grammar;
}

file
: code
;

code
: statement ';' code
| EOF                           // implicitly defined terminal
;

statement
: decl
| assign
| print
| loopWhile
;

block
: (statement ';')*
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

loopWhile
: 'while' '(' expr ')' '{'block '}'

;
expr
: atomExpr
| expr '+' expr
| expr '<' expr
;

atomExpr
: ID
| INT
;

ID:	('a'..'z')+ ;
INT:	('0'..'9')+ ;
WS:	[ \n\t\r]+ -> skip ;