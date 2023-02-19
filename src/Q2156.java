/*
포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
연속으로 놓여 있는 3잔을 모두 마실 수는 없다.
1부터 n까지의 번호가 붙어 있는 n개의 포도주 잔이 순서대로 테이블 위에 놓여 있고, 각 포도주 잔에 들어있는 포도주의 양이 주어졌을 때,
효주를 도와 가장 많은 양의 포도주를 마실 수 있도록 하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Q2156 {
    public void solution(){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        long arr[] = new long[n+1];
        long sum[] = new long[n+1]; //sum[A][B] A가 0이면 두번 연속 아닌 것 A가 1이면 연속인 것
        for(int i=1;i<=n;i++){
            arr[i] = scanner.nextLong();
        }
        sum[0] = 0;
        sum[1] = arr[1];
        if(n>1) {
            sum[2] = arr[1] + arr[2];

            for (int i = 3; i <= n; i++) {
                sum[i] = Math.max(sum[i - 1], Math.max(sum[i - 2] + arr[i], sum[i - 3] + arr[i - 1] + arr[i]));
            }
        }
        System.out.println(sum[n]);
    }
}
