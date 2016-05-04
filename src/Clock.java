import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Clock extends JFrame {
	
//	Clock o = new Clock();
	
	Date date = new Date();
	JPanel panel = new JPanel();
	JLabel[] numbers = new JLabel[200];
	
    static String[] data = { "ESKISTAFÜNF", "ZEHNZWANZIG", "DREIVIERTEL", "VORFUNKNACH",  
    						 "HALBAELFÜNF", "EINSXAMZWEI", "DREIPMJVIER", "SECHSNLACHT", 
    						 "SIEBENZWÖLF", "ZEHNEUNKUHR" };
    

	public Clock()
	{
		panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 50, 20, 50));
		panel.setLayout(new GridLayout(10,11));
		panel.setBackground(Color.black);
		add(panel);
		
		String input;
		int o = 0;
		
		for(int i=0;i<10;i++)
		{
			for(int n=0;n<11;n++)
			{
				
				input = (data[(i)].charAt(n) + "");
				
				System.out.println(input);

				numbers[o] = new JLabel(input);
			    numbers[o].setForeground(Color.gray);
			    panel.add(numbers[o]);
			    o++;
			}

		}
		
	}
	
//    public void getState()
//    {
//    	//fuenf
//    	
////    	switch(fuenf)
////    	{
////    	
////    	case 5:
////    	
////    	}
//    }
    
    
    
	
	public static void main(String[] args) {
		//Hauptmenü Prototyp
//		JFrame mainClock = new JFrame();
//		mainClock.setTitle("Main menu");
//		mainClock.setSize(800, 800);
//		mainClock.setVisible(true);
//
//		JButton buttonSelectS= new JButton("Schweizer Uhr");
//		buttonSelectS.setBounds(0, 0, 300, 100);
//		
//		JButton buttonSelectFR = new JButton("Französische Uhr");
//		buttonSelectFR.setBounds(310, 110, 300, 100);
//		
//		mainClock.add(buttonSelectS);
//		mainClock.add(buttonSelectFR);
		
		Clock sClock = new Clock();
		sClock.setTitle("Schweizer Uhr");	
		sClock.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		sClock.pack();
		sClock.setSize(700,700);
		sClock.setVisible(true);
		sClock.getContentPane().setBackground(Color.BLACK);
		
	    new javax.swing.Timer(1000,
	    		  new ActionListener() {
	    		  	public void actionPerformed(ActionEvent arg0) {
	    		  	sClock.update(sClock);
	    		  }
	    		  }
	    		  ).start();

	    
	    
	    
		
		init();
		
	}
	//Neun zeichnen und aktivierte/benötigte Label färben
	public void redraw()
	{
		String input;
		
		for(int i=0;i<10;i++)
		{
			for(int n=0;n<11;n++)
			{
				input = (data[(i)].charAt(n) + "");
				
				System.out.println(input);

			    JLabel numbers = new JLabel(input);
			    numbers.setForeground(Color.gray);
			    panel.add(numbers);
			}

		}
	}
    

	public static void init()
	{
		//Uhrzeit holen
		
		Calendar c = new GregorianCalendar();
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(hour + "/" + minute + "/" + second + "/");
		
		//Logik Uhr
		
		//1;5 nach 1; 10 nach 1; 15 nach 1; 20 nach 1; 5 vor halb 2; halb 2; 5 nach halb 2; 20 vor 2; 15 vor 2; 10 vor 2; 5 vor 2; 2
		
		
		//Uhr aktualisieren, jede Minute aktualisieren

		
		String test;
		

		
		//test123


	}
	public void update(Clock sClock)
	{
		   Calendar c =  new GregorianCalendar();
		   int hr = c.get(Calendar.HOUR_OF_DAY);
		   int mn = c.get(Calendar.MINUTE);
		   
		   //Minuten
		   
		    switch (mn)
		    {
		    case 0: 

		      break;
		    case 5: 

		      break;
		    case 10: 
		      break;
		    case 15: 

		      break;
		    case 20: 

		      break;
		    case 25: 

		      break;
		    case 30: 

		      break;
		    case 35: 

		      break;
		    case 40: 

		      break;
		    case 45: 

		      break;
		    case 50: 

		      break;
		    case 55: 

		      break;
		    }
		    switch (hr)
		    {
		    case 1: 

		      break;
		    case 2: 

		      break;
		    case 3: 

		      break;
		    case 4: 

		      break;
		    case 5: 

		      break;
		    case 6: 

		      break;
		    case 7: 

		      break;
		    case 8: 

		      break;
		    case 9: 

		      break;
		    case 10: 

		      break;
		    case 11: 

		      break;
		    case 12: 

		      break;
		    }

	}

}

