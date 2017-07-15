import javax.swing.*;
import java.awt.*;

public class createFrame {
	JFrame jFrame = new JFrame("Card Game");
	JButton[] button = new JButton[9];

	public void GridLayout() {
		jFrame.setLayout(new GridLayout(3,3));
		Container container = jFrame.getContentPane();
		ImageIcon image = new ImageIcon("C:/Users/PC/workspace/CardGame/image/cover.jpg");
		
		for(int i=0; i< button.length; i++) {
			button[i] = new JButton("***");
			button[i].setIcon(image);
			button[i].setBackground(Color.BLACK);
			button[i].setSize(1000,1000);
			container.add(button[i]);
			
		}
		
		jFrame.setSize(1000, 1430);
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		createFrame frame = new createFrame();
		frame.GridLayout();
	}

}
