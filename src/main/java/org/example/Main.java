package org.example; //DO NOT DELETE
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of gallons: ");

        double gallons = input.nextInt();

        System.out.println("In " + gallons + " gallons there are: ");
        System.out.println(4*gallons + " quarts");
        System.out.println(4*2*gallons + " pints");
        System.out.println(4*2*2*gallons + " cups");
        System.out.println(4*2*2*16*gallons + " tablespoons");
    }
}