import javax.crypto.Cipher;

public class vulnerabilidad {
    
    public static void inyecta_vulnerabilidad() {
        try
        {
            // Cipher c1 = Cipher.getInstance("DES"); // Noncompliant: DES works with 56-bit keys allow attacks via exhaustive search
        }
        catch(Exception e)
        {
        }
    } 
}
