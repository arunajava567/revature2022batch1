
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

	void dispEmpDetails()
	{
		System.out.println("Emp No:"+empNo);
		System.out.println("Emp Name:"+empName);
		System.out.println("Emp Salary:"+empSalary);
	}
}

class ConstructorDemo
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.dispEmpDetails();
	}
}




