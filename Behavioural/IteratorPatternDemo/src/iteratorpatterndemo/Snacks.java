package iteratorpatterndemo;

public class Snacks {
    private String snacksName;
 
    public Snacks(String snacksName) {
        this.snacksName = snacksName;
    }
    
    public String getSnacksName() {
        return snacksName;
    }

    public void setSnacksName(String snacksName) {
        this.snacksName = snacksName;
    }
    
    @Override
    public String toString() {

        return String.format("Snacks Name: %s", snacksName);

    }
}
