package designpatterns;
 class Volt {
	private int volts;
	
	public Volt(int v){
		this.volts=v;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
	
}


 class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}

 interface SocketAdapter {

	public Volt get120Volt();
		
	public Volt get12Volt();
	
	public Volt get3Volt();
}
 /*
Two Way Adapter Pattern
While implementing Adapter pattern, there are two approaches – class adapter and object adapter – however both these approaches produce same result.
1.	Class Adapter – This form uses java inheritance and extends the source interface, in our case Socket class.
2.	Object Adapter – This form uses Java Composition and adapter contains the source object.
Adapter Design Pattern – Class Adapter
Here is the class adapter approach implementation of our adapter.

*/
//Using inheritance for adapter pattern
 class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v= getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		Volt v= getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}
/*Adapter Design Pattern – Object Adapter Implementation
Here is the Object adapter implementation of our adapter.

*/

public class AdapterDemo {

	public static void main(String[] args) {
		
		testClassAdapter();
	}

	
	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		//Volt v12 = getVolt(sockAdapter,12);
		//Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
		//System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		//System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}
}
