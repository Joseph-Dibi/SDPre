import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisitedException
{
  public static void main( String[] args )
  {
    PrintWriter fileout;
    double gas;
    Scanner scanner = new Scanner(System.in);

    try
    {
      fileout = new PrintWriter("receipt.txt");
    }
    catch ( IOException err )
    {
      System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
      System.out.println("Maybe the file exists and is read-only?");
      fileout = null;
      System.exit(1);
    }

    System.out.println("How many Gallons of gas do you want?");
    gas = scanner.nextDouble();
    double price = gas * 3.459;


    fileout.println( "+------------------------" );
    fileout.println( "|                        " );
    fileout.println( "|       Corner Store     " );
    fileout.println( "|                        " );
    fileout.println( "| Gallons:   \t" + gas     );
    fileout.println( "| Price/gallon: $ 3.459  " );
    fileout.println( "|                        " );
    fileout.println( "| Fuel Total:\t$" + price   );
    fileout.println( "+------------------------" );
    fileout.close();

  }
}
