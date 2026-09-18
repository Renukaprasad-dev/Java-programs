import java.util.Scanner;

public class Q04_ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Element frequencies:");

        for (int i = 0; i < n; i++) {
            boolean counted = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    counted = true;
                    break;
                }
            }

            if (counted)
                continue;

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j])
                    count++;
            }

            System.out.println(a[i] + " occurs " + count + " times");
        }
    }
}