import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherTest {
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
    public void CaesarCipher_loops() {
    }
}