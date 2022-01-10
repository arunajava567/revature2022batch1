interface IntDemo {
	void display();
}

class classOne implements IntDemo {
	void add(int x, int y){
		System.out.println("The sum is :" +(x+y));
	}

	public void display(){
		System.out.println("Class one display method ");
	}
}

class classTwo implements IntDemo {
	void multiply(int i,int j, int k){
		System.out.println("The result:" +(i*j*k) );
	}

	public void display(){
		System.out.println("Class two display method" );
	}
}

class InterfaceReferenceDemo {
	public static void main(String args[]){
		IntDemo c1= new classOne();
		c1.display();
		c1 = new classTwo();
		c1.display();
	}
}
