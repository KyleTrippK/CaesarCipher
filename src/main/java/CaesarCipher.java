
public class CaesarCipher {


    private String messages;
//    String messages = message.toUpperCase();
    private int shiftKey;

    public CaesarCipher (String messages, int shiftKey){
        this.messages = messages;
        this.shiftKey = shiftKey;
    }

    // Encrypt the message

    public static String encrypt(String messages, int shiftKey){
        String characters = "abcdefghijklmnopqrstuvwxyz";
        messages.toLowerCase();
        int messageLength = messages.length();
        StringBuffer cypherText = new StringBuffer();
            for (int x=0; x<messageLength; x++){
                if(!Character.isLetter(messages.charAt(x))){
                    cypherText.append(messages.charAt(x));
                }else{
                    int  character = characters.indexOf(messages.charAt(x));
                    int shift =(character + shiftKey)%26;
                    char cypher = characters.charAt(shift);
                    cypherText.append(cypher).toString();
                }
            }
        return cypherText.toString();
    }
    public String getMessage(){

        return messages;
    }
    public int getShiftKey(){
        return shiftKey;
    }
}
