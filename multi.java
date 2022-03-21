import java.util.*;
class multi
{
public static void main(String args[])
{
Scanner Input=new Scanner(System.in);
System.out.print("Enter the number:");
int mul=Input.nextInt();
for(int i=1;i<11;i++)
{
System.out.println(i+"*"+mul+"="+(i*mul));
}
}
}