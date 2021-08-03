package prototypepatterndemo;

public abstract class Products implements Cloneable{
    
    private String productId;
    private String productName;
    private double productPrice;

    public abstract void getProductType();
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
@Override
	public Object clone() {
		Object clonedObject = null;
		try {
			clonedObject = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedObject;
	}
}
