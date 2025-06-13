package de.pandabrrito.rockpaperscissors.util;

import static de.pandabrrito.rockpaperscissors.App.scanner;

public class NumberValidator {

    public static int numberValidator(int min, int max) {
        do {
            try {
                int choice = scanner.nextInt();

                if (choice >= min && choice <= max) {
                    scanner.nextLine();
                    return choice;
                } else {
                    System.out.println("Please enter a valid number between " + min + " and " + max + ".");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                scanner.nextLine(); // Clear the invalid input
            }
        } while (true);
    }

}
