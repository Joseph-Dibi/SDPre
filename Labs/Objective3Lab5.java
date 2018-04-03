import java.util.Scanner;

public class Objective3Lab5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double num1, num2, num3;

    System.out.println("Please enter a number: ");
    num1 = input.nextDouble();

    System.out.println("Please enter another number: ");

    num2 = input.nextDouble();

    num3 = (num1 + num2);

    System.out.println("The sum of " + num1 + " + " + num2 + " = " + num3);
  
    input.close();
  }
}
