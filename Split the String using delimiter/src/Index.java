import java.util.*;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the String::");
		String s1 = input.nextLine();
		System.out.println("::Enter the Delimiter::");
		String s2 = input.next();
		int start = 0;
		ArrayList<String> words = new ArrayList<String>();
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
					String temp = "";
					for(int k=start;k<i;k++)
						temp+=s1.charAt(k);
					words.add(temp);
					i+=s2.length();
					start=i;
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		String temp = "";
		for(int i=start;i<s1.length();i++)
			temp+=s1.charAt(i);
		words.add(temp);
		for(int i=0;i<words.size();i++)
			System.out.println(words.get(i));
	}
}
