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
		
		JLabel P1 = new JLabel("o");
		JLabel P2 = new JLabel("o");
		JLabel P3 = new JLabel("o");
		JLabel P4 = new JLabel("o");
		
	    panel.add(P1);
	    panel.add(P2);
	    panel.add(P3);
	    panel.add(P4);
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
		   
		   
		   //RESET
		   
		   for(int i=0;i<110;i++)
		   {
			   numbers[i].setForeground(Color.DARK_GRAY);
		   }
		   
		   
		   //ES IST
	    	numbers[0].setForeground(Color.white);
	    	numbers[1].setForeground(Color.white);
	    	numbers[3].setForeground(Color.white);
	    	numbers[4].setForeground(Color.white);
	    	numbers[5].setForeground(Color.white);
	    	
	    	
	    	
		   System.out.print(mn/10);
	    	
	    	
		   //Minuten
		   
		    switch (mn)
		    {
		    case 0: 
		      break;
		    case 5:
		    
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);


		      break;
		    case 6:
			    
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);


		      break;
		    case 7:
			    
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);


		      break;
		    case 8:
			    
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);


		      break;
		    case 9:
			    
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);


		      break;
		    case 10:
		    	
		    	//ZEHN
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	numbers[100].setForeground(Color.white);
		    	numbers[101].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 11:
		    	
		    	//ZEHN
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	numbers[100].setForeground(Color.white);
		    	numbers[101].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 12:
		    	
		    	//ZEHN
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	numbers[100].setForeground(Color.white);
		    	numbers[101].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 13:
		    	
		    	//ZEHN
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	numbers[100].setForeground(Color.white);
		    	numbers[101].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 14:
		    	
		    	//ZEHN
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	numbers[100].setForeground(Color.white);
		    	numbers[101].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 15: 
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);


		      break;
		    case 16: 
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);


		      break;
		    case 17: 
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);


		      break;
		    case 18: 
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		      break;
		    case 19: 
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);

		      break;
		    case 20: 
		    	
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 21: 
		    	
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 22: 
		    	
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 23: 
		    	
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 24: 
		    	
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	
		      break;
		    case 25:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		    	
		    	

		      break;
		    case 26:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		    	
		    	

		      break;
		    case 27:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		    	
		    	

		      break;
		    case 28:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		    	
		    	

		      break;
		    case 29:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		      break;
		    case 30: 
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);

		      break;
		    case 31: 
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);

		      break;
		    case 32: 
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);

		      break;
		    case 33: 
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);

		      break;
		    case 34: 
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);

		      break;
		    case 35: 
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		    	

		      break;
		    case 36: 
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		    	

		      break;
		    case 37: 
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		    	

		      break;
		    case 38: 
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		    	

		      break;
		    case 39: 
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//NACH

		    	numbers[40].setForeground(Color.white);
		    	numbers[41].setForeground(Color.white);
		    	numbers[42].setForeground(Color.white);
		    	numbers[43].setForeground(Color.white);
		    	
		    	//HALB
		    	numbers[44].setForeground(Color.white);
		    	numbers[45].setForeground(Color.white);
		    	numbers[46].setForeground(Color.white);
		    	numbers[47].setForeground(Color.white);
		    	

		      break;
		    case 40:
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	

		      break;
		    case 41:
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	

		      break;
		    case 42:
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	

		      break;
		    case 43:
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	

		      break;
		    case 44:
		    	
		    	//ZWANZIG
		    	numbers[15].setForeground(Color.white);
		    	numbers[16].setForeground(Color.white);
		    	numbers[17].setForeground(Color.white);
		    	numbers[18].setForeground(Color.white);
		    	numbers[19].setForeground(Color.white);
		    	numbers[20].setForeground(Color.white);
		    	numbers[21].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);
		    	

		      break;
		    case 45:
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 46:
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 47:
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 48:
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 49:
		    	
		    	//VIERTEL
		    	numbers[27].setForeground(Color.white);
		    	numbers[28].setForeground(Color.white);
		    	numbers[29].setForeground(Color.white);
		    	numbers[30].setForeground(Color.white);
		    	numbers[31].setForeground(Color.white);
		    	numbers[32].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 50:
		    	
		    	//ZEHN
		    	numbers[96].setForeground(Color.white);
		    	numbers[97].setForeground(Color.white);
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 51:
		    	
		    	//ZEHN
		    	numbers[96].setForeground(Color.white);
		    	numbers[97].setForeground(Color.white);
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 52:
		    	
		    	//ZEHN
		    	numbers[96].setForeground(Color.white);
		    	numbers[97].setForeground(Color.white);
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 53:
		    	
		    	//ZEHN
		    	numbers[96].setForeground(Color.white);
		    	numbers[97].setForeground(Color.white);
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 54:
		    	
		    	//ZEHN
		    	numbers[96].setForeground(Color.white);
		    	numbers[97].setForeground(Color.white);
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 55:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 56:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 57:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 58:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    case 59:
		    	
		    	//FÜNF
		    	numbers[7].setForeground(Color.white);
		    	numbers[8].setForeground(Color.white);
		    	numbers[9].setForeground(Color.white);
		    	numbers[10].setForeground(Color.white);
		    	
		    	//VOR
		    	numbers[33].setForeground(Color.white);
		    	numbers[34].setForeground(Color.white);
		    	numbers[35].setForeground(Color.white);

		      break;
		    }
		    
		    switch (hr)
		    {
		    case 1: 
		    	
		    	//EINS
		    	numbers[55].setForeground(Color.white);
		    	numbers[56].setForeground(Color.white);
		    	numbers[57].setForeground(Color.white);
		    	numbers[58].setForeground(Color.white);
		    	
		      break;
		    case 2: 
		    	
		    	//ZWEI
		    	numbers[61].setForeground(Color.white);
		    	numbers[62].setForeground(Color.white);
		    	numbers[63].setForeground(Color.white);
		    	numbers[64].setForeground(Color.white);

		      break;
		    case 3: 
		    	
		    	//DREI
		    	numbers[65].setForeground(Color.white);
		    	numbers[66].setForeground(Color.white);
		    	numbers[67].setForeground(Color.white);
		    	numbers[68].setForeground(Color.white);

		      break;
		    case 4:
		    	
		    	//VIER
		    	numbers[72].setForeground(Color.white);
		    	numbers[73].setForeground(Color.white);
		    	numbers[74].setForeground(Color.white);
		    	numbers[75].setForeground(Color.white);

		      break;
		    case 5: 
		    	//FÜNF
		    	numbers[51].setForeground(Color.white);
		    	numbers[52].setForeground(Color.white);
		    	numbers[53].setForeground(Color.white);
		    	numbers[54].setForeground(Color.white);

		      break;
		    case 6: 
		    	
		    	//SECHS
		    	numbers[76].setForeground(Color.white);
		    	numbers[77].setForeground(Color.white);
		    	numbers[78].setForeground(Color.white);
		    	numbers[79].setForeground(Color.white);
		    	numbers[80].setForeground(Color.white);

		      break;
		    case 7: 
		    	
		    	//SIEBEN
		    	numbers[87].setForeground(Color.white);
		    	numbers[88].setForeground(Color.white);
		    	numbers[89].setForeground(Color.white);
		    	numbers[90].setForeground(Color.white);
		    	numbers[91].setForeground(Color.white);
		    	numbers[92].setForeground(Color.white);

		      break;
		    case 8: 
		    	
		    	numbers[83].setForeground(Color.white);
		    	numbers[84].setForeground(Color.white);
		    	numbers[85].setForeground(Color.white);
		    	numbers[86].setForeground(Color.white);

		      break;
		    case 9: 
		    	
		    	//NEUN
		    	numbers[101].setForeground(Color.white);
		    	numbers[102].setForeground(Color.white);
		    	numbers[103].setForeground(Color.white);
		    	numbers[104].setForeground(Color.white);
		    	

		      break;
		    case 10: 
		    	
		    	//ZEHN
		    	numbers[98].setForeground(Color.white);
		    	numbers[99].setForeground(Color.white);
		    	numbers[100].setForeground(Color.white);
		    	numbers[101].setForeground(Color.white);

		      break;
		    case 11: 
		    	
		    	numbers[49].setForeground(Color.white);
		    	numbers[50].setForeground(Color.white);
		    	numbers[51].setForeground(Color.white);

		      break;
		    case 12: 
		    	
		    	//ZWÖLF
		    	numbers[93].setForeground(Color.white);
		    	numbers[94].setForeground(Color.white);
		    	numbers[95].setForeground(Color.white);
		    	numbers[96].setForeground(Color.white);
		    	numbers[97].setForeground(Color.white);

		      break;
		    }

	}

}

