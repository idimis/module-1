package com.adimas.exercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateDifference {
    public static void main(String[] args) {
        // Input: Define the two dates
        LocalDate date1 = LocalDate.of(2024, 3, 19);
        LocalDate date2 = LocalDate.of(2024, 3, 21);

        // Calculation: Difference between the two dates
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        // Output: Print the difference in days
        System.out.println("The difference between the dates is: " + daysBetween + " days");
    }
}

