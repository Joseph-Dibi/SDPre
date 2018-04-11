import java.io.PrintWriter;

public class ReceiptRevisited
{
    public static void main(String[] args ) throws Exception
    {
      PrintWriter fileout = new PrintWriter("receipt.txt");

      fileout.println( "+------------------------+" );
      fileout.println( "|                        |" );
      fileout.println( "|      Corner Store      |" );
      fileout.println( "|                        |" );
      fileout.println( "|  2018-04-2  7:56PM     |" );
      fileout.println( "|                        |" );
      fileout.println( "| Gallons:       12.464  |" );
      fileout.println( "| Price/gallon: $ 3.459  |" );
      fileout.println( "|                        |" );
      fileout.println( "| Fuel total:   $43.11   |" );
      fileout.println( "+------------------------+" );
      fileout.close();
    }
}
