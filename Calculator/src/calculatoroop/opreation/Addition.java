package calculatoroop.opreation;

import calculatoroop.userinputhandler.UserInputHandler;

public class Addition extends Operation {

	public Addition(UserInputHandler in) {
		super(in);
	}

	@Override
	public void execute() {
		super.execute();
		double result = first + second;
		System.out.println("The amount: " + result);
	}
}