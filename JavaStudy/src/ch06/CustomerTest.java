package ch06;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10020, "신사임담");
        Customer customerHong = new GoldCustomer(10030, "홍길동");
        Customer customerYul = new GoldCustomer(10040, "이율곡");
        Customer customerKim = new VIPCustomer(10050, "김유신",12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println(" ==========고객정보출력================== " );

        for(Customer customer : customerList) {
            System.out.println("customer.showCustomerInfo() = " + customer.showCustomerInfo());
        }


        System.out.println(" =============할인율과 보너스 포인트계산=============== " );
        int price = 10000;
        for(Customer customer : customerList) {

            int cost = customer.calcPrice(price);
            System.out.println("cost = " + customer.getCustomerName() + cost);
            System.out.println("cost = " + customer.getCustomerName() + customer.bonuspoint);
        }
    }



}