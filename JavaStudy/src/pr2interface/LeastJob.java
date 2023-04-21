package pr2interface;

public class LeastJob implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
    }

    @Override
    public void sentCalltoAgent() {
        System.out.println("현재 상담업무가 없거나 상담대기가 가정 적은 상담원에게 배분합니다.");
    }

}

