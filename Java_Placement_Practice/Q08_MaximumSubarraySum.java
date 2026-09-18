import java.util.Scanner;

public class Q08_MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int sum = a[0];
        int max = a[0];

        for (int i = 1; i < n; i++) {
            sum = Math.max(a[i], sum + a[i]);
            max = Math.max(max, sum);
        }

        System.out.println("Maximum Subarray Sum: " + max);
    }
}