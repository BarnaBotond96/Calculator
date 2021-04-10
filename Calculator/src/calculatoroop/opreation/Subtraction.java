package calculatoroop.opreation;

import calculatoroop.userinputhandler.UserInputHandler;

public class Subtraction extends Operation {

	public Subtraction(UserInputHandler in) {
		super(in);
	}

	@Override
	public void execute() {
		super.execute();
		double result = first - second;
		System.out.println("The difference: " + result);
	}
}