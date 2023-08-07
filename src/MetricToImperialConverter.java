import java.util.InputMismatchException;
import java.util.Scanner;

public class MetricToImperialConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Metric to Imperial Unit Converter!");

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Convert Length (meters to feet)");
            System.out.println("2. Convert Weight (kilograms to pounds)");
            System.out.println("3. Convert Volume (liters to gallons)");
            System.out.println("4. Exit");

            int choice = getValidChoice(scanner);

            if (choice == 4) {
                System.out.println("Exiting the converter. Goodbye!");
                break;
            }

            double value;
            double convertedValue;

            while (true) {
                try {
                    value = getValidDoubleInput(scanner, "Enter the value to convert: ");
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // Clear the input buffer
                }
            }

            switch (choice) {
                case 1:
                    convertedValue = metersToFeet(value);
                    System.out.println(value + " meters is equal to " + convertedValue + " feet.");
                    break;
                case 2:
                    convertedValue = kilogramsToPounds(value);
                    System.out.println(value + " kilograms is equal to " + convertedValue + " pounds.");
                    break;
                case 3:
                    convertedValue = litersToGallons(value);
                    System.out.println(value + " liters is equal to " + convertedValue + " gallons.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        scanner.close();
    }

    private static int getValidChoice(Scanner scanner) {
        int choice = 0;
        while (true) {
            try {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please choose a valid option (1-4).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1-4).");
                scanner.nextLine(); // Clear the input buffer
            }
        }
        return choice;
    }

    private static double getValidDoubleInput(Scanner scanner, String prompt) {
        double value = 0;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
        return value;
    }
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }
}

