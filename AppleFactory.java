package assignment1;

// Factory for apples, can create 2 different brands.
public class AppleFactory extends GroceryProductFactory {
	
	// See GroceryProductFactory class for information on createProduct
	public Product createProduct(String brand) {
		
		double tempPrice = -1;
		
		// Branch for brand 1
		if (brand == "Red Delicious") {
			
			RedDeliciousApple rdApple = new RedDeliciousApple();
			tempPrice = retrievePrice(rdApple.productBrand + " " + rdApple.productType);
			
			if (tempPrice != -1) {
				rdApple.price = tempPrice;
				return rdApple;
			} else {
				return null;
			}

		// Branch for brand 2
		} else if (brand == "Royal Gala") {
			
			RoyalGalaApple rgApple = new RoyalGalaApple();
			tempPrice = retrievePrice(rgApple.productBrand + " " + rgApple.productType);
			
			if (tempPrice != -1) {
				rgApple.price = tempPrice;
				return rgApple;
			} else {
				return null;
			}
			
		// Branch if brand passed does not match
		} else {
			return null;
		}
		
	}
	
}
