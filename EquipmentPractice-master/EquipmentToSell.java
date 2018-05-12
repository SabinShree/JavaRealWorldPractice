package FirstYearJava;

public class EquipmentToSell extends Equipment {
    private int size;
    private int price;
    private int color;
    private int weight;
    private boolean isSold;

    public EquipmentToSell(String description, int size, int price, int color, int weight) {
        super(description);
        this.size = size;
        this.price = price;
        this.color = color;
        this.weight = weight;
        this.isSold = false;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public int getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setNewPrice(int price) {
        if (!isSold) {
            this.price = price;
        } else {
            System.out.println("Sorry ! Cant set the price at this moment.");
        }
    }

    public void sellEquipment(String customerName) {
        if (!isSold) {
            super.setCustomerName(customerName);
            this.isSold = true;
        } else {
            System.out.println("Sorry ! This items is already sold.");
        }
    }

    public void displayAll() {
        super.displayAll();
        if (!isSold) {
            System.out.println("Price of Equipment : " + this.price);
            System.out.println("Size of Equipment : " + this.size);
            System.out.println("Color of Equipment : " + this.color);
            System.out.println("Weight of Equipment : " + this.weight);
        }
    }
}
