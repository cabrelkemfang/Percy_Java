
public class reverse {
    public void reverse(int n) {
   int result = 0;
   int rem;
   while (n > 0) {
       rem = n % 10;
       n = n / 10;
       result = result * 10 + rem;
   }
}
}
