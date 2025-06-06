import java.util.*;
class AreaPerimeter
{
 public static void main (String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter sides of triangles a,b,c and height h");
 int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),h=sc.nextInt();
 float A=(b*h)/2;
 int p=a+b+c;
 System.out.println("Area of Triangle and Perimeter is:"+A+","+p);
 }
}