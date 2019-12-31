package Homework4;
import java.util.Scanner;

public class Convert {
    public static void main(String args[]){

        System.out.println("Enter 1 for Celsius to Kelvin.");
        System.out.println("Enter 2 for Celsius to Fahrenheit.");
        System.out.println("Enter 3 for Kelvin to Celsius.");
        System.out.println("Enter 4 for Kelvin to Fahrenheit.");
        System.out.println(" ");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=in.nextInt();

        Scanner temp = new Scanner(System.in);

            if(number==1){
                 System.out.print("Enter temp in Celsius : ");
                 double C=temp.nextDouble();
                 double K=C+273.15;
                 System.out.print("Temp in Kelvin is : " +K);
            }
            else if(number==2){
                System.out.print("Enter temp in Celsius : ");
                double C=temp.nextDouble();
                double F=(C * 9/5) + 32;
                System.out.print("Temp in Fahrenheit is : "+F);
            }
            else if(number==3){
                System.out.print("Enter temp in Kelvin : ");
                double K=temp.nextDouble();
                double C=K-273.15;
                System.out.print("Temp in Celsius is : "+C);
            }
            else if(number==4){
                System.out.print("Enter temp in Kelvin : ");
                double K=temp.nextDouble();
                double F=(K - 273.15) * 9/5  + 32;
                System.out.print("Temp in Fahrenheit is : "+F);
            }
            else{
                System.out.println("Entered invalid number.");
            }
    }
}
