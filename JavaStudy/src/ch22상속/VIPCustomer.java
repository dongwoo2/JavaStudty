package ch22상속;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;


    public VIPCustomer(int customerId, String customerName) {

        super(customerId, customerName);
        customerGrade = "VIP";
        salesRatio = 0.05;
        bonusRatio = 0.1;
    }
    @Override
    public int calcPrice(int price){

        bonuspoint += price * bonusRatio;
        return price - (int)(price *salesRatio);
    }

    public int getAgentID()
    {
        return agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "상담원 아이디는" + agentID;
    }
}
