/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exos;
import java.util.Scanner;
/**
 *
 * @author percy-ashu
 */
public class exos2_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x ;
        Scanner in = new Scanner(System.in);
       
        System.out.print("enter interger \n");
          x = in.nextInt();
        if(x%2!=0)
      System.out.printf("%d is a odd number\n",x);
        if(x%2==0)
            System.out.printf("%d is an even number\n",x);
            
        // TODO code application logic here
    }
    
}
