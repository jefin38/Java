import java.util.Scanner;
class oddeven
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
System.out.println ("Enter a number");
int num = obj.nextInt();
if(num%2 == 0)
System.out.println("number is even");
else
System.out.println("number is odd");
}
}
