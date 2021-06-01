/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;


import Configuration;




root: header music EOF;
header: index comment* title others* key;
index: 'X:' DIGIT+ endline;
title: 'T:' text+ endline;
others: composer | length |meter | tempo | voice+ |comment | SPACE ;
composer: 'C:' text+ endline;
length: 'L:' fraction endline;
meter: 'M:' ('C' | 'C|' | fraction) endline;
tempo: 'Q:' fraction '=' DIGIT+ endline;
voice: 'V:' text+ endline;
key: 'K:' BASENOTE KEYACCIDENTAL? MINOR? endline;

music: line+;
line: element* NEWLINE | voice | comment;
element: noteelement | tupletelement | BARLINE | NTHREPEAT | SPACE ;
noteelement: note | multinote;
note: pitch | rest;
rest: 'z' notelength?;
pitch: ACCIDENTAL? BASENOTE OCTAVE? notelength?;
OCTAVE: '\''+ | ','+ ;
notelength: (DIGIT+)? '/' (DIGIT+)? | DIGIT+;
ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';

tupletelement: tupletspec noteelement+;
tupletspec: '(' DIGIT;

multinote: '[' note+ ']';

BARLINE: '|' | '||' | '[|' | '|]' | ':|' | '|:';
NTHREPEAT: '[1' | '[2';

BASENOTE: [a-gA-G];
KEYACCIDENTAL:  '#' | 'b';
MINOR: 'm';
fraction: DIGIT+ '/' DIGIT+ ;
DIGIT: [0-9]+;
endline: comment? | NEWLINE;
LETTERS: [h-ln-zH-Z];
text: DIGIT | BASENOTE | LETTERS | MINOR | KEYACCIDENTAL | SYMBOLS | SPACE;
SYMBOLS:  '.' | '~' | '`' | '!' | '@' | '$' | '^' | '&' | '*' | '(' | ')' | '-' | '_' | '+' | '{' | '[' | '}' | ']' | '|' | '\\' | ';' | ':' | '\'' | '"' | '<' | '>' | ',' | '?';
comment: '%'  text NEWLINE;
NEWLINE: '\r'? '\n';
SPACE: [ ]+;