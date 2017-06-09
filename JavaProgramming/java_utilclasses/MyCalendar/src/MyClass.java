import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class MyClass {

	public static void main(String[] args) {
		
		//instantiate the calendar object
		Calendar instance = Calendar.getInstance();
		
		//display local calendar information - DATE and HOUR
		System.out.print("Local date and hour: ");
		System.out.println(instance.get(Calendar.DATE)+" "+instance.get(Calendar.HOUR));
		
		//switch timezone to Europe/Berlin
		instance.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
		//display Berlin calendar information - DATE and HOUR
		System.out.print("Berlin date and hour: ");
		System.out.println(instance.get(Calendar.DATE)+" "+instance.get(Calendar.HOUR));
	}
}
