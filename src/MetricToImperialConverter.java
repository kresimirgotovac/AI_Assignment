import java.util.InputMismatchException;
import java.util.Scanner;

public class MetricToImperialConverter {
    // Define constants for the magic strings
    private static final String YES_OPTION = "yes";
    private static final String NO_OPTION = "no";

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

            Converter converter;
            switch (choice) {
                case 1:
                    converter = new LengthConverter();
                    break;
                case 2:
                    converter = new WeightConverter();
                    break;
                case 3:
                    converter = new VolumeConverter();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    continue;
            }

            double value;
            while (true) {
                value = getValidDoubleInput(scanner, "Enter the value to convert: ");
                converter.convert(value);

                System.out.print("Do you want to convert another value for this type? (" + YES_OPTION + "/" + NO_OPTION + "): ");
                scanner.nextLine(); // Clear the input buffer
                String anotherConversion = scanner.nextLine().toLowerCase();

                if (!anotherConversion.equals(YES_OPTION)) {
                    break;
                }
            }
        }

        scanner.close();
    }

    /**
     * Displays the conversion options menu and prompts the user to select an option.
     *
     * @param scanner The Scanner object to read user input.
     * @return The user's selected conversion option.
     */
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
    /**
     * Converts a length value from meters to feet.
     *
     * @param meters The length value in meters to be converted.
     * @return The converted length value in feet.
     */
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }
    /**
     * Converts a weight value from kilograms to pounds.
     *
     * @param kilograms The weight value in kilograms to be converted.
     * @return The converted weight value in pounds.
     */
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    /**
     * Converts a volume value from liters to gallons.
     *
     * @param liters The volume value in liters to be converted.
     * @return The converted volume value in gallons.
     */

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }
}



