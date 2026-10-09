import java.util.*;
public class LC12_ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); String s = sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0, j = s.length() - 1;
        while (i < j) if (s.charAt(i++) != s.charAt(j--)) { System.out.println("false"); return; }
        System.out.println("true");
    }
}
