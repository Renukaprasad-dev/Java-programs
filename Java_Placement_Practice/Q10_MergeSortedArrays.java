import java.util.Scanner;

public class Q10_MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        System.out.println("Enter second sorted array:");
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        int i = 0, j = 0;

        System.out.println("Merged array:");

        while (i < n && j < m) {
            if (a[i] < b[j])
                System.out.print(a[i++] + " ");
            else
                System.out.print(b[j++] + " ");
        }

        while (i < n)
            System.out.print(a[i++] + " ");

        while (j < m)
            System.out.print(b[j++] + " ");
    }
}