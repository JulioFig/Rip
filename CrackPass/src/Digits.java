import java.awt.Font;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

import java.awt.Panel;

public class Digits extends Panel{

	//private Panel DigitPanel;
	private JTextField Digit1;
	private JTextField Digit2;
	private JTextField Digit3;
	private JTextField Digit4;

	// Parameters
	Digits(){
		this.setBounds(20, 88, 353, 176);
		setLayout(null);
		
		SetUpDigit1();
		SetUpDigit2();
		SetUpDigit3();
		SetUpDigit4();
		//hwc.run();
		
	}// End of Parameters
		
	// Digit 1
	private void SetUpDigit1(){
		
		Digit1 = new JTextField();
		Digit1.setEditable(false);
		Digit1.setHorizontalAlignment(SwingConstants.CENTER);
		Digit1.setFont(new Font("Tahoma", Font.PLAIN, 34));
		Digit1.setBounds(33, 70, 50, 50);
		//DigitPanel.add(Digit1);
		this.add(Digit1);
		//SetUpDigitPanel.add(Digit1);
		Digit1.setColumns(10);
		
	}// End of Digit 1
	
	// Digit 2
	private void SetUpDigit2(){
		
		Digit2 = new JTextField();
		Digit2.setEditable(false);
		Digit2.setHorizontalAlignment(SwingConstants.CENTER);
		Digit2.setFont(new Font("Tahoma", Font.PLAIN, 34));
		Digit2.setBounds(101, 70, 50, 50);
		this.add(Digit2);
		Digit2.setColumns(10);
		
	}// End of Digit 2
	
	//Digit 3
	private void SetUpDigit3(){
		
		Digit3 = new JTextField();
		Digit3.setEditable(false);
		Digit3.setHorizontalAlignment(SwingConstants.CENTER);
		Digit3.setFont(new Font("Tahoma", Font.PLAIN, 34));
		Digit3.setBounds(176, 70, 50, 50);
		this.add(Digit3);
		Digit3.setColumns(10);
		
	}//End of Digit 3
	
	//Digit 4
	private void SetUpDigit4(){
		
		Digit4 = new JTextField();
		Digit4.setEditable(false);
		Digit4.setHorizontalAlignment(SwingConstants.CENTER);
		Digit4.setFont(new Font("Tahoma", Font.PLAIN, 34));
		Digit4.setBounds(255, 70, 50, 50);
		this.add(Digit4);
		Digit4.setColumns(10);
		
	}// End of Digit 4
	
}// end of class
