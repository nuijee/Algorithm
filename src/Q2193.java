import java.util.Scanner;

public class Q2193 {
    /*
        0과 1로만 이루어진 수를 이진수라 한다. 이러한 이진수 중 특별한 성질을 갖는 것들이 있는데, 이들을 이친수(pinary number)라 한다. 이친수는 다음의 성질을 만족한다.

       이친수는 0으로 시작하지 않는다.
       이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
       N(1 ≤ N ≤ 90)이 주어졌을 때, N자리 이친수의 개수를 구하는 프로그램을 작성하시오.
     */
    public void solution(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[][] arr = new long[2][91];//0으로 끝나는 경우 1로 끝나는 경우로 분리
        arr[0][1]=0;
        arr[1][1]=1; // 1 하나
        arr[0][2]=1; // 10 하나
        arr[1][2]=0;

        for(int a=3;a<=N;a++){
            arr[0][a] = arr[0][a-1]+arr[1][a-1];
            arr[1][a] = arr[0][a-1];
        }

        System.out.println(arr[0][N] + arr[1][N]);
    }
}
