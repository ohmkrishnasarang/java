import java.util.*;
class sum
{
public static void main(String args[])
{
Scanner Input=new Scanner(System.in);
System.out.print("enter the first num: ");
int num1=Input.nextInt();
System.out.print("enter the second num: ");
int num2=Input.nextInt();
System.out.print("enter the second num: ");
int num3=Input.nextInt();
int sum=num1+num2;
System.out.println("the result is:"+sumoftwo(num1,num2,num3));
}
public static boolean sumoftwo(int p,int q,int r)
{
return ((p+q)==r||(q+r)==p||(r+9)==q);
}
}