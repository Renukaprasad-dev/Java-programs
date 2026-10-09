import java.util.*;
public class LC10_LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); String s = sc.nextLine().trim();
        if (s.isEmpty()) { System.out.println(0); return; }
        String[] a = s.split("\\s+"); System.out.println(a[a.length - 1].length());
    }
}
