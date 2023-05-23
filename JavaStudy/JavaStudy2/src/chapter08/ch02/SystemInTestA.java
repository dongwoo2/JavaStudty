package chapter08.ch02;

import java.io.IOException;

public class SystemInTestA {

    public static void main(String[] args) {
        System.out.println(" 알파벳 여러개를 쓰고 [enter]를 누르세요 ");

        int i;

        try {
            while ((i = System.in.read()) != '\n') {
                System.out.print("(char)i = " + (char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
