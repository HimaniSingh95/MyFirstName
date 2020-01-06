package Homework5;

import java.util.Scanner;

public class CarModes {
    public static void main(String args[]){

        Scanner Mode=new Scanner(System.in);
        System.out.println("Enter car mode : ");
        String CarMode=Mode.next();

        switch(CarMode){
            case "P" :
            case "Parallel":
                System.out.println("Park between two cars.");
                break;

            case "D":
                System.out.println("You can put drive tpe to Snow type, Sport type or Regular type");
                break;

            case "N":
                System.out.println("You can put car in car wash station.");
                break;

            case "R":
                System.out.println("You can only reverse the car and car will activate the back camera.");
                break;

            default:
                System.out.println("Invalid mode type, Please check your car mode.");
        }
    }
}
