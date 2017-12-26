import java.util.*;
import java.io.*;
public class Index {
	public static void main(String args[]){
		try(FileInputStream file = new FileInputStream("asd.txt");InputStreamReader isr = new InputStreamReader(file,"UTF-8");) {
			int i;
			while((i=isr.read())!=-1){
				System.out.print((char)i);
			}
			System.out.println();
			System.out.println((String)isr.getEncoding());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
