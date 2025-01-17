import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
public class Incryptable {
    public static void main(String[] args){

                Encryptable aes = new AES();

                String encryptedDataAES = aes.encrypt("Java Interface.");
                System.out.println("AES Encrypted: " + encryptedDataAES);

                String decryptedDataAES = aes.decrypt(encryptedDataAES);
                System.out.println("AES Decrypted: " + decryptedDataAES);

                Encryptable rsa = new RSA();


                String encryptedDataRSA = rsa.encrypt("Java Interface.");
                System.out.println("RSA Encrypted: " + encryptedDataRSA);

                String decryptedDataRSA = rsa.decrypt(encryptedDataRSA);
                System.out.println("RSA Decrypted: " + decryptedDataRSA);
            }
        }
