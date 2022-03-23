 import java.util.*;
class smaller
{
public static void main(String args[])
{
Scanner Input=new Scanner(System.in);
System.out.print("enter the first num:");
int first=Input.nextInt();
System.out.print("enter the sec num:");
int sec=Input.nextInt();
System.out.print("enter the third num:");
int third=Input.nextInt();
System.out.println("the smallest number is"+small(first,sec,third));
}
public static double small(double first,double sec,double third)
{
return Math.min(Math.min(first,sec),third);
}
}
 