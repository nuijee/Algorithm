import java.util.Scanner;

public class StepNumber {
    public void solution(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //n번째 자리수가 2로 끝나는 수 = arr[n][2]
        int [][] arr = new int[101][10];
        arr[1][0]=0;
        for(int i=1;i<10;i++){
            arr[1][i] = 1;
        }
        arr[2][0] = arr[1][1];
        arr[2][1] = arr[1][0]+arr[1][2];
        arr[2][2] = arr[1][1]+arr[1][3];
 /*
   . . .
  */
        arr[2][9] = arr[1][8];
        for(int n=2;n<=N;n++) {
            for (int i = 0; i < 10; i++) {
                if(i==0){
                    arr[n][i] = arr[n-1][1]%1000000000;
                }else if(i==9){
                    arr[n][i] = arr[n-1][8]%1000000000;
                }else{
                    arr[n][i] = (arr[n-1][i-1]+arr[n-1][i+1])%1000000000;
                }
            }
        }
        //int 32비트, long 64비트
        long answer = 0;
        for(int i=0;i<10;i++)
            answer+=arr[N][i];

        System.out.println(answer%1000000000);
    }
}
