import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Index {
	public static void main(String args[]){
		try(BufferedWriter wr = new BufferedWriter(new FileWriter("asd.txt",true));) {
			Scanner input = new Scanner(System.in);
			wr.write(input.nextLine());
			wr.newLine();
			wr.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
