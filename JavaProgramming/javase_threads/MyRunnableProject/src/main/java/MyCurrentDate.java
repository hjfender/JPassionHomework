import java.util.Date;
import java.text.DateFormat;

public class MyCurrentDate implements Runnable {

	DateFormat formatter;
	Thread thread;

	public MyCurrentDate(String name) {
		thread = new Thread(this, name);
		thread.start();
	}

	public void run() {
		System.out.println("Starting thread " + thread.getName());
		formatter = DateFormat.getDateTimeInstance();
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + thread.getName() + ": " + formatter.format(new Date()));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

}
