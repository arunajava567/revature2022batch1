
//super Demo
class Account
{
  int acctNo;
  double balance;
  
  Account(){}
  
  Account(int acctNo,double balance)
  {
    this.acctNo = acctNo;
    this.balance = balance;
  }
  
  void display()
  {
    System.out.println("Account No:"+acctNo);
    System.out.println("Account Balance:"+balance);
  }
}

class SavingAccount extends Account
{
  double interest;
  
  SavingAccount(){}
  
  SavingAccount(int acctNo,double balance,double interest)
  {
    super(acctNo,balance);
    this.interest = interest;
  }
  
  void display()
  {
    super.display();
    System.out.println("Interest:"+interest);
  }
}

public class SuperDemo
{
  public static void main(String[] args)
  {
    SavingAccount sa = new SavingAccount(111,5000,8.5);
    sa.display();
  }
}
