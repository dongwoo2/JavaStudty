package pr3;

import java.util.ArrayList;

public class Student {

    int studentId;
    String  studentName;

    //서브젝트의 리스트를 관리를 한다.
    ArrayList<Subject> subjectList = new ArrayList<Subject>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();


        subject.setName(name);
        subject.setScorePoint(score);

        subjectList.add(subject);
    }

    public void  showStudentInfo() {

        int total = 0;

        for(Subject s : subjectList) { // 서브젝트 리스트를 다 돌면서 합계를 구하고 각 과목의 성적은 몇점인지 출력 토탈도 출력

            total += s.getScorePoint();
            System.out.println(studentName + " 학생의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다. ");
        }
        System.out.println("학생의 총점은" + total + "입니다.");
    }
}
