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
    checkvalid(BaseCurrency);

    Scanner ToConvert = new Scanner(System.in);
    System.out.println("Please enter the currency you would like to convert to");

    String ConvertedCurrency=ToConvert.nextLine().toUpperCase();
    checkvalid(ConvertedCurrency);

    Exchange exchange = new Exchange();
    double rate1=exchange.rates(BaseCurrency);
    double rate2=exchange.rates(ConvertedCurrency);

    System.out.println(rate1);
  }
  /***** STATIC METHODS *****/
  {

  }
  public static void currencytype(String ConvertedCurrency)
  {

  }
  public static void checkvalid(String CurrencyType)
  {
    if (CurrencyType.length()==3) {
      Exchange exchange = new Exchange();
      double rate=exchange.rates(CurrencyType);
      if (rate!=0.0){
        System.out.println(rate);
      if (rate==0.0){
        System.out.println("Not a valid currency type, try again");
      }
      } 
    }
     else {
      System.out.println("Please use the ISO-4217 to denote the currency as "+CurrencyType+" is not a valid input");
      System.exit(0);
          }
  }
}
