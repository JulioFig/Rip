import java.awt.EventQueue;


public class Main {

	public static void main(String[] args) {
			
		// 99 feature
		Thread thr1 = new Thread( ExitThread.exitRunnable );
        thr1.start();	
		
		// Starts Search and Find GUI
		EventQueue.invokeLater(new Runnable() {
			public void run() {						
				SearchAndFind window = new SearchAndFind();							
			}
		});

	}
	
} // End Main
