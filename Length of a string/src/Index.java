import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	
		System.out.println("::Enter the String::");
		String inp = input.next();
		System.out.println(inp.toCharArray().length);
	}
}
