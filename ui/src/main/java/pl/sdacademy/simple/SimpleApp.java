package pl.sdacademy.simple;

import static pl.sdacademy.simple.tools.Utils.println;

import java.util.Map;
import java.util.Scanner;

import pl.sdacademy.simple.command.Command;
import pl.sdacademy.simple.command.SelectCommand;
import pl.sdacademy.simple.command.UnknownCommand;
import pl.sdacademy.simple.ui.MainMenu;

public class SimpleApp {

	private static final Map<Integer, Command> COMMANDS_MAP = Map.of(1, new SelectCommand());
	private static final Command UNKNOWN = new UnknownCommand();

	public static void main(String[] args) {
		println("Witamy w naszej wypożyczalni samochodów.");
		Scanner scanner = new Scanner(System.in);
		int selectedOption;

		for (; ; ) {
			selectedOption = MainMenu.present(scanner);
			if (selectedOption == 5) {
				println("Dziękujemy i zapraszamy ponownie. Miłego dnia!");
				return;
			}

			process(selectedOption, scanner);
		}
	}

	private static void process(int selectedOption, Scanner scanner) {
		Command command = COMMANDS_MAP.getOrDefault(selectedOption, UNKNOWN);
		command.execute(scanner);
	}
}
