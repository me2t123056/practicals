import java.util.Scanner;
import java.lang.Math;
class Practical_7
{
	public static void main(String args[])
	{
	 Scanner p7 = new Scanner(System.in);
	 double a,b,c,s,area; 
	 System.out.println("Enter length of side a:");
	 a = p7.nextDouble();
         System.out.println("Enter length of side b");
	 b = p7.nextDouble();
	 System.out.println("Enter length of side c");
	 c = p7.nextDouble();
	 s =(a+b+c)/2;
	 if(a+b>c && b+c>a && a+c>b)
	 	{
	   	 area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
 		 System.out.println("area of a triangal ="+area);
	 	}
		 else
		 System.out.println("length of anyone side is wrong so please re enter the length of sides");
	 }

}
