
public class Person {
	private String name;
	private int age;
	
	Person(String name, int age) throws ShortNameException{
		if(name.length()<=10)
			throw new ShortNameException(name.length());
		this.name = name;
		this.age = age;
	}
}
