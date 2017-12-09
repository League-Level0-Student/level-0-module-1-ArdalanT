import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle=JOptionPane.showInputDialog("I stay with you all day, but not night. What am I?");
		String ans= "your shadow";
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equals(ans)) {
	JOptionPane.showMessageDialog(null, "Correct");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "WRONG, the real answer is your shadow");
}
		// 6. Add some more riddles

riddle=JOptionPane.showInputDialog("I gurgle but never speak, run but never walk, have a bed but never sleeps. What am I?");
 ans= "a river";
//4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equals(ans)) {
JOptionPane.showMessageDialog(null, "Correct");
score++;
}
// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "WRONG, the correct answer is a river");
}








// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "score: " + score);
	}
}

