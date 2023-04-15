package ch19;

public class TwoDimensionTest {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {4,5,6,7}}; //행이 2개가 있고 첫행에는 3개의 엘리먼트를 넣고 두번쨰행에는 4개의 엘리먼트를 넣겠다.

        int i, j;
        for (i=0; i<arr.length; i++) { //행을 기준으로 열을 돌것이다.
            for(j=0; j<arr[i].length; j++) { // j가 돌 길이는 행의 열의개수만큼 돈다
                System.out.print(arr[i][j] + " "); //첫 번째 행은 열이 3개  두 번째 행은 열이 4개 찍힘
            }
            System.out.println();
        }
    }
}
