/* The following code was generated by JFlex 1.3.5 on 10/26/20, 2:13 PM */

    
import java_cup.runtime.Symbol;
    

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 10/26/20, 2:13 PM from the specification file
 * <tt>file:/D:/Projects/Eclipse Workspace/htmlceva.zip_expanded/html/lexer.jflex</tt>
 */
class Lexer implements symbols, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\41\0\1\0\10\0\1\0\2\0\1\0\1\0\1\7\1\0\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\5\0\1\1\1\0\1\2\42\0"+
    "\1\12\1\3\1\24\1\5\1\14\1\10\1\26\1\25\1\20\1\0"+
    "\1\35\1\23\1\13\1\17\1\4\1\21\1\0\1\11\1\15\1\16"+
    "\1\22\1\37\1\36\1\40\1\6\1\41\uff85\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    34,    68,   102,   136,   170,   204,   238,   272,   306, 
      340,   374,   408,   442,   476,   510,   544,   578,   612,   646, 
      680,   714,    68,   748,   782,   816,   850,    68,   884,   918, 
      952,   986,  1020,  1054,  1088,  1122,  1156,  1190,  1224,  1258, 
     1292,  1326,  1360,  1394,  1428,  1462,  1496,  1530,  1564,    68, 
     1598,  1632,  1666,  1700,  1734,  1768,  1802,  1836,  1870,  1904, 
     1938,  1972,  2006,    68,  2040,    68,  2074,  2108,  2142,    68, 
     2176,  2210,  2244,    68,  2278,  2312,  2346,  2380,  2414,  2448, 
     2482,  2516,  2550,  2584,    68,    68,  2618,  2652,  2686,  2720, 
     2754,    68,    68,    68,    68,    68,    68,    68,    68,    68, 
     2788,  2822,  2856,  2890,  2924,  2958,  2992,  3026,  3060,  3094, 
     3128,  3162,  3196,  3230,  3264,  3298,  3332,  3366,  3400,  3434, 
     3468,  3502,  3536,  3570,  3604,  3638,  3672,  3706,  3740,  3774, 
     3808,  3842,  3876,  3910,  3944,  3978,  4012,    68,  4046,  4080, 
     4114,  4148,  4182,    68,    68,  4216,    68,  4250,    68,    68, 
       68,    68,    68,    68,    68,    68,    68,  4284,  4318,  4352, 
     4386,  4420,    68,    68,  4454,  4488,  4522,  4556,    68,  4590, 
     4624,  4658,  4692,  4726,  4760,  4794,  4828,  4862,  4896,  4930, 
     4964,  4998,  5032,  5066,  5100,  5134,  5168,  5202,  5236,  5270, 
     5304,  5338,  5372,  5406,  5440,  5474,  5508,    68,  5542,  5576, 
     5610,  5644,  5678,  5712,  5746,  5780,    68,    68,  5814,  5848, 
       68,    68,  5882,  5916,  5950,  5984,  6018,  6052,  6086,  6120, 
     6154,  6188,  6222,  6256,  6290,  6324,  6358,  6392,  6426,  6460, 
     6494,  6528,  6562,  6596,  6630,  6664,  6698,  6732,  6766,  6800, 
     6834,    68,  6868,    68,    68,  6902,  6936,  6970,  7004,  7038, 
     7072,    68,  7106,    68,    68,    68,  7140,    68,  7174,  7208, 
     7242,  7276,  7310,  7344,  7378,  7412,  7446,  7480,  7514,  7548, 
     7582,  7616,  7650,  7684,    68,    68,  7718,  7752,    68,  7786, 
       68,  7820,  7854,    68,  7888,  7922,  7956,  7990,  8024,  8058, 
     8092,  8126,  8160,  8194,  8228,  8262,  8296,    68,  8330,    68, 
     8364,  8398,  8432,  8466,  8500,  8534,  8568,  8602,  8636,  8670, 
     8704,  8738,  8772,    68,    68,  8806,  8840,  8874,  8908,    68, 
       68,  8942,  8976,  9010
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\0\1\2\1\3\1\4\1\5\1\6\3\0\1\7"+
    "\1\10\1\11\1\0\1\12\1\13\1\14\1\15\2\0"+
    "\1\16\1\17\1\20\10\0\1\21\1\22\5\0\1\23"+
    "\1\24\2\0\1\25\1\26\1\0\1\27\2\0\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\0\1\37"+
    "\70\0\1\40\13\0\1\41\32\0\1\42\33\0\1\43"+
    "\1\44\5\0\1\45\35\0\1\46\36\0\1\47\11\0"+
    "\1\50\1\51\27\0\1\52\45\0\1\53\2\0\1\54"+
    "\3\0\1\55\22\0\1\56\3\0\1\57\5\0\1\60"+
    "\33\0\1\61\34\0\1\62\40\0\1\63\5\0\1\64"+
    "\1\0\1\65\31\0\1\66\7\0\1\67\6\0\1\70"+
    "\1\0\1\71\25\0\1\72\2\0\1\73\1\74\2\0"+
    "\1\75\41\0\1\76\36\0\1\74\30\0\1\77\4\0"+
    "\1\100\51\0\1\101\1\0\1\102\21\0\1\103\1\104"+
    "\3\0\1\105\1\0\1\106\2\0\1\107\1\110\1\111"+
    "\1\112\1\113\1\114\1\115\1\0\1\116\20\0\1\117"+
    "\4\0\1\120\43\0\1\121\1\122\5\0\1\123\22\0"+
    "\1\124\1\0\1\125\3\0\1\126\1\127\12\0\1\130"+
    "\20\0\1\131\50\0\1\132\3\0\1\133\45\0\1\134"+
    "\36\0\1\135\32\0\1\136\15\0\1\137\1\140\1\141"+
    "\1\142\1\143\1\144\31\0\1\145\36\0\1\146\2\0"+
    "\1\147\22\0\1\150\5\0\1\151\10\0\1\152\10\0"+
    "\1\153\10\0\1\154\5\0\1\155\45\0\1\156\34\0"+
    "\1\62\53\0\1\62\13\0\1\62\26\0\1\157\33\0"+
    "\1\62\1\0\1\160\45\0\1\161\23\0\1\162\41\0"+
    "\1\163\47\0\1\164\37\0\1\56\50\0\1\165\23\0"+
    "\1\166\5\0\1\167\46\0\1\163\36\0\1\165\32\0"+
    "\1\170\54\0\1\171\32\0\1\172\36\0\1\173\11\0"+
    "\1\174\41\0\1\175\34\0\1\176\1\0\1\177\37\0"+
    "\1\200\43\0\1\201\45\0\1\202\42\0\1\203\25\0"+
    "\1\204\41\0\1\205\41\0\1\206\52\0\1\207\27\0"+
    "\1\210\56\0\1\211\1\0\1\212\22\0\1\213\4\0"+
    "\1\214\43\0\1\215\1\216\5\0\1\217\24\0\1\220"+
    "\3\0\1\221\1\222\12\0\1\223\20\0\1\224\37\0"+
    "\1\225\62\0\1\226\36\0\1\227\50\0\1\230\1\231"+
    "\1\232\1\233\1\234\1\235\16\0\1\236\5\0\1\237"+
    "\34\0\1\240\41\0\1\241\52\0\1\242\21\0\1\243"+
    "\15\0\1\244\24\0\1\245\40\0\1\246\52\0\1\247"+
    "\35\0\1\250\57\0\1\251\34\0\1\252\55\0\1\253"+
    "\15\0\1\254\34\0\1\255\40\0\1\256\42\0\1\257"+
    "\60\0\1\260\32\0\1\261\46\0\1\262\46\0\1\263"+
    "\25\0\1\62\54\0\1\264\42\0\1\265\27\0\1\266"+
    "\42\0\1\267\47\0\1\165\41\0\1\270\32\0\1\62"+
    "\45\0\1\271\47\0\1\272\34\0\1\62\46\0\1\62"+
    "\31\0\1\273\37\0\1\274\43\0\1\275\41\0\1\276"+
    "\40\0\1\277\36\0\1\45\40\0\1\300\40\0\1\301"+
    "\57\0\1\302\25\0\1\303\34\0\1\304\52\0\1\305"+
    "\31\0\1\306\53\0\1\307\26\0\1\310\52\0\1\311"+
    "\34\0\1\312\5\0\1\313\34\0\1\314\41\0\1\315"+
    "\52\0\1\316\21\0\1\317\15\0\1\320\23\0\1\321"+
    "\46\0\1\322\44\0\1\323\44\0\1\324\36\0\1\325"+
    "\51\0\1\326\32\0\1\327\32\0\1\330\57\0\1\331"+
    "\30\0\1\332\40\0\1\333\52\0\1\334\45\0\1\335"+
    "\17\0\1\336\60\0\1\337\41\0\1\340\40\0\1\341"+
    "\37\0\1\342\27\0\1\343\74\0\1\344\26\0\1\345"+
    "\33\0\1\346\40\0\1\62\37\0\1\347\50\0\1\350"+
    "\40\0\1\351\35\0\1\352\36\0\1\353\40\0\1\354"+
    "\31\0\1\355\52\0\1\356\41\0\1\357\42\0\1\62"+
    "\41\0\1\272\47\0\1\360\43\0\1\353\40\0\1\165"+
    "\31\0\1\265\52\0\1\62\20\0\1\361\43\0\1\362"+
    "\53\0\1\363\34\0\1\364\44\0\1\365\36\0\1\366"+
    "\51\0\1\367\32\0\1\370\50\0\1\371\27\0\1\372"+
    "\44\0\1\373\50\0\1\374\42\0\1\375\23\0\1\376"+
    "\47\0\1\377\32\0\1\u0100\46\0\1\u0101\45\0\1\u0102"+
    "\34\0\1\u0103\51\0\1\u0104\24\0\1\45\61\0\1\152"+
    "\32\0\1\u0105\50\0\1\u0106\22\0\1\u0107\13\0\1\u0108"+
    "\1\170\23\0\1\u0109\47\0\1\u010a\66\0\1\165\17\0"+
    "\1\u010b\35\0\1\u010c\54\0\1\u010d\22\0\1\u010e\52\0"+
    "\1\62\35\0\1\u010f\41\0\1\u0110\46\0\1\u0111\20\0"+
    "\1\u0112\12\0\1\u0113\42\0\1\64\46\0\1\u0114\26\0"+
    "\1\u0115\51\0\1\u0116\50\0\1\u0117\42\0\1\u0118\31\0"+
    "\1\u0119\37\0\1\u011a\44\0\1\u011b\42\0\1\u011c\36\0"+
    "\1\u011d\32\0\1\u011e\51\0\1\u011f\41\0\1\u0120\62\0"+
    "\1\62\10\0\1\u0121\46\0\1\u0122\47\0\1\165\25\0"+
    "\1\163\73\0\1\u0123\24\0\1\u0124\46\0\1\u0125\30\0"+
    "\1\u0126\36\0\1\u0127\45\0\1\165\42\0\1\u0128\41\0"+
    "\1\u0129\42\0\1\u012a\37\0\1\u012b\42\0\1\u012c\36\0"+
    "\1\u012d\42\0\1\u012e\41\0\1\u012f\47\0\1\u0130\30\0"+
    "\1\u0131\34\0\1\u0132\1\u0107\5\0\1\u0133\6\0\1\170"+
    "\55\0\1\265\17\0\1\176\41\0\1\u0134\46\0\1\353"+
    "\34\0\1\342\65\0\1\62\27\0\1\u0135\27\0\1\u0136"+
    "\40\0\1\u0137\42\0\1\u0138\41\0\1\u0139\43\0\1\u013a"+
    "\40\0\1\u013b\43\0\1\15\40\0\1\u013c\45\0\1\353"+
    "\14\0\1\u013d\6\0\1\346\43\0\1\62\53\0\1\265"+
    "\26\0\1\u013e\50\0\1\u013f\43\0\1\u0140\40\0\1\u0141"+
    "\44\0\1\u0142\35\0\1\45\45\0\1\u0143\40\0\1\u0144"+
    "\36\0\1\277\43\0\1\345\45\0\1\62\17\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  9,  0,  0,  0,  1,  9,  1,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  9, 
     0,  9,  0,  0,  0,  9,  0,  0,  0,  9,  0,  1,  0,  0,  0,  0, 
     0,  0,  0,  0,  9,  9,  0,  1,  0,  0,  0,  9,  9,  9,  9,  9, 
     9,  9,  9,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  0,  0,  0,  0,  0,  9, 
     9,  0,  9,  0,  9,  9,  9,  9,  9,  9,  9,  9,  9,  0,  0,  0, 
     0,  0,  9,  9,  0,  0,  0,  0,  9,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0,  0,  0, 
     1,  0,  0,  0,  0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  9,  9, 
     0,  0,  9,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  9,  0,  9,  9,  0,  0,  0,  0,  0,  1,  9,  0,  9,  9,  9, 
     0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  9,  9,  0,  0,  9,  0,  9,  0,  0,  9,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  0,  9,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  9,  0,  0,  0,  0,  9, 
     9,  0,  0,  0
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[9044];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 94) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 274: 
          {  return symbol(sym.center);  }
        case 325: break;
        case 255: 
          {  return symbol(sym.thread);  }
        case 326: break;
        case 163: 
          {  return symbol(sym.supOpen);  }
        case 327: break;
        case 162: 
          {  return symbol(sym.subOpen);  }
        case 328: break;
        case 156: 
          {  return symbol(sym.h6Close);  }
        case 329: break;
        case 92: 
          {  return symbol(sym.liOpen);  }
        case 330: break;
        case 91: 
          {  return symbol(sym.ulOpen);  }
        case 331: break;
        case 87: 
          {  return symbol(sym.thOpen);  }
        case 332: break;
        case 85: 
          {  return symbol(sym.trOpen);  }
        case 333: break;
        case 84: 
          {  return symbol(sym.tdOpen);  }
        case 334: break;
        case 75: 
          {  return symbol(sym.uClose);  }
        case 335: break;
        case 73: 
          {  return symbol(sym.iClose);  }
        case 336: break;
        case 69: 
          {  return symbol(sym.aClose);  }
        case 337: break;
        case 2: 
          {  return symbol(sym.endTag);  }
        case 338: break;
        case 65: 
          {  return symbol(sym.olOpen);  }
        case 339: break;
        case 94: 
          {  return symbol(sym.h1Open);  }
        case 340: break;
        case 95: 
          {  return symbol(sym.h2Open);  }
        case 341: break;
        case 96: 
          {  return symbol(sym.h3Open);  }
        case 342: break;
        case 97: 
          {  return symbol(sym.h4Open);  }
        case 343: break;
        case 98: 
          {  return symbol(sym.h5Open);  }
        case 344: break;
        case 99: 
          {  return symbol(sym.h6Open);  }
        case 345: break;
        case 137: 
          {  return symbol(sym.olClose);  }
        case 346: break;
        case 143: 
          {  return symbol(sym.tdClose);  }
        case 347: break;
        case 144: 
          {  return symbol(sym.trClose);  }
        case 348: break;
        case 146: 
          {  return symbol(sym.thClose);  }
        case 349: break;
        case 148: 
          {  return symbol(sym.pClose);  }
        case 350: break;
        case 149: 
          {  return symbol(sym.ulClose);  }
        case 351: break;
        case 150: 
          {  return symbol(sym.liClose);  }
        case 352: break;
        case 151: 
          {  return symbol(sym.h1Close);  }
        case 353: break;
        case 152: 
          {  return symbol(sym.h2Close);  }
        case 354: break;
        case 153: 
          {  return symbol(sym.h3Close);  }
        case 355: break;
        case 154: 
          {  return symbol(sym.h4Close);  }
        case 356: break;
        case 155: 
          {  return symbol(sym.h5Close);  }
        case 357: break;
        case 299: 
          {  return symbol(sym.selectClose);  }
        case 358: break;
        case 297: 
          {  return symbol(sym.optionClose);  }
        case 359: break;
        case 283: 
          {  return symbol(sym.selectOpen);  }
        case 360: break;
        case 280: 
          {  return symbol(sym.tableClose);  }
        case 361: break;
        case 278: 
          {  return symbol(sym.smallClose);  }
        case 362: break;
        case 275: 
          {  return symbol(sym.optionOpen);  }
        case 363: break;
        case 254: 
          {  return symbol(sym.tableOpen);  }
        case 364: break;
        case 251: 
          {  return symbol(sym.smallOpen);  }
        case 365: break;
        case 244: 
          {  return symbol(sym.fontClose);  }
        case 366: break;
        case 243: 
          {  return symbol(sym.formClose);  }
        case 367: break;
        case 241: 
          {  return symbol(sym.bodyClose);  }
        case 368: break;
        case 211: 
          {  return symbol(sym.fontOpen);  }
        case 369: break;
        case 210: 
          {  return symbol(sym.formOpen);  }
        case 370: break;
        case 207: 
          {  return symbol(sym.supClose);  }
        case 371: break;
        case 206: 
          {  return symbol(sym.subClose);  }
        case 372: break;
        case 197: 
          {  return symbol(sym.bodyOpen);  }
        case 373: break;
        case 192: 
          {  return symbol(sym.accesskey);  }
        case 374: break;
        case 187: 
          {  return symbol(sym.accesskey);  }
        case 375: break;
        case 49: 
          {  return symbol(sym.accesskey);  }
        case 376: break;
        case 168: 
          {  return symbol(sym.img);  }
        case 377: break;
        case 93: 
          {  return symbol(sym.hr);  }
        case 378: break;
        case 63: 
          {  return symbol(sym.br);  }
        case 379: break;
        case 320: 
          {  return symbol(sym.noframesClose);  }
        case 380: break;
        case 319: 
          {  return symbol(sym.framesetClose);  }
        case 381: break;
        case 314: 
          {  return symbol(sym.noframesOpen);  }
        case 382: break;
        case 313: 
          {  return symbol(sym.framesetOpen);  }
        case 383: break;
        case 257: 
          {  return symbol(sym.input);  }
        case 384: break;
        case 253: 
          {  return symbol(sym.tbody);  }
        case 385: break;
        case 250: 
          {  return symbol(sym.frame);  }
        case 386: break;
        case 22: 
          {  return symbol(sym.aOpen);  }
        case 387: break;
        case 26: 
          {  return symbol(sym.iOpen);  }
        case 388: break;
        case 27: 
          {  return symbol(sym.pOpen);  }
        case 389: break;
        case 28: 
          {  return symbol(sym.uOpen);  }
        case 390: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
