package w18comp1011s1mar22;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jwright
 */
public class PWgenerator
{
    /**
     * This create a byte array containing random bytes that can be used as 
     * a salt 
     */
    public static byte[] getSalt() throws NoSuchAlgorithmException
    {
        //provide a cryptographically strong random number generator that is non-
        //deterministic
        SecureRandom sr = SecureRandom.getInstanceStrong();
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }
    
    /**
     * This method will convert a password and salt into a hashed String containing
     * 128 characters
     */
    public static String getPassword(String pwToHash, byte[] salt)
    {
        String hashedPW=null;
        
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt);
            
            byte[] pwBytes = md.digest(pwToHash.getBytes());
            
            //loop over the pwBytes array and convert into a String of 2
            //digit hex values
            StringBuilder sb = new StringBuilder();
            
            for (int i=0; i<pwBytes.length; i++)
            {
                sb.append(String.format("%02x", pwBytes[i]));
            }
            
            hashedPW = sb.toString();
        } catch (NoSuchAlgorithmException ex)
        {
            Logger.getLogger(PWgenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return hashedPW;
    }
}