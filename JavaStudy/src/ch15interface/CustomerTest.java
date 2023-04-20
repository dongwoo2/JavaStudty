package ch15interface;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.Buy();
        customer.Sell();
        customer.sayHello();

        Buy buyer = customer; //buy 라는 태입을 내포하고있다
        buyer.Buy(); //buy 만 쓸 수 있다

        Sell seller = customer;
        seller.Sell();

        customer.order();
    }
}
