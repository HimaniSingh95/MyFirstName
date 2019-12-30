package Basics;

import jdk.swing.interop.SwingInterOpUtils;

public class ClassWorkString {
    public static void main(String args[]){

        String myStatment="I am a good programmer";

        //int length=myStatment.length();
        //System.out.println("Length: " +length);
        //String LowerCase= myStatment.toLowerCase();
        //System.out.println(LowerCase);

        System.out.println(myStatment.length());
        System.out.println(myStatment.toLowerCase());
        System.out.println(myStatment.contains("mohammad"));
        System.out.println(myStatment.charAt(5));
        System.out.println(myStatment.equals("technsoft")); //for comparison
        System.out.println(myStatment.isEmpty());
        System.out.println(myStatment.startsWith("welcome"));
        System.out.println(myStatment.endsWith("goodbye"));
    }
}
