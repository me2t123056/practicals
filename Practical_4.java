import java.util.Scanner;
class Practical_4
{
	public static void main(String args[])
	{
	 Scanner p4 = new Scanner(System.in);
	 double a,b,BMI; 
	 System.out.println("Enter distance in inch:");
	 a = p4.nextDouble();
         System.out.println("Enter distance in pound:");
	 b = p4.nextDouble();
	 a = a * 0.45359237;
	 b = b * 0.0254;
	 BMI =b/(a*a);
 	 System.out.printf("your BMI =" +BMI);
	}

}
