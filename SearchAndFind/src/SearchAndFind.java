import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.JTextPane;
import javax.swing.UIManager;



public class SearchAndFind{

	private JFrame frame;
	private JButton btnFindNext;
	private JButton btnNewButton;
	private JTextField BrowseTextField;
	private String FileContent;
	private JTextField txtpnFind;
	private JTextField dtrpnReplaceWith;
	private JTextArea textArea;
	
	
	private int saveindex = 0;
	private JButton btnReplaceAll;
	private JButton btnFindAll;
	private JTextField textField;
	

	/**
	 * Create the application.
	 */
	public SearchAndFind() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Set Modern UI look and feel
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		
		//setup frame properties
		frame = new JFrame();
		frame.setBounds(100, 100, 809, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		
		JFileChooser chooser = new JFileChooser();
		panel.add(chooser);
		
		
		// BUTTONS!!!!
		
		
		//Find Next Button
		btnFindNext = new JButton("Find Next");
		btnFindNext.setBounds(328, 52, 103, 23);
		btnFindNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Find Button Clicked");
				String ReplaceStr = txtpnFind.getText();
				 Highlighter h = textArea.getHighlighter();				
		    	  try {
		    		 // h.addHighlight(0, 4, new DefaultHighlighter.DefaultHighlightPainter(Color.green));
		    		 // h.addHighlight(6, 8, DefaultHighlighter.DefaultPainter);
		    		 h.removeAllHighlights();
					int len = textArea.getText().length(); // - ReplaceStr.length() + 1;
					for (int i = saveindex; i < len; i++)
					{
						if (i + ReplaceStr.length() > len){
							continue;
							//TODO handle no text match/done
						}
						String TextCompare = textArea.getText().substring(i, i+ReplaceStr.length());
						
						if (ReplaceStr.equals(TextCompare))
								{
			                       //highlight
							       h.addHighlight(i, i+ReplaceStr.length(), new DefaultHighlighter.DefaultHighlightPainter(Color.green));
							       
							       //TODO prompt user to replace or skip
							       saveindex = i + ReplaceStr.length();
							     //  System.out.println(ReplaceStr);
							     // System.out.println("i = " + i + ", saveindex = " + saveindex + ", len = " + len);
							       return;
								}
						
					}
					
					saveindex = 0;
					
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	  
			}
			
		});
				
		
		// Replace With Button
		btnNewButton = new JButton("Replace With");
		btnNewButton.setBounds(328, 85, 103, 23);
		btnNewButton.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae) {
		    	  System.out.println("Replace Button Clicked");
		    	  String ReplaceStr = dtrpnReplaceWith.getText();
		    	  Highlighter h = textArea.getHighlighter();
		    	  
		    	  try {
		    		  //h.addHighlight(0, 4, DefaultHighlighter.DefaultPainter);
		    		  //h.addHighlight(6, 8, DefaultHighlighter.DefaultPainter);
		    		 h.removeAllHighlights();
					int len = textArea.getText().length(); // - ReplaceStr.length() + 1;
					for (int i = saveindex; i < len; i++)
					{
						if (i + ReplaceStr.length() > len){
							continue;
						}
						String TextCompare = textArea.getText().substring(i, i+ReplaceStr.length());
						
						if (ReplaceStr.equals(TextCompare))
								{
			                       //highlight
							       h.addHighlight(i, i+ReplaceStr.length(), new DefaultHighlighter.DefaultHighlightPainter(Color.green));
							       
							       //TODO prompt user to replace or skip
							       saveindex = i + ReplaceStr.length();
							      // System.out.println(ReplaceStr);
							      //System.out.println("i = " + i + ", saveindex = " + saveindex + ", len = " + len);
							       return;
								}
						
					}
					saveindex = 0;
					
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				
		        }
		      });
		
		
		//Browse Button
		JButton btnBro = new JButton("Browse");
		btnBro.setBounds(328, 18, 96, 23);
		btnBro.addActionListener(new ActionListener() {
				      public void actionPerformed(ActionEvent ae) {
				          JFileChooser fileChooser = new JFileChooser(".\\input");
				          int returnValue = fileChooser.showOpenDialog(null);
				          if (returnValue == JFileChooser.APPROVE_OPTION) {
				            File selectedFile = fileChooser.getSelectedFile();
				            System.out.println(selectedFile.getName());
				            BrowseTextField.setText(selectedFile.getPath());
				            try {
					    		   String str = FileUtils.readFileToString(new File(BrowseTextField.getText()));
					    		   System.out.println(str); 
					    		   FileContent = str;
					    		   textArea.setText(str);
					    		 } catch (IOException e) {
					    		    e.printStackTrace(); 
					          }
				          }
				        }
				      });
		
		
		// TEXT BOXES!!!!!!!!!
		
		//Find text box
		txtpnFind = new JTextField();
		txtpnFind.setBounds(37, 52, 271, 23);
		txtpnFind.setToolTipText("");
		txtpnFind.setForeground(Color.BLACK);
		
		//Replace With Text Box
		dtrpnReplaceWith = new JTextField();
		dtrpnReplaceWith.setBounds(38, 86, 270, 20);
		dtrpnReplaceWith.setForeground(Color.BLACK);
		
		//Browse Text box
		BrowseTextField = new JTextField();
		BrowseTextField.setBounds(37, 19, 271, 20);
		BrowseTextField.setColumns(10);
	    
		//Scroll Pane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 125, 721, 450);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnFindNext);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnBro);
		frame.getContentPane().add(txtpnFind);
		frame.getContentPane().add(dtrpnReplaceWith);
		frame.getContentPane().add(BrowseTextField);
		frame.getContentPane().add(scrollPane);
		
		// Text big Area
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setTabSize(9);
		textArea.setEditable(false);
		textArea.setColumns(20);
		textArea.setRows(8);
		
		btnReplaceAll = new JButton("Replace All");
		btnReplaceAll.setBounds(439, 85, 85, 23);
		frame.getContentPane().add(btnReplaceAll);
		
		btnFindAll = new JButton("Find All");
		btnFindAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFindAll.setBounds(441, 52, 82, 23);
		frame.getContentPane().add(btnFindAll);
		
		
	}
}
