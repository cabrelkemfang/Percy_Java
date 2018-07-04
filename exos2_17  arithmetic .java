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
public class exos2_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb1,numb2,numb3;
        int sum;double ave=1;int prod;
        System.out.print("Enter first integer: "); // prompt
        numb1 = in.nextInt(); // read first number from user
        System.out.print("Enter second integer: "); // prompt
        numb2 = in.nextInt(); // read second number from user
        System.out.print("Enter third integer: "); // prompt
        numb3 = in.nextInt(); // read second number from user
        
        sum = numb1 + numb2 + numb3;
        prod = numb1 * numb2 * numb3;
        ave = sum / 3;  
       System.out.printf("sum = %d%n prod =%d%n ave =%f%n ",sum,prod,ave);
        // TODO code application logic here 
        
        // TODO code application logic here
    }
    }   

