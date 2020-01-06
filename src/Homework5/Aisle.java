package Homework5;
import java.util.*;
import java.util.function.DoubleToIntFunction;

public class Aisle {
    public static void main(String args[]){
        Scanner name = new Scanner(System.in);
        System.out.print("Enter product name : ");
        String Aisle=name.next();

        switch(Aisle){
            case "Milk":
            case "Eggs":
            case "Donuts":
                System.out.println("Product is in Aisle 8 ");
                break;
            case "Fries":
            case "Pizza":
                System.out.println("product is in Aisle 7 ");
                break;
            case "Candy":
                System.out.println("Product is in Aisle 3 ");
                break;
            case "Apple":
            case "orange":
                System.out.println("Product is in Aisle 2 ");
                break;
            case "Diapers":
                System.out.println("Product is in Aisle 1");
                break;
            default :
                System.out.println("Product is out of Stock");
        }
    }
}
