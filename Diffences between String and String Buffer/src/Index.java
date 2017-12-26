/* STRING: Objects once defined cannot be altered. New objects are created every time 
 * modifications are done. So more memory and more time consuming when it comes
 * to concatenation and other functions.
 
 * STRING BUFFER: Objects of String buffer can be changed accordingly. Less Memory and
 * time consuming so it is efficient than STRING class. The only advantage is STRING 
 * BUFFER is SYNCHRONIZED. When further the time complexity to be reduced STRINGBUILDER
 * class is used. 
 */
public class Index {
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		concatString();
		System.out.println("Time taken to concat string "+(System.currentTimeMillis()-startTime)+" ms");
		startTime = System.currentTimeMillis();
		concatStringBuffer();
		System.out.println("Time taken to concat String buffer "+(System.currentTimeMillis()-startTime)+" ms");
		startTime = System.currentTimeMillis();
		concatStringBuilder();
		System.out.println("Time taken to concat String Builder "+(System.currentTimeMillis()-startTime)+" ms");
	}
	public static void concatString(){
		String t = "String";
		for(long i=0;i<10000;i++)
			t+=" concat";
	}
	public static void concatStringBuffer(){
		StringBuffer t = new StringBuffer("StringBuffer");
		for(long i=0;i<10000;i++)
			t.append(" concat");
	}
	public static void concatStringBuilder(){
		StringBuilder t = new StringBuilder();
		for(long i=0;i<10000;i++)
			t.append(" concat");
	}
}
