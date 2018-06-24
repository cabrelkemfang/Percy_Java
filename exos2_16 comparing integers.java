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
public class exos2_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter  first number\n");
        num1 =in.nextInt();
        System.out.print("Enter  first second\n");
        num2 =in.nextInt();
        
        if(num1>num2)
            System.out.printf("%d is larger", num1);
        if(num1==num2)
            System.out.printf("numbers are equal");
        // TODO code application logic here
    }
    
}
