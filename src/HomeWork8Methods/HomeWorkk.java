package HomeWork8;

import java.util.*;

public class HomeWorkk {
    public static void main(String[] args) {
        Sum();
        MaxMark();
    }
    public static void Sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to get the sum : ");
        int num=sc.nextInt();
        int Sum=0;
        for (int i=0; i<=num; i++){
            Sum = Sum + i;
        }
        System.out.println("Sum is: " +Sum);
    }

    public static void MaxMark(){
        double[] sMarks={90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
        String[] sNames={"Happy", "Peace" , "Jesse", "Kaitlin", "Amir", "Donald", "Steven", "Vicky", "Hannah", "David", "Gia"};
        double MaxMarks=sMarks[0];
        String Name=sNames[0];
        for(int i=0; i<=sMarks.length-1; i++){
            if(sMarks[i]>sMarks[0]) {
                MaxMarks = sMarks[i];
                for(int j=0; j<=sNames.length-1; j++){
                    if(i == j ){
                        Name=sNames[j];
                    }
                }
            }
        }
        System.out.println(Name + " got the maximum marks.");
    }
}
