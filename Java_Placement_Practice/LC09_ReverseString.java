import java.util.*;
public class LC09_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); char[] a = sc.nextLine().toCharArray();
        int i = 0, j = a.length - 1;
        while (i < j) { char t = a[i]; a[i++] = a[j]; a[j--] = t; }
        System.out.println(new String(a));
    }
}
