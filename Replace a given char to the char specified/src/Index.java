import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the String::");
		String inp = input.next();
		System.out.println("::Enter the character to be swapped::");
		char a = input.next().charAt(0);
		System.out.println("::Enter the character to be swapped with::");
		char b = input.next().charAt(0);
		char arr[] = inp.toCharArray();
		for(int i=0;i<inp.length();i++){
			if(arr[i] == a)
				arr[i] = b;
		}
		System.out.println(arr);
	}
}
