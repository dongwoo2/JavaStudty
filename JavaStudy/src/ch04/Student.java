package ch04;

public class Student {

    int studentId;
    String studentName;
    String studentAddress;

    public Student(){} //오버로딩 이름은 같고 매개변수는 다르므로서 하나이상의 생성자가 있는것을 오버로드

    public Student(int studentId,String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public Student(int studentId,String studentName,String studentAddress){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public void showStudentInfo() {
        System.out.println("studentName  = " + studentName+ "studentAddress  =" +studentAddress +"studentId  =" +studentId);
    }

   public String getStudentName(){ //웹페이지를 클라이언트 코드라고 얘기함 가져다 쓰는쪽의 입장에서 만들어야한다.
        return studentName;
   }

//    public static void main(String[] args) {
//        Student student = new Student();
//        student.showStudentInfo();
//    }
}
