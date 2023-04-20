package ch15interface;

public interface Buy {

    void Buy();

    default void order() {
        System.out.println(" buy order " );
    }

}
