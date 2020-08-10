package tecnicas;

public class Operation {
	
	private Boolean[] values = { true, false };
	private IOperation doOperation;


	public Operation(IOperation operation) {
		this.doOperation = operation;
	}
	
	 public void showCombination() {
		for (Boolean firt : values) {
			for (Boolean second : values) {
				System.out.println(firt + " " + " - " + " " + second + " = " + doOperation.operation(firt, second));
			}
		}
	}

}
