import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Index {
	public static void main(String args[]){
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Calendar Functions
		c.add(Calendar.DATE, 2);
		System.out.println("2 days from now "+ c.getTime());
		c.add(Calendar.DATE,-2);
		c.add(Calendar.MONTH, 5);
		System.out.println("5 months from now "+c.getTime());
		c.add(Calendar.MONTH, -5);
		c.add(Calendar.YEAR, 2);
		System.out.println("2 years from now "+c.getTime());
		c.add(Calendar.YEAR, -2);
		// SimpleDateFormat is for Date
		System.out.println(sdf.format(c.getTime()));
		
		
		//Date Functions
		Date d1 = new Date();
		System.out.println(sdf.format(d1));
		Date date;
		try {
			date = sdf.parse("31/03/2015");
			System.out.println("Date is: "+date); 
		} catch (ParseException e) {
			e.printStackTrace();
		}  
	     
	}
}
