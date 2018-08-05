/**
 *
 * @author percy-ashu
 */
public class EmployeeTest 
{
	// main method begins program execution
  public static void main(String[] args) {
Employee employ1 = new Employee( "Peter", "Ngoe", 70000.00 );
Employee employ2 = new Employee( "Harvy", "Wamba", 30000.00 );		
System.out.printf("Yearly salary of %s %s = %.2f\n", employ1.getFirstName(), employ1.getLastName(), employ1.getYearlySalary() );
System.out.printf("Yearly salary of %s %s = %.2f\n", employ2.getFirstName(), employ2.getLastName(), employ2.getYearlySalary() );		
System.out.println();	
System.out.println("Income with 10% increase");
System.out.printf( "Yearly salary of %s %s = %.2f\n", employ1.getFirstName(), employ1.getLastName(), employ1.getRaiseSalary() );
System.out.printf( "Yearly salary of %s %s = %.2f\n", employ2.getFirstName(), employ2.getLastName(), employ2.getRaiseSalary() );
     } 
} 