/* Sección de declaraciones de JFlex */
package codigo;
import static codigo.Tokens.*;
%%
/* Al utilizar esta instrucción, se le indica a JFlex que devuelva objetos del tipo TokenPersonalizado */
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

/* Palabra reservada Iterar  */ 
(Iterar ) {lexeme=yytext(); return For;}
/* Palabra reservada if   */ 
(if  ) {lexeme=yytext(); return If ;}
/* Palabra reservada else  */ 
(else ) {lexeme=yytext(); return Else;}
/* Palabra reservada elseif   */ 
(elseif  ) {lexeme=yytext(); return Elseif;}
/* Palabra reservada #  */ 
(# ) {lexeme=yytext(); return Comentar;}
/* Palabra reservada \n  */ 
(\n ) {lexeme=yytext(); return \N;}
/* Palabra reservada ""\""""  */ 
(""\"""" ) {lexeme=yytext(); return Comillas ;}
/* Palabra reservada retorn  */ 
(retorn ) {lexeme=yytext(); return Retorno;}
/* Palabra reservada Ent  */ 
(Ent ) {lexeme=yytext(); return Entrada;}
/* Palabra reservada Sald  */ 
(Sald ) {lexeme=yytext(); return Salida;}
/* Palabra reservada +  */ 
(+ ) {lexeme=yytext(); return Suma;}
/* Palabra reservada -  */ 
(- ) {lexeme=yytext(); return Resta;}
/* Palabra reservada /  */ 
(/ ) {lexeme=yytext(); return Division;}
/* Palabra reservada *  */ 
(* ) {lexeme=yytext(); return Multiplicacion;}
/* Palabra reservada ==  */ 
(== ) {lexeme=yytext(); return Igual;}
/* Palabra reservada >  */ 
(> ) {lexeme=yytext(); return MayorQue;}
/* Palabra reservada >  */ 
(> ) {lexeme=yytext(); return MenorQue;}
/* Palabra reservada !=  */ 
(!= ) {lexeme=yytext(); return diferencia;}
/* Palabra reservada ;  */ 
(; ) {lexeme=yytext(); return P_Coma;}
/* Palabra reservada Cadena  */ 
(Cadena ) {lexeme=yytext(); return String;}
/* Palabra reservada int  */ 
(int ) {lexeme=yytext(); return Int;}
/* Palabra reservada Deci  */ 
(Deci ) {lexeme=yytext(); return Decimal;}


/* Error de analisis */
 . {return ERROR;}


