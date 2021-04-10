package calculatoroop.validator;

public class DivisorValidator {

	private double divisor;

	public DivisorValidator(double divisor) {
		this.divisor = divisor;
	}

	public boolean isDivisorValid() {
		if (divisor == 0) {
			System.out.println("Division by zero is not possible!");
			return false;
		}
		return true;
	}
}