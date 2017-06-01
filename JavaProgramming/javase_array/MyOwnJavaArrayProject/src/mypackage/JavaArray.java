package mypackage;

import javax.swing.JOptionPane;

public class JavaArray {
	
	public static void main(String[] args) {
		String[] names = new String[3];
		String longest_name = "";
		
		for (int i = 0; i < 3; i++) {
			names[i] = JOptionPane.showInputDialog("Please enter your name");
			if(i==0 || names[i].length()>=longest_name.length()){
				longest_name = names[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, longest_name + " has the longest first name");
	}
}
