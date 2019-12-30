package Basics;

public class ArraysEg {
    public static void main(String args[]) {
        String[] laptops={"apple", "sony", "hp", "acer"};

        String[] cars = new String[5];
        cars[0] = "Tesla";
        cars[1] = "Honda";
        cars[2] = "Kia";
        cars[3] = "Audi";
        cars[4] = "BMW";

        int size = cars.length;
        System.out.println("The length of array is: " + size);
        System.out.println("Length of array is: "+laptops.length);
        System.out.println(laptops);

        boolean isEqual=cars[4].equals("BMW");
        boolean isEQUAL=cars[4].equals("Bmw");
        System.out.println(isEqual);
        System.out.println(isEQUAL);


    }
}

