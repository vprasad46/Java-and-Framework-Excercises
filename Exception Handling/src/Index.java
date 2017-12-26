import java.util.*;
public class Index {
	public static void main(String args[]) throws ShortNameException{
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the Person's name::");
		String name = input.nextLine();
		System.out.println("::Enter the Person's age::");
		int age = input.nextInt();
		func(name,age);
		throw new ShortNameException(2);
		}
	
	public static void func(String name, int age) throws ShortNameException{
			Person person = new Person(name,age);
	 }
	}

