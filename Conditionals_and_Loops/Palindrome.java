import java.util.Scanner;

public class Palindrome {

    boolean palindrome(int n) {
            int temp = n;
        int sum = 0;

        while (temp > 0) {

            sum = (sum*10) +(temp % 10);
            temp /= 10;
        }

        if(sum == n) return true;

        return false;

    }

    public static void main(String[] args) {

        Palindrome p = new Palindrome();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        if (p.palindrome(n)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }

    }
}