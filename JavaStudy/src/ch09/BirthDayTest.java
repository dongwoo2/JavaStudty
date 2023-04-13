package ch09;
//유효한 생일인지 체크하고싶다
public class BirthDayTest {

    public static void main(String[] args) {

        BirthDay day = new BirthDay();
        day.setYear(2023);
        day.setMonth(15); //설정
        day.setDay(30);

        System.out.println("day.isValid() = " + day.isValid());
        System.out.println("day = " + day);
        day.printThis();
    }
}
