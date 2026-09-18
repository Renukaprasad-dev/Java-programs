import java.util.Scanner;

public class Q16_CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch))
                digits++;
            else if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            } else
                special++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
}