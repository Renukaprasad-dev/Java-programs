import java.util.Scanner;

public class Q19_PrimeNumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        int count = 0;

        System.out.println("Prime numbers:");

        for (int num = start; num <= end; num++) {
            boolean prime = true;

            if (num < 2)
                prime = false;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println("\nCount: " + count);
    }
}