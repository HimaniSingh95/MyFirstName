package Homework1;
import java.util.*;

public class NameInitials {
    public static void main(String args[]){
        Scanner i=new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String First=i.next();
        System.out.println("Enter your last name: ");
        String Last=i.next();

        String initials=First.substring(0,1) +"."+ Last.substring(0,1);
        System.out.println(initials);
    }
}
