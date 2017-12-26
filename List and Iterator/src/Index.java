import java.util.*;

public class Index {
	public static void main(String args[]){
		//Array List
		List<String> list = new ArrayList<String>();

		list.add("element 0");
		list.add("element 1");
		list.add("element 2");

		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println(element);
		}
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Linked List 1");
		ll.add("Linked List 2");
		ll.add("Linked List 3");
		
		Iterator it = ll.iterator();
		while(it.hasNext()){
		  String element = (String) it.next();
		  System.out.println(element);
		}
		
		
		Vector v1 = new Vector();
		v1.addAll(0,list);
		v1.add(3,123);
		System.out.println(v1.get(3));
		
		Stack s1 = new Stack();
		
		s1.push(1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		s1.push(v1);
		System.out.println(s1.peek());
		
	}
}
