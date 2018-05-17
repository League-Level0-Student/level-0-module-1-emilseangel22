package extra;

import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null, "When is your Cake day?");
	if (answer.equals("5/17")){
		JOptionPane.showMessageDialog(null, "Happy Cake Day!!");
	}
	else {
		JOptionPane.showMessageDialog(null,"Happy uncake day.");
		
	}
}
}
