import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // BufferedWriter는 String만 출력 가능
        // 이럴 땐 형변환 때문에 BufferedReader + Sysout 조합이 낫다.
        System.out.println(a * b);

        br.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
