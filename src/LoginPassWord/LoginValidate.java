package LoginPassWord;

import java.util.Scanner;

public class LoginValidate {
    public static void main(String[] args) {
        Scanner Login = new Scanner(System.in);
        System.out.println("Enter the User Name : ");
        String UserName = Login.nextLine();
        System.out.println("Enter the Password : ");
        String Password = Login.nextLine();

        String ExpectedUserName = "HimaniSingh";
        String ExpectedPassword = "technosoft";

        if(ExpectedUserName.equals(UserName) && ExpectedPassword.equals(Password)){
                System.out.println("Welcome to Home Page");
        }
        else {
            for (int i = 0; i <= 10; i++) {
                if (!ExpectedUserName.equals(UserName) && !ExpectedPassword.equals(Password)) {
                    int count = 10 - i;
                    System.out.println("You have left " + count + "tries.");
                    System.out.println("Enter valid UserName & Password");
                    UserName = Login.nextLine();
                    Password = Login.nextLine();
                    if (i == 9) {
                        System.out.println("Your account will be locked for 15 min.");
                    }
                }
                else if (!ExpectedUserName.equals(UserName) && ExpectedPassword.equals(Password)) {
                    int countUser = 10 - i;
                    System.out.println("You have left with "+ countUser + " tries.");
                    System.out.println("Enter Valid UserName");
                    UserName = Login.nextLine();
                    if (i == 9) {
                        System.out.println("Your account will be locked for 15 min");
                    }
                }
                else if (ExpectedUserName.equals(UserName) && !ExpectedPassword.equals(Password)) {
                    int countPassword = 10 - i;
                    System.out.println("You have left with "+countPassword+ " tries.");
                    System.out.println("Enter valid Password");
                    Password = Login.nextLine();
                    if (i == 9) {
                        System.out.println("Your account will be locked for 15 min");
                    }
                }
                else{
                    System.out.println("Welcome to Home Page.");
                    break;
                }
            }
        }
    }
}

