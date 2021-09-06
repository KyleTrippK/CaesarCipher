import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherTest {

    //encryption tests
    @Test
    public void CaesarCipher_readsText_string() {
        CaesarCipher testCaesar = new CaesarCipher("message", 3);
        assertEquals("message", testCaesar.getMessage());
    }

    @Test
    public void CaesarCipher_takesKeys_string() {
        CaesarCipher testCaesar = new CaesarCipher("message", 3);
        assertEquals(3, testCaesar.getShiftKey());
    }

    @Test
    public void CaesarCipher_encrypts_otd(){
        CaesarCipher encrypt = new CaesarCipher("otd", 5);
        assertEquals("otd", encrypt.encrypt("joy", 5));
    }

    // Decryption tests
    @Test
    public void CipherDecrypt_reads_input() {
        CaesarCipher testCipher = new CaesarCipher("joy", 5);
        assertEquals("joy", testCipher.getMessage());
    }
    @Test
    public void CipherDecrypt_reads_shiftKey() {
        CaesarCipher testCipher = new CaesarCipher("joy ", 5);
        assertEquals(5, testCipher.getShiftKey());
    }
    @Test
    public void CaesarDecrypt_decrypts_joy(){
        CipherDecrypt decrypt = new CipherDecrypt("joy", 5);
        assertEquals("joy", decrypt.decrypt("otd", 5));
    }
}