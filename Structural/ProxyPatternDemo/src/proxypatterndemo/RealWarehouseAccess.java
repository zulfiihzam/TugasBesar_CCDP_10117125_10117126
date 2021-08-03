package proxypatterndemo;


public class RealWarehouseAccess implements ShopWarehouseAccess{
  
    @Override
    public void grantWarehouseAccess() {
       System.out.println("Accessing the warehouse");  
    }
    
}
