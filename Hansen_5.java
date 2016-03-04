public class Hansen_5 extends Menu
{
   public static void main(String[] args)
   {
      int first = 0;
      int last = 0;
      int delta = 0;
      int whileTotal=0;
      int forTotal=0;
      
      System.out.println("Enter first number:");  
      first = grabInteger();
      
      System.out.println("Enter last number:");
      last = grabInteger();
      
      System.out.println("Enter delta number:");
      delta = grabInteger();
            
      int w=first;
      while (w<=last)
      {
         whileTotal+=w;
         w+=delta;
      }
      
      System.out.println("While Loop Total:"+whileTotal); 
      
      for(int i=first; i<=last; i+=delta)
      {
            forTotal+=i;      
      }
      System.out.println("For Loop Total:"+forTotal);
   }
}
