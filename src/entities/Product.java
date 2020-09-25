package entities;

public class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

// (... get / set / hashCode / equals)
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}