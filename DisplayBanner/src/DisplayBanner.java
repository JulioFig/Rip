import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DisplayBanner {
	
	    public static void main(String[] args) {
			
	    	JFrame.setDefaultLookAndFeelDecorated(true);
	        final JFrame frame = new JFrame();
	        frame.setResizable(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setBackground(Color.WHITE);
	
	        String defaultText = System.getProperty("default.text", "");
	        
	        JTextField textField = new JTextField();
			textField.setText(defaultText);
			textField.setFont(new Font("Tahoma", Font.BOLD, 39));

			frame.getContentPane().add(textField);
			textField.setColumns(10);
			final Dimension D = textField.getSize();

			textField.setForeground(Color.BLUE);
			textField.setVisible(true);
			textField.setEditable(true);
			textField.setHorizontalAlignment(JTextField.CENTER);

			frame.add(textField);
	        frame.setAlwaysOnTop( true );
	        frame.pack();
	        frame.setVisible(true);
			
	        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			
	        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	        int y = (int) ( 0 );
			
	        frame.setLocation(x,y);
	        
			final Dimension fD = frame.getSize();
       
	    }
	}


