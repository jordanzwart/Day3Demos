import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age: ");

		int age = scan.nextInt();

		if (age >= 18) {
			System.out.println("Congrats you can vote!");
		} else if (age >= 16 && age < 18) {
			System.out.println("Head to voter education");
		} else {
			System.out.println("Do some reseach");
		}
		scan.close(); // closes the scanner

	}

}
