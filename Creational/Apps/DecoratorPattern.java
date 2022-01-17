package designpatterns;
	 interface Car {
	public void assemble();
	}
	 class BasicCar implements Car {
		public void assemble() {
			System.out.print("Basic Car.");		}		}
		
	 class CarDecorator implements Car {
		protected Car car;
		public CarDecorator(Car c){
			this.car=c;
		}
		public void assemble() {
			this.car.assemble();
		}
	}
	 class SportsCar extends CarDecorator {
		public SportsCar(Car c) {
			super(c);
		}
		public void assemble(){
			super.assemble();
			System.out.print(" Adding features of Sports Car.");
		}
	}
	 class LuxuryCar extends CarDecorator {
		public LuxuryCar(Car c) {
			super(c);
		}
		public void assemble(){
			super.assemble();
			System.out.print(" Adding features of Luxury Car.");
		}
	}
 class DecoratorPattern {
	public static void main(String[] args) {  // new BufferedReader(new InputStreamReader(System.in));
		Car sportsCar = new SportsCar(new BasicCar()); //decorator syntax
		sportsCar.assemble();
		System.out.println("\n*****");
			Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}

