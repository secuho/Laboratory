package inheritancestudy;

public class VIPCustomer extends Customer{

    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("(2) Child constructor!");
    }


}
