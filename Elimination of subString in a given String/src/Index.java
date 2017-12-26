import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter the String 1::");
		String s1 = input.next();
		System.out.println("::Enter the String 2::");
		String s2 = input.next();
	
		deleteSubstring(s1,s2);
	}
	public static void deleteSubstring(String s1, String s2){
		int length = s1.length();
		char arr[] = s1.toCharArray();
		for(int i=0;i<length;){
			if(arr[i] == s2.charAt(0)){
				int j;
				for(j=0;j<s2.length();j++){
					if(i+j>=length)
						break;
					if(s2.charAt(j) != arr[i+j])
						break;
				}
				if(j==s2.length()){
					for(int k = 0;k<(length-i-s2.length());k++)
						arr[i+k] = arr[i+s2.length()+k];
					length-=s2.length();
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		for(int i=0;i<length;i++)
			System.out.print(arr[i]);
	}
}
