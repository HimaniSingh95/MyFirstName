package Basics;

public class SwitchEx {
    public static void main(String args[]){
        String months="Aug";

        switch(months){
            case "Dec":
               // System.out.println("December");
            case "Jan":
               // System.out.println("January");
            case "Feb":
                //System.out.println("February");
                System.out.println("Winters");
                break;

            case "March":
                //System.out.println("March");
            case "April":
                //System.out.println("April");
            case "May":
                //System.out.println("May");
                System.out.println("spring");
                break;

            case "June":
                //System.out.println("June");
            case "July":
                //System.out.println("July");
            case "Aug":
                //System.out.println("August");
                System.out.println("Summers");
                break;

            case "Sept":
                //System.out.println("Sept");
            case "Oct":
                //System.out.println("October");
            case "Nov":
                //System.out.println("November");
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Invalid");

        }
    }
}
