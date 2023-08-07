import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The MetricToImperialConverter class allows users to convert various metric units to their corresponding imperial units.
 */
public class MetricToImperialConverter {
    /**
     * The main method is the entry point of the Metric to Imperial Unit Converter program.
     *
     * @param args The command-line arguments (not used in this program).
     */
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
                try {
                    value = getValidDoubleInput(scanner, "Enter the value to convert: ");
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // Clear the input buffer
                }
            }

            converter.convert(value);
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

/**
 * The Converter interface defines a common contract for all conversion types.
 */
interface Converter {
    /**
     * Converts the input value and displays the result of the conversion.
     *
     * @param value The value to be converted.
     */
    void convert(double value);
}
/**
 * The LengthConverter class converts length values from meters to feet.
 */
class LengthConverter implements Converter {
    /**
     * Converts a length value from meters to feet and displays the result.
     *
     * @param meters The length value in meters to be converted.
     */
    public void convert(double meters) {
        double feet = metersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }

    private double metersToFeet(double meters) {
        return meters * 3.28084;
    }
}
/**
 * The WeightConverter class converts weight values from kilograms to pounds.
 */
class WeightConverter implements Converter {
    /**
     * Converts a weight value from kilograms to pounds and displays the result.
     *
     * @param kilograms The weight value in kilograms to be converted.
     */

    public void convert(double kilograms) {
        double pounds = kilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds.");
    }

    private double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
}
/**
 * The VolumeConverter class converts volume values from liters to gallons.
 */
class VolumeConverter implements Converter {
    /**
     * Converts a volume value from liters to gallons and displays the result.
     *
     * @param liters The volume value in liters to be converted.
     */
    public void convert(double liters) {
        double gallons = litersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallons + " gallons.");
    }

    private double litersToGallons(double liters) {
        return liters * 0.264172;
    }
}

