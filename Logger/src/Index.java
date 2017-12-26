import java.io.IOException;
import java.util.logging.*;
public class Index {
	private static final Logger l = Logger.getLogger("Index");
	public static void main(String args[]){
		LogManager.getLogManager().reset();
		l.setLevel(Level.ALL);
		
		ConsoleHandler cl = new ConsoleHandler();
		cl.setLevel(Level.SEVERE);
		l.addHandler(cl);
		
		FileHandler fl;
		try {
			fl = new FileHandler("myLogger.log");
			fl.setLevel(Level.ALL);
			l.addHandler(fl);
		} catch (IOException e) {
			l.log(Level.SEVERE,"File Logger not Working",e);
		}
		
		l.severe("Log this !!!!!");
		
	}
}
