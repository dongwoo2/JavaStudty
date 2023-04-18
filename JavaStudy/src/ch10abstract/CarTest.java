package ch10abstract;

public class CarTest {

    public static void main(String[] args) {

        Car aiCar = new AlCar();
        aiCar.run();

        System.out.println(" ===================== " );

        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
