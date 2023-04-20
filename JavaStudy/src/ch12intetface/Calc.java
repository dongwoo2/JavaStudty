package ch12intetface;

public interface Calc {


    public static final double PI = 3.14;
    int Error = -9999999;
    public abstract int add(int num1,int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() { //default 함수에서만 private로 선언된 myMethod를 호출할 수 있다.
        myMethod();
        mystaticMethod();
        System.out.println(" 정수를 계산합니다. ");
    }

    private void myMethod() {
        System.out.println(" private method" );
    }

    static int total(int[] arr) { //private 스택틱 메서는 스태틱메서드에서 불러주면됨
//        myMethod(); 얘는 인스턴스가 생성되고나서 불릴 수 있음
        mystaticMethod() ;
        int total = 0;

        for(int i: arr) {
            total += 1;
        }

        return total;
    }

    private static void mystaticMethod() { //private는 인터페이스 안에서만 사용가능
        //인스턴스 생성과 상관없이 스택틱 내부에서 쓰는거기 때문에 default 메서드에서도 호출될수있음
        System.out.println(" private static method ");
    }
}
