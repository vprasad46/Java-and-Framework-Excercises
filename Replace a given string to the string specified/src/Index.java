import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the String::");
		String s1 = input.next();
		System.out.println("::Enter the string to be swapped::");
		String s2 = input.next();
		System.out.println("::Enter the string to be swapped with::");
		String s3 = input.next();
		
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
					s1 = swapSubString(s1,s3,i,j+i);
					i+=s3.length();
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		System.out.println(s1);
	}
	public static String swapSubString(String s1, String s3,int start,int end){
		String returnString = "";
		
		for(int i=0;i<start;i++)
			returnString+=s1.charAt(i);
		returnString+=s3;
		for(int i=end;i<s1.length();i++)
			returnString+=s1.charAt(i);
		
		return returnString;
	}
}
