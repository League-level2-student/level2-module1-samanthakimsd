package intro_to_array_lists;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public static void main(String[] args) {
	
	new GuestBook().createUI();
}
	private void createUI() {
		// TODO Auto-generated method stub
		frame.add(panel);
	panel.add(aButton);
	panel.add(bButton);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton aButton = new JButton("ADD NAME");
	JButton bButton = new JButton("VIEW NAME");
	// display an input dialog that asks the user to enter a name. Add

	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
