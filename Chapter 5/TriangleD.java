public class TriangleD

 {
 public static void main (String[] args)
  {
        for(int count = 10; count > 0; count--)
        {
            for(int index=0; index < count-1; index++)
                System.out.print(" ");
            
            for(int star=10; star > count-1; star--)
                System.out.print("*");
            
            System.out.println();
        }
  }
}