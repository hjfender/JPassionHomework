package com.mycompany.mySwingApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Hello world!
 *
 */
public class MySwingApp implements ActionListener {
	final static int NUM_IMAGES = 6;
	final static int START_INDEX = 0;
	
	ImageIcon[] images = new ImageIcon[NUM_IMAGES];
	JPanel mainPanel, selectPanel, displayPanel;
	
	JComboBox countryChoices = null;
	JLabel countryIconLabel = null;
	
	public MySwingApp() {
		//Create the country selection and display panels
		selectPanel = new JPanel();
		displayPanel = new JPanel();
		
		//Add various widgets to the sub panels
		addWidgets();
		
		//Create the main panel to contain the two sub panels
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		//Add the select and display panels to the main panel
		mainPanel.add(selectPanel);
		mainPanel.add(displayPanel);
	}
	
	private void addWidgets() {
		// Get the images from the resources directory and place them into an array of ImageIcons
		for (int i = 0; i < NUM_IMAGES; i++) {
			images[i] = createImageIcon("/images/image" + i + ".jpeg");
		}
		
		/*
		 * Create a label for displaying the country flag images
		 * and place a border around it.
		 */
		countryIconLabel = new JLabel();
		countryIconLabel.setHorizontalAlignment(JLabel.CENTER);
		countryIconLabel.setHorizontalTextPosition(JLabel.CENTER);
		countryIconLabel.setVerticalAlignment(JLabel.CENTER);
		countryIconLabel.setVerticalTextPosition(JLabel.CENTER);
		countryIconLabel.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLoweredBevelBorder(),
				BorderFactory.createEmptyBorder(5,5,5,5)));
		countryIconLabel.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createEmptyBorder(0,0,10,0),
				countryIconLabel.getBorder()));
		
		// Create a combo box with country choices.
		String[] countries = {"Brazil", "Spain", "Netherlands", "Italy", "Germany", "Argentina"};
		countryChoices = new JComboBox(countries);
		countryChoices.setSelectedIndex(START_INDEX);
		
		// Display the first image.
		countryIconLabel.setIcon(images[START_INDEX]);
		countryIconLabel.setText("");
		
		// Add a border around the select panel
		selectPanel.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createTitledBorder("Select WorldCup 2010 Country"),
				BorderFactory.createEmptyBorder(5,5,5,5)));
		
		// Add a border around the display panel
		displayPanel.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createTitledBorder("Display WorldCup 2010 Country"),
				BorderFactory.createEmptyBorder(5,5,5,5)));
		
		// Add countries combo box to select panel and image label
		displayPanel.add(countryIconLabel);
		selectPanel.add(countryChoices);
		
		// Listen to events from the combo box
		countryChoices.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		if ("comboBoxChanged".equals(event.getActionCommand())) {
			// Update the icon to display the new country
			countryIconLabel.setIcon(images[countryChoices.getSelectedIndex()]);
		}
	}
	
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL resource = MySwingApp.class.getResource(path);
		
		if (resource == null) {
			System.err.println("Resource not found: " + path);
			return null;
		} else {
			return new ImageIcon(resource);
		}
	}
	
	private static void createAndShowGUI() {
		// Ensure the GUI has nice window decorations
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		// Create a new instance of this application class
		MySwingApp mySwingApp = new MySwingApp();
		
		// Create and set up the window
		JFrame frame = new JFrame("WorldCup 2010");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(mySwingApp.mainPanel);
		
		// Display the window
		frame.pack();
		frame.setVisible(true);
	}
	
    public static void main( String[] args ) {
    	// Schedule a job for the event-dispatching thread: this creates and shows the application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
        	public void run(){
        		createAndShowGUI();
        	}
        });
    }
}
