
//Constructor Overloading Demo
class Employee
{
	int empNo;
	String empName;
	double empSalary;

	Employee()
	{
		empNo=111;
		empName="Ravi";
		empSalary=5000;
	}

	Employee(int empNo,String empName,double empSalary)
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

class ConstructorOverloadingDemo
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		
		e.dispEmpDetails();

		Employee e1 = new Employee(222,"Raj",6000);
		
		e1.dispEmpDetails();
	}
}