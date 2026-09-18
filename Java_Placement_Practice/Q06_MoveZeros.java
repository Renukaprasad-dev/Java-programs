import java.util.Scanner;

public class Q06_MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                a[index++] = a[i];
        }

        while (index < n)
            a[index++] = 0;

        System.out.println("Array after moving zeros to the end:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}