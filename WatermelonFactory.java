package assignment1;

// Factory for watermelons, can create 2 different brands.
public class WatermelonFactory extends GroceryProductFactory{

    // See GroceryProductFactory class for information on createProduct
    public Product createProduct(String brand) {
        
        double tempPrice = -1;

        // Branch for brand 1
        if (brand == "Crimson Sweet") {

            CrimsonSweetWatermelon crimWatermelon = new CrimsonSweetWatermelon();
            tempPrice = retrievePrice(crimWatermelon.productBrand + " " + crimWatermelon.productType);

            if (tempPrice != -1) {
            	crimWatermelon.price = tempPrice;
                return crimWatermelon;
            } else {
                return null;
            }
            
        // Branch for brand 2
        } else if (brand == "Icebox") {

            IceboxWatermelon iceWatermelon = new IceboxWatermelon();
            tempPrice = retrievePrice(iceWatermelon.productBrand + " " + iceWatermelon.productType);

            if (tempPrice != -1) {
            	iceWatermelon.price = tempPrice;
                return iceWatermelon;
            } else {
                return null;
            }
            
        // Branch if brand passed does not match
        } else {
            return null;
        }
    }
    
}
