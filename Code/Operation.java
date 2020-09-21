package tecnicas;

public class Operation {
	
	private Boolean[] values = { true, false };
	private IOperation doOperation;


	public Operation(IOperation operation) {
		this.doOperation = operation;
	}
	
	 public void showCombination() {
		for (Boolean first : values) {
			for (Boolean second : values) {
				System.out.println(first + " " + " - " + " " + second + " = " + doOperation.operation(first, second));
			}
		}
	}

}
