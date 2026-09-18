import java.util.Scanner;

public class Q09_PairWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.println("Pairs:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == target)
                    System.out.println("(" + a[i] + ", " + a[j] + ")");
            }
        }
    }
}