import java.util.*;
public class LC06_CommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int a = sc.nextInt(), b = sc.nextInt(), count = 0;
        int m = Math.min(Math.abs(a), Math.abs(b));
        for (int i = 1; i <= m; i++) if (a % i == 0 && b % i == 0) count++;
        System.out.println(count);
    }
}
