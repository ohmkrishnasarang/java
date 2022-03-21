import java.util.*;
import java.lang.*;
import java.io.*;
class circle
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.print("enter the breadth:");
int p=obj.nextInt();
System.out.println("area of the circle="+(Math.PI*p*p));
System.out.println("perimeter of the circle="+(2*Math.PI*p));
}
}
 