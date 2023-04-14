package ch14;

public class Employee {

    private static int serialNum = 1000;
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        employeeId = ++serialNum; //앞에 있으면 증가하고 어사인하고 뒤에있으면 어사인해주고 증가
    }

    public static int getSerialNum() { //스태틱 매서드 안에서는 메모리 생성이 보장되지 않은 인스턴스 변수 사용불가
        int i = 0;
//        employeeName = "Lee";
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
