package primenum;
import java.util.Scanner;
public class Primenum {
public static void main(String[] args) {
Scanner i=new Scanner(System.in);
System.out.println("Enter your number");
int x=i.nextInt();
int o=2;
int c=0;
while(x>o){
if(x%o==0){
c++;
break;}
o++;}
if(c==0)
System.out.println("This number is prime");
else
System.out.println("This number isn't prime");   

}
    
}
