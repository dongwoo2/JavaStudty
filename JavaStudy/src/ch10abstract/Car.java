package ch10abstract;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void fuel();

    public void StartCar() {
        System.out.println(" 시동을 켭니다 ");
    }
    public void turnOff() {
        System.out.println(" 시동을 끕니다 ");
    }
    public void washCar() {

    }

    final public void run() { //구현됐든 아니든 상관없음 알아서 구현메서드들이 구현할꺼니까
        StartCar();
        drive();
        stop();
        turnOff();
        fuel();
        washCar();
    }
}
