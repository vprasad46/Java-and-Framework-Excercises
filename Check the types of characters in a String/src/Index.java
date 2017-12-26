//Counting the number of lowercase, uppercase, no.of.digits, Special Characters
import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int l=0, u=0, n=0, s=0; 
		
		System.out.println("::Enter the String::");
		String inp = input.next();
		input.close();
		for(int i=0;i<inp.length();i++){
			if(inp.charAt(i)>='a' && inp.charAt(i)<='z')
				l++;
			else if(inp.charAt(i)>='A' && inp.charAt(i)<='Z')
				u++;
			else if(inp.charAt(i)>='0' && inp.charAt(i)<='9')
				n++;
			else if((inp.charAt(i)>='!' && inp.charAt(i)<='/')||(inp.charAt(i)=='@'))
				s++;
		}
		
		System.out.println("Lowercase Characters: "+l);
		System.out.println("Uppercase Characters: "+u);
		System.out.println("Numbers: "+n);
		System.out.println("Special Characters: "+s);
	}
}
