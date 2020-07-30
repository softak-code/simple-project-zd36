package pl.sdacademy.simple.ui;

import static pl.sdacademy.simple.tools.Utils.println;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import pl.sdacademy.simple.model.CarParameter;

public class Condition {

	private static final int SEPARATOR_COUNTER = 120;

	private Condition() {
		// utility class
	}

	public static CarParameter present(Scanner scanner) {
		println("#".repeat(SEPARATOR_COUNTER));
		String finish;
		String brand;
		String producer;
		String colour;
		String extraConditions;
		do {
			println("Podaj kolejne atrybuty");
			println("model:");
			brand = scanner.nextLine();
			println("producent:");
			producer = scanner.nextLine();
			println("kolor:");
			colour = scanner.nextLine();
			println("dodatkowe atrybuty (kolejne rozdziel przecinkami):");
			extraConditions = scanner.nextLine();
			println("#".repeat(SEPARATOR_COUNTER));
			println("Czy warunek jest kompletny?");
			finish = scanner.nextLine();
		} while (!"t".equalsIgnoreCase(finish));

		return CarParameter.builder()
				.model(brand)
				.producer(producer)
				.colour(colour)
				.attributes(getAttributes(extraConditions))
				.build();
	}

	private static Set<String> getAttributes(String extraConditions) {
		Set<String> result = new HashSet<>();
		if (StringUtils.isNotBlank(extraConditions)) {
			result.addAll(Arrays.asList(extraConditions.split(",")));
		}
		return result;
	}
}
