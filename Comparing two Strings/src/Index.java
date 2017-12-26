import java.util.*;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("::Enter the String 1::");
		String s1 = input.next();
		System.out.println("::Enter the String 2::");
		String s2 = input.next();
		
		System.out.println("Without Case Sensitivity "+compareIgnoreCase(s1,s2));
		System.out.println("With Case Sensitivity "+compareWithCase(s1,s2));
	}
	
	public static boolean compareIgnoreCase(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		else{
			for(int i=0;i<s1.length();i++){
				if(Character.toUpperCase(s1.charAt(i)) != Character.toUpperCase(s2.charAt(i)))
					return false;
			}
			return true;
		}
	}
	public static boolean compareWithCase(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		else{
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i) != s2.charAt(i))
					return false;
			}
			return true;
		}
	}
}
