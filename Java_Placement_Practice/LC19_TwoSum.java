import java.util.*;
public class LC19_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int target = sc.nextInt(); Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int need = target - a[i];
            if (seen.containsKey(need)) { System.out.println("Indices: " + seen.get(need) + " " + i); return; }
            seen.put(a[i], i);
        }
        System.out.println("No solution");
    }
}
