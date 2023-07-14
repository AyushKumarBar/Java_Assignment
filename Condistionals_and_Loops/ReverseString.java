import java.util.Scanner;

public class ReverseString {

    String reverseString(String str) {

        String newStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            newStr = ch + newStr; // adds each character in front of the existing string
        }

        return newStr;
    }

    public static void main(String[] args) {

        ReverseString r = new ReverseString();
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println("Reversed String is : "+ r.reverseString(str));

    }
}
