package com.adimas.exercise;
import java.util.Scanner;
public class Triangle {

    public static void hitung() {
        // Create a Scanner object for taking inputs
        Scanner scanner = new Scanner(System.in);

        // Input: Get the first two angles from the user
        System.out.print("Enter the first angle of the triangle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter the second angle of the triangle: ");
        int angle2 = scanner.nextInt();

        // Calculation: Third angle
        int angle3 = 180 - (angle1 + angle2);

        // Output: Print the third angle
        System.out.println("The third angle of the triangle is: " + angle3);
    }
}

