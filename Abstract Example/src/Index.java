
public class Index extends AbstractClass{
	public static void main(String args[]){
		Index index = new Index();
		index.dispNumber();
		index.display();
	}

	@Override
	public void display() {
		System.out.println("This is from the inherited Class");
	}
}
