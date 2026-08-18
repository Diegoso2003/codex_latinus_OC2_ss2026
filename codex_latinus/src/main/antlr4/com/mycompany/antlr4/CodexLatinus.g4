grammar CodexLatinus;

WS : [ \t\r\n]+ -> skip;
COMS_I : '##' .*? '##' -> skip;
COMS : '//' ~[\r\n]* -> skip;
INT : [0-9]+;
DEC : [0-9]+'.'[0-9]+;
TEXT : '"'.*?'"';
CHAR : '\''~['\r\n]'\'';
BOOL : 'bool';
VERUM : 'verum';
FALSUS : 'falsus';
PR : 'perge';
IT : 'interrumpe';
ES : 'esto';
SR : 'series';
FC : 'facere';
DUM : 'dum';
PER : 'per';
AT : 'aliter';
SI : 'si';
FN : 'finis';
RT : 'ratio';
RD : 'reddere';
ST : 'structura';
AC : 'actio';
VAR : 'VARIABILES';
FNS : 'FINIS';
MUN : 'MUNERA';
MAI : 'MAIOR';
TXT : 'textum';
DECI : 'decimalis';
NUME : 'numerus';
LITT : 'littera';
PAA : '(';
PAC : ')';
LLAA : '{';
LLAC : '}';
CORA : '[';
CORC : ']';
DPUN : ':';
PCO : ';';
COM : ',';
PUN : '.';
MAY : '>';
MAYI : '>=';
MEN : '<';
MENI : '<=';
MAS : '+';
MENOS : '-';
POR : '*';
DIV : '/';
INCRE: '++';
DECRE: '--';
AND : '&&';
OR : '||';
DIF : '!=';
IGU : '==';
NON : 'non';
LEER : '<<';
IMPRI : '>>';
ASIG : '=';
ID : [a-zA-Z]+[a-zA-Z0-9_]*;

prog : var_glo? functs? main FNS PCO
    ;

var_glo : VAR MAY l_decl
    ;

l_decl : decl+
    ;

decl: declS
    | struct
    ;

functs : MUN MAY l_met
    ;

l_met : met+
    ;

met : metodo
    | funcion
    ;

main : MAI MAY l_inst
    ;

l_inst : inst+
    ;

declS : ES ID DPUN tipo comple?                     #primitivo
    | SR ID access_a DPUN tipo lista PCO      #arreglo
    ;

condi : SI paren_expr bloque sino
    ;

sino : AT paren_expr bloque sino
    | default
    ;

default : AT bloque FN PCO
    | FN PCO
    ;

cicloS : DUM paren_expr bloque FN PCO
    ;

paren_expr : PAA expr PAC
    ;

bloque : LLAA l_inst? LLAC
    ;

cicloD : FC bloque DUM paren_expr PCO
    ;

cicloP : PER PAA declS expr PCO asign PAC bloque
    ;

comple : expr PCO
    | PCO
    | declStru
    ;

inst : cicloS
    | cicloP
    | cicloD
    | declS
    | condi
    | RD expr PCO
    | PR PCO
    | IT PCO
    | asign PCO
    | lectura
    | l_impri PCO
    | ll_func PCO
    ;

l_impri : impri+
    ;

impri : IMPRI expr
    ;

lectura : LEER
    | expr LEER
    ;

asign : identi op=(INCRE|DECRE)
    | op=(INCRE|DECRE) identi
    | identi ASIG valor
    ;

metodo : AC ID PAA l_atrib? PAC LLAA c_met LLAC FN PCO
    ;

funcion : RT tipo ID PAA l_atrib? PAC LLAA c_met LLAC FN PCO
    ;

valor : expr
    | declStru
    ;

c_met : variables? l_inst?
    ;

variables : VAR CORA l_decl CORC
    ;

declStru : LLAA l_val LLAC
    ;

l_val : val (COM val)*
    ;

val : ID DPUN valor
    ;

struct : ST ID LLAA l_atrib LLAC FN PCO
    ;

l_atrib : atrib (COM atrib)*        #LAtribComa
    | (atrib_pcoma)+                #LAtribPcoma
    ;

atrib_pcoma : atrib PCO
    ;

atrib : ta=(ES|SR) ID DPUN tipo
    ;

lista : LLAA l_exp? LLAC
    ;

l_exp : expr (COM expr)*
    ;

tipo: TXT
    | DECI
    | NUME
    | LITT
    | BOOL
    | ID
    ;

expr : expr OR and
    | and
    ;

and : and AND iguDif
    | iguDif
    ;

iguDif : iguDif (IGU|DIF) menMay
    | menMay
    ;

menMay : menMay (MEN|MAY|MENI|MAYI) sumRes
    | sumRes
    ;

sumRes : sumRes (MAS|MENOS) mulDiv
    | mulDiv
    ;

mulDiv : mulDiv (POR|DIV) unario
    | unario
    ;

unario : (MENOS|MAS|NON) term
    | term
    ;

term : INT
    | DEC
    | TEXT
    | CHAR
    | VERUM
    | FALSUS
    | identi (INCRE|DECRE)?
    | (INCRE|DECRE) identi
    | paren_expr
    ;

identi : ID
    | identi c_identi
    | ll_func
    ;

c_identi : access_a
    | PUN ID
    ;

ll_func : ID PAA l_exp? PAC
    ;

access_a : CORA expr CORC
    ;
