import java.util.Scanner;

public class PerfectNumber {

    boolean isPerfectNumber(long n) {
        long sum = 0;

        int i = 1;

        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (sum == n) {
            return true;
        } else
            return false;
    }

    public static void main(String args[]) {
        PerfectNumber p = new PerfectNumber();
        long n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextLong();
        sc.close();
        if (p.isPerfectNumber(n)) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It's not a perfect number");
        }
    }
}