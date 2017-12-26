import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/*
 * Properties are nothing but HashTable but only for String as a key,String as a value
 */
public class Index {
	public static void main(String args[]){
		Properties p = new Properties();
		
		p.put("email", "vprasad46@gmail.com");
		p.put("password", "password");
		
		//Storing using properties class 
		try {
			p.store(new FileWriter("myDetails.txt"), "These are my credentials");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
