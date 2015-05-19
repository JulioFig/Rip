import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Panel;


public class CrackPass {
	
	/// Variable Declarations
	private JFrame frame;
	private Panel DigitPanel;
	
	//Set Up GUI
	private JTable table;
	private JLabel lblCrackMyPassword;
	private JButton btnStart;
	private JProgressBar progressBar;
	private JLabel lblProgress;

	/// main entry method (calls CrackPass)
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CrackPass window = new CrackPass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}// End Main
	
	public CrackPass() {
		initialize();
	} //End of Frame
	
	///Implementing what ProductRouterGUI Looks like
	
	private void initialize() {
		
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 399, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Crack My Password!");
		frame.getContentPane().setLayout(null);

		// Setup different sections of the GUI
		SetUpGui();
		SetUpDigitPanel();

	} // end initialize
	
	
	private void SetUpDigitPanel() {
		
		DigitPanel = new Digits();
		DigitPanel.setBounds(20, 88, 328, 148);
		frame.getContentPane().add(DigitPanel);
		DigitPanel.setLayout(null);
		
		}// End of Set Up Digit Panel
	
 void SetUpGui() {

		//Label At the Top
		lblCrackMyPassword = new JLabel("Crack My Password");
		lblCrackMyPassword.setFont(new Font("Narkisim", Font.PLAIN, 24));
		lblCrackMyPassword.setBounds(96, 10, 200, 50);
		//contentPane.add(lblCrackMyPassword);
		frame.getContentPane().add(lblCrackMyPassword);
		
		//Table for Label
		table = new JTable();
		table.setBackground(new Color(153, 204, 102));
		table.setBounds(10, 10, 363, 50);
		//contentPane.add(table);
		frame.getContentPane().add(table);
		
		//Label for Progress Bar
		lblProgress = new JLabel("Progress");
		lblProgress.setBounds(42, 333, 67, 14);
		//contentPane.add(lblProgress);
		frame.getContentPane().add(lblProgress);
		
		//Progress Bar
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(102, 204, 51));
		progressBar.setBounds(42, 348, 294, 14);
		//contentPane.add(progressBar);
		frame.getContentPane().add(progressBar);
		
		//Start Button
		btnStart = new JButton("Start");
		btnStart.setBounds(129, 254, 89, 23);
		btnStart.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
		   
			/*
    	  boolean success = CrackPass.mySerialTest.initialize(textField.getText());

           if (success == false) {System.out.println("Could not connect"); return;}

            this.setVisible(false);  // THIS DOES NOT WORK!!

            JTextInputArea myInputArea = new JTextInputArea();
            myInputArea.createAndShowGUI();
            */
            
		    	  System.out.println("Start Button Clicked");
		    	  
		      }
		});
		//contentPane.add(btnStart);
		frame.getContentPane().add(btnStart);
		
		
		
		/*
		Panel DigitPanel = new Panel();
		DigitPanel.setBounds(20, 88, 353, 148);
		contentPane.add(DigitPanel);
		
		
		
		 * connectButton.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e)
        {

            boolean success = Main.mySerialTest.initialize(textField.getText());

            if (success == false) {System.out.println("Could not connect"); return;}

            frame.setVisible(false);  // THIS DOES NOT WORK!!

            JTextInputArea myInputArea = new JTextInputArea();
            myInputArea.createAndShowGUI();

            System.out.println("Connected");


        }
    });

}
		 */
	}
	
} //End of Class
