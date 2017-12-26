import java.util.*;

// Random class generates random object 
public class Index {
	public static void main(String args[]){
		
		Random rd = new Random();
		
		for(int i=0;i<10;i++){
			System.out.print(rd.nextInt(200)+"\t");
			System.out.print(rd.nextBoolean()+"\t");
			System.out.print(rd.nextGaussian()+"\t");
			System.out.print(rd.nextDouble()+"\t");
			System.out.println();
		}
	}
}
