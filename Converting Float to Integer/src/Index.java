import java.math.*;

public class Index {
	public static void main(String args[]){
		float a = 2.54f;
		
		System.out.println(Math.round(a)); //Rounding off 
		System.out.println(Math.floor(a)); // Flooring
		System.out.println(new BigDecimal(String.valueOf(a)).doubleValue());
		//Double
		System.out.println(Long.parseLong(String.valueOf(Math.round(a)))); //Long
		
	}
}
