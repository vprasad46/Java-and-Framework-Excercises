
public class Index implements Request {

	@Override
	public void display() {
		System.out.println("This is Implemented Method");
		
	}
	public static void main(String args[]){
		Index index = new Index();
		index.display();
	}
}
