package tecnicas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		IOperation operation = new And();
		
		Operation p = new Operation(operation);
						
				
		String input = keyboard.nextLine().toUpperCase();
		String [] inputs = input.split(" ");
					
		for (String string : inputs) {
			System.out.println(input);
		}
		
		
 		keyboard.close();
         
	}

}
