package w18comp1011s1mar22;

import java.security.NoSuchAlgorithmException;

/**
 *
 * @author jwright
 */
public class TestingPWGenerator
{
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        testSaltGenerator();
        showPasswords();
    }
    
    public static void showPasswords() throws NoSuchAlgorithmException
    {
       // byte[] salt = PWgenerator.getSalt();
        for (int i=1; i<=10; i++)
            System.out.println(PWgenerator.getPassword("test", PWgenerator.getSalt()));
    }
    
    public static void testSaltGenerator() throws NoSuchAlgorithmException
    {
        for (int i=1; i<=10; i++)
        {
            byte[] salt = PWgenerator.getSalt();
            for (byte character:salt)
                System.out.printf("%s", character);
            System.out.println();
        }
    }
}
