package p2;

public class CarFactoryTest {

    public static void main(String[] args) {

        //CarFactory에 이미 있는 객체를 가져와서 쓰기위해 이렇게 인스턴스를 부름 객체를 쓰기위해 이렇게 문법을 하는것(예는 new처럼 계속 객체를 만드는게 아니고 이미 있는 객체를 가쟈오기 때문에 이렇게 작성함)
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println("mySonata = " + mySonata.getCarNum());
        System.out.println("yourSonata = " + yourSonata.getCarNum());
    }
}
