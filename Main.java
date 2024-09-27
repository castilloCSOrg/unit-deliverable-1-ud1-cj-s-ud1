/********************************************
*	AUTHORS:	Cj Cryan
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	9/24/24
********************************************/

/********************************************
*	Currency calc
*********************************************
*	PROGRAM DESCRIPTION:
*	Can calculate the value of currency from one country to another
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <list of static methods and which teammate made each>
*********************************************/
import java.util.Scanner;
public class Main 
{
  /***** CONSTANT SECTION *****/

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/

    /***** INITIALIZATION SECTION *****/

    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/
    
    Scanner Base = new Scanner(System.in);
    System.out.println("Enter currencies current type");

    String BaseCurrency = Base.nextLine().toUpperCase();
    if (BaseCurrency.length()==3) {
      System.out.println("Currency is in "+BaseCurrency);
    } else {
      System.out.println("Please use the ISO-4217 to denote the currency as "+BaseCurrency+" is not a valid input");
      System.exit(0);
    }

    Scanner ToConvert = new Scanner(System.in);
    System.out.println("Please enter the currency you would like to convert to");

    String ConvertedCurrency=ToConvert.nextLine().toUpperCase();

    Exchange exchange = new Exchange();
    double rates=exchange.rates(BaseCurrency);
    System.out.println(rates);
  }
  /***** STATIC METHODS *****/
  {

  }
  public static void currencytype(String ConvertedCurrency)
  {

  }
}
