import java.lang.Math.*;
import java.util.*;

public class Hansen_9 extends Menu
{
   public static void main(String[] args)
   {
   
      //Generates a random list of nubers into an ArrayList of random length.
      Random random = new Random();
      ArrayList<Integer> myList = new ArrayList<Integer>();   
      for(int i = random.nextInt(20)+10; i >=0; i--)
      {
         myList.add(random.nextInt(100)+1);
      }
      //End random list generation
      int key =0;
      
      
      myList = sortArrayAsc(myList);
      System.out.println("Our sorted list:");
      System.out.println(myList);
      System.out.println("Enter a key to find:");
      key = grabInteger();
      
      //binSearchs
     
      if(binSearch(myList, key))
         System.out.println("While Loop: Key found!");
      else
         System.out.println("Value wasn't found");
         
 
      if(binSearch(myList, key, 0, myList.size()))
         System.out.println("Recurive: Key found!");
      else
         System.out.println("Value wasn't found");

      
    }
    
   /*************************************************************************************
   sortArrayAsc - Sorts an array from lowest to highest values
   Accepts: List of Integers
   Returns: Sorted List of integers
   *************************************************************************************/
    public static ArrayList<Integer> sortArrayAsc(ArrayList<Integer> myList)
    {
      boolean sorted = false;
      int temp = 0;
      while(!sorted)
      {
         sorted = true;
         for(int i=0; i<(myList.size()-1); i++)
         {
            if(myList.get(i) > myList.get(i+1))
            {
               temp = myList.get(i);
               myList.set(i, myList.get(i+1));
               myList.set(i+1, temp);
               sorted = false;
            }
         }
      }
      return myList;
    }
    
   /*************************************************************************************
   binSearch() - Searchs an array for a key using binary search.
   Accepts: List of Integers, integer to find in list.
   Returns: Boolean, true if found.  False if not.
   *************************************************************************************/
    public static boolean binSearch(ArrayList<Integer> myList, int key)
    {
      int lower = 0;
      int upper = myList.size();
      int position = myList.size()/2;
      while(lower <= upper)
      {  
         if (myList.get(position) == key)
         {
            return true;
         }
         if (myList.get(position) > key)
         {
            upper = position;
         }
         else if (myList.get(position) < key)
         {
             lower = position;
         }            
         
         if(position == (upper+lower)/2)
            return false;
         else
            position = (upper+lower) / 2;

         
       }
       return false;  
    }
    
    public static boolean binSearch(ArrayList<Integer> myList, int key, int lower, int upper)
    {
      int position = (upper+lower)/2;
      if (myList.get(position) == key)
      {
            return true;
      }
      else if (myList.get(position) > key)
      {
            upper = position;
                  }
      else if (myList.get(position) < key)
      {     
            lower = position;
             
      }            
      if(position == (upper+lower)/2)
         return false;
      else        
         return binSearch(myList, key, lower, upper);

    }

    
}
