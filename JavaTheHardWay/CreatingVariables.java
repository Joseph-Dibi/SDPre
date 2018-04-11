public class CreatingVariables
{
  public static void main( String[] args )
  {
    int x, y, age, tacos;
    double seconds, e, checking, minutes;
    String firstName, lastName, title, gfName, gfLastName;

    x = 10;
    y = 400;
    age = 39;
    minutes = 42.76;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    tacos = 99;

    firstName = "Joseph";
    lastName = "DiBiasi";
    title = "Mr.";
    gfName = "Caroline";
    gfLastName = "Campbell";

    System.out.println( " The variable x contains " + x );

    System.out.println( " The value " + y + " is stored in the variable y." );

    System.out.println( "The experiement took " + seconds + " seconds.");

    System.out.println( "A favorite irrational # is Euler's number: " + e );

    System.out.println( "Hopefully you have more than $" + checking + "!");

    System.out.println( "My name's " + title + " " + firstName + " " + lastName );

    System.out.println( "My girlfriend " + gfName + " " + gfLastName + " is the best girlfriend ever.");

    System.out.println( "She can make " + tacos + " tacos in " + minutes + " minutes. It's impressive.");

  }
}
