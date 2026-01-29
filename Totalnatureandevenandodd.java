package totalnatureandevenandodd;
import java.util.Scanner;
public class Totalnatureandevenandodd {
public static void main(String[] args) {
Scanner i=new Scanner(System.in);       
System.out.println("Enter first number");
int x=i.nextInt();
System.out.println("Enter end number");
int y=i.nextInt();    
int sum=0;
int sum1=0;
int sum2=0;
int z=x;
while(y>=z){
sum+=z;
if(y>=z){z++;}}
System.out.println("The sum of natural number is" +" "+ sum);
int u=x;
while (y>=u){
if(u%2==0){sum1+=u;}
u++;}
System.out.println("The sum of even number is" +" "+ sum1);
int t=x;
while(y>=t){
if(t%2!=0){sum2+=t;}
t++;}
System.out.println("The sum of odd number is" +" "+ sum2);    
    
    
    
    }
    
}
