package ch21상속;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer();

        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(10010);
        customerLee.bonuspoint = 1000;

        System.out.println("customerLee.showCustomerInfo() = " + customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer();

        customerKim.setCustomerName("충무공");
        customerKim.setCustomerId(10020);
        customerKim.bonuspoint = 10000;

        System.out.println("customerKim.showCustomerInfo() = " + customerKim.showCustomerInfo());

    }
}
