import java.util.*;
public class Index {
	public static void main(String args[]){
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
		
		ht.put(3, "Vishwa");
		ht.put(10, "Prasad");
	
		Enumeration e = ht.elements();
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}
