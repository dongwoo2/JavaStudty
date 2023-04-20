package ch12intetface;

public class CalculatorTest {

    public static void main(String[] args) {

        CompleteCalc calc = new CompleteCalc();

        int num1 = 10;
        int num2 = 2;

        System.out.println(num1 + "+" + num2 + "=" + calc.add(num1,num2));
        System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1,num2));
        System.out.println(num1 + "*" + num2 + "=" + calc.times(num1,num2));
        System.out.println(num1 + "%" + num2 + "=" + calc.divide(num1,num2));

        calc.showInfo();

        calc.description();

        //정적 메소드이기 때문에 인스턴스화 된게 하나도 없어도 인터페으스 이름으로 정적메소드 호출해서 사용가능
        int[] arr = {1,2,3,4,5};

        int total = Calc.total(arr);//static 메서드는 인터페이스타입으로 부르면됨
        System.out.println("total = " + total);
    }
}
