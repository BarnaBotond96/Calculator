package calculatoroop.validator;

public class MenuOptionValidator {

	private int menuOption;

	public MenuOptionValidator(int menuOption) {
		this.menuOption = menuOption;
	}

	public boolean isValidMenuOption() {
		if (menuOption > 0 && menuOption < 6) {
			return true;
		}
		System.out.println("Invalid menu option!");
		return false;
	}
}