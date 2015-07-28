import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.Label;
import java.awt.Panel;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class CodeBeakerGui {

	private JFrame fame;
	
	private JTabbedPane tabbedPane;
	private Panel EncryptionPanel;
	private Panel DecryptionPanel;
	
	private JLabel lblCodeBreaker;
	private JLabel lblKeyWord;
	private JLabel lblScrambledMessage;
	private Label lblMessage;
	private Label lblEncryptedMessage;
	private Label lblDecryptedMessage;
	private Label lblKeyWordIs;
	
	private JTextField KeyWordTextField;
	private JTextField MessageTextField;
	private JTextField EncryptedMessageTextField;
	private JTextField EncryptedTextField;
	private JTextField DecryptMessageTextField;
	private JTextField KeyWordIsTextField;
	
	private JButton EncryptButton;
	private JButton DecryptButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CodeBeakerGui window = new CodeBeakerGui();
					window.fame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CodeBeakerGui() {
		initialize();
		EncryptionPanel();
		DecryptionPanel();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fame = new JFrame();
		fame.setAlwaysOnTop(true);
		fame.setTitle("Code Breaker");
		fame.setResizable(false);
		fame.setBounds(100, 100, 532, 236);
		fame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fame.getContentPane().setLayout(null);
		
		// Title Label
		lblCodeBreaker = new JLabel("Code Breaker");
		lblCodeBreaker.setBounds(230, 0, 71, 23);
		fame.getContentPane().add(lblCodeBreaker);
		
		// Main Tab Pane
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 21, 523, 183);
		fame.getContentPane().add(tabbedPane);
		
	}// End of initialize Method
	
	//////////////////////////////////////////////////////////////////////////////////////////////ENCRYPTION PANEL ////////////////////////////////////////////////////////////////////////////////
	
	private void EncryptionPanel(){
		
		//START OF ENCRYPTION PANEL
		EncryptionPanel = new Panel();
		tabbedPane.addTab("Encryption", null, EncryptionPanel, null);
		EncryptionPanel.setLayout(null);
		
		// Key Word Label
		lblKeyWord = new JLabel("Key Word:");
		lblKeyWord.setBounds(10, 11, 51, 32);
		EncryptionPanel.add(lblKeyWord);
		
		// Key Word Text Field
		KeyWordTextField = new JTextField();
		KeyWordTextField.setBounds(65, 11, 342, 22);
		EncryptionPanel.add(KeyWordTextField);
		
		// Encrypt Button
		EncryptButton = new JButton("Encrypt");
		EncryptButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		System.out.println("Encrypt Button pressed");
		EcrptionButton();
		}
		});
		EncryptButton.setActionCommand("");
		EncryptButton.setBounds(427, 11, 70, 22);
		EncryptionPanel.add(EncryptButton);
		
		// Message Label
		lblMessage = new Label("Message:");
		lblMessage.setBounds(10, 39, 51, 22);
		EncryptionPanel.add(lblMessage);
		
		// Message Text Field 
		MessageTextField = new JTextField();
		MessageTextField.setBounds(67, 39, 441, 22);
		EncryptionPanel.add(MessageTextField);
		
		// Encrypted Message Label
		lblScrambledMessage = new JLabel("Encrypt Message:");
		lblScrambledMessage.setBounds(195, 67, 107, 14);
		EncryptionPanel.add(lblScrambledMessage);
		
		// Encrypted Message Text Field
		EncryptedMessageTextField = new JTextField();
		EncryptedMessageTextField.setBounds(10, 87, 498, 58);
		EncryptionPanel.add(EncryptedMessageTextField);
		
	}// End of Encryption Panel Method
	
	private void EcrptionButton(){
		System.out.println("Started Ecrption Method When button Clicked(){");
		KeyWord();
		NormalMessage();
		EncrptMessage();
		
	}// End of Ecrption Button Method
	
	private void KeyWord(){
		System.out.println("Ran Key Word Method");
		
	}// End of Key Word Method
	
	private void NormalMessage(){
		System.out.println("Ran Normal Message Method");
		
	}// End of Normal Message Method
	
	private void EncrptMessage(){
		System.out.println("Ran Encrpt Message Method");
		System.out.println("} // End of Encption Method");
		System.out.println(" ");
		System.out.println(" ");
		
	}// End of Encrpt Message Method
	
///////////////////////////////////////////////////////////////////////////////////////////// DECRYPTION PANEL ///////////////////////////////////////////////////////////////////////////////
	
	private void DecryptionPanel(){
		
		// START OF DECRYPTION PANEL
		DecryptionPanel = new Panel();
		tabbedPane.addTab("Decryption", null, DecryptionPanel, null);
		DecryptionPanel.setLayout(null);
		
		// Encrypted Message Label
		lblEncryptedMessage = new Label("Encrypted Message:");
		lblEncryptedMessage.setBounds(10, 10, 106, 22);
		DecryptionPanel.add(lblEncryptedMessage);
		
		// Encrypted Text Field
		EncryptedTextField = new JTextField();
		EncryptedTextField.setBounds(122, 10, 313, 22);
		DecryptionPanel.add(EncryptedTextField);
		
		// Decrypt Button
		DecryptButton = new JButton("Decrypt");
		DecryptButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		System.out.println("Decrypt Button pressed");
		DecryptButton();
		}
		});
		DecryptButton.setBounds(438, 10, 70, 22);
		DecryptionPanel.add(DecryptButton);
		
		// Decrypt Message Label
		lblDecryptedMessage = new Label("Decrypt Message");
		lblDecryptedMessage.setBounds(212, 29, 90, 22);
		DecryptionPanel.add(lblDecryptedMessage);
		
		// Decrypt Message Text Field
		DecryptMessageTextField = new JTextField();
		DecryptMessageTextField.setHorizontalAlignment(SwingConstants.CENTER);
		DecryptMessageTextField.setColumns(3);
		DecryptMessageTextField.setBounds(10, 57, 498, 63);
		DecryptionPanel.add(DecryptMessageTextField);
		
		// KEY WORD LABAEL
		lblKeyWordIs = new Label("The Key Word is:");
		lblKeyWordIs.setBounds(10, 123, 90, 22);
		DecryptionPanel.add(lblKeyWordIs);
		
		// KEY WORD TEXTFIELD
		KeyWordIsTextField = new JTextField();
		KeyWordIsTextField.setBounds(106, 126, 402, 22);
		DecryptionPanel.add(KeyWordIsTextField);
		
	}//End of Decryption Panel Method
	
	private void DecryptButton(){
		System.out.println("Started Decryption Method When button Clicked(){");
		EncryptedMessage();
		DecryptMessage();
		KeyWordOutput();
		
	}// End of Decryption Method 
	
	private void EncryptedMessage(){
		System.out.println("Ran Encrypted Message Method");
		
	}// End of Encrypted Message Method 
	
	private void DecryptMessage(){
		System.out.println("Ran Decrypt Message Method");
		
	}// End of Decrypt Message Method 
	
	private void KeyWordOutput(){
		System.out.println("Ran Key Word Output Method");
		System.out.println("} // End of Decryption Method");
		System.out.println(" ");
		System.out.println(" ");
		
	}// End of Key Word Output Method 
	
}// End of Class
