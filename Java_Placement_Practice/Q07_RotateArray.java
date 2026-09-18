import java.util.Scanner;

public class Q07_RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        k = k % n;

        System.out.println("Array after rotation:");

        for (int i = n - k; i < n; i++)
            System.out.print(a[i] + " ");

        for (int i = 0; i < n - k; i++)
            System.out.print(a[i] + " ");
    }
}