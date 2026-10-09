import java.util.*;
public class LC05_StepsToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int n = sc.nextInt(), steps = 0;
        while (n > 0) { n = n % 2 == 0 ? n / 2 : n - 1; steps++; }
        System.out.println(steps);
    }
}
