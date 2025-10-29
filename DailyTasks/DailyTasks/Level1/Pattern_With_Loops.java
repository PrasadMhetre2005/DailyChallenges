package DailyTasks.Level1;

import java.util.Scanner;
// Task 2: Generate and print number patterns using loops and switch-case
// Author: <Your Name>
// Internship: Cognify
// Date: 2025-10-27

import java.util.Scanner;

public class Pattern_With_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, rows;

        System.out.println("====================================");
        System.out.println("   🎯 NUMBER PATTERN GENERATOR");
        System.out.println("====================================");
        System.out.println("Choose a pattern to generate:");
        System.out.println("1. Right-Angled Triangle");
        System.out.println("2. Inverted Triangle");
        System.out.println("3. Number Pyramid");
        System.out.println("4. Inverted Pyramid");
        System.out.println("5. Floyd’s Triangle");
        System.out.println("6. Exit");
        System.out.println("====================================");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice != 6) {
            System.out.print("Enter the number of rows: ");
            rows = sc.nextInt();
        } else {
            rows = 0;
        }

        System.out.println("\n📊 Generated Pattern:\n");

        switch (choice) {
            case 1:
                // Right-angled triangle
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Inverted triangle
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                // Number Pyramid
                for (int i = 1; i <= rows; i++) {
                    for (int s = i; s < rows; s++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

            case 4:
                // Inverted Pyramid
                for (int i = rows; i >= 1; i--) {
                    for (int s = i; s < rows; s++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

            case 5:
                // Floyd's Triangle
                int num = 1;
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(num + " ");
                        num++;
                    }
                    System.out.println();
                }
                break;

            case 6:
                System.out.println("👋 Exiting program. Thank you!");
                break;

            default:
                System.out.println("❌ Invalid choice! Please try again.");
        }

        sc.close();
    }
}

