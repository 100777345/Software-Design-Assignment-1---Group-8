package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Implemented as an abstract class rather than interface,
 * as retrievePrice is common for all concrete factories.
 */

abstract class GroceryProductFactory {
	
	// Instantiates a product, sets price using retrievePrice, and returns product.
	abstract Product createProduct(String brandName);
	
	/* Returns price of product with name productName by reading a database file (database.txt).
	 * Database is a text file in the following form:
	 * 
	 * ProductAName
	 * ProductAPrice
	 * ProductBName
	 * ProductBPrice
	 * ...
	 */
	public double retrievePrice(String productName)
	{

		double tempPrice = -1;
		
		try {
			
			File products = new File("database.txt");
		    Scanner myReader = new Scanner(products);
		    
		    while (myReader.hasNextLine()) 
		    {
		    	
		        String input = myReader.nextLine();
		        
		        if (input.equals(productName))
		        {
		        	tempPrice = myReader.nextDouble();
		        }
		        
		    }
		    
		    myReader.close();
		    
		} catch (FileNotFoundException e) {
		      System.out.println("No database file found.");
		      e.printStackTrace();
		}

		return tempPrice;

	}
	
}
