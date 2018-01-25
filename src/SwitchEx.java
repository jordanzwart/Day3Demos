import java.util.Scanner;


public class SwitchEx {

	public static void main(String[] args) {
		
		int caseSwitch = 1;
		switch (caseSwitch) {
		case 1:
		case 3: //this is stating that if its number 1 OR 3 it will print Case 1
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default case");
			break;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a grade: ");
		double grade = scan.nextDouble();
		
		switch( (int)(grade / 10)) { //divided by ten will drop off the tenth's of a number
		case 1:
			System.out.println("10-19");
			break;
		case 2:
			System.out.println("20-29");
			break;
		case 3:
			System.out.println("30-39");
			break;
		default:
			System.out.println("Your number didnt match");
		}
			System.out.println("Goodbye");
		
	}

}
