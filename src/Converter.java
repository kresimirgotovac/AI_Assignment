import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
class Time12hrTo24hrConverter implements Converter {
    @Override
    public void convert(double value) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in 12-hour format (hh:mm am/pm): ");
        String inputTime = scanner.nextLine();
        String convertedTime = convert12HourTo24Hour(inputTime);
        System.out.println("Converted Time: " + convertedTime);
    }

    private String convert12HourTo24Hour(String inputTime) {
        DateFormat inputFormat = new SimpleDateFormat("hh:mm a", Locale.US);
        DateFormat outputFormat = new SimpleDateFormat("HH:mm", Locale.US);
        try {
            Date date = inputFormat.parse(inputTime);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid Time Format";
        }
    }
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