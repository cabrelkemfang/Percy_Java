import java.util.Scanner;
public class WorldPopulation{
public static void main(String args[]){
 Scanner input= new Scanner(System.in);
int pop;
double rate;

double tot=0;
System.out.println("Enter World population");
pop=input.nextInt();
System.out.println("Enter Growth rate");
rate=input.nextDouble();
for(int i=1;i<76;i++){
 double gpop=pop*rate;
 
 tot+=gpop;
 gpop+=gpop;
 
 
System.out.println(i+"\t"+tot+"\t"+gpop);
 
 }
}
}
