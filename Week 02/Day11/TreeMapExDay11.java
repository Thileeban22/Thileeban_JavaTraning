package programs.Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExDay11 {

	public static void main(String[] args) {
		
		
		TreeMap<String,String> hmss = new TreeMap<String, String>(
				(c1,c2)->(c2.compareTo(c1))
				);
		hmss.put("Karnataka", "Bangalore");
		
		hmss.put("Tamilnadu", "Chennai");
		hmss.put("AP", "Amaravati");
		hmss.put("Kerala", "Trivandrum");
		
		Set<Entry<String,String>> sess = hmss.entrySet();
		Iterator<Entry<String, String>> it = sess.iterator();
		

		
		while(it.hasNext()) {
			Entry<String,String> ess = it.next();
			System.out.println(ess.getKey()+"=>"+ess.getValue());
		}
		
		
		
	}
}