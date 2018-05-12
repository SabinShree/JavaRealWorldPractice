package FirstYearJava;

public class EquipmentToRent extends Equipment {
    private String dateOfHire;
    private String dateOfReturn;
    private int downPayment;
    private int numberOfDays;
    private int dailyRate;
    private int totalRent;
    private boolean isOnLoan;


    public EquipmentToRent(String description, int downPayment, int dailyRate) {
        super(description);
        this.downPayment = downPayment;
        this.dailyRate = dailyRate;
        this.numberOfDays = 0;
        this.totalRent = 0;
        this.dateOfHire = "";
        this.dateOfReturn = "";
        this.isOnLoan = false;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public int getTotalRent() {
        return totalRent;
    }

    public boolean isOnLoan() {
        return isOnLoan;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setDownPayment(int downPayment) {
        this.downPayment = downPayment;
    }

    public void rentOutEquipment(String customer, String dateOfHire, String returnDate, int numberOfDays) {
        if (isOnLoan) {
            System.out.println("Dear " + customer + "! This Equipment is on loan.\nIt would be with us in " + returnDate + " days. Thank you.");
        } else {
            super.setCustomerName(customer);
            this.dateOfHire = dateOfHire;
            this.dateOfReturn = returnDate;
            this.numberOfDays = numberOfDays;
            this.isOnLoan = true;
            this.totalRent = dailyRate * numberOfDays;
        }
    }

    public void equipmentAvailable() {
        if (!this.isOnLoan) {
            System.out.println("Equipment is available!!");
        } else {
            super.setCustomerName("");
            this.numberOfDays = 0;
            this.dateOfHire = "";
            this.dateOfReturn = "";
            this.isOnLoan = false;
        }
    }

    public void allDescription() {
        System.out.println("Description of Equipment : " + super.getDescription());
        System.out.println("Total rent collected to-date : " + this.totalRent);
    }

    public void displayAll() {
        super.displayAll();
        System.out.println("Down payment : " + this.downPayment);
        System.out.println("Daily rate : " + this.dailyRate);
        if (isOnLoan) {
            System.out.println("Date of Hire : " + this.dateOfHire);
            System.out.println("Date of Return : " + this.dateOfReturn);
            System.out.println("Number of days : " + this.numberOfDays);
        }
    }
}
