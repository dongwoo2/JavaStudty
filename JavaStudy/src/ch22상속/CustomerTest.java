package ch22상속;

public class CustomerTest {

    public static void main(String[] args) {

//        Customer customerLee = new Customer();
//
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerId(10010);
//        customerLee.bonuspoint = 1000;
//
//        System.out.println("customerLee.showCustomerInfo() = " + customerLee.showCustomerInfo());


        Customer customerKim = new VIPCustomer(10020,"김유신");

        customerKim.bonuspoint = 10000;

        VIPCustomer vcustomer = new VIPCustomer(0, "Lee");



        System.out.println("customerKim.showCustomerInfo() = " + customerKim.showCustomerInfo());

    }
}
