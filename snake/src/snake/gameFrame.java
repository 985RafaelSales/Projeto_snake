package snake;

import javax.swing.JFrame;

public class gameFrame extends JFrame {
	gameFrame(){
		this.add(new gamePane1());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
