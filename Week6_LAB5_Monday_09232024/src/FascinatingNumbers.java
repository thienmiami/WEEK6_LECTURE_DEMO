import java.util.Scanner;

/**
 *  This class is to check for the fascianating numbers which is a prime or a fibonaci number
 * @ Hien Nguyen
 */
public class FascinatingNumbers {
    /**
     * Global Scanner object variable to use keyboard to get inputs
     */
    private static final Scanner keyboard = new Scanner(System.in);
    /**
     *  Length of the array
     */
    private static final int MAX_NUMBERS = 10;
    /**
     * Sentinel value to stop the loop
     */
    private static final int SENTINEL_VALUE_TO_STOP_THE_INPUT = 0;

    //-----------------------------------------------------------------------------

    /**
     * The main method
     * @param args Passed in fromthe command line
     */
    public static void main(String[] args) {

        int candidates[] = new int[MAX_NUMBERS];
        int numberOfCandidates;
        int index;

        //----Enter numbers from user
        numberOfCandidates = getCandidates(candidates);

        System.out.println();
        //----Loop through candidates checking each
        for (index = 0; index < numberOfCandidates - 1; index++) {

            System.out.print(candidates[index] + " is ");
            if (isFibonacci(candidates[index])) {
                System.out.print("Fibonacci");
            } else {
                System.out.print("not Fibonacci");
            }

            System.out.print(" and is ");
            if (isPrime(candidates[index])) {
                System.out.print("prime");
            } else {
                System.out.print("not prime");
            }
            System.out.println();

        } // end of the for loop

    } // end of the main method

    //-----------------------------------------------------------------------------

    /**
     * Get all the input numbers (candidates) and store it to the receied array from the paramemter.
     * @param candidates
     * @return The total elements in the candidates array.
     */
    private static int getCandidates(int[] candidates) {

        int numberOfCandidates = 0;

        System.out.print("Please enter numbers (" + SENTINEL_VALUE_TO_STOP_THE_INPUT + " to stop) : ");

        do {
            //----Here's where idiot proofing could be added
            candidates[numberOfCandidates] = keyboard.nextInt();
            numberOfCandidates++;

        //----Stop when out of space or user enters sentinel
        } while (numberOfCandidates < candidates.length && candidates[numberOfCandidates - 1] != SENTINEL_VALUE_TO_STOP_THE_INPUT);

        return (numberOfCandidates);

    }

    //-----------------------------------------------------------------------------

    /**
     * A boolean method to check an integer number via the parameter to see if it is a Fibonacci number
     * @param candidate
     * @return Return true if the candidate paramenter is a Fibonacci number
     */
    private static boolean isFibonacci(int candidate) {

        int previous = 1;
        int current = 0;
        int next;

        while (current < candidate) {
            next = current + previous;
            previous = current;
            current = next;
        }
        return (candidate == current);

    } // end of the isFibonacci method

    //-----------------------------------------------------------------------------

    /**
     * A boolean method to check an integer number via the paramether to see if it is a prime number
     * @param candidate
     * @return Return true if the candidate integer number a prime number.
     */
    private static boolean isPrime(int candidate) {

        int divisor = 2;
        while (divisor <= Math.sqrt(candidate)) {
            if (candidate % divisor == 0) {
                return (false);
            }
            divisor++;
        }

        return (true);

    } // end of the isPrime method

} // end of the FascinatingNumbers class
