package p2;

public class CarFactory {
    //자동차를 생산하는 공장은 하나이면 된다 그래서 static 씀
    private static CarFactory instance = new CarFactory();
    //생성자를 그냥 두면 디폴트 생성자가 생기니까 만들어놓기 private로 만들어놓음 디폴트는 public임
    private CarFactory() {}
        //carFactory를 반환해주는 getInstacne
        public static CarFactory getInstance() {
            if(instance == null) {
                instance = new CarFactory();
            }
            return instance;
        }
    //차를 반환
    public Car createCar() {
        Car car = new Car();
        return car;
    }
}
