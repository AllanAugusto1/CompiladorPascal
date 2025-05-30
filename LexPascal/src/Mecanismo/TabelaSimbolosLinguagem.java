package LexPascal.src.Mecanismo;

import java.util.HashMap;

public class TabelaSimbolosLinguagem extends Definicoes {

    private HashMap<String, Token> tabela;

    public HashMap<String, Token> getTabela() {
        return tabela;
    }

    public TabelaSimbolosLinguagem(){
        this.tabela = new HashMap<>();
        this.tabela.put(this.getABSTRACT(), this.ABSTRACT);
        this.tabela.put(this.getANSICHAR(), this.ANSICHAR);
        this.tabela.put(this.getANSISTRING(), this.ANSISTRING);
        this.tabela.put(this.getARRAY(), this.ARRAY);
        this.tabela.put(this.getAS(), this.AS);
        this.tabela.put(this.getASM(), this.ASM);
        this.tabela.put(this.getASSEMBLER(), this.ASSEMBLER);
        this.tabela.put(this.getAUTOMATED(), this.AUTOMATED);
        this.tabela.put(this.getBEGIN(), this.BEGIN);
        this.tabela.put(this.getBOOLEAN(), this.BOOLEAN);
        this.tabela.put(this.getBREAK(), this.BREAK);
        this.tabela.put(this.getBYTE(), this.BYTE);
        this.tabela.put(this.getCASE(), this.CASE);
        this.tabela.put(this.getCDECL(), this.CDECL);
        this.tabela.put(this.getCHAR(), this.CHAR);
        this.tabela.put(this.getCLASS(), this.CLASS);
        this.tabela.put(this.getCONST(), this.CONST);
        this.tabela.put(this.getCONSTRUCTOR(), this.CONSTRUCTOR);
        this.tabela.put(this.getCONTINUE(), this.CONTINUE);
        this.tabela.put(this.getCURRENCY(), this.CURRENCY);
        this.tabela.put(this.getDEFAULT(), this.DEFAULT);
        this.tabela.put(this.getDEPRECATED(), this.DEPRECATED);
        this.tabela.put(this.getDESTRUCTOR(), this.DESTRUCTOR);
        this.tabela.put(this.getDISPOSE(), this.DISPOSE);
        this.tabela.put(this.getDIV(), this.DIV);
        this.tabela.put(this.getDO(), this.DO);
        this.tabela.put(this.getDOUBLE(), this.DOUBLE);
        this.tabela.put(this.getDOWNTO(), this.DOWNTO);
        this.tabela.put(this.getELSE(), this.ELSE);
        this.tabela.put(this.getEND(), this.END);
        this.tabela.put(this.getEXIT(), this.EXIT);
        this.tabela.put(this.getEXPORT(), this.EXPORT);
        this.tabela.put(this.getEXTENDED(), this.EXTENDED);
        this.tabela.put(this.getEXTERNAL(), this.EXTERNAL);
        this.tabela.put(this.getFALSE(), this.FALSE);
        this.tabela.put(this.getFAR(), this.FAR);
        this.tabela.put(this.getFILE(), this.FILE);
        this.tabela.put(this.getFINALIZATION(), this.FINALIZATION);
        this.tabela.put(this.getFINALIZED(), this.FINALIZED);
        this.tabela.put(this.getFINALLY(), this.FINALLY);
        this.tabela.put(this.getFOR(), this.FOR);
        this.tabela.put(this.getFORWARD(), this.FORWARD);
        this.tabela.put(this.getFUNCTION(), this.FUNCTION);
        this.tabela.put(this.getGOTO(), this.GOTO);
        this.tabela.put(this.getIF(), this.IF);
        this.tabela.put(this.getIMPLEMENTATION(), this.IMPLEMENTATION);
        this.tabela.put(this.getIN(), this.IN);
        this.tabela.put(this.getINHERITED(), this.INHERITED);
        this.tabela.put(this.getINITIALIZATION(), this.INITIALIZATION);
        this.tabela.put(this.getINLINE(), this.INLINE);
        this.tabela.put(this.getINT64(), this.INT64);
        this.tabela.put(this.getINTEGER(), this.INTEGER);
        this.tabela.put(this.getINTERFACE(), this.INTERFACE);
        this.tabela.put(this.getINTERRUPT(), this.INTERRUPT);
        this.tabela.put(this.getIS(), this.IS);
        this.tabela.put(this.getLABEL(), this.LABEL);
        this.tabela.put(this.getLIBRARY(), this.LIBRARY);
        this.tabela.put(this.getLONGINT(), this.LONGINT);
        this.tabela.put(this.getLONGWORD(), this.LONGWORD);
        this.tabela.put(this.getMESSAGE(), this.MESSAGE);
        this.tabela.put(this.getMOD(), this.MOD);
        this.tabela.put(this.getNEAR(), this.NEAR);
        this.tabela.put(this.getNEW(), this.NEW);
        this.tabela.put(this.getNIL(), this.NIL);
        this.tabela.put(this.getNODEFAULT(), this.NODEFAULT);
        this.tabela.put(this.getOBJECT(), this.OBJECT);
        this.tabela.put(this.getOF(), this.OF);
        this.tabela.put(this.getOPERATOR(), this.OPERATOR);
        this.tabela.put(this.getOVERLOAD(), this.OVERLOAD);
        this.tabela.put(this.getOVERRIDE(), this.OVERRIDE);
        this.tabela.put(this.getPACKED(), this.PACKED);
        this.tabela.put(this.getPASCAL(), this.PASCAL);
        this.tabela.put(this.getPLATFORM(), this.PLATFORM);
        this.tabela.put(this.getPRIVATE(), this.PRIVATE);
        this.tabela.put(this.getPROCEDURE(), this.PROCEDURE);
        this.tabela.put(this.getPROGRAM(), this.PROGRAM);
        this.tabela.put(this.getPROPERTY(), this.PROPERTY);
        this.tabela.put(this.getPROTECTED(), this.PROTECTED);
        this.tabela.put(this.getPUBLIC(), this.PUBLIC);
        this.tabela.put(this.getPUBLISHED(), this.PUBLISHED);
        this.tabela.put(this.getRAISE(), this.RAISE);
        this.tabela.put(this.getREAD(), this.READ);
        this.tabela.put(this.getREADLN(), this.READLN);
        this.tabela.put(this.getREADONLY(), this.READONLY);
        this.tabela.put(this.getREAL(), this.REAL);
        this.tabela.put(this.getRECORD(), this.RECORD);
        this.tabela.put(this.getREGISTER(), this.REGISTER);
        this.tabela.put(this.getREINTRODUCE(), this.REINTRODUCE);
        this.tabela.put(this.getREPEAT(), this.REPEAT);
        this.tabela.put(this.getREQUIRES(), this.REQUIRES);
        this.tabela.put(this.getRESIDENT(), this.RESIDENT);
        this.tabela.put(this.getRESOURCESTRING(), this.RESOURCESTRING);
        this.tabela.put(this.getSAFECALL(), this.SAFECALL);
        this.tabela.put(this.getSEALED(), this.SEALED);
        this.tabela.put(this.getSELF(), this.SELF);
        this.tabela.put(this.getSET(), this.SET);
        this.tabela.put(this.getSHL(), this.SHL);
        this.tabela.put(this.getSHORTINT(), this.SHORTINT);
        this.tabela.put(this.getSHORTSTRING(), this.SHORTSTRING);
        this.tabela.put(this.getSHR(), this.SHR);
        this.tabela.put(this.getSINGLE(), this.SINGLE);
        this.tabela.put(this.getSMALLINT(), this.SMALLINT);
        this.tabela.put(this.getSTDCALL(), this.STDCALL);
        this.tabela.put(this.getSTRICT(), this.STRICT);
        this.tabela.put(this.getSTRING(), this.STRING);
        this.tabela.put(this.getTHEN(), this.THEN);
        this.tabela.put(this.getTHREADVAR(), this.THREADVAR);
        this.tabela.put(this.getTO(), this.TO);
        this.tabela.put(this.getTRUE(), this.TRUE);
        this.tabela.put(this.getTRY(), this.TRY);
        this.tabela.put(this.getTYPE(), this.TYPE);
        this.tabela.put(this.getUINT64(), this.UINT64);
        this.tabela.put(this.getUNICODESTRING(), this.UNICODESTRING);
        this.tabela.put(this.getUNIT(), this.UNIT);
        this.tabela.put(this.getUNTIL(), this.UNTIL);
        this.tabela.put(this.getUSES(), this.USES);
        this.tabela.put(this.getVAR(), this.VAR);
        this.tabela.put(this.getVARARGS(), this.VARARGS);
        this.tabela.put(this.getVIRTUAL(), this.VIRTUAL);
        this.tabela.put(this.getWHILE(), this.WHILE);
        this.tabela.put(this.getWIDECHAR(), this.WIDECHAR);
        this.tabela.put(this.getWIDESTRING(), this.WIDESTRING);
        this.tabela.put(this.getWITH(), this.WITH);
        this.tabela.put(this.getWORD(), this.WORD);
        this.tabela.put(this.getWRITE(), this.WRITE);
        this.tabela.put(this.getWRITELN(), this.WRITELN);
        this.tabela.put(this.getXOR(), this.XOR);
        this.tabela.put(this.getAND(), this.AND);
        this.tabela.put(this.getOR(), this.OR);
        this.tabela.put(this.getNOT(), this.NOT);
        this.tabela.put(this.getDOT(), this.DOT);
        this.tabela.put(this.getCOMMA(), this.COMMA);
        this.tabela.put(this.getSEMICOLON(), this.SEMICOLON);
        this.tabela.put(this.getCOLON(), this.COLON);
        this.tabela.put(this.getDOUBLECOLON(), this.DOUBLECOLON);
        this.tabela.put(this.getASSIGNMENT_OPERATOR(), this.ASSIGNMENT_OPERATOR);
        this.tabela.put(this.getDOUBLE_DOT(), this.DOUBLE_DOT);
        this.tabela.put(this.getSINGLE_QUOTE(), this.SINGLE_QUOTE);
        this.tabela.put(this.getDOUBLE_QUOTE(), this.DOUBLE_QUOTE);
        this.tabela.put(this.getLEFT_PARENTHESES(), this.LEFT_PARENTHESES);
        this.tabela.put(this.getRIGHT_PARENTHESES(), this.RIGHT_PARENTHESES);
        this.tabela.put(this.getLEFT_AND_RIGHT_PARENTHESES(), this.LEFT_AND_RIGHT_PARENTHESES);
        this.tabela.put(this.getLEFT_BRACKETS(), this.LEFT_BRACKETS);
        this.tabela.put(this.getRIGHT_BRACKETS(), this.RIGHT_BRACKETS);
        this.tabela.put(this.getLEFT_AND_RIGHT_BRACKETS(), this.LEFT_AND_RIGHT_BRACKETS);
        this.tabela.put(this.getLEFT_BRACES(), this.LEFT_BRACES);
        this.tabela.put(this.getRIGHT_BRACES(), this.RIGHT_BRACES);
        this.tabela.put(this.getLEFT_AND_RIGHT_BRACES(), this.LEFT_AND_RIGHT_BRACES);
        this.tabela.put(this.getEQUAL_SIGN(), this.EQUAL_SIGN);
        this.tabela.put(this.getGREATER_THAN_SIGN(), this.GREATER_THAN_SIGN);
        this.tabela.put(this.getLESS_THAN_SIGN(), this.LESS_THAN_SIGN);
        this.tabela.put(this.getGREATER_THAN_OR_EQUAL_TO_SIGN(), this.GREATER_THAN_OR_EQUAL_TO_SIGN);
        this.tabela.put(this.getLESS_THAN_OR_EQUAL_TO_SIGN(), this.LESS_THAN_OR_EQUAL_TO_SIGN);
        this.tabela.put(this.getNOT_EQUAL_TO_SIGN(), this.NOT_EQUAL_TO_SIGN);
        this.tabela.put(this.getPLUS_SIGN(), this.PLUS_SIGN);
        this.tabela.put(this.getMINUS_SIGN(), this.MINUS_SIGN);
        this.tabela.put(this.getASTERISK_OR_MULTIPLICATION_SIGN(), this.ASTERISK_OR_MULTIPLICATION_SIGN);
        this.tabela.put(this.getFORWARD_SLASH_OR_DIVISION_SIGN(), this.FORWARD_SLASH_OR_DIVISION_SIGN);
        this.tabela.put(this.getCARET_OR_EXPONENTIATION_SIGN(), this.CARET_OR_EXPONENTIATION_SIGN);
        this.tabela.put(this.getPERCENT_SIGN(), this.PERCENT_SIGN);        
    }

}
