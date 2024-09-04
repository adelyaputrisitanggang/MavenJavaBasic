package org.automation;

import java.util.Scanner; // Import for user input

public class Practical_Assessment_1 {
    // Instance of Scanner to read user input
    private final Scanner scanner = new Scanner(System.in);

    // Display Menu
    public static void displayMenu() {
        System.out.println("Shape Drawing Program");
        System.out.println("Menu");
        System.out.println("1. Right-Angled Triangle");
        System.out.println("2. Isosceles Triangle");
        System.out.println("3. Square");
        System.out.println("4. Rectangle");
        System.out.println("5. Diamond");
        System.out.println("5. Exit");
    }

    // Draw shape based on user selection
    public void drawShape(int menu) {
        switch (menu) {
            case 1:
                System.out.println("Right-Angled Triangle");
                System.out.print("Height: ");
                int height = scanner.nextInt();
                drawRightTriangle(height);
                break;
            case 2:
                System.out.println("Isosceles Triangle");
                System.out.print("Height: ");
                int height2 = scanner.nextInt();
                drawIsoscelesTriangle(height2);
                break;
            case 3:
                System.out.println("Square");
                System.out.print("Height: ");
                int height3 = scanner.nextInt();
                drawSquare(height3);
                break;
            case 4:
                System.out.println("Rectangle");
                System.out.print("Width: ");
                System.out.print("Height: ");
                int height4 = scanner.nextInt();
                int width = scanner.nextInt();
                drawRectangle(width, height4);
                break;
            case 5:
                System.out.println("Diamond");
                System.out.println("Height:");
                int height5 = scanner.nextInt();
                drawDiamond(height5);
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid menu option. Please try again.");
        }
    }

    // Draw an Isosceles Triangle
    public void drawIsoscelesTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" "); // Print spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }
    }

    // Draw a Right-Angled Triangle
    public void drawRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }
    }

    // Draw a Square
    public void drawSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }
    }

    // Draw a Rectangle
    public void drawRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }
    }
    // Draw a Diamond
    public void drawDiamond(int height) {
        // Draw the upper part of the diamond
        for (int i = 1; i <= height; i++) {
            // Print leading spaces
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Draw the lower part of the diamond
        for (int i = height - 1; i > 0; i--) {
            // Print leading spaces
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Run the shape drawer program
    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Please select an option: ");
            int menu = scanner.nextInt();
            drawShape(menu);
            System.out.println();
        }
    }

    // Main method to start the program
    public static void main(String[] args) {
        Practical_Assessment_1 drawer = new Practical_Assessment_1();
        drawer.run();
    }
}
