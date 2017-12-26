import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the String::");
		isPalin(input.next());
	}
	public static void isPalin(String input){
		int count = 0;
		for(int i=0;i<(input.length()+1)/2;i++){
			if(input.charAt(i) == input.charAt(input.length()-1-i))
				count++;
		}
		
		if(count == (input.length()+1)/2)
			System.out.println("This is a Palindrome");
		else
			System.out.println("This is not a Palindrome");
	}
}
