import java.util.Scanner;

public class Q20_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }

        int[] binary = new int[32];
        int i = 0;

        while (num > 0) {
            binary[i++] = num % 2;
            num /= 2;
        }

        System.out.print("Binary: ");
        for (i--; i >= 0; i--)
            System.out.print(binary[i]);
    }
}