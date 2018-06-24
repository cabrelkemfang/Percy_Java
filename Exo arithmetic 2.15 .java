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
public class Exos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb1,numb2;
        int sum;float quot=1;int dif=0; int prod;
        System.out.print("Enter first integer: "); // prompt
        numb1 = in.nextInt(); // read first number from user
        System.out.print("Enter second integer: "); // prompt
        numb2 = in.nextInt(); // read second number from user
        sum = numb1 + numb2;
        prod = numb1 * numb2 ;
        if(numb1<numb2){
            quot = numb2 / numb1;
            dif =numb2 - numb1;}
        if(numb1>numb2){
            quot = numb1 / numb2;
                dif = numb1 - numb2;
         // TODO code application logic here 
        }
    System.out.printf("sum = %d%n dif = %d%n prod =%d%n quot =%.2f%n ",sum,dif,prod,quot);
    }
}
