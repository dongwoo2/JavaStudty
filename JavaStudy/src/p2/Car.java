package p2;

public class Car {

    //기준이 되는 번호
    private static int serialNum = 10000;
    //차가 생성될 때 마다 고유번호를 지정해줄수 있게 변수 생성
    private int carNum;

    //차에게 번호를 주기전에 1증가 시키고
    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    //차의 번호를 확인하기 위해 퍼블릭하게 getcarnum으로 제공 private니까 set은(설정)못하게하고 get 가져오기만 할 수 있게
    public int getCarNum() {
        return carNum;
    }
}
