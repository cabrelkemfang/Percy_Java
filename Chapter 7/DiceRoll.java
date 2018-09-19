import java.util.Random; 
public class DiceRoll
  {
      public static void main(String[] args)
     {
        Random rnd = new Random();
        int[] totals = new int[18000];
        int[] tallies = new int[11];
       
        for(int i = 0; i < 18000; i++)
           totals[i] = RollDie(rnd) + RollDie(rnd);
       
        for(int i = 0; i < 11; i++)    
           for(int j = 0; j < 18000; j++)
              if(totals[j] == (i+2))
                 tallies[i]++;
                 
        System.out.println("Value  Tally");
        for(int i = 0; i < 11; i++)
           System.out.println((i+2) + "      " + tallies[i]);
     }
      public static int RollDie(Random rnd)
     {
        return(rnd.nextInt(6)+1);
     }
  }