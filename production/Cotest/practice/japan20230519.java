package production.Cotest.practice;

import java.util.Scanner;

public class japan20230519 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = y; j > 0; j--) {
                if( i < j) {
                    System.out.println("  ");
                }else {
                    System.out.print("*");
                }
                System.out.println("  ");
            }
        }
    }
}
