package Basics;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class StringEG {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("My name is: "+name);

        //   Person person =new Person();
        //  person.name="Himani";
        // System.out.println(person.name);
    }
}