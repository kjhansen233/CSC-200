public class Hansen_2 extends Menu
{
   public static void main(String[] args)
   {
      String[] menuOpts = {"Fah to Cel", "Cel to Fah", "Exit"};
      Menu mainMenu = new Menu(menuOpts); 
      int input = mainMenu.prompt();

      switch (input)
      {
         case 1:
              FtoC();
               break;
         case 2:
               CtoF();
               break;
         case 3:
               System.out.println("Good bye!");
               break;
         default:
               System.out.println("Somehow, you managed to enter an invalid option");
               break;
      }
   }
   
   /*************************************************************************************
   CtoF() - Prompts user for degrees in celsius, and displays the result in Fahrenheit.
   Accepts no paramaters, returns no paramters.
   *************************************************************************************/
   public static void CtoF()
   {
    double Ctemp =0;
    double Ftemp =0;
       
    System.out.println("Enter the temperature in Celsius:");
    Ctemp = grabDouble();
    
    Ftemp = (Ctemp*1.8)+32;
    System.out.println(Ctemp +" degrees Celsius is "+Ftemp+" degrees Fahrenheit");
   
   }
   
   /*************************************************************************************
   FtoC() - Prompts user for degrees in Fahrenheit, and displays the result in Celsius.
   Accepts no paramaters, returns no paramters.
   *************************************************************************************/
   public static void FtoC()
   {
    
    double Ctemp =0;
    double Ftemp =0;
        
    System.out.println("Enter the temperature in Fahrenheit:");
    Ftemp = grabDouble();
    Ctemp = (Ftemp-32)*(5.0/9.0);
    System.out.println(Ftemp +" degrees Fahrenheit is "+Ctemp+" degrees Celsius");
   
   }
   
}