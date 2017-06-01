package mypackage;

/**
 * @author hefe002
 *
 */
public class CommandLineArguements {
	
	public static void main(String[] args) {
		//Prevent invalid formatting
		if(args.length < 6 || args.length > 12){
			System.out.println("Too many or too few arguments");
			System.exit(0);
		} else if (args.length%2 ==1){
			System.out.println("Odd number of arguments");
			System.exit(0);
		}
		
		//Compute the average of ages
		int average = 0;
		
		for (int i = 1; i < args.length; i+=2) {
			average += Integer.parseInt(args[i]);
		}
		average = 2*average/args.length;
		
		System.out.println("The average age of your family is "+average);
	}
	
}
