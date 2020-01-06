package Homework5;
import java.util.*;

public class HomeWork {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = in.nextInt();
        int remainder = number/15;
            if(number % 15 == 0){
                System.out.println("Number is divisible.");
            }
            else{
                System.out.println("Remainder is : "+remainder);
            }

            String name = "Himani Singh";
                if(name.length() >8){
                    System.out.println(name.replace('a','A'));
                }
                else{
                    System.out.println(name.toUpperCase());
                }int[] a={1 ,2 ,4 ,7 ,6 };
        int b=(a[0] + a[1] + a[2] + a[3] + a[4]) / 5;
            if(b > 25){
                System.out.println(a);
             }
            else{
                 Collections.reverse(Arrays.asList(a));
                 System.out.println(Arrays.asList(a));
            }
        System.out.println(b);
    }
}
