import java.util.Scanner;
class Practical_5
{
	public static void main(String args[])
	{
	 Scanner p5 = new Scanner(System.in);
	 int m,h,f,t,a,b,c,temp=0; 
	 System.out.println("Enter the amount:");
	 m = p5.nextInt();
		 h = m/100;
		 m = m%100;
         	 System.out.println("Number of 100 note:"+h);
		 f = m/50;
		 m = m%50;
         	 System.out.println("Number of 50 note:"+f);
		 t = m/10;
		 m = m%10;
         	 System.out.println("Number of 10 note:"+t);
 		 a = m/5;
		 m = m%5;
         	 System.out.println("Number of 5 note:"+a);
		 b = m/2;
		 m = m%2;
         	 System.out.println("Number of 2 note:"+b);
		 c = m/1;
         	 System.out.println("Number of 1 note:"+c);

		}

}
