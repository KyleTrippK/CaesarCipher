public class CaesarCipher {

    private String message;
    private int shiftKey;

    public CaesarCipher (String message, int shiftKey){
        this.message = message;
        this.shiftKey = shiftKey;
    }

    // Encrypt the message

    public static StringBuffer encrypt(String text, int shiftKey){
        StringBuffer cypherText = new StringBuffer();
        for (int x=0; x<text.length(); x++){

        }
        return cypherText;
    }
    public String getMessage(){
        return message;
}
    public int getShiftKey(){
        return shiftKey;
    }
}
