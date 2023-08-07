public class MetricToImperialConverterTest {

    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        testMetersToFeet();
        testKilogramsToPounds();
        testLitersToGallons();
    }

    public static void testMetersToFeet() {
        System.out.println("Testing metersToFeet() method...");

        double meters = 10.0;
        double expectedFeet = 32.8084;
        double actualFeet = MetricToImperialConverter.metersToFeet(meters);

        System.out.println(meters + " meters should be approximately " + expectedFeet + " feet.");
        System.out.println("Actual result: " + actualFeet);
        System.out.println("Test passed: " + (Math.abs(actualFeet - expectedFeet) < 0.001));
    }

    public static void testKilogramsToPounds() {
        System.out.println("Testing kilogramsToPounds() method...");

        double kilograms = 50.0;
        double expectedPounds = 110.231;
        double actualPounds = MetricToImperialConverter.kilogramsToPounds(kilograms);

        System.out.println(kilograms + " kilograms should be approximately " + expectedPounds + " pounds.");
        System.out.println("Actual result: " + actualPounds);
        System.out.println("Test passed: " + (Math.abs(actualPounds - expectedPounds) < 0.001));
    }

    public static void testLitersToGallons() {
        System.out.println("Testing litersToGallons() method...");

        double liters = 20.0;
        double expectedGallons = 5.28344;
        double actualGallons = MetricToImperialConverter.litersToGallons(liters);

        System.out.println(liters + " liters should be approximately " + expectedGallons + " gallons.");
        System.out.println("Actual result: " + actualGallons);
        System.out.println("Test passed: " + (Math.abs(actualGallons - expectedGallons) < 0.001));
    }
}
