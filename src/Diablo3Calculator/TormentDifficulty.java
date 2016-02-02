package Diablo3Calculator;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TormentDifficulty {

	private Object[] difficulty = {"Difficulty:","Normal","Hard","Expert","Master","Torment I","Torment II","Torment III","Torment IV","Torment V","Torment VI","Torment VII","Torment VIII", "Torment IX", "Torment X"};
	private Object[] health = {"Health:","100%","200%","320%","512%","819%","1311%","2097%","3355%","5369%","8590%","18985%","41625%", "91260%", "200082%"};
	private Object[] damage = {"Damage:","100%","130%","189%","273%","396%","575%","833%","1208%","1752%","2540%","3604%","5097%", "7208%", "10194%"};
	private Object[] gold = {"Gold Find:","0%","75%","100%","200%","300%","400%","550%","800%","1150%","1600%","1700%","1800%", "1900%", "2000%"};
	private Object[] xp = {"XP Bonus:","0%","75%","100%","200%","300%","400%","550%","800%","1150%","1600%","1900%","2300%", "2750%", "3300%"};
	private Object[] drop = {"LDrop Rate:","0%","0%","0%","0%","15%","32%","52%","75%","101%","131%","165%","207%", "264%", "323%"};
	private Object[] dropRift = {"LDrop (Rift):","25%","25%","25%","25%","44%","65%","90%","119%","151%","189%","236%","295%", "369%", "461%"};
	private Object[] keystone = {"Keystone:","50%","50%","50%","50%","55%","60%","70%","80%","90%","100%","100%+5%","100%+15%", "100%+25%", "100%+50%"};
	private Object[] deathBreath = {"DB:","15%","18%","21%","25%","31%","37%","44%","53%","64%","75%","90%+","100%+15%", "100%+25%", "100%+50%"};
	private Object[] material = {"Material:","2","2","2","2","3","3","3","3","3","3","4","4", "4", "5"};
	private Object[] keywarden = {"Keywarden:","-","-","-","-","25%","28%","33%","38%","43%","50%","55%","60%", "65%", "70%"};
	private Object[] uber = {"Uber:","-","-","-","-","100%","100%+10%","100%+20%","100%+30%","100%+40%","100%+50%","200%","200%+10%", "200%+25%", "200%+50%"};

	private Object[][] filler = {health, damage, gold, xp, drop, dropRift, keystone, deathBreath, material, keywarden, uber};

	public void tormentDifficulty(){
		JFrame window = new JFrame();
		JTable table = new JTable(filler, difficulty);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(scrollPane, BorderLayout.CENTER);
		window.setSize(1200, 220);
		window.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(WindowEvent winEvt) {
		        // Perhaps ask user if they want to save any unsaved files first.
		        System.exit(0); 
		    }
		});
		window.setVisible(true);
	}
}
