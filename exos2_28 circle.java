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
public class exos2_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;double circum;
        System.out.print("Enter radius of circle \n ");
        r = in.nextInt();
        System.out.printf("Diameter = %d circumference =%f,area =%f ",2*r,(2*r)*Math.PI,(r*r)*Math.PI);
        
        // TODO code application logic here
    }
    
}
