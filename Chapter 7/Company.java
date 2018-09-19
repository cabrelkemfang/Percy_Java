import java.util.Scanner;

   public class Company
  {
      public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        float[][] sales = new float[4][5];
        boolean ok = true;
     
        while(ok)
        {
           displayMenu();
           
           switch(sc.nextInt())
           {
              case 1:
                 editSalesSlip(sales, sc);
                 break;
              case 2:
                 displaySalesTotals(sales);
                 break;
              case 3:
                 System.out.println("Exiting program...");
                 ok = false;
                 break;
              default:
                 System.out.println("Make sure you enter a value between 1 and 3.");
                 break;
           }
        }
     }//displayMenu
      private static void displayMenu()
     {
        System.out.println("1.  Fill in a sales slip.");
        System.out.println("2.  Display the sales totals.");
        System.out.println("3.  Exit program.");
        System.out.println("Type in a value and press enter.");
     }//End displayMenu
     
     //editSalesSlip
      private static void editSalesSlip(float[][] sales, Scanner sc)
     {
        int salesNo, productNo;
        float totalSold;
                 
        System.out.println("Enter your Sales Number (from 1 to 4): ");
        salesNo = sc.nextInt();
                 
        System.out.println("Enter the Product Number (from 1 to 5): ");
        productNo = sc.nextInt();
                 
        System.out.println("Enter the total value of that product's" + " sales, in dollars");
        totalSold = sc.nextFloat();
                 
        sales[salesNo-1][productNo-1] = totalSold;
     }//End editSalesSlip
     
     //displaySalesTotals
      private static void displaySalesTotals(float[][] sales)
     {
        for(int i = 0; i < 4; i++)
        {
           int totalSales = 0;
                   
           for(int j = 0; j < 5; j++)
              totalSales += sales[i][j];
             
           System.out.println("Total sales for salesperson " + (i+1)
                       + ": " + totalSales + ".");
        }
                 
        System.out.println("");
                 
        for(int i = 0; i < 5; i++)
        {
           int totalSales = 0;
                   
           for(int j = 0; j < 4; j++)
              totalSales += sales[j][i];
             
           System.out.println("Total sales for product " + (i+1)
                       + ": " + totalSales + ".");
        }
                 
        System.out.println("");
     }
     //End displaySalesTotals
  }