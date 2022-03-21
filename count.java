import java.util.*;
class count
{
public static void main(String args[])
{
String test="my name is saru#";
count(test);

}
public static void count(String x)
{

char[] ch=x.toCharArray();
int letter=0;
int space=0;
int num=0;
int other=0;
for(int i=0;i<x.length();i++)
{
if(Character.isLetter(ch[i]))
{
letter++;
}
else if(Character.isDigit(ch[i]))
{
num++;
}
else if(Character.isSpaceChar(ch[i]))
{
space++;
}
else
{
other++;
}
}
System.out.println("the string is:"+x);
System.out.println("letters:"+letter);
System.out.println("numbers:"+num);
System.out.println("other:"+other);
}
}

