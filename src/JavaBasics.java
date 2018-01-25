
public class JavaBasics {

	public static void main(String[] args) {
		final String TEST = "Hello";
		
		final int TESTING = 4;
		
		//primative type declarations
		byte b = 127; //byte is only used from 1-127 
		short s = 32; //short can only be used from 1-32
		int i = 1000; //int can go to 
		float fl = 6.7f; //float needs to be casted as (float)6.7, or 6.7f
		double d = 5.0; //double needs no cast or letter
		char c = 'c'; //must use single quotes
		boolean bool = true; //boolean default is false if not declared true
		long l = 55555555555L; //long must have an 'l' or 'L' after the number
		
		//implicit conversion examples
		int numOfFiles = 5;
		System.out.println(3.0/1.5);
		System.out.println(3.0/2);
		System.out.println(3/2.0);
		System.out.println((numOfFiles + 10) / 2);
		System.out.println((numOfFiles + 10) / 2.0);
		
		//explicit casting (type casting)
		double x = (double)3/ (double)5; //must declare 3 and 5 double as the 3 and 5 are integers(3) not doubles (3.0)
		double x1 = (double) (3/5); //prints 0.0 because division is done before casting
		System.out.println(x);
		System.out.println(x1);
		
		// example 2 -- common error forgetting to cast
		int kidsInFamily1 = 3;
		int kidsInFamily2 = 4;
		int numOfFamilies = 2;
		
		double avgKidsPerFamily = (double)(kidsInFamily1 + kidsInFamily2) / (double)numOfFamilies;
		System.out.println(avgKidsPerFamily);
		
		
		
		
		
	}

}
