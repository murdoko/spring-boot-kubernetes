import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

public class vulnerabilidad {
    
    public static void inyecta_vulnerabilidad() {
        try
        {
            Cipher c1 = Cipher.getInstance("DES"); // Noncompliant: DES works with 56-bit keys allow attacks via exhaustive search
        }
        catch(NoSuchAlgorithmException|NoSuchPaddingException e)
        {
        }
    }       
}
