import java.util.*;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the String 1::");
		String s1 = input.next();
		System.out.println("::Enter the String 2::");
		String s2 = input.next();
		
		System.out.println("The SubString appears "+noOfOccurances(s1,s2)+" times");
	}
	public static int noOfOccurances(String s1, String s2){
		int count = 0;
		for(int i=0;i<s1.length();){
			if(s1.charAt(i) == s2.charAt(0)){
				int j;
				for(j=0;j<s2.length();j++){
					if(i+j>=s1.length())
						break;
					if(s2.charAt(j) != s1.charAt(i+j))
						break;
				}
				if(j==s2.length()){
					count++;
					i+=s2.length();
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		return count;
	}
}
