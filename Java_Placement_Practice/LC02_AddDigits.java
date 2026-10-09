import java.util.*;
public class LC02_AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); long n = Math.abs(sc.nextLong());
        while (n >= 10) { long sum = 0; while (n > 0) { sum += n % 10; n /= 10; } n = sum; }
        System.out.println(n);
    }
}
