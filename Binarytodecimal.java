package binarytodecimal;
import java.util.Scanner;
public class Binarytodecimal {
public static void main(String[] args) {
Scanner i=new Scanner (System.in); 
System.out.println("Enter binary number ");
int x=i.nextInt();
int decimalnum=0;
int base=1;
while(x>0){
int lastnum=x%10;
decimalnum+=lastnum*base;
base*=2;
x/=10;}
System.out.println("The decimal number is "+decimalnum);
}}