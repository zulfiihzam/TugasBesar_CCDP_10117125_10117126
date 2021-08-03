package proxypatterndemo;

public class ShopEmployee {
    private String employeId;
    private String employeeName;
    private String employeePosition;

    public ShopEmployee(String employeeId, String employeeName, String employeePosition){
        this.employeId = employeeId;
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
    }
    
    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }
    
}
