package factorial;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
Scanner i=new Scanner (System.in);
System.out.println("Enter your number");
int x=i.nextInt();
int sum=1;
while(x>0){sum*=x;
x--;}
System.out.println("The factorial value is "+sum);



    }
    
}
