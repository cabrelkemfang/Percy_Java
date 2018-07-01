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
public class exos2_30 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a five integer ");
        int num = input.nextInt();
        System.out.printf("%d   %d   %d   %d   %d \n",num/10000,(num%10000)/1000,((num%10000)%1000)/100,((num%10000)%1000)%100/10,num%10);
        
        
        // TODO code application logic here
    }
    
}
