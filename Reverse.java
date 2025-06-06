import java.util.*;
class Reverse
{
 public static void main (String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the string:");
 String S=sc.nextLine();
 StringBuilder str=new StringBuilder(S);
 System.out.println("reverse of string:"+str.reverse().toString());
}
}