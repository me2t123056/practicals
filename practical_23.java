import java.util.Scanner; 
class bankaccount
{
  long Accountnumber;
  String Accountholdername;
  int Balance; 
  void openaccount(long anum,String hname,int bal)
{
  Accountnumber=anum;	
  Accountholdername=hname;
  Balance=bal;
  System.out.println("Account Number"+Accountnumber);
  System.out.println("Account Holder Name"+Accountholdername);
  System.out.println("Balance"+Balance);
}
  void deposit(int add)
  {
    Balance +=add;
    System.out.println("New Balance"+Balance);
  }
  void checkbalance()
   {
     System.out.println("Balance"+Balance);
   }
  void withdraw(int minus)

   {
     Balance -=minus;
     System.out.println(" New Balance"+Balance);

   }
}
 class savingaccount extends bankaccount
 {
   void calculateinterest(double rate)
   {
     double interest =(Balance*rate)/100;
     System.out.println("Interesr"+interest); 
   }
  }
 class fdaccount extends bankacount
  {
    void maturityamount(double rate,int year)
  { 
   double m=(balance*rate*year)/100;
   System.out.println("Maturity amount"+m);
  }
  }
     class main
{
  public static void main(String [] args)
{   
   Scanner sc=new Scanner(System.in);
    long number=sc.nextlong();
    String name=sc.nextLine();
    int balance=sc.nextInt();
     

    savingaccount s= new savingacount()
  }
}