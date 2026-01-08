import java.util.Scanner;
class practical2{
	public static void main(String[]args){
		
		System.out.println("Cremal rules");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Element a:");
		double a=sc.nextDouble();
		System.out.printf("Element b:");
		double b=sc.nextDouble();
		System.out.printf("Element c:");
		double c=sc.nextDouble();
		System.out.printf("Element d:");
		double d=sc.nextDouble();
		System.out.printf("Element e:");
		double e=sc.nextDouble();
		System.out.printf("Element f:");
		double f=sc.nextDouble();
		
		double D=a*d-b*c;
		double Dx=e*d-b*f;
		double Dy=a*f-c*e;
		double x=Dx/D;
		double y=Dy/D;
		
		System.out.println("x:"+x + "  y:"+y);
		
		
		
		
		}
	
	}