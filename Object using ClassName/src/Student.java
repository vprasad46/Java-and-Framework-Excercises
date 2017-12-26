import java.io.Serializable;

public class Student implements Serializable,Comparable{
	int marks = 123123;
	String name= "asdasd";
	Student(){
		
	}
	Student(int marks,String name){
		this.marks = marks;
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
