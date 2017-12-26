import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
 
public class Index {
  public static void main(String[] args) throws IOException {
    String fileName = "file.txt";
 
    RandomAccessFile rf = new RandomAccessFile(fileName,"rw");
    rf.writeUTF("Hello World!!!");
    rf.seek(0);
    System.out.println(rf.readLine());
    rf.seek(0);
    System.out.println(rf.readInt());
    rf.close();
  }
}