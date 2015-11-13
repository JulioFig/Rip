import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		
			
		Scanner s = new Scanner(System.in);
		//Scanner y = new Scanner(System.in);
		//Scanner No = new Scanner(System.in);
		
		//String No = null;
		
		
		//String Username = s.nextLine();
		
		System.out.println("Whats is your name?");
		String Username = s.nextLine();
		
        System.out.println("Do you like Rock Music " + Username + "?");
        
        System.out.println("  ");
        answer();
        
	}// End Main

	private static void extracted() {
		return;
	}
	
	private static void answer(){
		Scanner a = new Scanner(System.in);
		//String Yes = null;
		//String No = null;
		
		try{
			if(a.equals(a.nextLine() != "Yes")){
				System.out.println("Here are some song sugggestion you may like the:");
															    System.out.println("1");
																System.out.println("2");
																System.out.println("3");
				extracted();
				//return;
			 }// End of Yes if Statement
			
			
			else{
				System.out.println("No? Ok well thank you for visting");
				extracted();
				//return;
				
			}// End of No if Statement
			
		}// End of Try
		
		catch(Exception e){
			System.out.println("Invaild Answer. Thank you. Good Bye");
			extracted();
			//return;
		}// End of Catch
		
		
	}// End of Answer method
	
}// End of Class 
