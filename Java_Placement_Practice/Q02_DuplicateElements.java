import java.util.Scanner;

public class Q02_DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Repeated elements:");

        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}