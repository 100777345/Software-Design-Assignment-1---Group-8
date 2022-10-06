package assignment1;

// Abstract class for all products, contains variables used in all products
abstract class Product {
	
	double price;
	String productBrand, productType;

	public String getBrand() {
		return this.productBrand;
	}
	
	public String getType() {
		return this.productType;
	}
	
	public double getPrice() {
		return this.price;
	}

}
