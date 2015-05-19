public class IntDigit {
	
	int num;

	public static void main(String[] args) {
		
		System.out.println("hello world");
		IntDigit hwc = new IntDigit();
		hwc.run();
	}
	
	private void run()
	{
		for(int i=0; i<10; i++)
		{
			//10 random  numbers between 0 and 9
			
			Double doubleNum = Math.floor( ((Math.random()*9) +1) );
			//Double doubleNum = Math.( ((Math.random()*9) +1) );
			num =  doubleNum.intValue();
			System.out.println(num);
		}
	}
}
