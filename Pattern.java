import java.util.*;
class Pattern
{
 public static void main (String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter no of rows");
 int r=sc.nextInt();
 for(int i=r;i>=1;i--)
 {
  for(int j=1;j<=i;j++)
 {
   System.out.print(" * ");
 } 
  System.out.println();
}
}
}