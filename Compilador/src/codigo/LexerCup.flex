package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

(Iterar) {return new Symbol(sym.For, yychar, yyline, yytext());}
(if ) {return new Symbol(sym.If , yychar, yyline, yytext());}
(else) {return new Symbol(sym.Else, yychar, yyline, yytext());}
(elseif ) {return new Symbol(sym.Elseif, yychar, yyline, yytext());}
(#) {return new Symbol(sym.Comentar, yychar, yyline, yytext());}
("\"") {return new Symbol(sym.Comillas , yychar, yyline, yytext());}
(retorn) {return new Symbol(sym.Retorno, yychar, yyline, yytext());}
(Ent) {return new Symbol(sym.Entrada, yychar, yyline, yytext());}
(Sald) {return new Symbol(sym.Salida, yychar, yyline, yytext());}
("\+") {return new Symbol(sym.Suma, yychar, yyline, yytext());}
("\-") {return new Symbol(sym.Resta, yychar, yyline, yytext());}
("\/") {return new Symbol(sym.Division, yychar, yyline, yytext());}
("\*") {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
("\==") {return new Symbol(sym.Igual, yychar, yyline, yytext());}
(">") {return new Symbol(sym.MayorQue, yychar, yyline, yytext());}
("<") {return new Symbol(sym.MenorQue, yychar, yyline, yytext());}
("!=") {return new Symbol(sym.diferencia, yychar, yyline, yytext());}
(";") {return new Symbol(sym.P_Coma, yychar, yyline, yytext());}
(Cadena) {return new Symbol(sym.String, yychar, yyline, yytext());}
(int) {return new Symbol(sym.Int, yychar, yyline, yytext());}
(Deci) {return new Symbol(sym.Decimal, yychar, yyline, yytext());}



/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Texto */
"\"" {L}({L}|{D})* "\"" {return new Symbol(sym.Texto, yychar, yyline, yytext());}

/* Texto2 */
"\'" {L}({L}|{D})* "\'" {return new Symbol(sym.Texto2, yychar, yyline, yytext());}


/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
