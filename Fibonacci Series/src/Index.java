// Print n Fibonacci numbers
import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("::Enter the number of Fibonacci Numbers to be printed::");
		int n = input.nextInt();
		int prev = 0;
		int now = 1;
		for(int i=0;i<n;i++){
			
			if(i<2)
				System.out.print(i+" ");
			else{
				int sum = prev + now;
				System.out.print(sum+" ");
				prev = now;
				now = sum;
			}
		}
	}
}
