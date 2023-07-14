import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

    boolean isArmstrong(int n) {

        int temp, digits = 0, last = 0, sum = 0;
        temp = n;

        // To count the number of digits
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = n;

        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }

        if (n == sum)
            return true;

        return false;
    }

    public static void main(String[] args) {

        Armstrong a = new Armstrong();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        sc.close();

        if (a.isArmstrong(n)) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }

    }

}