import java.util.*;
public class LC11_LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int n = Integer.parseInt(sc.nextLine().trim());
        String[] a = new String[n]; for (int i = 0; i < n; i++) a[i] = sc.nextLine();
        if (n == 0) { System.out.println(""); return; }
        String p = a[0];
        for (int i = 1; i < n; i++) {
            while (!a[i].startsWith(p)) { p = p.substring(0, p.length() - 1); if (p.isEmpty()) break; }
        }
        System.out.println(p);
    }
}
