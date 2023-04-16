package ch21상속;

public class Customer {

    protected   int customerId; //외부에서 접근은 할 수 없지만 하위 클래스에서는 접근가능하게 protected 접근제어자 설정
    protected String customerName;
    protected String customerGrade;

    int bonuspoint;
    double bonusRatio;


    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;

    }

    public int calcPrice(int price) {
        bonuspoint += price * bonusRatio;
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonuspoint + "입니다";
    }

}
