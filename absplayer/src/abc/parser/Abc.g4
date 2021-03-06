/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;


root: header music EOF;



header: index comment* title otherfields* key;
index: 'X:' DIGIT+ endline;
title: 'T:' TEXT+ endline;
otherfields: composer | length | meter | tempo | voice+; 
composer: 'C:' TEXT endline;
length: 'L:' DIGIT+ '/' (DIGIT+)? endline;
meter: 'M:' 'C' | 'C|' | DIGIT+ '/' DIGIT+ endline;
tempo: 'Q:' DIGIT+ '/' DIGIT+ '=' DIGIT+ endline;
key: 'K:' BASENOTE accidental? 'm'? endline;
accidental: '#' | 'b';



music: element* NEWLINE | voice | comment;
element: noteelement | BARLINE | tupletelement | nthrepeat | WHITESPACE;

noteelement: note | multinote;
note: pitch | rest;
pitch: ACCIDENTAL? BASENOTE OCTAVE? notelength?;
rest: 'z' notelength?;
notelength: ((DIGIT+)? '/' (DIGIT)?) | DIGIT+;
multinote: '[' note+ ']';

tupletelement: tupletspec noteelement+;
tupletspec: '(' DIGIT;

BARLINE: '|' | '[|' | '|]' | '|:' | ':|';
nthrepeat: '[1' | '[2';

voice: 'V:' TEXT+ endline;
OCTAVE: '\''+ | ','+;

ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';
BASENOTE: [a-gA-G];
WHITESPACE : ' ' | '\t';





comment: '%' TEXT NEWLINE;
TEXT: ~'<'+; 
endline: comment? | NEWLINE;
DIGIT: [0-9];
NEWLINE: '\r'? '\n';
SPACES : [ ]+ -> skip;