package pl.sdacademy.simple.model;

import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CarParameter {
	private final String producer;
	private final String model;
	private final String colour;
	private final Set<String> attributes;
}
