public class CipherDecrypt {


    private String messages;
    //    String messages = message.toUpperCase();
    private int shiftKey;

    public CipherDecrypt(String messages, int shiftKey){
        this.messages = messages;
        this.shiftKey = shiftKey;
    }

    // decrypt the message

    public static String decrypt(String messages, int shiftKey){
        String characters = "zyxwvutsrqponmlkjihgfedcba";
        messages.toLowerCase();
        StringBuffer cypherText = new StringBuffer();
        for (int x=0; x<messages.length(); x++){
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


