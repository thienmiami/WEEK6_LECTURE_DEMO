import java.util.Scanner;
public class Week7_LAB6 {
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Week 7 - LAB 6");

        int[] houseNumbers;
        int[][] houseAges;
        int numberOfHouses;

        System.out.print("How many houses in the street?	: ");
        numberOfHouses = keyboard.nextInt();

        houseNumbers = new int[numberOfHouses];
        System.out.println();

        //update the houseNumbers array
        inputHouseNumbers(houseNumbers);

        houseAges = new int[numberOfHouses][];
        System.out.println();

        //update the houseAges array
        inputHouseAges(houseNumbers, houseAges);

        //analyze both 2 arrays to display the result of total ages in each house
        //and the total age of all houses.

        int houseIndex, personIndex;
        int totalStreetAge, totalHouseAge;

        totalStreetAge = 0;

        for (houseIndex = 0; houseIndex < houseNumbers.length; houseIndex++) {

            totalHouseAge = 0;

            for (personIndex = 0; personIndex < houseAges[houseIndex].length; personIndex++) {
                totalHouseAge += houseAges[houseIndex][personIndex];
            } //end of the inner for loop

            System.out.println("House " + houseNumbers[houseIndex] + " has a total age of " + totalHouseAge);
            totalStreetAge += totalHouseAge;
        } //end of the outer for loop

        System.out.println();
        System.out.println("The street has a total age of " + totalStreetAge);

    } // end of the main method

    private static void inputHouseNumbers(int [] houseNumbersArray) {

        int index;

        for (index = 0; index < houseNumbersArray.length; index++) {
            System.out.print("What is the next house number?	: ");
            houseNumbersArray[index] = keyboard.nextInt();
        } //end of the for loop

    } // end of the inputHouseNumbers method

    private static void inputHouseAges(int[] houseNumbersArray, int[][] houseAgesArray) {

        int houseIndex;
        int numberOfPeople;
        int personIndex;

        for (houseIndex = 0; houseIndex < houseNumbersArray.length; houseIndex++) {

            System.out.print("How many people live in number " + houseNumbersArray[houseIndex] + " : ");

            numberOfPeople = keyboard.nextInt();

            houseAgesArray[houseIndex] = new int[numberOfPeople];

            for (personIndex = 0; personIndex < houseAgesArray[houseIndex].length; personIndex++) {
                System.out.print("What is the age of person " + (personIndex + 1) + "	: ");
                houseAgesArray[houseIndex][personIndex] = keyboard.nextInt();
            } //end of the inner for loop

            System.out.println();
        } //end of the outer for loop

    }// end of the inputHouseAges method

} //end of the Week7_LAB6 class