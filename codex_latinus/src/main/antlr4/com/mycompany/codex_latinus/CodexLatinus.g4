grammar CodexLatinus;

WS : [ \t\r\n]+ -> skip;
COMS_I : '##' .*? '##' -> skip;
COMS : '//' ~[\r\n]* -> skip;
INT : [0-9]+;
DEC : [0-9]+'.'[0-9]+;
TEXT : '"'.*?'"';
CHAR : '\''.'\'';
BOOL : 'verum'|'falsus';
ID : [a-zA-Z]+[a-zA-Z0-9_]*;
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
NUM : 'NUMERA';
MAI : 'MAIOR';

prog : var_glo functs main FNS ';'
    ;

var_glo : VAR '>' l_decl
    |
    ;

l_decl : (decl | declStru | struct )+
    ;

functs : NUM '>' l_met
    |
    ;

l_met : (metodo | funcion)+
    ;

main : MAI '>' l_inst
    ;

decl : ES ID ':' tipo comple
    | SR ID '[' expr ']' ':' t lista ';'
    ;

t : tipo
    |
    ;

condi : SI '(' expr ')' '{' l_inst '}' sino
    ;

sino : AT '(' expr ')' '{' l_inst '}' sino
    | default
    ;

default : AT '{' l_inst '}' FN ';'
    | FN ';'
    ;

cicloS : DUM '(' expr ')' '{' l_inst '}' FN ';'
    ;

cicloD : FC '{' l_inst '}' DUM '(' expr ')' FN ';'
    ;

cicloP : PER '(' decl ';' expr ';' asign ')' '{' l_inst '}'
    ;

comple : expr ';'
    | ';'
    | declStru
    ;

inst : cicloS
    | cicloP
    | cicloD
    | condi
    | RD expr ';'
    | PR ';'
    | IT ';'
    | asign
    | lectura
    | l_impri
    ;

l_impri : (impri)+ ';'
    ;

impri : '>>' expr
    ;

lectura : '<<'
    | expr '<<'
    ;

asign : unario ';'
    ;

l_inst : (inst)+
    ;

metodo : AC ID '(' l_atrib ')' '{' c_met '}' FN ';'
    ;

funcion : RT tipo ID '(' l_atrib ')' '{' c_met '}' FN ';'
    ;

valor : expr
    | declStru
    ;

c_met : variables l_inst
    ;

variables : VAR '[' l_var ']'
    ;

l_var : (decl)+
    ;

declStru : '{' l_val '}'
    ;

l_val : l_val ',' ID ':' valor
    | ID ':' valor
    ;

struct : ST ID '{' l_atrib '}' FN ';'
    ;

l_atrib : atrib (',' atrib)*
    | atrib ';' (atrib ';')*
    ;

atrib : ta=(ES|SR) ID ':' tipo
    ;

lista : '{' cont '}'
    ;

cont : l_exp
    |
    ;

l_exp : expr (',' expr)*
    ;

arreg : '[' expr ']'
    |
    ;

tipo: 'textum'
    | 'decimalis'
    | 'numerus'
    | 'littera'
    | BOOL
    | ID
    ;

expr : expr op='||' and
    | and
    ;

and : and op='&&' iguDif
    | iguDif
    ;

iguDif : iguDif op=('=='|'!=') menMay
    | menMay
    ;

menMay : menMay op=('<'|'>'|'<='|'>=') sumRes
    | sumRes
    ;

sumRes : sumRes op=('+'|'-') mulDiv
    | mulDiv
    ;

mulDiv : mulDiv op=('*'|'/') unario
    | unario
    ;

unario : op=('--'|'++'|'-'|'+'|'non') postf
    | postf
    ;

postf : term ('++'|'--')
    | term
    ;

term : INT
    | DEC
    | TEXT
    | CHAR
    | BOOL
    | identi
    | '(' expr ')'
    ;

identi : ID
    | identi c_identi
    | ll_func
    ;

c_identi : '[' expr ']'
    | '.' ID
    ;

ll_func : ID '(' l_exp ')'
    ;

