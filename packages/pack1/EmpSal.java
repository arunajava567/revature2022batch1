package pack1;

class EmpClass {
	String empName;
	double salary;

	EmpClass(String name, double sal){
		empName = name;
		salary = sal;
	}

	void display(){
		System.out.println(empName + " : $"+salary);
	}
}

class EmpSal {
	public static void main(String args[]){
		EmpClass emp[] = new EmpClass[4];
		emp[0] = new EmpClass("A.D Tedd",450.20);
		emp[1] = new EmpClass("D.M Scott",725.93);
		emp[2] = new EmpClass("B.W TayLor",630.80);
		emp[3] = new EmpClass("T.N Blair",545.60);
		for (int i=0; i<4; i++)
			emp[i].display();
	}
}
