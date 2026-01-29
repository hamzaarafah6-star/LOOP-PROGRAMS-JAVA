package powerbyloop;
import java.util.Scanner;
public class Powerbyloop{
public static void main(String[] args) {
Scanner i=new Scanner (System.in);
System.out.println("Enter the base of number ");
int x=i.nextInt();
System.out.println("Enter the power of number above number one ");
int y=i.nextInt();
int h=1;
int sum=1;
do{sum*=x;
h++; }while(h<=y);
System.out.println("The result is "+sum);

}
    
}
