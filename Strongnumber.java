package strongnumber;
import java.util.Scanner;
public class Strongnumber {
public static void main(String[] args) {
Scanner i=new Scanner (System.in); 
System.out.println("Enter the number ");
int x=i.nextInt();
int sum=0;
int original=x;
while(x>0){
int factorial=1;
int y=x%10;
while(y>0)
{factorial*=y;
y--;}
sum+=factorial;
x/=10;}
if(sum==original)
System.out.println("This number is strong number");
else
System.out.println("This number isn't strong number");
}
}
