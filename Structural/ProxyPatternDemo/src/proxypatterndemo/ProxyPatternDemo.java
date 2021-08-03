package proxypatterndemo;

public class ProxyPatternDemo {


    public static void main(String[] args) {
        
        ShopEmployee Rizky = new ShopEmployee("OW01", "Boy Chandra", "Owner");
        ProxyWarehouseAccess ownerProxyWarehouseAccess = new ProxyWarehouseAccess(Rizky);
        ownerProxyWarehouseAccess.grantWarehouseAccess();
        
        ShopEmployee Fikih = new ShopEmployee("MG01", "Brad Er", "Warehouse Manager");
        ProxyWarehouseAccess managerProxyWarehouseAccess = new ProxyWarehouseAccess(Fikih);
        managerProxyWarehouseAccess.grantWarehouseAccess();
        
        ShopEmployee Bobby = new ShopEmployee("KS01", "Asep", "Cashier");
        ProxyWarehouseAccess cashierProxyWarehouseAccess = new ProxyWarehouseAccess(Bobby);
        cashierProxyWarehouseAccess.grantWarehouseAccess();
    }
    
}
