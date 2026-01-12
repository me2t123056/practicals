import java.util.Scanner;
class Practical_3
{
	public static void main(String args[])
	{
	 Scanner p3 = new Scanner(System.in);
	 double ch;
	 System.out.println("Enter a character:");
	 ch = p3.next().charAt(0);
	 if(ch == 'a' ||ch == 'e' ||ch == 'i' || ch == 'u' || ch == 'o')
		  System.out.println("Enter character is vowel");
         else
	 System.out.println("Enter character is consonant");
	}

}
