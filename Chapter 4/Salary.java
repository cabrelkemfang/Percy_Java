import java.util.Scanner;
public class Salary {

   
    public static void main(String[] args) {
        double hrate,salary,hours;
        int choice=1;
        Scanner input=new Scanner(System.in);
        while(choice==1)
        {
            System.out.println("Enter total amount of hours :");
            hours=input.nextDouble();
            System.out.println("Enter hourly rate :");
            hrate=input.nextDouble();
            if(hours<=40){
                salary=hours*hrate;
                System.out.printf("Your salary of %.2f hours at rate %.2f =%.2f", hours,hrate,salary);
                          }
            else{
                salary=40*hrate;
                hours=hours-40;
                salary=(double)(salary+(hours*hrate*1.5));
                System.out.printf("\n Do you want to fine next employee?(1 for yes & 0 for no)");
                choice=input.nextInt();
                
            }
        }
        
    
}
}
