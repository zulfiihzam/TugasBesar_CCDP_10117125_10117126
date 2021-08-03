package prototypepatterndemo;

public class PrototypePatternDemo {

    public static void main(String[] args) {
     
        ProductsCache.loadCache();
        
	Products foodProducts = ProductsCache.getProducts("FP01");
	System.out.println("Id: " + foodProducts.getProductId()+ "\nProduct Name: " 
                + foodProducts.getProductName());
        foodProducts.getProductType();
		    
        Products electronicProduct = ProductsCache.getProducts("EP01");
        System.out.println("Id: " + electronicProduct.getProductId()+ "\nProduct Name: " 
                + electronicProduct.getProductName());
        electronicProduct.getProductType();
    }
    
}
