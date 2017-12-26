//Copy one String to Another String
import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the String::");
		String inp = input.next();
		String copy_inp = new String();
		for(int i=0;i<inp.length();i++)
			copy_inp+=inp.charAt(i);
		System.out.println(copy_inp);
	}
}
