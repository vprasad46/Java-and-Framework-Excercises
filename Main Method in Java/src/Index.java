/*
 *  Main Method doesn't belong to any class. This method is always defined as public static void main()
 *  The Main method is the entry point of any program and it always accepts a String array as an argument
 *  
 *  The Syntax is public static void main(String args[]){} The reason it is defined as above is written 
 *  below
 *  
 *  public - This is to make method visible to the JVM to find the main method
 *  static - Since there will be no objects of the Class Index created at the beginning of the program
 *  		this method is defined as static method
 *  void - In java it is mandatory of any method to return something so the main method returns void
 *  main - this is the keyword for which the JVM searches
 *  String args[] - The main method accepts String array as an argument
 *  
 *  Main method can be overloaded with different arguments but the entry point of JVM will always be the
 *  method with a String array as parameter.
 */
public class Index {
	public static void main(String args[]){
		System.out.println("Hello world");
	}
}
