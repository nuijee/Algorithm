import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(int[] money) {
        int answer = 0;
        int sum = 0;
        String [] visited = new String[money.length];
        List<int[]> moneyArr = new ArrayList<>();
        int[] temp = new int[4];//0:액수 1:왼편Idx 2:오른편Idx
        temp[0] = money[0];
        temp[1]= money.length-1;
        temp[2]=1;
        temp[3]=0;
        moneyArr.add(temp);
        for(int i=1;i<money.length-1;i++){
            temp = new int[4];
            temp[0] = money[i];
            temp[1] = i-1;
            temp[2] = i+1;
            temp[3]=i;
            moneyArr.add(temp);
        }
        temp = new int[4];

        temp[0]=money[money.length-1];
        temp[1]=money.length-2;
        temp[2]=0;
        temp[3]=money.length-1;
        moneyArr.add(temp);

        moneyArr.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]>o2[0])
                    return -1;
                else return 1;
            }
        });//내림차순 정렬



for(int i=0;i<money.length;i++){
    System.out.println(moneyArr.get(i)[0]+" "+moneyArr.get(i)[3]);
}
        visited[moneyArr.get(0)[3]]="1";
        sum+=moneyArr.get(0)[0];
        for (int i=1;i< money.length;i++){
            int a = moneyArr.get(i)[1];
            int b = moneyArr.get(i)[2];
            if("1".equals(visited[a])||"1".equals(visited[b])){
                continue;
            }else{
                visited[moneyArr.get(i)[3]]="1";
                sum+= moneyArr.get(i)[0];
            }
        }

        return sum;
    }
}