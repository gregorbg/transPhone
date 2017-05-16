grammar GenerativePhonology;

transposition: in MAPS out IF fullCtx #unilateral
    | BR_LEFT ctxPart BR_RIGHT in IFF out BR_LEFT ctxPart BR_RIGHT #bilateral
    ;

in: phoneme
  | LETTER
  | MORPH_BORDER
  | EMPTY
  ;

out: phoneme
   | LETTER
   | MORPH_BORDER
   | EMPTY
   ;

phoneme: PHONEME_BR_LEFT_RIGHT PHONEME+ PHONEME_BR_LEFT_RIGHT;


fullCtx: ctxPart INPUT ctxPart
       ;

ctxPart: LETTER
       | RANGE_BR_LEFT LETTER+ RANGE_BR_RIGHT
       | WORD_BORDER
       ;

BR_LEFT: '(';
BR_RIGHT: ')';
RANGE_BR_LEFT: '[';
RANGE_BR_RIGHT: ']';
PHONEME_BR_LEFT_RIGHT: '/';

MAPS: ':';
IF: PHONEME_BR_LEFT_RIGHT | '=>' | '->' | '^->';
IFF: '<->' | '<=>';

LETTER: [a-zA-ZäöüÄÖÜß];
PHONEME: [ɪiʏʊøəɛœɐɔŋʔʃʒθçð];

INPUT: '_'+;
WORD_BORDER: '#';
MORPH_BORDER: '^';
EMPTY: '<>';

WHITESPACE: [ \t\n] -> skip;