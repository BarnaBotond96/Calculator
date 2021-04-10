package calculatoroop;

import java.util.Scanner;

import calculatoroop.menu.Menu;
import calculatoroop.opreation.Addition;
import calculatoroop.opreation.Division;
import calculatoroop.opreation.Multiplication;
import calculatoroop.opreation.Operation;
import calculatoroop.opreation.Subtraction;
import calculatoroop.userinputhandler.UserInputHandler;

public class Calculator {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			UserInputHandler userInputHandler = new UserInputHandler(scanner);
			Menu menu = new Menu(userInputHandler);
			loop: do {
				menu.printMenuOptions();
				int chosenMenuOption = menu.chooseMenuOption();

				Operation operation = null;

				switch (chosenMenuOption) {
				case 1:
					operation = new Addition(userInputHandler);
					break;
				case 2:
					operation = new Subtraction(userInputHandler);
					break;
				case 3:
					operation = new Multiplication(userInputHandler);
					break;
				case 4:
					operation = new Division(userInputHandler);
					break;
				case 5:
					System.out.println("Have a nice day!");
					break loop;
				}
				operation.execute();
			} while (true);
		}
	}

}