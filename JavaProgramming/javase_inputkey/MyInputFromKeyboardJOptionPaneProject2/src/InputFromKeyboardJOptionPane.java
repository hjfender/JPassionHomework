import java.io.IOException;

import javax.swing.JOptionPane;

/*
 * 
 * @author henry
 */
public class InputFromKeyboardJOptionPane {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		String name = "";
		String age = "";
		name = JOptionPane.showInputDialog("Please enter your name");
		age = JOptionPane.showInputDialog("Please enter your age");
		int intage = Integer.parseInt(age);
		if(intage > 100){
			JOptionPane.showMessageDialog(null, "Hello "+name+", you are old!");
		} else {
			JOptionPane.showMessageDialog(null, "Hello "+name+", you are young!");
		}
	}
}
