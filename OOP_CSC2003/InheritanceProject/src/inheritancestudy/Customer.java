package inheritancestudy;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("(1) Parent constructor!");
    }

    public int calcPrice(int price) {
        bonusPoint += (int)(price * bonusRatio);
        return price;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void showCustomerInfo() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Grade: " + customerGrade);
        System.out.println("Bonus Point: " + bonusPoint);
        System.out.println("Bonus Ratio: " + bonusRatio);
    }
}
