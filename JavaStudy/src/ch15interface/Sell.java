package ch15interface;

public interface Sell {

    void Sell();

    default void order() {
        System.out.println(" buy order " );
    }
}
