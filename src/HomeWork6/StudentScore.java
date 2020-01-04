package HomeWork6;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner StudentScore=new Scanner(System.in);
        System.out.println("Enter the score : ");
        int score = StudentScore.nextInt();
        int percent = (score*100)/100 ;

        if(score >= 90 && score <= 100 ){
            System.out.println("You got A (" +percent+ "%).");
        }
        else if(score >= 80 && score <= 89){
            System.out.println("You got B (" +percent+ "%).");
        }
        else if(score >= 70 && score <= 79){
            System.out.println("You got C (" +percent+ "%).");
        }
        else if(score >= 60 && score <= 69){
            System.out.println("You got D (" +percent+ "%).");
        }
        else if(score >= 50 && score <= 59){
            System.out.println("You got E (" +percent+ "%).");
        }
        else if(score <= 49){
            System.out.println("You got F. Try again.");
        }
        else{
            System.out.println("Entered score is invalid.");
        }
    }
}
