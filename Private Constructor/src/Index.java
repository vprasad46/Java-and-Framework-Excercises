/*
 * Creating a static method inside Sample.java which return an instance is used 
 * in case the class has a private Construct
 */
public class Index {
	public static void main(String args[]){
		Sample s1 = Sample.getInstance(10);
		System.out.println(s1.a);
	}
}
