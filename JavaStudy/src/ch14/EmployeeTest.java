package ch14;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");


        Employee employeeKim = new Employee();
        employeeLee.setEmployeeName("김유신");

        System.out.println("employeeKim.serialNum = " + employeeKim.getEmployeeId());
        System.out.println("employeeLee.serialNum = " + employeeLee.getEmployeeId());
        System.out.println(Employee.getSerialNum());


    }
}
