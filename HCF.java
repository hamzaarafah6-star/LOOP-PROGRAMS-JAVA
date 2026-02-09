package hcf;
import java.util.Scanner;
public class HCF {
public static void main(String[] args) {
Scanner i=new Scanner(System.in);
System.out.println("Enter the biggest number");
int x=i.nextInt();
System.out.println("Enter the smallest number");
int y=i.nextInt();
while(y!=0){ 
int z=x%y;
x=y;
y=z;

}
System.out.println("The HCF is "+x);
}    
    
    
    
    }
    

