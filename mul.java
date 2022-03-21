import java.util.*;
import java.io.*;
class mul
{
public static void main(String args[])
{
int mult;
Scanner obj=new Scanner(System.in);
System.out.print("enter first number:");
int fnum=obj.nextInt();
System.out.print("enter the second number:");
int snum=obj.nextInt();
mult=fnum+snum;
System.out.println(fnum+"*"+snum+"="+mult);
}
}  
