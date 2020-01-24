package ClassTest;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("\n Question 1: ");
        MissingElement();

        System.out.println("\n\n Question 2: ");
        RemoveElement(24);

        System.out.println("\n\n Question 3: ");
        TrafficTicket(80.0);
    }

    public static void MissingElement(){
//        int[] array1={1,3,5,4,2,7};
//        int[] array2={-1, -3, 4, 2};
        int[] array={0, 5, -1, 1, 2, 4, 5, 6, 7, 1, 2};
        int max=array[0];
        int num=0;
        for(int i=0; i<=array.length-1; i++){
            if(array[i]>max){
                max=array[i];
            }
            for(int j=1; j<=max; j++){
                if(array[i] != j){
                    num=j;
                }
            }
        }
        System.out.println(num);
    }
    
    public static void RemoveElement(int Element){
        int[] OrgArray={32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        System.out.print("New Array: ");
        for(int i=0; i<=OrgArray.length-1; i++){
            if(OrgArray[i]!=Element){
                System.out.print(OrgArray[i] + " ");
            }
        }
    }

    public static void TrafficTicket(Double UserSpeed) {
        int SpeedLimit = 70;
        int points = 0;
        if (UserSpeed == SpeedLimit) {
            System.out.println("\n No points deducted.");
        }
        else {
            for (int i = 71; i <= UserSpeed; i=i+5) {
                points++;
            }
            if (points >= 12) {
                System.out.println("\n Your Points are more than 12. So, Your license is suspended");
            }
            System.out.println("Your Points are: " + points);
        }
    }
}

