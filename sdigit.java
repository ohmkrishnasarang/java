import java.util.*;
import java.io.*;
import java.lang.*;
class sdigit
{
public static void main(String args[])
{
int sum=0;
int temp;
Scanner obj=new Scanner(System.in);
System.out.print("enter the digit:");
int fnum=obj.nextInt();
while (fnum>0)
{
temp=fnum%10;
sum=sum+temp;
fnum=fnum/10;
}
System.out.println("sum of digit="+sum);
}
}  
