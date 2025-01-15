import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[2];

        for(int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(a[0] * (a[1] % 10));
        int temp = a[1] / 10;
        System.out.println(a[0] * (temp % 10));
        temp = temp / 10;
        System.out.println(a[0] * (temp % 10));
        System.out.println(a[0] * a[1]);

        br.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
