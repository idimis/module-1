package com.adimas.exercise;

import java.util.Scanner;

public class Rectangle {
    public static void calculated() {
        // Create a Scanner object for taking inputs
        Scanner scanner = new Scanner(System.in);

        // Input: Get the length and width from the user
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        // Calculation: Area of the rectangle
        int area = length * width;

        // Output: Print the area
        System.out.println("The area of the rectangle is: " + area);
    }
}


