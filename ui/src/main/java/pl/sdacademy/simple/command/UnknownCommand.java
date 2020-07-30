package pl.sdacademy.simple.command;

import static pl.sdacademy.simple.tools.Utils.println;

import java.util.Scanner;

public class UnknownCommand implements Command {
	@Override
	public void execute(Scanner scanner) {
		println("Wybrałeś opcję, która nie jest obsłużona. Spróbuj ponownie.");
	}
}
