import java.util.Scanner;

public class Q11053 {
    public void solution(){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        long[] arr = new long[n];
        long[] cnt= new long[n];

        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();

        cnt[0] = 1;
        for(int i=1;i<n;i++){
            long max=0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i] && cnt[j]>max)
                    max=cnt[j];
            }
            cnt[i] = max+1;
        }
        long answer = 0;
        for(int i=0;i<n;i++){
            if(cnt[i]>answer)
                answer=cnt[i];
        }

        System.out.println(answer);
    }
}
