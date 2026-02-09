package count$p$n$0;
import java.util.Scanner;
public class Count$P$N$0 {
public static void main(String[] args) {
Scanner i=new Scanner(System.in);
int count=0;
int count1=0;
int count2=0;
String n="yes";
do{
System.out.println("Enter the number");
int x=i.nextInt();
if(x>0)
count++;
else if(x<0)
count1++;
else count2++;
System.out.println("Do you want to continue? yes or no ");
n=i.next();
}while(n.equals("yes"));    
System.out.println("Positive numbers: " + count);
System.out.println("Negative numbers: " + count1);
System.out.println("Zero numbers: " + count2);




    }
    
}
