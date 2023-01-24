import java.util.Scanner;
import java.util.StringTokenizer;

public class Algorithm1000 {
    //System.in.read() : 문장이 아닌 문자열 하나만 읽음
    //Scanner: console로 문장 읽기 가능
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringTokenizer stn = new StringTokenizer(str, " ");
        System.out.println("입력받음 >> "+str);
        int a = Integer.parseInt(stn.nextToken());
        int b = Integer.parseInt(stn.nextToken());
        System.out.println(a+b);

    }
}
