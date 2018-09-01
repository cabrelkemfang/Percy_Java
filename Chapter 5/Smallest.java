import java.util.Scanner;//class uses scanner class
	public class Smallest
	{
	    public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);//create object to obtain input	       
	        int counter;
	        int smallest = Integer.MAX_VALUE;//stores smallest integer
	        int NumValue = 0;
	        int number = 0;
	        System.out.print("Please enter number of integers: ");
	        NumValue = input.nextInt();
	        for(counter = 0;counter < NumValue;counter++)
	        {
	            System.out.print("Please enter an integer: ");
	            number = input.nextInt();	             
	            if(number < smallest)
	            {
	                smallest = number;
	            }
	        }//end for
	        System.out.printf("The smallest integer is: %d\n", smallest);

	    }//end main
	}//end class Smallest