package org.example;

import java.util.Scanner;

public class RoadAccidentTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize accident counts for each city and vehicle type
        int[][] accidentCounts = {
                {155, 121}, // Cape Town: Car, Motorbike
                {178, 145}, // Johannesburg: Car, Motorbike
                {112, 89}  // Port Elizabeth: Car, Motorbike
        };

        // Prompt user for input
        System.out.println("Enter the city (Cape Town, Johannesburg, or Port Elizabeth):");
        String city = scanner.nextLine();
        System.out.println("Enter the number of car accidents:");
        int carAccidents = scanner.nextInt();
        System.out.println("Enter the number of motorbike accidents:");
        int motorbikeAccidents = scanner.nextInt();

        // Update accident counts based on input
        if (city.equalsIgnoreCase("Cape Town")) {
            accidentCounts[0][0] += carAccidents;
            accidentCounts[0][1] += motorbikeAccidents;
        } else if (city.equalsIgnoreCase("Johannesburg")) {
            accidentCounts[1][0] += carAccidents;
            accidentCounts[1][1] += motorbikeAccidents;
        } else if (city.equalsIgnoreCase("Port Elizabeth")) {
            accidentCounts[2][0] += carAccidents;
            accidentCounts[2][1] += motorbikeAccidents;
        } else {
            System.out.println("Invalid city. Please enter Cape Town, Johannesburg, or Port Elizabeth.");
            return;
        }

        // Display the updated accident counts
        System.out.println("\nRoad Accident Report:");
        System.out.println("----------------------");
        System.out.println("City\tCar\tMotorbike");
        System.out.println("----------------------");
        for (int i = 0; i < accidentCounts.length; i++) {
            System.out.println(getCityName(i) + accidentCounts[i][0] + accidentCounts[i][1]);
        }
    }

    private static String getCityName(int index) {
        switch (index) {
            case 0:
                return "Cape Town";
            case 1:
                return "Johannesburg";
            case 2:
                return "Port Elizabeth";
            default:
                return "Invalid city index";
        }
    }
}