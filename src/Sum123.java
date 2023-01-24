import java.util.Scanner;

public class Sum123 {
    /*
    9095
     정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수
     */
    public void solution(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int k= 0; k<n;k++) {
            int num = scanner.nextInt();
            int[] arr = new int[12];
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;
            for (int i = 4; i <= num; i++) {
                //arr[i-2]는 arr[i-1] 과 한패턴이 겹치고 arr[i-1] 또한 arr[i-2],arr[i-1]와 패턴이 겹침
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
            System.out.println(arr[num]);
        }

    }
}
