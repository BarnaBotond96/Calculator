package calculatoroop.opreation;

import calculatoroop.userinputhandler.UserInputHandler;
import calculatoroop.validator.DivisorValidator;

public class Division extends Operation {

	public Division(UserInputHandler in) {
		super(in);
	}

	@Override
	public void execute() {
		first = in.readDouble("\nPlease, enter the first number!");
		boolean isValid;
		do {
			second = in.readDouble("Please, enter the second number!");
			DivisorValidator validator = new DivisorValidator(second);
			isValid = validator.isDivisorValid();
		} while (!isValid);
		double result = first / second;
		System.out.println("The quotient: " + result);
	}
}