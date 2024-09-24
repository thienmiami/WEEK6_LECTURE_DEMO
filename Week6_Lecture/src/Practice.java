import java.util.Scanner;
public class Practice {

    private static final Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Debugging Demo");

        int [] myArray = new int[5];

        int index;
        for (index = 0; index < myArray.length ; index++){

            System.out.println("At index " + index + ": Enter an interger number:");
            myArray[index] = keyboard.nextInt() * 2;

        } // end of the for loop

        System.out.println("Done input. Now display the content of the array:");
        for (index = 0; index < myArray.length ; index++){

            System.out.println("At index " + index + ": " +   myArray[index]);


        } // end of the for loop




    } // end of the main method

} // end of the Practice class
