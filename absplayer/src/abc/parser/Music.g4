grammar Music;
import Configuration;

root: music EOF;
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


comment: '%' TEXT NEWLINE;
TEXT: ~'<'+; 
endline: comment? | NEWLINE;
DIGIT: [0-9];
NEWLINE: '\r'? '\n';
WHITESPACE : ' ' | '\t';
