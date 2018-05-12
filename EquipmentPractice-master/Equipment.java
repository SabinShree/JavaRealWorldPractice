package FirstYearJava;

public class Equipment {
    private String description;
    private String customerName;

    public Equipment(String description) {
        this.description = description;
        this.customerName = "";
    }

    public String getDescription() {
        return description;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void displayAll() {
        System.out.println("Description of Equipment : " + getDescription());
        if (!customerName.isEmpty()) {
            System.out.println("Customer Name : " + getCustomerName());
        }
    }
}
