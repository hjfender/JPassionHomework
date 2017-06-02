package mypackage;

/**
 * @author hefe002
 *
 */
public class Class {

	public static void main(String[] args) {
		//ensure that only 3 to 6 family names were passed in as arguments
		if (args.length > 6){
			System.out.println("Too many names!");
			System.exit(0);
		} else if (args.length < 3){
			System.out.println("Too few names!");
			System.exit(0);
		}
		
		//print out each family name
		System.out.println("Original family names:");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("Newly generated name:");
		System.out.println(generateNewName(args));
	}
	
	/**
	 * @param family array of Strings
	 * Method to create a new first name by using the 2nd character of each name String in the family array
	 */
	static String generateNewName(String[] family){
		//declare the newName variable
		String newName = "";
		
		//initialize the newName variable by appending in order every second character
		//of the Strings in the family array
		for (int i = 0; i < family.length; i++) {
			newName += family[i].charAt(1);
		}
		
		//return the newName
		return newName;
	}
}
