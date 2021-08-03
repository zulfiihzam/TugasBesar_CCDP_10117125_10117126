package prototypepatterndemo;

import java.util.HashMap;
import java.util.Map;

public class ProductsCache {
    
	private static Map<String, Products> productsMap = new HashMap<String, Products>();

	public static void loadCache() {
		
		Products foodProduct = new FoodProducts("FP01", "Supermi Ayam Bawang", 2500);
		Products electronicProduct = new ElectronicProducts("EP01", "Dispencer Miyako", 350000);
                
		productsMap.put(foodProduct.getProductId(), foodProduct);
                productsMap.put(electronicProduct.getProductId(), electronicProduct);
	}
	
	public static Products getProducts(String productId) { 
		Products cachedProduct = productsMap.get(productId); 
		return (Products) cachedProduct.clone();
	}
}
