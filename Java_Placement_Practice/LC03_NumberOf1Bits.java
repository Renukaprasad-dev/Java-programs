import java.util.*;
public class LC03_NumberOf1Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int n = sc.nextInt(), count = 0;
        while (n != 0) { n &= n - 1; count++; }
        System.out.println(count);
    }
}
