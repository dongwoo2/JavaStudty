package pr3;

public class StudentSubjectTest {

    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKiM = new Student(1002, "Kim");
        studentKiM.addSubject("국어", 70);
        studentKiM.addSubject("수학", 85);
        studentKiM.addSubject("영어", 100);

        studentLee.showStudentInfo();

        System.out.println("==================================");

        studentKiM.showStudentInfo();
    }
}
