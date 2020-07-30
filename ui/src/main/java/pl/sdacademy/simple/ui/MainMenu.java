package pl.sdacademy.simple.ui;

import static pl.sdacademy.simple.tools.Utils.println;

import java.util.Scanner;
import java.util.Set;

public class MainMenu {

	private MainMenu() {
		// utility class
	}

	private static final Set<Integer> CORRECT_OPTIONS = Set.of(1, 2, 3, 4, 5);
	private static final int SEPARATOR_COUNTER = 120;

	public static int present(Scanner scanner) {
		boolean notSelected = true;
		int result = 5;
		do {
			println("#".repeat(SEPARATOR_COUNTER));
			println("1 - wyświetlenie wszystkich dostępnych samochodów");
			println("2 - określenie warunków wyszukania a następnie wyświetlenie samochodów");
			println("3 - wypożyczenie wybranego samochodu");
			println("4 - zwrócenie wypożyczonego samochodu");
			println("5 - zakończenie");
			println("#".repeat(SEPARATOR_COUNTER));

			println("Wybierz funkcję z menu:");
			String inputValue = scanner.nextLine();
			try {
				result = Integer.parseInt(inputValue);
				notSelected = !CORRECT_OPTIONS.contains(result);
			} catch (NumberFormatException e) {
				println("Wybrano niewłaściwą opcję!");
			}
		} while (notSelected);

		return result;
	}

}
