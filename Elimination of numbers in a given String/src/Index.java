import java.util.Scanner;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("::Enter the String in which numbers to be removed::");
		String inp = input.next();
		
		withStringBuilder(inp);
		withoutStringBuilder(inp);
		
	}
	public static void withStringBuilder(String inp){
		StringBuilder stringbuilder = new StringBuilder(inp);
		for(int i=0;i<stringbuilder.toString().length();){
			if(stringbuilder.toString().charAt(i)>='0' && stringbuilder.toString().charAt(i)<='9'){
				stringbuilder.deleteCharAt(i);
			}
			else{
				i++;
			}
		}
		System.out.println("The resultant String with using String Builder is "+ stringbuilder.toString());
	}
	public static void withoutStringBuilder(String inp){
		int length = inp.length();
		char arr[] = inp.toCharArray();
		for(int i=0;i<length;){
			if(arr[i]>='0' && arr[i]<='9'){
				for(int j=i;j+1<length && j<length;j++){
					arr[j] = arr[j+1];
				}
				length--;
			}
			else{
				i++;
			}
		}
		System.out.print("The resultant String without using String Builder is ");
		for(int i=0;i<length;i++)
			System.out.print(arr[i]);
	}
}
