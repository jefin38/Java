import java.util.Scanner;
 
class Sum {
    Scanner sc = new Scanner(System.in);
    int a, b;

    void operation()
     {
    	System.out.println("enter 1st roll number");
	a = sc.nextInt();
	System.out.println("enter 2nd roll number");
	b = sc.nextInt();
	int s= a+b;
	System.out.println("sum " +s);
	}
	public static void main(String args[])
	{
	Sum sumObject=new Sum();
	sumObject.operation();

     }
}


