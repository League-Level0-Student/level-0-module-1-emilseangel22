import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
String answer = JOptionPane.showInputDialog(null,"What did the clock say to the watch?");
if (answer.equals("can't wait to see you later")){
	JOptionPane.showMessageDialog(null,"You are right!");
	score = score +1;

}
else {
	JOptionPane.showMessageDialog null, "You are wrong. It is can't wait to see you later."+score; 
}

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

