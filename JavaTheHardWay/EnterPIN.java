import java.util.Scanner;

public class EnterPIN
{
  public static void main( String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String entry2;

    pin = 12345;

    System.out.println("Welcome to the bank of Java");

    System.out.print("Please enter your password: ");
    entry2 = keyboard.next();

    while ( ! entry2.equals("taco")  )
    {
      System.out.println("\nWrong Password, please try again.");
      System.out.print("Please enter your password: ");
      entry2 = keyboard.next();
    }

    System.out.print("Enter your PIN: " );
    entry = keyboard.nextInt();

    while (entry != pin)
    {
      System.out.println("\n Incorrect PIN. Try again.");
      System.out.print("Enter your PIN: " );
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN Accepted. Your account balance is $2.06");
  }
}
