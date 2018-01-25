
public class DoWhileExample {

	public static void main(String[] args) {
		
		int i = 1;
		int month = 36;
		double futureValue = 0;
		double monthPmt = 330.63;
		double intRate = 5.99/100;
		
		do {
			
			futureValue = ((futureValue + monthPmt) * (1 + intRate));
			i++;
			//if here it will print all 36 expressions
		} while (i <= month);
		
		System.out.println(futureValue);
		//if here it will print one expression
		
		

	}

}
