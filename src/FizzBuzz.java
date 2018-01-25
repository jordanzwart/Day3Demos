import java.util.Scanner;


public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Check Numbers between 1-100");
		
		
	
		for (int i = 1; i <= 100; i++) {
			
			if (i % 15 == 0){
			System.out.println(i + " Fizz Buzz!");
			}
			else if (i % 5 == 0){
			System.out.println(i + " Buzz!");			
			}
			else if (i % 3 == 0){
			System.out.println(i + " Fizz!");
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println("Goodbye");
			
			
		
		
		
		
		
		

	}

}
