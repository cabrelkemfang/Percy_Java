
public class perfectN {
    int perfect( int num )
       {
        
       int divisor = 0; 
       for(int n = 1 ; n < num; n++) 
          {
              if (num % n == 0)
              {
        divisor = divisor + n ;
              }
      }         
        

         if (divisor == num) 
          {

        return num;
          }
            else
               {
        
        return 0;
                   
           }
 
    
        
       }
        

}
