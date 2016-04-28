import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;

public class Clock {
	
    static String[] data = { "ESKISCHAFÜF", "VIERTUBFZÄÄ", "ZWÄNZGSIVOR", "ABOHAUBIEPM",  
    						 "EISZWÖISDRÜ", "VIERIFÜFIGT", "SÄCHSISIBNI", "ACHTINÜNIEL", 
    						 "ZÄNIERBEUFI", "ZWÖUFIAMUHR" };
	
	public static void main(String[] args) {
		JFrame mainClock = new JFrame();
		mainClock.setTitle("Main menu");
		mainClock.setSize(800, 800);
		mainClock.setVisible(true);

		JButton buttonSelectS= new JButton("Schweizer Uhr");
		buttonSelectS.setBounds(0, 0, 300, 100);
		
		JButton buttonSelectFR = new JButton("Französische Uhr");
		buttonSelectFR.setBounds(310, 110, 300, 100);
		
		mainClock.add(buttonSelectS);
		mainClock.add(buttonSelectFR);
		
		init();
		
	}
	public static void init()
	{
		JFrame sClock = new JFrame();
		sClock.setTitle("Schweizer Uhr");
		sClock.setSize(500, 500);
		sClock.setVisible(true);
		sClock.getContentPane().setBackground(Color.BLACK);
		
        JTable jtable = new JTable( 4, 1  );
        jtable.setBorder( new LineBorder( Color.white, 3 ));
        jtable.setRowHeight( 20 );
        sClock.add( jtable, BorderLayout.CENTER );
        
        
		
		String test;
		
		for(int i=1;i<9;i++)
		{
			for(int n=0;n<10;n++)
			{
//				test = (data[(i)].charAt(n) + "");
				test = (data[(i)]);
			    JLabel numbers = new JLabel(test, 0);
			    numbers.setForeground(Color.white);
			    sClock.add(numbers);
			}

		}


	}
}

