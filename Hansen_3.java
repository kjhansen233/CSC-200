import java.util.Scanner;

public class Hansen_3 extends Menu
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String input = null;
      int age = 0;
      int time = 0;
      int movie = 0;
      boolean isFilmFestival = false;
      
      //Defines Menu Options
      String[] opts = {"Film Festival Movie","Boring Regular Movie"};
      Menu movies = new Menu(opts);

      
      System.out.println("Welcome to the automated movie ticket machine.");
      System.out.println("Select your movie:");
      
      movie = movies.prompt();      
      if (movie == 1)
         isFilmFestival = true;
      else 
         isFilmFestival = false;
         
      if (isFilmFestival)
         System.out.println("Ticket Price: $15.00");
      else
      {
         System.out.println("Enter the current hour.  Ex: 4:30 would be entered as \'4\'");
         //grabInteger is defined in Menu class
         time = grabInteger();
         if (time < 5)
            System.out.println("Ticket Price: $10.00");
         else
         {
            System.out.println("Enter your age.  We WILL know if you're lying.");
            //grabInteger is defined in Menu class
            age = grabInteger();   
            if(age < 13)
               System.out.println("Ticket Price: $10.00");
            else if (age < 65)
               System.out.println("Ticket Price: $25.00");
            else
            {
               System.out.println("You're so old that you get a 25% discount!");
               System.out.println("Ticket Price: $18.75");
            }
               
         
         }
       }         
      
      
   }

}