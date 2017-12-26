import java.util.concurrent.ThreadLocalRandom;

public class ThreadExample implements Runnable{
	String name;
	long time;
	ThreadExample(String name){
		this.name = name;
		this.time = ThreadLocalRandom.current().nextLong(1000);
	}
	@Override
	public void run() {
		System.out.println("Thread "+ name +" is running.");
		try {
			System.out.println("Sleep time for "+ name +" for "+(time/1000.00)+" seconds");
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" woke up!!");
	}
}
