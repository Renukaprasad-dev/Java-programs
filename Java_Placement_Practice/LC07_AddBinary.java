import java.util.*;
public class LC07_AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); String a = sc.next(), b = sc.next();
        int i = a.length() - 1, j = b.length() - 1, carry = 0; StringBuilder out = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry + (i >= 0 ? a.charAt(i--) - '0' : 0) + (j >= 0 ? b.charAt(j--) - '0' : 0);
            out.append(sum % 2); carry = sum / 2;
        }
        System.out.println(out.reverse());
    }
}
