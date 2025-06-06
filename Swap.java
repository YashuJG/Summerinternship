import java.util.*;
class Swap
{
 public static void main (String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a,b values:");
 int a=sc.nextInt(),b=sc.nextInt();
 System.out.println("values of a,b before swapping:"+a+","+b);
 int temp=a;
 a=b;
 b=temp;
 System.out.println("values of a,b after swapping:"+a+","+b);
 }
}