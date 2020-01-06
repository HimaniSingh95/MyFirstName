package Homework5;

public class Vegan {
    public static void main(String args[]){
        boolean isGuestOneVegan=true;
        boolean isGuestTwoVegan=true;

        if(isGuestOneVegan && isGuestTwoVegan ){
            System.out.println("Offer only vegan menu.");
        }
        else if(isGuestOneVegan || isGuestTwoVegan){
            System.out.println("offer some vegan dishes in the menu.");
        }
        else{
            System.out.println("offer any menu.");
        }
    }
}
