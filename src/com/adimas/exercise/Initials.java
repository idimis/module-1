package com.adimas.exercise;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        // Create a Scanner object for taking inputs
        Scanner scanner = new Scanner(System.in);

        // Input: Get the full name from the user
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Split the name into parts
        String[] nameParts = fullName.split(" ");

        // Get the first character of each part and convert it to uppercase
        String initials = "";
        for (String part : nameParts) {
            initials += part.charAt(0);
        }

        // Output: Print the initials in uppercase
        System.out.println("Your initials are: " + initials.toUpperCase());
    }
}
