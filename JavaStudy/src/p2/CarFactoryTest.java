package p2;

public class CarFactoryTest {

    public static void main(String[] args) {

        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println("mySonata = " + mySonata.getCarNum());
        System.out.println("yourSonata = " + yourSonata.getCarNum());
    }
}
