import java.util.*;

public class MapEntryDemo {
	public static void main(String arghs[]) {
		HashMap hmp = new HashMap();
		hmp.put("Neha", new Double(2424.34));
		hmp.put("Niti", new Double(367.22));
		hmp.put("Shivangi", new Double(4381.00));
		hmp.put("Vinita", new Double(4761.22));
		hmp.put("Sushmita", new Double(3904.08));
		// Get a set of the entries
		Set set = hmp.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display entries
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			if (me.getKey().equals("Sushmita")) {
				me.setValue((Double) me.getValue() + 1000.00);
				System.out.println("Sushmita's new balance: " + me.getValue());
			}
		}
	}
}