package ch16;

import java.util.Calendar;

public class SchoolTest {

    public static void main(String[] args) {

        School school = School.getInstance();

        Calendar calendar = Calendar.getInstance(); //timezone의 시간은여러 인스턴스 값을 가지지 않음 딱 하나의 값을 가짐 현재시간이라는 객체는 하나니까
    }
}
