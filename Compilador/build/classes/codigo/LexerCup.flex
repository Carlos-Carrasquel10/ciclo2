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

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Comilla Simple */
( "\'" ) {return new Symbol(sym.Comillas_simple, yychar, yyline, yytext());}

/* Tipos de datos */
( byte | int | char | long | float | double | bool ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}


/* XOR */
( "^" ) {return new Symbol(sym.XOR, yychar, yyline, yytext());}

/* NOT */
( "~" | "!" ) {return new Symbol(sym.NOT, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Casetr */
( casetr ) {return new Symbol(sym.Casetr, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada imprimir */
( printf ) {return new Symbol(sym.Printf, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operador Modulo */
( "%" ) {return new Symbol(sym.Modulo, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/*Especificadores */
( "%c" | "%d" | "%e" | "%f" | "%g" | "%o" | "%i" | "%s" | "%x" | "%p" | "%n" | "%u" | "%E" | "%G" | "%X" | "%%" ) {return new Symbol(sym.Especificadores, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Sin valor */
( "null" ) {return new Symbol(sym.Null, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Parentesis de cierre */
( "." ) {return new Symbol(sym.Comas, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Retorno */
( "return" ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

/* No regresa valor */
( "void" ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Dos puntos */
( ":" ) {return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());}

/* Switch */
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}

/* Caso */
( case ) {return new Symbol(sym.Caso, yychar, yyline, yytext());}

/* Break */
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

/* Defecto */
( default ) {return new Symbol(sym.Defecto, yychar, yyline, yytext());}

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
