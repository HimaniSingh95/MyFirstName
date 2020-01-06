package Homework5;
import java.util.*;

public class DivideArray {
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
            }


        int[] a={1 ,2 ,4 ,7 ,6 };
        int b=(a[0] + a[1] + a[2] + a[3] + a[4]) / 5;
            if(b > 25){
                for(int i=0; i<=a.length-1; i++){
                    System.out.println(a[i]);
                }
            }
            else{
                for(int i=a.length-1; i>=0; i--){
                    System.out.print(a[i] + " ");
                }
            }


    }
}
