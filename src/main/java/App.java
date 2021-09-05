
import java.io.Console;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Console output = System.console();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose E for Encrypt, D for Decrypt or Q for Quit");
        int choice = Integer.parseInt(output.readLine());

        if (choice == 1) {

            System.out.println("input the word to be incrypted");
            String text = scanner.nextLine();
            System.out.println("input the encryption Key");
            int key = Integer.parseInt(output.readLine());

//          CaesarCipher caesar = new CaesarCipher(text,key);
            System.out.println(CaesarCipher.encrypt(text, key));


        } else {
            System.out.println("input the word to be incrypted");
            String text = scanner.nextLine();
            System.out.println("input the encryption Key");
            int key = Integer.parseInt(output.readLine());

//          CaesarCipher caesar = new CaesarCipher(text,key);
            System.out.println(Cipherdecrypt.decrypt(text,key));

        }
    }
}
