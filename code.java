import java.util.*;

public class NewClass
{
    public static void main(String[] args)
    {
        int length = 10;
        System.out.println(password(length));
        int ATMPINlength=4;
        System.out.println(ATMPIN(ATMPINlength));

    }
    static char[] password(int len)
    {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                String symbols = "!@#$%&_";
        String values = Capital_chars + Small_chars +
                        numbers + symbols;
        Random rndm_method = new Random();
        char[] password = new char[len];
        for (int i = 0; i < len; i++)
        {
            password[i] =
              values.charAt(rndm_method.nextInt(values.length()));
        }
        return password;
    }
      static char[] ATMPIN(int len)
    {

        System.out.println("Generating ATM pin using random() : ");
        System.out.print("You ATM pin is : ");
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] ATMPIN = new char[len];
        for (int i = 0; i < len; i++)
        {
            ATMPIN[i] =
             numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return ATMPIN;
    }

}
