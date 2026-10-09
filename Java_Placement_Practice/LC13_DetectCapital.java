import java.util.*;
public class LC13_DetectCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); String s = sc.nextLine();
        System.out.println(s.equals(s.toUpperCase()) || s.equals(s.toLowerCase()) ||
            (!s.isEmpty() && Character.isUpperCase(s.charAt(0)) && s.substring(1).equals(s.substring(1).toLowerCase())));
    }
}
