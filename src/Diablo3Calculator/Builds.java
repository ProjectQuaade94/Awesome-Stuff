package Diablo3Calculator;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Builds {

	private Object[] classNames = {"Crusader", "Demon Hunter", "Witch Doctor", "Monk", "Wizard", "Barbarian"};
	
	private Object[][] filler = {};
	
	public void builds(){
		JFrame window = new JFrame();
		JTable table = new JTable(filler, classNames);
		JScrollPane scrollPane = new JScrollPane(table);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(scrollPane, BorderLayout.CENTER);
		window.setSize(1200, 220);
		window.setVisible(true);
	}
}
