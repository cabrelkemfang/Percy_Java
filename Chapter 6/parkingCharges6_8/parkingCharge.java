import java.util.Scanner;

public class parkingCharge {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of cars parked yesterday: ");
        final int NUMBER_OF_CARS = keyboard.nextInt();

        double hoursParked=0;
        double currentCost=0;   
        double totalCost=0;

        for(int count = 1; count<=NUMBER_OF_CARS; count++)
        {   
            System.out.print("Enter hours parked for car " + count + ": ");
            hoursParked = keyboard.nextDouble();
            currentCost = calculateCharges(hoursParked); //most recent customer
            totalCost+=currentCost; //Running total
        }

        System.out.println("Most recent customer paid: $" + currentCost);
        System.out.println("Running total of receipts: $" + totalCost);

    }

    public static double calculateCharges (double numHours)
    {

        double garageCost = 0;

        if(numHours<=3)
            garageCost = 2;

        else if(numHours>3 && numHours<=19)
            garageCost = 2.0 + 0.5*(numHours - 3);

        else if (numHours >19)
            garageCost = 10;

        return garageCost;
    }
}