package 연습용;

import java.awt.Font;
import java.awt.Frame;
import java.util.Random;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class GridLayoutTest1111 extends Frame {
	JButton[] buttons = new JButton[9];
	String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	Random random = new Random();
	
	public GridLayoutTest1111() {
		setTitle("1 ~ 9");
		setBounds(400, 400, 600, 600);
		
		GridLayout grid = new GridLayout(3, 3, 3, 3);
		setLayout(grid);
		
		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton(numbers[i]);
			buttons[i].setFont(new Font("Dialog", Font.BOLD, 30));
			add(buttons[i]);
		}
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		GridLayoutTest1111 window = new GridLayoutTest1111();
	}
	
}
