package proxypatterndemo;

public class ProxyWarehouseAccess implements ShopWarehouseAccess{

    private RealWarehouseAccess realWarehouseAccess;
    private ShopEmployee shopEmployee;
    
    
    
    public ProxyWarehouseAccess(ShopEmployee shopEmployee){
        this.shopEmployee = shopEmployee;
    }
    
    @Override
    public void grantWarehouseAccess() {
if (shopEmployee.getEmployeePosition().equalsIgnoreCase("Owner") || 
				shopEmployee.getEmployeePosition().equalsIgnoreCase("Warehouse Manager")) 
		{
                       
			realWarehouseAccess = new RealWarehouseAccess();
                        
                        realWarehouseAccess.grantWarehouseAccess();
                        
			System.out.println(shopEmployee.getEmployeeName()+" You're going to access the shop warehouse as " 
                                +shopEmployee.getEmployeePosition()+"\n\n");
                        
			
                        
		} else {
			System.out.println(shopEmployee.getEmployeeName()+" You don't have access to the warehouse."
                                + " Your position as " + shopEmployee.getEmployeePosition() +" doesn't include access to the warehouse!");
		}
	}
}
