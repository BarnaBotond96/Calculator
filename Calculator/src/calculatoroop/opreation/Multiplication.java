package calculatoroop.opreation;

import calculatoroop.userinputhandler.UserInputHandler;

public class Multiplication extends Operation {

	public Multiplication(UserInputHandler in) {
		super(in);
	}

	@Override
	public void execute() {
		super.execute();
		double result = first * second;
		System.out.println("The product: " + result);
	}
}