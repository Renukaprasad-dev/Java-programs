import java.util.Scanner;

public class Q05_MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int[] a = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++)
            a[i] = sc.nextInt();

        int sum = n * (n + 1) / 2;

        for (int i = 0; i < n - 1; i++)
            sum -= a[i];

        System.out.println("Missing number: " + sum);
    }
}