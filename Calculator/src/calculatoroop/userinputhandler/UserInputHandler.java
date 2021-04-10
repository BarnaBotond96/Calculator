package calculatoroop.userinputhandler;

import java.util.InputMismatchException;
import java.util.Scanner;

import calculatoroop.validator.MenuOptionValidator;

public class UserInputHandler {

	private Scanner scanner;

	public UserInputHandler(Scanner scanner) {
		this.scanner = scanner;
	}

	public int readMenuOption(String message) {
		int number = 0;
		boolean isValid;
		do {
			try {
				number = readInt(message);
			} catch (InputMismatchException e) {
				scanner.nextLine();
			}
			MenuOptionValidator validator = new MenuOptionValidator(number);
			isValid = validator.isValidMenuOption();
		} while (!isValid);
		return number;
	}

	public int readInt(String message) {
		System.out.print(message);
		int number = scanner.nextInt();
		scanner.nextLine();
		return number;
	}

	public double readDouble(String message) {
		System.out.println(message);
		double number = scanner.nextDouble();
		scanner.nextLine();
		return number;
	}

}