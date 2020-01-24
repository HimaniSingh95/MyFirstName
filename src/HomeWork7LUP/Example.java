package LoginPassWord;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Tell user to enter password
        System.out.println("Please enter your password");
        //takes input from console and storing the value into actualPassword variable
        String actualPassword = scan.nextLine();
        //setting expected password which is associated with user account details in database
        String expectedPassword = "technosoft";
        //Creating for loop to give user max tries to enter valid password and log the user to system if
        //correct password is entered
        for (int i = 0; i < 10; i++) {
            //checking if actual password is not equal to expected password
            if (!actualPassword.equals(expectedPassword)) {
                //subtracting the count by iteration so user will have less tries (-1 every miss tries)
                int count = 10 - i;
                //console message to user to enter valid password
                System.out.println("Please enter the valid password");
                //console message to let user know how many more tries he has left with
                System.out.println("You have " + count + " more tries");
                //letting user to update the actualPassword value with new input from console
                actualPassword = scan.nextLine();
                //if count equals to 9, then notifying user with custom message
                if (i == 9) {
                    System.out.println("Your account will be locked for 15 min");
                }
            } else {
                // if any point in the loop user enters correct password then system let user into home page
                System.out.println("Welcome to home page");
                break;
            }
        }
    }
}

