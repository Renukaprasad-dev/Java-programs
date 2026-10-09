import java.util.*;
public class LC14_ReversePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); String s = sc.nextLine(); char c = sc.nextLine().charAt(0);
        int k = s.indexOf(c);
        if (k >= 0) { StringBuilder b = new StringBuilder(s.substring(0, k + 1)).reverse(); b.append(s.substring(k + 1)); System.out.println(b); }
        else System.out.println(s);
    }
}
