import java.lang.Math.*;
import java.util.*;

public class Hansen_8a
{
   public static void main(String[] args)
   {
   
      //Generates a random list of nubers into an ArrayList of random length.
      Random random = new Random();
      ArrayList<Integer> myList = new ArrayList<Integer>();   
      for(int i = random.nextInt(5) + 1; i >=0; i--)
      {
         myList.add(random.nextInt(100)+1);
      }
      //End random list generation
      System.out.println("Our starting list:");
      System.out.println(myList);
      System.out.println("Highest: "+high(myList));
      System.out.println("Lowest: "+low(myList));
      System.out.println("Sum: " +sum(myList));
      System.out.println("Average:"+average(myList));      
            
    }
   
   
   //Returns Highest Number
   public static int high(ArrayList<Integer> myList)
   {
      int max = myList.get(0);
      for(int i = 0; i < myList.size(); i++)
      {
         if (myList.get(i) > max)
            max = myList.get(i);
      }
      return max;
   }
   
   //Returns Lowest Number
   public static int low(ArrayList<Integer> myList)
   {
      int min =myList.get(0);
      for(int i = 0; i < myList.size(); i++)
      {
         if (myList.get(i) < min)
            min = myList.get(i);
      }
      return min;
   }
   
   //Returns the sum of all items in the array list.
   public static int sum(ArrayList<Integer> myList)
   {
      int total =0;
      for(int i = 0; i < myList.size(); i++)
         total += myList.get(i);
      return total;
   }
   
    //Returns Average (utilizes "sum" method).
   public static double average(ArrayList<Integer> myList)
   {
      return ((double)sum(myList))/myList.size();
   }



}