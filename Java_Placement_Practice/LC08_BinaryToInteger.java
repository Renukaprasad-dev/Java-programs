import java.util.*;
public class LC08_BinaryToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); String s = sc.nextLine().trim(); long n = 0;
        for (char c : s.toCharArray()) { if (c != '0' && c != '1') { System.out.println("Invalid binary"); return; } n = n * 2 + (c - '0'); }
        System.out.println(n);
    }
}
