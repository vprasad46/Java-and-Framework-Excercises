
public class Sample {
	int a ;
	
	private Sample(int a){
		this.a = a;
	}
	
	static Sample getInstance(int a){
		return new Sample(a);
	}
}
