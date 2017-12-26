import java.util.ArrayList;

public class Strings {
	String var;
	
	Strings(String var){
		this.var = var;
	}
	public  boolean compareIgnoreCase(Strings s2){
		if(this.var.length()!=s2.var.length())
			return false;
		else{
			for(int i=0;i<this.var.length();i++){
				if(Character.toUpperCase(this.var.charAt(i)) != Character.toUpperCase(s2.var.charAt(i)))
					return false;
			}
			return true;
		}
	}
	public  boolean compareWithCase(Strings s2){
		if(this.var.length()!=s2.var.length())
			return false;
		else{
			for(int i=0;i<this.var.length();i++){
				if(this.var.charAt(i) != s2.var.charAt(i))
					return false;
			}
			return true;
		}
	}
	
	public Strings concat(Strings s2){
		return new Strings(this.var+s2.var);
	}
	
	public int indexOf(Strings s2){
		int length = this.var.length();
		char arr[] = this.var.toCharArray();
		for(int i=0;i<length;){
			if(arr[i] == s2.var.charAt(0)){
				int j;
				for(j=0;j<s2.var.length();j++){
					if(i+j>=length)
						break;
					if(s2.var.charAt(j) != arr[i+j])
						break;
				}
				if(j==s2.var.length()){
					return i;
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		return -1;
	}
	
	public Strings subString(int index){
		String temp = "";
		
		for(int i=index;i>0&&i<this.var.length();i++)
			temp+= this.var.charAt(i);
		return new Strings(temp);
	}
	
	public Strings subString(int bindex, int eindex){
		String temp = "";
		
		for(int i=bindex;(i>0&&i<this.var.length())&&(i<eindex);i++)
			temp+= this.var.charAt(i);
		return new Strings(temp);
	}
	
	public Strings replace(Strings phraseReplaced, Strings replaceWith){
		for(int i=0;i<this.var.length();){
			if(this.var.charAt(i) == phraseReplaced.var.charAt(0)){
				int j;
				for(j=0;j<phraseReplaced.var.length();j++){
					if(i+j>=this.var.length())
						break;
					if(phraseReplaced.var.charAt(j) != this.var.charAt(i+j))
						break;
				}
				if(j==phraseReplaced.var.length()){
					this.var = swapSubString(this.var,replaceWith.var,i,j+i);
					break;
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		return this;
	}
	public Strings replaceAll(Strings phraseReplaced, Strings replaceWith){
		for(int i=0;i<this.var.length();){
			if(this.var.charAt(i) == phraseReplaced.var.charAt(0)){
				int j;
				for(j=0;j<phraseReplaced.var.length();j++){
					if(i+j>=this.var.length())
						break;
					if(phraseReplaced.var.charAt(j) != this.var.charAt(i+j))
						break;
				}
				if(j==phraseReplaced.var.length()){
					this.var = swapSubString(this.var,replaceWith.var,i,j+i);
					i+=replaceWith.var.length();
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		return this;
	}
	private String swapSubString(String s1, String s3,int start,int end){
		String returnString = "";
		
		for(int i=0;i<start;i++)
			returnString+=s1.charAt(i);
		returnString+=s3;
		for(int i=end;i<s1.length();i++)
			returnString+=s1.charAt(i);
		
		return returnString;
	}
	public boolean contains(Strings s2){
		int length = this.var.length();
		char arr[] = this.var.toCharArray();
		for(int i=0;i<length;){
			if(arr[i] == s2.var.charAt(0)){
				int j;
				for(j=0;j<s2.var.length();j++){
					if(i+j>=length)
						break;
					if(s2.var.charAt(j) != arr[i+j])
						break;
				}
				if(j==s2.var.length()){
					return true;
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		return false;
	}
	public Strings toUpperCase(){
		char arr[] = this.var.toCharArray();
		for(int i=0;i<this.var.length();i++){
			arr[i] = Character.toUpperCase(arr[i]);
		}
		return new Strings(new String(arr));
	}
	public Strings toLowerCase(){
		char arr[] = this.var.toCharArray();
		for(int i=0;i<this.var.length();i++){
			arr[i] = Character.toLowerCase(arr[i]);
		}
		return new Strings(new String(arr));
	}
	public ArrayList<String> split(String delimiter){
		int start = 0;
		ArrayList<String> words = new ArrayList<String>();
		for(int i=0;i<this.var.length();){
			if(this.var.charAt(i) == delimiter.charAt(0)){
				int j;
				for(j=0;j<delimiter.length();j++){
					if(i+j>=this.var.length())
						break;
					if(delimiter.charAt(j) != this.var.charAt(i+j))
						break;
				}
				if(j==delimiter.length()){
					String temp = "";
					for(int k=start;k<i;k++)
						temp+=this.var.charAt(k);
					words.add(temp);
					i+=delimiter.length();
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
		for(int i=start;i<this.var.length();i++)
			temp+=this.var.charAt(i);
		words.add(temp);
		return words;
	}
	public Strings reverse(){
		char arr[] = this.var.toCharArray();
		for(int i=0;i<arr.length/2;i++){
			char temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		return new Strings(new String(arr));
	}
	public boolean endsWith(Strings s2){
		Strings actual = this.reverse();
		s2 = s2.reverse();
		if(actual.indexOf(s2) == 0)
			return true;
		else
			return false;
	}
}
