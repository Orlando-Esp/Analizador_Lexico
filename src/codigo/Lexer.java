/* The following code was generated by JFlex 1.4.3 on 12/12/22 17:22 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/12/22 17:22 from the specification file
 * <tt>C:/Users/kikal/Documents/NetBeansProjects/AnalizadorLexico2/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\34\2\0\1\3\22\0\1\3\7\0\1\42\1\43"+
    "\1\40\1\36\1\3\1\37\1\46\1\33\12\2\1\53\1\41\1\51"+
    "\1\35\1\52\2\0\22\1\1\30\7\1\1\47\1\0\1\50\1\0"+
    "\1\1\1\0\1\14\1\12\1\15\1\11\1\4\1\16\1\17\1\32"+
    "\1\21\2\1\1\13\1\24\1\5\1\10\1\22\1\27\1\7\1\20"+
    "\1\6\1\25\1\26\1\1\1\23\1\1\1\31\1\44\1\0\1\45"+
    "\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\20\2\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\22\2\1\25"+
    "\14\2\1\4\1\0\32\2\1\25\10\2\1\0\40\2"+
    "\1\3\5\2\1\26\44\2\1\27\11\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[191];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\54\0\260\0\334\0\u0108"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\54\0\54"+
    "\0\54\0\54\0\54\0\u039c\0\54\0\54\0\54\0\54"+
    "\0\54\0\54\0\54\0\54\0\54\0\u03c8\0\u03f4\0\u0420"+
    "\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528\0\u0554\0\u0580"+
    "\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688\0\u06b4\0\u06e0"+
    "\0\u070c\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\u0814\0\u0840"+
    "\0\u086c\0\u0898\0\u08c4\0\u08f0\0\u091c\0\u0948\0\u0974\0\u09a0"+
    "\0\u09cc\0\u09f8\0\u0a24\0\u0a50\0\u0a7c\0\u0aa8\0\u0ad4\0\u0b00"+
    "\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0\0\u0bdc\0\u0c08\0\u0c34\0\u0c60"+
    "\0\u0c8c\0\u0cb8\0\u0ce4\0\u0d10\0\u0d3c\0\u0d68\0\u0d94\0\u0dc0"+
    "\0\130\0\u0dec\0\u0e18\0\u0e44\0\u0e70\0\u0e9c\0\u0ec8\0\u0ef4"+
    "\0\u0f20\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0\0\u0ffc\0\u1028\0\u1054"+
    "\0\u1080\0\u10ac\0\u10d8\0\u1104\0\u1130\0\u115c\0\u1188\0\u11b4"+
    "\0\u11e0\0\u120c\0\u1238\0\u1264\0\u1290\0\u12bc\0\u12e8\0\u1314"+
    "\0\u1340\0\u136c\0\u1398\0\u13c4\0\u13f0\0\u141c\0\u1448\0\u1474"+
    "\0\u14a0\0\u14cc\0\54\0\u14f8\0\u1524\0\u1550\0\u157c\0\u15a8"+
    "\0\130\0\u15d4\0\u1600\0\u162c\0\u1658\0\u1684\0\u16b0\0\u16dc"+
    "\0\u1708\0\u1734\0\u1760\0\u178c\0\u17b8\0\u17e4\0\u1810\0\u183c"+
    "\0\u1868\0\u1894\0\u18c0\0\u18ec\0\u1918\0\u1944\0\u1970\0\u199c"+
    "\0\u19c8\0\u19f4\0\u1a20\0\u1a4c\0\u1a78\0\u1aa4\0\u1ad0\0\u1afc"+
    "\0\u1b28\0\u1b54\0\u1b80\0\u1bac\0\u1bd8\0\130\0\u1c04\0\u1c30"+
    "\0\u1c5c\0\u1c88\0\u1cb4\0\u1ce0\0\u1d0c\0\u1d38\0\u1d64";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[191];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\10"+
    "\1\3\1\11\1\12\1\13\1\14\1\15\1\16\1\3"+
    "\1\17\1\20\1\21\1\3\1\22\1\3\1\23\1\3"+
    "\1\24\1\3\1\25\1\26\1\5\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\55\0\2\3\1\0\27\3"+
    "\23\0\1\4\52\0\2\3\1\0\1\3\1\46\12\3"+
    "\1\47\2\3\1\50\7\3\22\0\2\3\1\0\10\3"+
    "\1\51\10\3\1\52\5\3\22\0\2\3\1\0\1\53"+
    "\26\3\22\0\2\3\1\0\1\54\3\3\1\55\22\3"+
    "\22\0\2\3\1\0\4\3\1\56\22\3\22\0\2\3"+
    "\1\0\10\3\1\57\16\3\22\0\2\3\1\0\6\3"+
    "\1\60\20\3\22\0\2\3\1\0\4\3\1\61\2\3"+
    "\1\62\1\63\16\3\22\0\2\3\1\0\7\3\1\64"+
    "\1\65\4\3\1\66\11\3\22\0\2\3\1\0\10\3"+
    "\1\67\4\3\1\70\11\3\22\0\2\3\1\0\1\3"+
    "\1\71\16\3\1\72\6\3\22\0\2\3\1\0\3\3"+
    "\1\73\1\74\3\3\1\75\10\3\1\76\5\3\22\0"+
    "\2\3\1\0\4\3\1\77\10\3\1\100\11\3\22\0"+
    "\2\3\1\0\1\101\7\3\1\102\16\3\22\0\2\3"+
    "\1\0\15\3\1\103\11\3\22\0\2\3\1\0\10\3"+
    "\1\104\16\3\54\0\1\105\57\0\1\106\15\0\2\3"+
    "\1\0\2\3\1\107\24\3\22\0\2\3\1\0\2\3"+
    "\1\110\24\3\22\0\2\3\1\0\2\3\1\111\13\3"+
    "\1\112\10\3\22\0\2\3\1\0\2\3\1\113\24\3"+
    "\22\0\2\3\1\0\1\114\6\3\1\115\17\3\22\0"+
    "\2\3\1\0\2\3\1\116\24\3\22\0\2\3\1\0"+
    "\14\3\1\117\12\3\22\0\2\3\1\0\6\3\1\120"+
    "\20\3\22\0\2\3\1\0\4\3\1\121\22\3\22\0"+
    "\2\3\1\0\3\3\1\122\23\3\22\0\2\3\1\0"+
    "\14\3\1\123\12\3\22\0\2\3\1\0\3\3\1\124"+
    "\23\3\22\0\2\3\1\0\10\3\1\125\16\3\22\0"+
    "\2\3\1\0\5\3\1\126\6\3\1\115\1\3\1\127"+
    "\1\3\1\130\6\3\22\0\2\3\1\0\4\3\1\131"+
    "\22\3\22\0\2\3\1\0\7\3\1\132\17\3\22\0"+
    "\2\3\1\0\1\3\1\133\25\3\22\0\2\3\1\0"+
    "\7\3\1\134\17\3\22\0\2\3\1\0\1\3\1\115"+
    "\25\3\22\0\2\3\1\0\2\3\1\135\24\3\22\0"+
    "\2\3\1\0\16\3\1\136\10\3\22\0\2\3\1\0"+
    "\4\3\1\137\10\3\1\140\11\3\22\0\2\3\1\0"+
    "\3\3\1\141\23\3\22\0\2\3\1\0\23\3\1\142"+
    "\3\3\22\0\2\3\1\0\6\3\1\143\20\3\22\0"+
    "\2\3\1\0\5\3\1\144\21\3\22\0\2\3\1\0"+
    "\1\145\26\3\22\0\2\3\1\0\3\3\1\146\23\3"+
    "\22\0\2\3\1\0\11\3\1\147\15\3\22\0\2\3"+
    "\1\0\14\3\1\150\12\3\22\0\2\3\1\0\11\3"+
    "\1\151\15\3\21\0\34\105\1\0\17\105\2\0\1\152"+
    "\52\0\2\3\1\0\1\153\26\3\22\0\2\3\1\0"+
    "\1\141\7\3\1\154\16\3\22\0\2\3\1\0\15\3"+
    "\1\155\11\3\22\0\2\3\1\0\4\3\1\156\22\3"+
    "\22\0\2\3\1\0\15\3\1\114\11\3\22\0\2\3"+
    "\1\0\22\3\1\157\4\3\22\0\2\3\1\0\4\3"+
    "\1\141\22\3\22\0\2\3\1\0\4\3\1\160\22\3"+
    "\22\0\2\3\1\0\11\3\1\161\15\3\22\0\2\3"+
    "\1\0\7\3\1\162\17\3\22\0\2\3\1\0\7\3"+
    "\1\163\17\3\22\0\2\3\1\0\13\3\1\164\13\3"+
    "\22\0\2\3\1\0\2\3\1\165\24\3\22\0\2\3"+
    "\1\0\2\3\1\164\24\3\22\0\2\3\1\0\14\3"+
    "\1\166\12\3\22\0\2\3\1\0\1\167\26\3\22\0"+
    "\2\3\1\0\2\3\1\170\24\3\22\0\2\3\1\0"+
    "\6\3\1\171\20\3\22\0\2\3\1\0\2\3\1\172"+
    "\24\3\22\0\2\3\1\0\14\3\1\115\12\3\22\0"+
    "\2\3\1\0\10\3\1\173\16\3\22\0\2\3\1\0"+
    "\15\3\1\174\11\3\22\0\2\3\1\0\1\175\26\3"+
    "\22\0\2\3\1\0\3\3\1\176\1\177\2\3\1\200"+
    "\17\3\22\0\2\3\1\0\2\3\1\201\3\3\1\202"+
    "\20\3\22\0\2\3\1\0\1\3\1\203\20\3\1\204"+
    "\4\3\22\0\2\3\1\0\21\3\1\205\5\3\22\0"+
    "\2\3\1\0\7\3\1\206\17\3\22\0\2\3\1\0"+
    "\21\3\1\207\5\3\22\0\2\3\1\0\1\3\1\210"+
    "\25\3\22\0\2\3\1\0\5\3\1\211\21\3\22\0"+
    "\2\3\1\0\15\3\1\115\11\3\22\0\2\3\1\0"+
    "\2\3\1\212\24\3\22\0\2\3\1\0\1\74\26\3"+
    "\23\0\1\152\40\0\1\213\11\0\2\3\1\0\3\3"+
    "\1\164\23\3\22\0\2\3\1\0\2\3\1\214\24\3"+
    "\22\0\2\3\1\0\1\215\26\3\22\0\2\3\1\0"+
    "\3\3\1\216\23\3\22\0\2\3\1\0\10\3\1\141"+
    "\16\3\22\0\2\3\1\0\3\3\1\217\23\3\22\0"+
    "\2\3\1\0\10\3\1\220\16\3\22\0\2\3\1\0"+
    "\1\221\26\3\22\0\2\3\1\0\1\222\26\3\22\0"+
    "\2\3\1\0\4\3\1\221\22\3\22\0\2\3\1\0"+
    "\3\3\1\223\23\3\22\0\2\3\1\0\1\141\26\3"+
    "\22\0\2\3\1\0\1\3\1\224\25\3\22\0\2\3"+
    "\1\0\21\3\1\225\5\3\22\0\2\3\1\0\15\3"+
    "\1\202\11\3\22\0\2\3\1\0\10\3\1\226\16\3"+
    "\22\0\2\3\1\0\7\3\1\141\17\3\22\0\2\3"+
    "\1\0\5\3\1\157\21\3\22\0\2\3\1\0\3\3"+
    "\1\227\23\3\22\0\2\3\1\0\15\3\1\230\11\3"+
    "\22\0\2\3\1\0\3\3\1\231\23\3\22\0\2\3"+
    "\1\0\1\232\26\3\22\0\2\3\1\0\1\233\26\3"+
    "\22\0\2\3\1\0\10\3\1\74\16\3\22\0\2\3"+
    "\1\0\11\3\1\234\15\3\22\0\2\3\1\0\10\3"+
    "\1\235\16\3\22\0\2\3\1\0\1\236\26\3\22\0"+
    "\2\3\1\0\15\3\1\237\11\3\22\0\2\3\1\0"+
    "\7\3\1\115\17\3\22\0\2\3\1\0\2\3\1\240"+
    "\24\3\22\0\2\3\1\0\10\3\1\241\16\3\22\0"+
    "\2\3\1\0\1\242\26\3\22\0\2\3\1\0\15\3"+
    "\1\243\11\3\22\0\2\3\1\0\1\3\1\244\25\3"+
    "\22\0\2\3\1\0\2\3\1\245\24\3\22\0\2\3"+
    "\1\0\1\3\1\202\25\3\22\0\2\3\1\0\1\3"+
    "\1\132\25\3\22\0\2\3\1\0\10\3\1\246\16\3"+
    "\22\0\2\3\1\0\10\3\1\247\16\3\22\0\2\3"+
    "\1\0\10\3\1\221\16\3\22\0\2\3\1\0\3\3"+
    "\1\157\23\3\22\0\2\3\1\0\1\3\1\250\25\3"+
    "\22\0\2\3\1\0\12\3\1\251\14\3\22\0\2\3"+
    "\1\0\20\3\1\252\6\3\22\0\2\3\1\0\2\3"+
    "\1\202\24\3\22\0\2\3\1\0\20\3\1\253\6\3"+
    "\22\0\2\3\1\0\13\3\1\254\13\3\22\0\2\3"+
    "\1\0\15\3\1\255\11\3\22\0\2\3\1\0\5\3"+
    "\1\256\21\3\22\0\2\3\1\0\2\3\1\166\24\3"+
    "\22\0\2\3\1\0\11\3\1\256\15\3\22\0\2\3"+
    "\1\0\3\3\1\257\23\3\22\0\2\3\1\0\5\3"+
    "\1\260\21\3\22\0\2\3\1\0\20\3\1\157\6\3"+
    "\22\0\2\3\1\0\11\3\1\115\15\3\22\0\2\3"+
    "\1\0\5\3\1\166\21\3\22\0\2\3\1\0\10\3"+
    "\1\261\16\3\22\0\2\3\1\0\1\3\1\164\25\3"+
    "\22\0\2\3\1\0\11\3\1\262\15\3\22\0\2\3"+
    "\1\0\2\3\1\162\24\3\22\0\2\3\1\0\10\3"+
    "\1\263\16\3\22\0\2\3\1\0\15\3\1\74\11\3"+
    "\22\0\2\3\1\0\1\264\26\3\22\0\2\3\1\0"+
    "\15\3\1\265\11\3\22\0\2\3\1\0\16\3\1\133"+
    "\10\3\22\0\2\3\1\0\4\3\1\266\22\3\22\0"+
    "\2\3\1\0\10\3\1\267\16\3\22\0\2\3\1\0"+
    "\1\270\26\3\22\0\2\3\1\0\11\3\1\271\15\3"+
    "\22\0\2\3\1\0\2\3\1\157\24\3\22\0\2\3"+
    "\1\0\25\3\1\141\1\3\22\0\2\3\1\0\1\3"+
    "\1\272\25\3\22\0\2\3\1\0\5\3\1\273\21\3"+
    "\22\0\2\3\1\0\14\3\1\141\12\3\22\0\2\3"+
    "\1\0\3\3\1\115\23\3\22\0\2\3\1\0\15\3"+
    "\1\274\11\3\22\0\2\3\1\0\2\3\1\275\24\3"+
    "\22\0\2\3\1\0\10\3\1\266\16\3\22\0\2\3"+
    "\1\0\4\3\1\276\22\3\22\0\2\3\1\0\4\3"+
    "\1\267\22\3\22\0\2\3\1\0\1\3\1\277\25\3"+
    "\22\0\2\3\1\0\1\267\26\3\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7568];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\21\1\5\11\1\1\11\11"+
    "\40\1\1\0\43\1\1\0\40\1\1\11\64\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[191];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
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
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 122) {
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
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
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
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
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
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 12: 
          { lexeme=yytext(); return CierraParentesis;
          }
        case 24: break;
        case 19: 
          { lexeme=yytext(); return Mayorque;
          }
        case 25: break;
        case 23: 
          { lexeme=yytext(); return Modificadores;
          }
        case 26: break;
        case 22: 
          { lexeme=yytext(); return TipoDato;
          }
        case 27: break;
        case 11: 
          { lexeme=yytext(); return AbreParentesis;
          }
        case 28: break;
        case 18: 
          { lexeme=yytext(); return Menorque;
          }
        case 29: break;
        case 7: 
          { lexeme=yytext(); return Suma;
          }
        case 30: break;
        case 5: 
          { lexeme=yytext(); return Division;
          }
        case 31: break;
        case 17: 
          { lexeme=yytext(); return CierraCorchetes;
          }
        case 32: break;
        case 16: 
          { lexeme=yytext(); return AbreCorchetes;
          }
        case 33: break;
        case 6: 
          { lexeme=yytext(); return Igual;
          }
        case 34: break;
        case 15: 
          { lexeme=yytext(); return Punto;
          }
        case 35: break;
        case 13: 
          { lexeme=yytext(); return Abrellaves;
          }
        case 36: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 37: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 38: break;
        case 9: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 39: break;
        case 1: 
          { return ERROR;
          }
        case 40: break;
        case 20: 
          { lexeme=yytext(); return Dospuntos;
          }
        case 41: break;
        case 4: 
          { /*Ignore*/
          }
        case 42: break;
        case 14: 
          { lexeme=yytext(); return Cierrallaves;
          }
        case 43: break;
        case 21: 
          { lexeme=yytext(); return Reservadas;
          }
        case 44: break;
        case 8: 
          { lexeme=yytext(); return Resta;
          }
        case 45: break;
        case 10: 
          { lexeme=yytext(); return PuntoyComa;
          }
        case 46: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
