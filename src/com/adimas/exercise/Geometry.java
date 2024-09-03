package com.adimas.exercise;


import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        // Create a Scanner object for taking inputs
        Scanner scanner = new Scanner(System.in);

        // Input: Get the radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculation: Diameter, Circumference, and Area
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Output: Print the diameter, circumference, and area
        System.out.println("The diameter of the circle is: " + diameter);
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("The area of the circle is: " + area);
    }
}
