import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		
		Sample s1 = new Sample();
		s1.x = 1;
		s1.y = 2;
		s1.u++; // Static object accessed through any object is same;
		System.out.println("Sample s1 x = "+s1.x+" y = "+s1.y+" u = "+s1.u);
		Sample s2 = new Sample();
		s2.x = 2;
		s2.y = 4;
		s2.u++;
		System.out.println("Sample s2 x = "+s2.x+" y = "+s2.y+" u = "+s2.u);
		{
			int y = 100;
			System.out.println("Local variable y = "+y);
		}
//		System.out.println(y); 'y' cannot be accessed from here because it is a local variable
	}
}
