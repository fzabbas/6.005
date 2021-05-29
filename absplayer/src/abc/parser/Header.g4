/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */

/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this folder
 * (src/abc/parser) and run the following command:
 * 
 * java -jar ../../../lib/antlr.jar Header.g4
 *
 */

grammar Header;
import Configuration;

/*
 * Nonterminal rules (a.k.a. parser rules) must be lowercase, e.g. "root" and "sum" below.
 *
 * Terminal rules (a.k.a. lexical rules) must be UPPERCASE, e.g. NUMBER below.
 * Terminals can be defined with quoted strings or regular expressions.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special token
 * EOF so that it describes the entire input. Below, "root" is the start rule.
 *
 */
 
 
root : header EOF;
header: index; /* comment* title otherfields* key; */
index: 'X:' DIGIT+ endline;
title: 'T:' TEXT+ endline;
otherfields: composer | length | meter | tempo | voice+; 
composer: 'C:' TEXT endline;
length: 'L:' DIGIT+ '/' (DIGIT+)? endline;
meter: 'M:' 'C' | 'C|' | DIGIT+ '/' DIGIT+ endline;
tempo: 'Q:' DIGIT+ '/' DIGIT+ '=' DIGIT+ endline;
voice: 'V:' TEXT+ endline;
key: 'K:' BASENOTE accidental? 'm'? endline;
BASENOTE: [a-gA-G];
accidental: '#' | 'b';
comment: '%' TEXT NEWLINE;
TEXT: ~'<'+; 
endline: comment? | NEWLINE;
DIGIT: [0-9];
NEWLINE: '\r'? '\n';
SPACES : [ ]+ -> skip;

  