import java.util.Scanner;

public class Q18_ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers:");

        for (int num = start; num <= end; num++) {
            int temp = num;
            int digits = 0;
            int sum = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int)Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == num)
                System.out.print(num + " ");
        }
    }
}