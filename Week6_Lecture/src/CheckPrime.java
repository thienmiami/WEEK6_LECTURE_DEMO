import java.util.Scanner;
public class CheckPrime {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer number to check if it is a prime number or not. Enter zero to exit.");
        int inputNumber = keyboard.nextInt();

        while (inputNumber != 0){

            if (isPrime(inputNumber)){
                System.out.println(inputNumber + " is a prime number");
            }else{
                System.out.println(inputNumber + " is not a prime number");
            }

            System.out.println("Enter an integer number to check if it is a prime number or not. Enter zero to exit.");
            inputNumber = keyboard.nextInt();


        } // end of the while loop

        System.out.println("Program complete.");

    } // end of the main method


    private static boolean isPrime(int candidate) {

        int divisor = 2;

        while (divisor <= Math.sqrt(candidate)) {
            if (candidate % divisor == 0) {

                return(false);
            }
            divisor++;
        }
        return(true);
    } // end of the isPrime method


} // end of the CheckPrime class
