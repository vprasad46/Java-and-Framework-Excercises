import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the String 1::");
		String inp = input.next();
		System.out.println("::Enter the String 2::");
		String inp2 = input.next();
		
		System.out.println(inp+inp2);
	}
}
