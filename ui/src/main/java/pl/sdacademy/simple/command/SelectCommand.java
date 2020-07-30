package pl.sdacademy.simple.command;

import static pl.sdacademy.simple.tools.Utils.println;

import java.util.Scanner;

import pl.sdacademy.simple.model.CarParameter;
import pl.sdacademy.simple.ui.Condition;

public class SelectCommand implements Command {
	@Override
	public void execute(Scanner scanner) {
		CarParameter carParameter = Condition.present(scanner);

		println("Tutaj trzeba dodać logikę odpowiedzialną za prezentację wszystkich samochodów...");
	}
}
