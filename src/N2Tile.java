import java.util.Scanner;
/*
11727
2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 */
public class N2Tile {
    public void solution(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[1001];
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 5;

        for(int i=3;i<=num;i++){
            arr[i] = (arr[i-1]+2*arr[i-2])%10007;
        }

        System.out.println(arr[num]);
    }
}
