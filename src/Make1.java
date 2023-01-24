public class Make1 {
    /**
     * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
     *
     * X가 3으로 나누어 떨어지면, 3으로 나눈다.
     * X가 2로 나누어 떨어지면, 2로 나눈다.
     * 1을 뺀다.
     * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
     **/
    public int solution(int inpt){
        int[] arr = new int[1000001];
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 1;
        for(int i=4;i<=inpt;i++){
            if(i%3==0 && i%2==0){
                int min = 0;

                if(arr[i/3]>arr[i/2])
                    min = arr[i/2]+1;
                else
                    min = arr[i/3]+1;

                if(arr[i-1]+1<min)
                    min = arr[i-1]+1;

                arr[i] = min;
            }
            else if(i%3==0){
                if(arr[i-1]>arr[i/3])
                    arr[i] = arr[i/3]+1;
                else
                    arr[i]=arr[i-1]+1;
            }else if(i%2==0){
                if(arr[i-1]>arr[i/2])
                    arr[i] = arr[i/2]+1;
                else
                    arr[i]=arr[i-1]+1;
            }else{
                arr[i]=arr[i-1]+1;
            }
        }

        return arr[inpt];
    }
}
