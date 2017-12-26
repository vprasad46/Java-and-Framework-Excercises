import java.io.*;
public class ShortNameException extends Exception {
	private int length;
	
	ShortNameException(int length){
		this.length = length;
	}
	public int getLength(){
		return this.length;
	}
}
