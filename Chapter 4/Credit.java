/**
 *
 * @author percy-ashu
 */
import java.util.Scanner;
public class Credit {
   public static void main(String[] args) {
       Scanner input = new Scanner( System.in );
        int accNum;
        int prebalance;
        int totalItems;
        int totalCredit;
        int maxCredit;
        int x;
        System.out.println("Enter total number of customers \n");
        int totalCus = input.nextInt();
        for(x=0;x<totalCus;x++){
            System.out.println("Enter account number \n");
         accNum=input.nextInt();
         System.out.println("Enter  begining balance \n");
         prebalance=input.nextInt();
         System.out.println("Enter  total number of items \n");
         totalItems=input.nextInt();
         System.out.println("Enter  total amount of credit \n");
         totalCredit=input.nextInt();
         System.out.println("Enter  limit of credit \n");
         maxCredit=input.nextInt();
         int newbalance = prebalance + totalItems -totalCredit;
         System.out.printf("New balance is %d \n",newbalance);
         if(newbalance>maxCredit)
             System.out.println("Credit limit exceeded");
        }
    }
    
}
