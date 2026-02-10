package count$sum$divide9;
import java.util.Scanner;
public class Count$sum$divide9 {
public static void main(String[] args) {
Scanner i=new Scanner (System.in); 
System.out.println("Enter the min number");
int x=i.nextInt();
System.out.println("Enter the max number");
int y=i.nextInt();
int count=0;
int sum=0;
System.out.println("Numbers are");
while(y>x){
if(x%9==0){
System.out.println(x);
count++;
sum+=x;
}
x++;
}
System.out.println("The sum of number is "+sum );
System.out.println("The count of number is "+count);




    }
    
}
