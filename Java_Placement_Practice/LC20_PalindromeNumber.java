import java.util.*;
public class LC20_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int n = sc.nextInt();
        if (n < 0) { System.out.println("false"); return; }
        int x = n; long rev = 0;
        while (x > 0) { rev = rev * 10 + x % 10; x /= 10; }
        System.out.println(rev == n);
    }
}
