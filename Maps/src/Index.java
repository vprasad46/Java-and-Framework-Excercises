import java.util.*;
public class Index {
	public static void main(String args[]){
		//Does not maintain a specific order
		HashMap<String,String> hm = new HashMap<String,String>();
		System.out.println("HashMap Does not maintain a specific order ");
		System.out.println();
		hm.put("Vishwa", "Male");
		hm.put("Aiyswarya","Female");
		hm.put("Muruga","Male");
		hm.put("Viswesvaran", "Male");
		for(Map.Entry<String, String> m:hm.entrySet()){
			System.out.println("The Name is "+m.getKey()+" and the Gender is "+m.getValue());
		}
		System.out.println();
		//LinkedHashMap maintains a insertion order
		LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
		System.out.println("LinkedHashMap maintains a insertion order");
		System.out.println();
		lhm.put("Vishwa", "Male");
		lhm.put("Aiyswarya","Female");
		lhm.put("Muruga","Male");
		lhm.put("Viswesvaran", "Male");
		for(Map.Entry<String, String> m:lhm.entrySet()){
			System.out.println("The Name is "+m.getKey()+" and the Gender is "+m.getValue());
		}
		System.out.println();
		//TreeMap sorts the Value in ascending order of Ascii Values
		TreeMap<String,String> thm = new TreeMap<String,String>();
		System.out.println("TreeMap sorts the Value in ascending order of Ascii Values");
		System.out.println();
		thm.put("Vishwa", "Male");
		thm.put("Aiyswarya","Female");
		thm.put("Muruga","Male");
		thm.put("Viswesvaran", "Male");
		for(Map.Entry<String, String> m:thm.entrySet()){
			System.out.println("The Name is "+m.getKey()+" and the Gender is "+m.getValue());
		}
		
	}
}
