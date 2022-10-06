package assignment1;

public class FactoryTester {

	public static void main(String[] args) {
		// Main method that tests all brands and all factories.

		// Create factories
		AppleFactory newapplefactory = new AppleFactory();
		BananaFactory newbananafactory = new BananaFactory();
		WatermelonFactory newwatermelonfactory = new WatermelonFactory();
		
		// Create product and display product information		
		Product apple1 = newapplefactory.createProduct("Red Delicious");
		displayProductInfo(apple1);
		
		Product apple2 = newapplefactory.createProduct("Royal Gala");
		displayProductInfo(apple2);
		
		Product banana1 = newbananafactory.createProduct("Del Monte");
		displayProductInfo(banana1);
		
		Product banana2 = newbananafactory.createProduct("Dole");
		displayProductInfo(banana2);
		
		Product watermelon1 = newwatermelonfactory.createProduct("Crimson Sweet");
		displayProductInfo(watermelon1);
		
		Product watermelon2 = newwatermelonfactory.createProduct("Icebox");
		displayProductInfo(watermelon2);
		
		
	}
	
	// Takes attributes of product and displays them to the user.
	public static void displayProductInfo(Product product) {
		System.out.println("Product name: " + product.getBrand() + " " + product.getType() + "\nPrice: $" + product.getPrice());
	}

}
