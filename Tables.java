package tables;
import java.util.Scanner;
public class Tables {
public static void main(String[] args) {
Scanner i=new Scanner (System.in);
System.out.println("enter start number");
int x=i.nextInt();
System.out.println("enter end number");
int y=i.nextInt();
System.out.println("enter table number");
int z=i.nextInt();
while(y>=x)
{int t=x*z;
System.out.println(x+"*"+z+"="+t);
  x++;  
}
}
}