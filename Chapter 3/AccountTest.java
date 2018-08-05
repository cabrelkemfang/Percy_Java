import java.util.Scanner;
public class AccountTest
{
public static void main(String[] args)
{
Account account1 = new Account("Jane Green", 50.00);
Account account2 = new Account("John Blue", 50.00);
// display initial balance of each object
System.out.printf("%s balance: $ %.2f %n",
account1.getName(), account1.getBalance() );
System.out.printf("%s balance: $ %.2f %n%n",
account2.getName(), account2.getBalance() );
// create a Scanner to obtain input from the command window
Scanner input = new Scanner(System.in);
System.out.print("Enter withdraw amount for account1: "); // prompt
double withdrawAmount = input.nextDouble(); // obtain user input
System.out.printf("%nsub %.2f to account1 balance%n%n",
withdrawAmount);
account1.withdraw(withdrawAmount); // add to account1’s balance
// display balances
System.out.printf("%s balance: $ %.2f %n",
account1.getName(), account1.getBalance() );
System.out.printf("%s balance: $ %.2f %n%n",
account2.getName(), account2.getBalance() );
System.out.print("Enter withdraw amount for account2: "); // prompt
withdrawAmount = input.nextDouble(); // obtain user input
System.out.printf("%nsub %.2f to account2 balance%n%n",
withdrawAmount);
account2.withdraw(withdrawAmount); // add to account2 balance
// display balances
System.out.printf("%s balance: $ %.2f %n",
account1.getName(), account1.getBalance() );
System.out.printf("%s balance: $ %.2f %n%n",
account2.getName(), account2.getBalance() );
} // end main
} // end class AccountTest