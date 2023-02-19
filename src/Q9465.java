import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;

public class Q9465 {
    /*
    스티커 한 장을 떼면, 그 스티커와 변을 공유하는 스티커는 모두 찢어져서 사용할 수 없게 된다. 즉, 뗀 스티커의 왼쪽, 오른쪽, 위, 아래에 있는 스티커는 사용할 수 없게 된다.
    2n개의 스티커 중에서 점수의 합이 최대가 되면서 서로 변을 공유 하지 않는 스티커 집합을 구해야 한다.
    첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 n (1 ≤ n ≤ 100,000)이 주어진다. 다음 두 줄에는 n개의 정수가 주어지며, 각 정수는 그 위치에 해당하는 스티커의 점수이다.
    연속하는 두 정수 사이에는 빈 칸이 하나 있다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
     */
    public void solution(){
        Scanner scanner= new Scanner(System.in);
        int caseNum = scanner.nextInt();
        StringTokenizer stn;
        for(int i= 0;i<caseNum;i++){
            int n=scanner.nextInt();
            long [][] arr= new long[3][100001];
            //입력값으로 배열채우기
            for(int a=0;a<=1;a++){
                for(int b=1;b<=n;b++)
                    arr[a][b]=scanner.nextInt();
            }
            //+1대각선 위치의 스티커 숫자 더하기 or +2대각선 위치의 스티커 숫자 더하기
            long[][] answer = new long[3][100001];
            answer[0][0]=0;
            answer[1][0]=0;

            answer[0][1]=arr[0][1];
            answer[1][1]=arr[1][1];

            for(int a=2;a<=n;a++){
                answer[0][a] = Math.max(answer[1][a-1],answer[1][a-2])+arr[0][a];
                answer[1][a] = Math.max(answer[0][a-1],answer[0][a-2])+arr[1][a];
            }
            System.out.println(Math.max(answer[0][n],answer[1][n]));
        }
    }
}
