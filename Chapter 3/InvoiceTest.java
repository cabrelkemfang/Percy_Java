import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {
        int price=0;
        Invoice invoice1 = new Invoice("01","cups",9, 50.00);
        System.out.printf("item No %s is %s , number remaining %d , price %.2f",
invoice1.getnumber(), invoice1.getdescript(),invoice1.getquantity(),invoice1.getprice() );
   Scanner input = new Scanner(System.in);
   System.out.println();
        double  priceAmount=price;
   System.out.print("Enter quantity for : \n"); // prompt
int quantityAmount = input.nextInt(); // obtain user input
    System.out.printf("Invoice amount is %.2f",invoice1.getInvoiceAmount(priceAmount,quantityAmount));
    }
    
}
