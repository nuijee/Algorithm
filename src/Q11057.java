import java.util.Scanner;

public class Q11057 {
    /**
     * 11057 오르막 수
     *
     * 오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이때, 인접한 수가 같아도 오름차순으로 친다.
     * 예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.
     * 수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오.
     */

    public void solution(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[][] arr = new long[1001][10];
        //arr[A][B] = 길이가 A이면서 B로 끝나는 경우
        for(int i=0;i<10;i++){
           arr[1][i] = 1;
        }

        for(int n=2;n<=N;n++){
            for(int i=0;i<10;i++) {
                long temp = 0;
                for(int j=0 ; j<=i; j++){
                    temp+= arr[n-1][j];
                }
                arr[n][i] = temp%10007;
            }
        }

        long answer = 0;
        for(int k = 0;k<10;k++){
            answer+= arr[N][k]%10007;
        }
        System.out.println(answer%10007);
    }
}
