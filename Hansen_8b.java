import java.util.*;

public class Hansen_8b
{
   public static void main(String[] args)
   {
   //Generates a random list of nubers into an ArrayList of random length.
      Random random = new Random();
      ArrayList<Integer> listOne = new ArrayList<Integer>(); 
      ArrayList<Integer> listTwo = new ArrayList<Integer>(); 
      ArrayList<Integer> listResult = new ArrayList<Integer>();   
      for(int i = random.nextInt(5) + 1; i >=0; i--)
      {
         listOne.add(random.nextInt(20)+1);
         listTwo.add(random.nextInt(20)+1);
      }
      System.out.println("Two starting lists:");
      System.out.println(listOne);
      System.out.println(listTwo);
      listResult = combine(listOne, listTwo);
      System.out.println("--------------------------");
      System.out.println(listResult); 
   }
   
   public static ArrayList<Integer> combine(ArrayList<Integer> listOne, ArrayList<Integer> listTwo)
   {
      ArrayList<Integer> result = new ArrayList<Integer>();
      for(int i = 0; i < listOne.size(); i++)
         result.add(listOne.get(i)+listTwo.get(i));
      return result;
   }
}