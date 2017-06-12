package mypackage;

public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args){
		String name = "Sang Shin";
		int age = 100;

		if (args.length == 1) {
			name = args[0];
		}

		if (args.length == 2) {
			name = args[0];
			age = Integer.parseInt(args[1]);
		}

		Person p = new Person(name, age);
		System.out.println(p.saySomething());
	}

}