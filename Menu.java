import java.util.Scanner;
/*************************************************************************************
   Menu Class - Prompts user to enter a number which coorelates to a menu option.
   Default Constructors: Handles no parameters, and an array of type "String".
   Methods: showMenu(), prompt();
   Notes: While still functional, a menu initialized with default constructor is useless.
   *************************************************************************************/

public class Menu
{
  //Holds the menu options.
  String[] opts;



   /*************************************************************************************
   Menu() - Default constructor.
   Accepts: Nothing
   Returns: Nothing
   Notes:
   **************************************************************************************/

  public Menu()
  {
    opts = new String[2]; 
    opts[0] = "Menu Not Initialized";
    opts[1] = "Please initialize menu before use";
  }

   /*************************************************************************************
   Menu(String[] params) - Initializes the menu.
   Accepts: An array of strings
   Returns: Nothing
   Notes:
   **************************************************************************************/
   public Menu(String[] params)
   {

     opts = new String[params.length];
     for (int i=0; i < params.length; i++)
     {
         opts[i]=(params[i]);
     }

   }
  
   /*************************************************************************************
   showMenu() - displays menu.
   Accepts: Nothing
   Returns: Nothing
   Notes:
   **************************************************************************************/
   
   public void showMenu()
   {
      int optionNumber =1;
      for(int i = 0; i < opts.length; i++)
      {
         System.out.println(Integer.toString(optionNumber)+". "+opts[i]);
         optionNumber++;
      }

   }

   /*************************************************************************************
   menu() - Prompts user to enter a number which coorelates to a menu option.  If input is invalid, loops.
   Accepts: Nothing
   Returns: Integer
   Notes: Requires user to enter a correct response in order to break from loop.
   *************************************************************************************/

   public int prompt()
   {
      boolean flag = true;
      Scanner scan = new Scanner(System.in);
      String input = null;
      int choice = 0;

      do
      {
         showMenu();
         input = scan.nextLine();
         if (isValidInteger(input))
         {
            choice = Integer.parseInt(input);
            if (choice <= opts.length && choice > 0)
            {
               flag = false;
            }
            else
            {
               System.out.println("The number you entered does not coorespond to an item on the menu.");
               System.out.println("Please select again");
            }
         }
         else
         {
         System.out.println("Please enter the number associated with your choice.  No letters or punctuation.");
         System.out.println("Please select again");
         }
      }while(flag);
      return choice;
    }
   
   /*************************************************************************************
   isValidInteger() - Checks user input to ensure an interger was entered. Returns true if yes, false if no.
   Accepts: String
   Returns: Boolean
   *************************************************************************************/

   public static boolean isValidInteger(String input)
   {
      try
      {
         Integer.parseInt(input);
      }
      catch(Exception message)
      {
         return false;
      }
      return true;
   }
   
   /*************************************************************************************
   isValidDouble() - Checks user input to ensure an interger was entered. Returns true if yes, false if no.
   Accepts: String
   Returns: Boolean
   *************************************************************************************/
   public static boolean isValidDouble(String input)
   {
      try
      {
         Double.parseDouble(input);
      }
      catch(Exception message)
      {
         return false;
      }
      return true;
   }
   
   /*************************************************************************************
   grabInteger() - Guarenteed to return an integer from user input.
   Accepts: Nothing
   Returns: Integer
   *************************************************************************************/
   public static int grabInteger()
   {
      do
      {
      Scanner scan = new Scanner(System.in);
      String input = null;
      input = scan.nextLine();
      if (isValidInteger(input))
         return Integer.parseInt(input);
      else
         System.out.println("Input was not valid integer.  Please try again.");
      }while(true);
   }
   
   /*************************************************************************************
   grabDouble() - Guarenteed to return a double from user input.
   Accepts: Nothing
   Returns: Double
   *************************************************************************************/
   public static double grabDouble()
   {
      do
      {
      Scanner scan = new Scanner(System.in);
      String input = null;
      input = scan.nextLine();
      if (isValidDouble(input))
         return Double.parseDouble(input);
      else
         System.out.println("Input was not valid.  Please try again.");
      }while(true);
   }
   
   /*************************************************************************************
   grabString() - Returns string from user input.
   Accepts: Nothing
   Returns: String
   *************************************************************************************/

   public static String grabString()
   {
      Scanner scan = new Scanner(System.in);
      return scan.nextLine();
   }   
}