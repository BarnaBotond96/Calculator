package calculatoroop.opreation;

import calculatoroop.userinputhandler.UserInputHandler;

public class Operation {

	protected UserInputHandler in;
	protected double first;
	protected double second;

	public Operation(UserInputHandler in) {
		this.in = in;
	}

	public void execute() {
		first = in.readDouble("Please, enter the first number!");
		second = in.readDouble("Please, enter the second number!");
	}
}