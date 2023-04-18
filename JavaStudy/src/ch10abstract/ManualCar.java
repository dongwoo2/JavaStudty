package ch10abstract;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println(" 자율 주행합니다 ");
        System.out.println(" 자동차가 스스로 방향을 바꿉니다 ");
    }
    @Override
    public void stop() {
        System.out.println(" 스스로 멈춥니다 ");
    }

    @Override
    public void fuel() {

    }

    public void washCar() { //오버라이딩 해도되고 안해도됨 오버라이딩 된 애들은 추상함수이기에 반드시 구현을해야해서
        //오버라이딩을 해야하지만 이 함수는 구현부는 있지만 로직은 없는상태여서 (구현부괄호가 있다는게중요)반드시 오버라이딩 해야하는건 아님
        System.out.println(" 손세차를 합니다 ");
    }
}
