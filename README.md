DISCLAIMER: I'm sorry the chat pdf is so large. There are a lot of pages because chatgpt kept giving me unusable responses. The prompts where I ask for the "additional prompts" as requested in the assignment details are closer to the beginning/middle of the pdf. The program got too complicated near the end and unfortunately I was not able to implement the last feature "display the current time". However, I did prompt chatgpt to write that code. Please go easy on me if you can



Metric to Imperial Unit Converter
================================

This program allows users to convert various metric units to their corresponding imperial units. It provides a simple command-line interface where the user can select the type of conversion (length, weight, or volume) and enter the value to be converted.

Usage
-----
1. Run the program in a Java environment (JRE or JDK) to start the converter.
2. The program will display a menu of conversion options: Length, Weight, Volume, Time, and Exit.
3. Choose the desired conversion option by entering the corresponding number (1, 2, 3, 4, or 5).
4. If you select one of the conversion options (1, 2, 3, or 4), the program will prompt you to enter the value you wish to convert.
5. Enter a valid numeric value for conversion.
6. The program will display the converted value in the respective imperial unit (or appropriate time conversion).
7. If you want to convert another value for the same conversion type, you can choose to do so by entering 'yes' when prompted. Otherwise, choose 'no' to go back to the main menu.

Conversion Options
------------------
1. Convert Length (meters to feet):
   This option allows you to convert a length value in meters to its equivalent value in feet.

2. Convert Weight (kilograms to pounds):
   This option allows you to convert a weight value in kilograms to its equivalent value in pounds.

3. Convert Volume (liters to gallons):
   This option allows you to convert a volume value in liters to its equivalent value in gallons.

4. Convert 12hr time to 24hr time:
   This option allows you to convert 12hr time to 24hr military time.

6. Exit:
   Selecting this option will terminate the program and exit the converter.

Input Validation
----------------
The program performs input validation to ensure that the user enters valid numeric values for conversion. If the user enters an invalid input (e.g., non-numeric characters), the program will display an error message and prompt the user to re-enter a valid value.

Supported Units and Conversion Factors
--------------------------------------
1 meter (m)        = 3.28084 feet (ft)
1 kilogram (kg)    = 2.20462 pounds (lbs)
1 liter (L)        = 0.264172 gallons (gal)
time in 12-hour format (hh:mm am/pm)

Modularity and Extensibility
----------------------------
The program follows the principles of modularity and extensibility by organizing each conversion type into separate classes. Adding new conversion types in the future is straightforward. To add a new conversion, simply create a new class that implements the 'Converter' interface and provides the conversion logic for the new type.

Open/Closed Principle (OCP) and Interface Segregation Principle (ISP)
--------------------------------------------------------------------
The program adheres to the OCP and ISP principles. The 'MetricToImperialConverter' class is closed for modification and open for extension, enabling easy addition of new conversion types without modifying existing code. The 'Converter' interface follows the ISP by providing a specific method ('convert()') for each conversion type, promoting clean and minimal interfaces.


Author
------
This program was developed by [ChatGPT].
