import java.io.*;
public class Hypotest
{
   public static void main(String args[])
  {
 try
   {

    BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
    int side1,side2;
    double hyp;

    System.out.println("-- Enter Side1 --");
    side1 = Integer.parseInt(d.readLine());

    System.out.println("-- Enter Side2 --");
    side2 = Integer.parseInt(d.readLine());

    Hypo ob = new Hypo();

    hyp = ob.hypotenuse(side1,side2);

    System.out.println("-- Hypotenuse = "+hyp);

   }
   catch (Exception e){}
  }


}
