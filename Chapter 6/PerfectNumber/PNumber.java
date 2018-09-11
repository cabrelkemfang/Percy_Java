import java.io.*;
public class PNumber
{
  public static void main (String args[])
       {
        
     try
        {   
        int num1,num2;

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

    System.out.println(" Enter A Number ");
    num1 = Integer.parseInt(b.readLine());

    

    perfectN ob = new perfectN();

    num2 = ob.perfect(num1);

    System.out.println("perfect number is = "+num2);
        }
         catch (Exception e){}


       }
        
                      
 }
