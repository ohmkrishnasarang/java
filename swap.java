import java.util.*;

class swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		System.out.print("Enter the first number: ");
		a = sc.nextInt();
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		System.out.println("a = " + a + " b = " + b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("a = " + a + " b = " + b);
		
	}
}