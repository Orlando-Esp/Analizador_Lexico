package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]
%{
    public String lexeme;
%}
%%
entero | doble | booleano | cadena | 
flotante | largo | corto {lexeme=yytext(); return TipoDato;}

si | sino | por | 

clase | exportaciones | extiende | final | implementos | importar | modulo |
vacio | nativa | nueva | paquete | retornar | estatico | este | Sistema | salida |
imprimir |
abstracta | interfaz |

hacer | mientras |

verdadero | falso | nulo |
principal |
descanso | caso |
captura | probar | cambiar {lexeme=yytext(); return Reservadas;}

publico |
privado |
protegida {lexeme=yytext(); return Modificadores;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {lexeme=yytext(); return Igual;}
"+" {lexeme=yytext(); return Suma;}
"-" {lexeme=yytext(); return Resta;}
"*" {lexeme=yytext(); return Multiplicacion;}
"/" {lexeme=yytext(); return Division;}
";" {lexeme=yytext(); return PuntoyComa;}
"(" {lexeme=yytext(); return AbreParentesis;}
")" {lexeme=yytext(); return CierraParentesis;}
""" {lexeme=yytext(); return Comillas;}
"{" {lexeme=yytext(); return Abrellaves;}
"}" {lexeme=yytext(); return Cierrallaves;}
"." {lexeme=yytext(); return Punto;}
"[" {lexeme=yytext(); return AbreCorchetes;}
"]" {lexeme=yytext(); return CierraCorchetes;}
"<" {lexeme=yytext(); return Menorque;}
">" {lexeme=yytext(); return Mayorque;}
":" {lexeme=yytext(); return Dospuntos;}
{L} ({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
{espacio} {lexeme=yytext(); return Espacios;}
 . {return ERROR;}
