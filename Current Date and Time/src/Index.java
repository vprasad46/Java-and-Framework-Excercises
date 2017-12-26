import java.text.*;
import java.util.*;
public class Index {
	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	public static void main(String args[]){
		Date date = new Date();
		System.out.println(sdf.format(date));
	}
}
