import java.util.*;
public class LC16_GoalParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); String s = sc.nextLine();
        System.out.println(s.replace("()", "o").replace("(al)", "al"));
    }
}
