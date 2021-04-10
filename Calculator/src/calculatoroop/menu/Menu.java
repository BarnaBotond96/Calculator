package calculatoroop.menu;

import calculatoroop.userinputhandler.UserInputHandler;

public class Menu {

	private UserInputHandler in;

	public Menu(UserInputHandler in) {
		this.in = in;
	}

	
	public void printMenuOptions() {
		System.out.println("______________________");
		System.out.println("      Calculator");
		System.out.println("______________________");
		System.out.println("[1] - Addition");
		System.out.println("[2] - Subtraction");
		System.out.println("[3] - Multiplication");
		System.out.println("[4] - Division");
		System.out.println("[5] - Exit");
	}

	public int chooseMenuOption() {
		int userChoice = in.readMenuOption("\nPlease, select a menu option!\n");
		return userChoice;
	}
}