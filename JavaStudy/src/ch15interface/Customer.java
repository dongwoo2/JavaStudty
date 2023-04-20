package ch15interface;

public class Customer implements Buy,Sell{
    @Override
    public void Buy() {
        System.out.println("customerbuy ") ;
    }



    @Override
    public void Sell() {
        System.out.println("customersell ");
    }

    public void sayHello() {
        System.out.println(" say hello " );
    }

    @Override
    public void order() {
        System.out.println("customer order" );
    }
}
