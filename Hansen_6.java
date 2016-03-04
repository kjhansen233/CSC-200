import java.util.Scanner;

public class Hansen_6 extends Menu
{
   public static void main(String[] args)
   {
      //Declare Menu options
      String[] opts ={"Ounces to Grams",
                   "Grams to Ounces",
                   "Pounds to Kilograms",
                   "Kilograms to Pounds",
                   "Feet to Meters",
                   "Meters to Feet",
                   "Miles to Kilometers",
                   "Kilometers to Miles",
                   "Exit"};
      
      Menu main = new Menu(opts);
      int choice=0;
   
      do
      {
         choice=main.prompt();
         switch (choice)
         {
            case 1:
               OuncesToGrams();
               break;
            case 2:
               GramsToOunces();
               break;
            case 3:
               PoundsToKilos();
               break;
            case 4:
               KilosToPounds();
               break;
            case 5:
               FeetToMeters();
               break;
            case 6:
               MetersToFeet();
               break;
            case 7:
               MilesToKiloms();
               break;
            case 8:
               KilomsToMiles();
               break;
            case 9:
               System.out.println("Good bye!");
               break;
            default:
               System.out.println("Somehow, you managed to enter an invalid option");
               break;
         }      
      }while(choice != 9);   
   }
   
   public static void OuncesToGrams()
   {
   Scanner scan = new Scanner(System.in);
   double ounces;
   System.out.println("How many ounces?");
   ounces = grabDouble();
   System.out.println(ounces+" ounces is " +(ounces*28.375)+" grams");
   System.out.println("Press Enter to Continue...");
   scan.nextLine();
   }
   
   public static void GramsToOunces()
   {
   Scanner scan = new Scanner(System.in);
   double grams;
   System.out.println("How many grams?");
   grams = grabDouble();
   System.out.println(grams+" grams is " +(grams*0.035)+" ounces");
   System.out.println("Press Enter to Continue...");
   scan.nextLine();
   }
   
   public static void PoundsToKilos()
   {
   Scanner scan = new Scanner(System.in);
   double pounds;
   System.out.println("How many pounds?");
   pounds = grabDouble();
   System.out.println(pounds+" pounds is " +(pounds*0.454)+" kilograms");
   System.out.println("Press Enter to Continue...");
   scan.nextLine();
   }

   public static void KilosToPounds()
   {
   Scanner scan = new Scanner(System.in);
   double kilos;
   System.out.println("How many kilos?");
   kilos = grabDouble();
   System.out.println(kilos+" kilos is " +(kilos*2.204)+" pounds");
   System.out.println("Press Enter to Continue...");
   scan.nextLine();
   }
   
   public static void FeetToMeters()
   {
   Scanner scan = new Scanner(System.in);
   double feet;
   System.out.println("How many feet?");
   feet = grabDouble();
   System.out.println(feet+" feet is " +(feet*0.3)+" meters");
   System.out.println("Press Enter to Continue...");
   scan.nextLine();
   }

   public static void MetersToFeet()
   {
   Scanner scan = new Scanner(System.in);
   double meters;
   System.out.println("How many meters?");
   meters = grabDouble();
   System.out.println(meters+" meters is " +(meters*3.3)+" feet");
   System.out.println("Press Enter to Continue...");
   scan.nextLine();
   }
   
   public static void MilesToKiloms()
   {
   Scanner scan = new Scanner(System.in);
   double miles;
   System.out.println("How many miles?");
   miles = grabDouble();
   System.out.println(miles+" miles is " +(miles*1.6)+" kilometers");
   System.out.println("Press Enter to Continue...");
   scan.nextLine();
   }
   
   public static void KilomsToMiles()
   {
   Scanner scan = new Scanner(System.in);
   double kiloms;
   System.out.println("How many kilometers?");
   kiloms = grabDouble();
   System.out.println(kiloms+" kiloms is " +(kiloms*0.6)+" miles");
   System.out.println("Press Enter to Continue...");
   scan.nextLine();
   }
}