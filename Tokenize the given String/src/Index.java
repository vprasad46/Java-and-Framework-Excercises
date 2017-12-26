import java.util.*;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("::Enter the String::");
		String s1 = input.nextLine();
		System.out.println("::Enter the Tokenizer::");
		String s2 = input.nextLine();
		
		ArrayList<String> words = new ArrayList<String>();
		HashSet<Character> delim = new HashSet<Character>();
		
		for(int i=0;i<s2.length();i++)
			delim.add(s2.charAt(i));
		
		String temp = "";
		for(int i=0;i<s1.length();i++){
			
			if(delim.contains(s1.charAt(i))){
				if(temp!="")
					words.add(temp);
				temp = "";
			}
			else{
				temp+=s1.charAt(i);
			}
		}
		if(temp!="")
			words.add(temp);
		for(int i=0;i<words.size();i++)
			System.out.println(words.get(i));
	}
}
