package HomeWork8;
import java.util.*;

public class HomeWorkArrays {
    public static void main(String arg[]){
        arr();
        ArrSum();
        MaxMin();
//        sort();
//        HomeWorkStrings.abc();
    }

    public static void arr() {
        int Arr[] = {25, 15, 3, 2, 40};
        String rev = "";
        System.out.print("Reverse of given array is: ");
        for (int i = Arr.length - 1; i >= 0; i--) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void ArrSum() {
        int array[] = {20, 10, 40, 44};
        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of given array is: " + sum);
        double average = sum / array.length - 1;
        System.out.println("Average of a given array is: " + average);
    }

    public static void MaxMin(){
        int ar[]={20, 10, 40, 44, 32};
        int max=ar[0];
        int min=ar[0];
        for(int j=0; j<=ar.length-1; j++){
            if(ar[j]>ar[0]){
                max=ar[j];
            }
        }
        for(int k=0; k<=ar.length-1; k++){
            if(ar[k]<ar[0]){
                min=ar[k];
            }
        }
        System.out.println("Maximum number in the given array is: " +max);
        System.out.println("Minimum number in the given array is: " +min);
    }

    public static void sort(){
        int[] a={20, 10, 40, 44};
        int arr=0;
        for(int i=0; i<=a.length; i++){
            if(a[i]<a[i+1]){
                arr = arr + a[i];
            }
            else{
                arr = arr + a[i+1];
            }
        }
        System.out.println(arr);
    }
}
