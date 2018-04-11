import java.util.Scanner;

public class RudeQuestions
{
  public static void main( String[] args)
  {
    String name, pet;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.println("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!! ");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println( name + ".");

    System.out.print( "What is the name of your pet? ");
    pet = keyboard.next();
    System.out.println("Wow, " + pet + " is a very cool name.");

    //It does not blow up because an integer is still a double, but a double is not always an integer.
    //It does not because Strings are flexible and will basically take anything.
    //I blew up a String using cntrl-c or by exceeding the amount that could be stored in a String.
    //A double or String wrecked how old I was.
    //A String wrecked the double questions
  }
}
