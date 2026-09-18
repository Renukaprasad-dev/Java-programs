import java.util.Scanner;

public class Q01_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int largest = a[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }

        System.out.println("Second largest element: " + second);
    }
}