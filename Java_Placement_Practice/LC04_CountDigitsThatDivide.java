import java.util.*;
public class LC04_CountDigitsThatDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int n = sc.nextInt(), x = Math.abs(n), count = 0;
        if (x == 0) { System.out.println(0); return; }
        int t = x;
        while (t > 0) { int d = t % 10; if (d != 0 && x % d == 0) count++; t /= 10; }
        System.out.println(count);
    }
}
