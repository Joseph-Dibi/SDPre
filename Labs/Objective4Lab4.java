import java.util.Scanner;

public class Objective4Lab4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int num1;

    System.out.println( "Please enter a number: ");
    num1 = keyboard.nextInt();

    if ( num1 % 2 == 0)
    {
      System.out.println("The number is even.");
    }
    else if ( num1 % 2 == 1)
    {
      System.out.println("The number is odd.");
    }
    else
    {
      System.out.println("Type a real integer!");
    }
  }
}