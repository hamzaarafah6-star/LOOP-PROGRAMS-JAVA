package evenoroddloop;
import java.util.Scanner;
public class Evenoroddloop {
public static void main(String[] args) {
Scanner i=new Scanner (System.in);
System.out.println("Enter the Start number");
int x=i.nextInt();
System.out.println("Enter the End number");
int y=i.nextInt();
System.out.println("Even numbers are");
int z=x;
while(y>=z){
if(z%2==0)
{System.out.println(z);}
z++;}
System.out.println("Odd numbers are");
z=x;
while(y>=z){
if(z%2!=0)
{System.out.println(z);}
z++;}
}
}

