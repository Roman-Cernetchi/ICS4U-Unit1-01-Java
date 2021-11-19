/*
 * This program calculates the amount of logs than can be put in a truck
 *
 * @author  Roman Cernetchi
 * @version 1.0
 * @since   2021-11-18
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* This class calculates the maximum amount of logs that a truck can carry.
*/
final class Log {

    /**
    * Prevents instantiation.
    * Throw an exception IllegalStateException when called.
    *
    * @throws IllegalStateException
    *
    */
    private Log() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Prints the number of logs that can fit in the truck.
     *
     * @param args No args will be used.
     * @throws IOException if inputReader fails.
     * */
    public static void main(final String[] args) throws IOException {

        // Variable Declarations
        final int maxWeight = 1100;
        final int logWeightperMeter = 20;
        float heightOfLog = 0f;
        float maxAmountOfLogs = 0f;

        // User prompt
        System.out.print("Enter the length of log (0.25m, 0.5m or 1 m): ");

        // Gathering the user input
        final BufferedReader inputReader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        // Reads the input and converts it to float
        heightOfLog = Float.parseFloat(inputReader.readLine());

        // Calculates the max amount of logs that can fit in the truck
        maxAmountOfLogs = maxWeight / logWeightperMeter / heightOfLog;

        // Outputs the result of the calculation to the user
        System.out.println("The truck can hold " + maxAmountOfLogs + " logs.");

        System.out.println("\nDone.");
    }

}

