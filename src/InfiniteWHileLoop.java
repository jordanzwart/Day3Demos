
public class InfiniteWHileLoop {

	public static void main(String[] args) {
		//This code will continue endlessly unless I add a stop condition

		while(true){
			int randomNum = (int)(Math.random()*10); //This will generate a number 0-10	
		
			System.out.println(randomNum);
			
			if(randomNum == 7){
				System.out.println("7 has been found -- exit loop");
				break;
			}
		}
	}
}
