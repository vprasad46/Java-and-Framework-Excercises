/* Overriding toString method . String method overrides toString to convert other data
* data types to String.
*/
public class Index {
	public static void main(String args[]){
		Sample s1 = new Sample();
		System.out.println(s1.getClass().getSuperclass());// Every Class is inherited
		// from java.lang.Object class
		System.out.println(s1.toString());
	}
}
