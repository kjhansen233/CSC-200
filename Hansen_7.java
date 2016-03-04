import java.util.Scanner;
import java.lang.Math.*;

public class Hansen_7 extends Menu
{
   public static void main(String[] args)
   {
      String[] opts ={"New Project","Exit"};
      Menu mainMenu = new Menu(opts);
      int selection = 0;
      
      do
      {
      selection = mainMenu.prompt();
      if (selection == 1)
         landscape();
      }while(selection != 2);
   }
   
   public static void landscape()
   {
      double totalArea=0;
       
      String[] opts ={"Square","Rectangle","Triangle","Circle","Exit"};
      Menu lsMenu = new Menu(opts);
      int choice = 0;
      do
      {
         choice = lsMenu.prompt();
         switch(choice)
         {
            case 1:
               totalArea+=square();
               break;
            case 2:
               totalArea+=rectangle();
               break;
            case 3:
               totalArea+=triangle();
               break;
            case 4: 
               totalArea+=circle();
               break;
            case 5:
               break;   
            default:
               System.out.println("Somehow, you managed to enter in a wrong option...");
         }
         System.out.println("The total area is: "+totalArea);
      }         
      while(choice !=5);
      
   
   }
   
   public static double circle()
   {
      double radius=0;
      System.out.println("Please enter the radius of the circle.");
      radius = grabDouble();
      return radius*radius*Math.PI;

   }
   
   public static double square()
   {
      double length=0;
      System.out.println("Please enter the length of a side of the square.");
      length=grabDouble();
      return length*length;
   }
   
   public static double triangle()
   {
      double base =0;
      double height =0;
      System.out.println("Please enter base of the triangle.");
      base = grabDouble();
      System.out.println("Please enter the height of the triangle.");
      height = grabDouble();
      return .5*base*height;
   }
   
   public static double rectangle()
   {
      double length =0;
      double width =0;
      System.out.println("Please enter length of the rectangle.");
      length = grabDouble();
      System.out.println("Please enter the height of the rectangle.");
      width = grabDouble();
      return length*width;

   }
}





