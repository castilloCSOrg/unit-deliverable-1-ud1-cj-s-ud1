/********************************************
*	AUTHORS:	Cj Cryan
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	10/10/24
********************************************/

/********************************************
*	Currency calc
*********************************************
*	PROGRAM DESCRIPTION:
*	Can calculate the value of currency from one country to another
*********************************************

*********************************************/
import java.util.Scanner;
public class Main 
{
  /***** CONSTANT SECTION *****/
  public static Exchange exchange = new Exchange();
  private static String BaseCurrency="";
  private static String ConvertedCurrency="";
  
   public static void main(String[] args)
  {
    /***** OUTPUT SECTION *****/
    String Continue="Y";
    while (Continue.equals("Y")){
      currencytype();
      Scanner Loop=new Scanner(System.in); 
      System.out.println("Would you like to continue converting currency? (Y/N) ");
      Continue = Loop.nextLine().toUpperCase();
    
      while (! Continue.equals("N")){
        Loop=new Scanner(System.in); 
        System.out.println("Invalid input, please try again (Y/N) ");
        Continue = Loop.nextLine().toUpperCase();
    }
    } 
    
    
  }
  /***** STATIC METHODS *****/
  {

  }
  public static void currencytype()
  {
    //Professor approved of scanner use in UD1
    //Scanner to learn the base currency
    Scanner Base = new Scanner(System.in);
    System.out.println("Enter currencies current type");
    //Saves the scanner output and uppercases it
    Main.BaseCurrency = Base.nextLine().toUpperCase();
    //Checks if the inputed currency type is a valid one and if it isn't it exits the program
    Main.BaseCurrency=checkvalid(Main.BaseCurrency);
    //Scanner to learn the currency it is to be converted to
    Scanner ToConvert = new Scanner(System.in);
    System.out.println("Please enter the currency you would like to convert to");
    //Saves the scanner output and uppercases it
    Main.ConvertedCurrency=ToConvert.nextLine().toUpperCase();
    //Checks if the inputed currency type is a valid one and if it isn't it exits the program
    Main.ConvertedCurrency=checkvalid(Main.ConvertedCurrency);
    int cash=GetMoney();
    //Determining what the exchange rates are
    double rate1=exchange.rates(BaseCurrency);
    double rate2=exchange.rates(ConvertedCurrency);
    //Doing the math for the exhange rates
    //Making it into USD
    double cash_exchanged= cash*(1/rate1);
    cash_exchanged=cash_exchanged*(rate2);
    System.out.printf("$%,d%s%s%s%s%s$%,.2f\n",cash," coverted from ",BaseCurrency," to ",ConvertedCurrency," is ",cash_exchanged);
  }
  public static String checkvalid(String Currency)
  {
    double rate=exchange.rates(Currency);
    //Checking if the user inputed currecy is an ISO recognized by using the Exchange.java file and placed into a loop until it is a ISO currency.
    while (Currency.length()!=3 || rate==0.0 ){
      System.out.println("Not a valid currency type, try again\n");
      Scanner C = new Scanner(System.in);
      System.out.println("Enter the ISO code for the currencies current type");
      Currency = C.nextLine().toUpperCase();
      rate=exchange.rates(Currency);
    }
    return Currency;
      
  }
  public static int GetMoney(){
    Scanner scanner = new Scanner(System.in);
    int intValue=0;
    //Placing into a loop until a correct int value is passed
    do {
      System.out.print("Please enter a intger with the amount money that you would like to convert (Must be above 0) \n");
      String next = scanner.next();
      try {
          intValue = Integer.parseInt(next);
      //Catches if a user inputs a string value to prevent the code from breaking
      } catch (NumberFormatException exp) {
      }
  } while (intValue <= 0);
  
  return intValue;

  }
}

