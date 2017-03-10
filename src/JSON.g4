grammar JSON;

json    :   array
        |   object
        ;

array       :   '['  element (',' element )* ']'        # arraynotempty
            |   '[' ']'                                 # arrayempty
            ;
element    :    INT | object | array | STRING | 'true' | | 'false' | 'null'
            ;
object      :   '{' '}'                                 # objectempty
            |   '{' pair(',' pair)* '}'                 # objectnotempty
            ;
pair        :   key ':' element
            ;
key         :   STRING
            ;
STRING      : '"' ~["]+ '"'
            ;
INT         : [0-9]+
            ;
NL          : [ \t\r\n] -> skip
            ;