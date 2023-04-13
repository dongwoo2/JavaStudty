package ch13;

public class Student {

    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money) { //이름이 뭐고 얼마를 가지고있다.
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {  //버스를 탄다고 하면 이 메서드를 호출하겠다 매개변수를 내가 타는 버스를 받겠다.
        bus.take(1000);
        this.money -= 1000;
    }


    public void takeSubway(Subway subway) {  //지하철을 탄다고 하면 이 메서드를 호출하겠다 매개변수를 내가 타는 버스를 받겠다.
        subway.take(1200);
        this.money -= 1200;
    }

    public void showStudentInfo() {

        System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다.");
    }
}
