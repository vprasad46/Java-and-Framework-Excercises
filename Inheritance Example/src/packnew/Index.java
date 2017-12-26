package packnew;

public class Index {
	public static void main(String args[]){
		Faculty f = new Faculty("Santhosh",28,20000);
		Student s = new Student("Kathiravan",16,35);
		
		System.out.println("::Faculty Details::");
		System.out.println(f.name+" "+f.age+" "+f.salary);
		System.out.println("::Student Details::");
		System.out.println(s.name+" "+s.age+" "+s.marks);
	}
}
