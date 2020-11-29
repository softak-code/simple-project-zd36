package pl.sdacademy.simple.data;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class CarEntity {
	@Id
	@GeneratedValue
	private long id;
	private String producer;
	private String model;
	private String colour;
	private double price;
	private Byte automatic;
	@ManyToMany
	@JoinTable(name = "car_to_attribute",
			joinColumns = @JoinColumn(name = "car_id"),
			inverseJoinColumns = @JoinColumn(name = "attr_id"))
	private Set<CarAttributeEntity> attributes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Byte getAutomatic() {
		return automatic;
	}

	public void setAutomatic(Byte automatic) {
		this.automatic = automatic;
	}

	public Set<CarAttributeEntity> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<CarAttributeEntity> attributes) {
		this.attributes = attributes;
	}
}
