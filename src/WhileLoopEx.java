import java.util.Scanner;


public class WhileLoopEx {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		
		while(cont.equalsIgnoreCase("y")) {
			//code starts here
			
			System.out.println("Code");
			
			//code ends
			
			System.out.println("Do you want to continue? y/n");
			cont = scan.nextLine();
			
		}
		
		//Let the user know the program has ended
		System.out.println("Goodbye");
		
		
		
		
		
		scan.close();
		
		

	}

}
