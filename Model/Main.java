import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Proposition a = new Proposition(true);
		Proposition b = new Proposition(true);
		
		IOperation op = new And(a, new Not(b));	// A and ¬B

		System.out.println(op.value());
		
 		keyboard.close();
         
	}

}
