/**
 *
 * @author percy-ashu
 */
import java.util.Scanner;
public class Gas 
{
    
    public static void main(String[] args)
    {
     Scanner input = new Scanner( System.in );
     int miles ; 
     int gallons ;
     int trips ;
     int x;
     
     double totalmpg=0.0;
     System.out.println("Enter total number of trips \n");
     trips=input.nextInt();
     for(x=0;x<trips;x++){
         System.out.println("Enter  number of miles \n");
         miles=input.nextInt();
         System.out.println("Enter  amount of gallons \n");
          gallons=input.nextInt();
         double mpg= miles / gallons;
          System.out.printf("miles per gallon for trip %d is %.1f \n",x+1,mpg);
          totalmpg+=mpg;
     }
        System.out.printf("Total miles per gallon of all trips %.1f\n",totalmpg);
             
    }
    
}
