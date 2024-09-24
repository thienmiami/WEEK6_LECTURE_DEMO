import java.util.Scanner;

//=============================================================================
public class FibPrime {
    //-----------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int MAX_NUMBERS = 10;
    private static final int SENTINEL = 0;

    //-----------------------------------------------------------------------------
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
        }
    }

    //-----------------------------------------------------------------------------
    private static int getCandidates(int[] candidates) {
        int numberOfCandidates = 0;
        System.out.print("Please enter numbers (" + SENTINEL + " to stop) : ");
        do {
//----Here's where idiot proofing could be added
            candidates[numberOfCandidates] = keyboard.nextInt();
            numberOfCandidates++;
//----Stop when out of space or user enters sentinel
        } while (numberOfCandidates < candidates.length && candidates[numberOfCandidates - 1] != SENTINEL);

        return (numberOfCandidates);

    }

    //-----------------------------------------------------------------------------
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
    }

    //-----------------------------------------------------------------------------
    private static boolean isPrime(int candidate) {
        int divisor = 2;
        while (divisor <= Math.sqrt(candidate)) {
            if (candidate % divisor == 0) {
                return (false);
            }
            divisor++;
        }

        return (true);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
