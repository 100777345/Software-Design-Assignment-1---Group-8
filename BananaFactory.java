package assignment1;

// Factory for bananas, can create 2 different brands.
public class BananaFactory extends GroceryProductFactory{

    // See GroceryProductFactory class for information on createProduct
    public Product createProduct(String brand) {
        
        double tempPrice = -1;

        // Branch for brand 1
        if (brand == "Del Monte") {

            DelMonteBanana delBanana = new DelMonteBanana();
            tempPrice = retrievePrice(delBanana.productBrand + " " + delBanana.productType);

            if (tempPrice != -1) {
            	delBanana.price = tempPrice;
                return delBanana;
            } else {
                return null;
            }
        // Branch for brand 2
        } else if (brand == "Dole") {

            DoleBanana dolBanana = new DoleBanana();
            tempPrice = retrievePrice(dolBanana.productBrand + " " + dolBanana.productType);

            if (tempPrice != -1) {
            	dolBanana.price = tempPrice;
                return dolBanana;
            } else {
                return null;
            }

        // Branch if brand passed does not match
        } else {
            return null;
        }
        
    }

}
