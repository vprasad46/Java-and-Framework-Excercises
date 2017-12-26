// Factorial of 'n' 
import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the number::");
		int n = input.nextInt();
		int fact = 1;
		while(n>0){
			fact*=n;
			n--;
		}
		System.out.println(fact);
	}
}
