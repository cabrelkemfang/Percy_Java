import java.util.Random;
import java.util.Scanner;
public class guessnumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        long from = 1;
        long to = 100;
        int randomNumber = (int) (random.nextInt((int) (to - from + 1)) + from);
        int guessedNumber ;
        int count=0;
        System.out.printf("The number is between %d and %d.\n", from, to);
 
        do
        {
            count++;
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
        } 
        while (guessedNumber != randomNumber); 
        if(count<10)
            System.out.println("Aha! You know the secret!");
        else
          System.out.println("You should be able to do better!");
       
    }
}