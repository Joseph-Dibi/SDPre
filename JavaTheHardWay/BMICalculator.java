import java.util.Scanner;

public class BMICalculator
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double in, pd, m, kg, bmi;
    int ft;

    System.out.print("Your height (feet only): ");
    ft = keyboard.nextInt();
    System.out.print("Your height (inches only): ");
    in = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    pd = keyboard.nextDouble();

    kg = pd * 0.45359237;
    m = (ft * 12 + in )* 0.0254;
    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi );
  }
}
