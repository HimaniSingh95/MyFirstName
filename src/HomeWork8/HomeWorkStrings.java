package HomeWork8;

import java.util.*;

public class HomeWorkStrings {
    public static void main(String[] args) {
        Rev();
        Abbreviation();
    }

    public static void Rev() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse of given string is: " + reverse);
    }

    public static void Abbreviation() {
        String str = "Happy New Year";
        System.out.print("Abbreviation of the string is: ");
        System.out.print(str.charAt(0) + " ");
        for (int i = 0; i <= str.length() - 1; i++) {
            if(str.charAt(i)==' '){
                System.out.print(str.charAt(i+1) + " ");
            }
        }
    }
}
