
//Class Demo
class Employee
{
  int empNo;
  String empName;
  double empSalary;
  
  void inputEmpDetails(int empNo,String empName,double empSalary)
  {
    this.empNo = empNo;
    this.empName = empName;
    this.empSalary = empSalary;
  }
  void dispEmpDetails()
  {
    System.out.println("Emp No:"+empNo);
    System.out.println("Emp Name:"+empName);
    System.out.println("Emp Salary:"+empSalary);
  }
}
public class EmployeeDemo
{
  public static void main(String[] args)
  {
    Employee e = new Employee();
    e.inputEmpDetails(111,"Ravi",5000);
    e.dispEmpDetails();
  }
}