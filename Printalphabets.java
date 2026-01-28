package printalphabets;
import java.util.Scanner;
public class Printalphabets {
public static void main(String[] args) {
Scanner i=new Scanner (System.in);
System.out.println("enter first alphabet");
char x=i.next().charAt(0);
System.out.println("enter end alphabet");
char y=i.next().charAt(0);
System.out.println("Alphabets are");
if(y>=x){
while(y>=x)
{
System.out.println(x);
x++;
}}
else if(x>=y){
while(x>=y)
{
System.out.println(x);
x--;
}}
}
    
}
