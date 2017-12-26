import java.util.*;

public class Index {
	public static void main(String args[]){
		Properties systemProps = System.getProperties();
		Set<Object> key = systemProps.keySet();
		
//		for(Object obj: key){
//			String keys = (String) obj;
//			System.out.println(keys+" "+System.getProperty(keys));
//		}
//		
		System.out.println(System.getProperty("user.dir"));
	}
}
