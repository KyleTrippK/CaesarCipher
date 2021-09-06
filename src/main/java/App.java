
import java.io.Console;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Console output = System.console();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose E for Encrypt, D for Decrypt or Q for Quit");
        int choice = Integer.parseInt(output.readLine());

        if (choice == 1) {

            System.out.println("input the text to be Encrypted");
            String text = scanner.nextLine();
            System.out.println("input the shiftKey");
            int key = Integer.parseInt(output.readLine());

//          CaesarCipher caesar = new CaesarCipher(text,key);
            System.out.println(CaesarCipher.encrypt(text, key));


        } else {
            System.out.println("input the cypher text to be Decrypted");
            String text = scanner.nextLine();
            System.out.println("input the shiftKey");
            int key = Integer.parseInt(output.readLine());

//          CaesarCipher caesar = new CaesarCipher(text,key);
            System.out.println(CipherDecrypt.decrypt(text,key));

        }
    }
}
