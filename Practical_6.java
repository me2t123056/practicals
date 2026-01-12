import java.util.Scanner;
class Practical_6
{
 public static void main(String args[])
	{
	  Scanner p8 = new Scanner(System.in);
	  int digit,temp,flag=0,sum,num=0,place=1;
	  System.out.println("Enter the value of digit");
	  digit = p8.nextInt();
	  while(digit!=0)
		{
		 temp = digit%10;
    		 sum =temp+1;	
			if(sum==10)
			{
			  sum=0;
			}
			num = sum*place+num;
			place = place*10;
			digit =digit/10;
		}
		 System.out.println(" the value of digit"+num);

	}
}