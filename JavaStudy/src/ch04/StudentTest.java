package ch04;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student(100,"Lee"); //참조변수 생선된 객체를 가리키는 아아 studentLee라는 객체를 생성
                                            //그 객체는 id,name,address에 값을 줄 수 있음

        studentLee.studentAddress = "Seoul";

        Student studentKim = new Student(101, "Kim" , "New York");

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println("studentLee = " + studentLee);
        System.out.println("studentLee = " + studentKim);
    }
}
