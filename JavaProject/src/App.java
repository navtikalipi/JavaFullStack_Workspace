import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.print("Enter number to be checked:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (rev == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
