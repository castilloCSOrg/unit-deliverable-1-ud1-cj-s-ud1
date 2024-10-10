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
    /***** OUTPUT SECTION *****/
    //Professor approved of scanner use in UD1
    //Scanner to learn the base currency
    Scanner Base = new Scanner(System.in);
    System.out.println("Enter currencies current type");
    //Saves the scanner output and uppercases it
    String BaseCurrency = Base.nextLine().toUpperCase();
    //Checks if the inputed currency type is a valid one and if it isn't it exits the program
    checkvalid(BaseCurrency);
    //Scanner to learn the currency it is to be converted to
    Scanner ToConvert = new Scanner(System.in);
    System.out.println("Please enter the currency you would like to convert to");
    //Saves the scanner output and uppercases it
    String ConvertedCurrency=ToConvert.nextLine().toUpperCase();
    //Checks if the inputed currency type is a valid one and if it isn't it exits the program
    checkvalid(ConvertedCurrency);
    //Scanner to learn how much currency to be converted
    Scanner MonetaryAmount = new Scanner(System.in);
    System.out.println("Please enter a whole number of the amount of money to convert");
    String Money=MonetaryAmount.nextLine();
    try {
      int cash=Integer.parseInt(Money);
    } catch(Exception e){
      System.out.println("A integer was not input, rerun the code and enter a integer");
      System.exit(0);
    }
    int cash=Integer.parseInt(Money);
    System.out.println(cash);
    //Allowing the Exchange.java to be utilized in Main
    Exchange exchange = new Exchange();
    //Determining what the exchange rates are
    double rate1=exchange.rates(BaseCurrency);
    double rate2=exchange.rates(ConvertedCurrency);
    //Doing the math for the exhange rates
    //Making it into USD
    double cash_exchanged= cash*rate1;
    System.out.println(cash_exchanged);
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
      }
      else {
        System.out.println("Not a valid currency type, try again");
        System.exit(0);
      }
      } 
    }
      
  }

