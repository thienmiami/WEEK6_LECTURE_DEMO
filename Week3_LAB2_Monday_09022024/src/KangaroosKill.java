import java.util.Scanner;

public class KangaroosKill {

    private static Scanner keyboard = new Scanner(System.in);
    //----CONSTANT variables
    private static final double KANGAROOS_KILL_PROBABILITY = 1.47;
    private static final double ROAD_WIDTH = 0.01;

    //------------------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variables to hold input values
        double squareSide, roadLength, numberOfKangaroos;
        double kangaroosDensity, squareArea, roadArea;
        double kangaroosCarnage;
        int kangaroosKills = 0;
        int kangaroosInjuries = 0;

//----1. Input data
//----		1.1 Prompt and input length of square
        System.out.print("Enter side of square in km	: ");
        squareSide = keyboard.nextDouble();
//----		1.2 Prompt and input length of roads
        System.out.print("Enter roads length in km	: ");

        roadLength = keyboard.nextDouble();
//----		1.3 Prompt and input number of 'roos
        System.out.print("Enter number of 'roos	: ");
        numberOfKangaroos = keyboard.nextDouble();

//----2. Compute 'roos killed
//----	2.1 Compute 'roo density
//----		2.1.1 Compute square area = side * side
        squareArea = squareSide * squareSide;
//----		2.1.2 Compute density = number of 'roos / square area
        kangaroosDensity = numberOfKangaroos / squareArea;
//----		2.2 Compute road area = 0.01km * roads length
        roadArea = roadLength * ROAD_WIDTH;
//----	2.3 Compute carnage
//----		2.3.1 Compute total = 'roo density * road area * 1.47
        kangaroosCarnage = kangaroosDensity * roadArea * KANGAROOS_KILL_PROBABILITY;
        System.out.println("Kangaroos Carnage: " + kangaroosCarnage);
//----		2.3.2 Compute kills = Floor of total
        kangaroosKills = (int) kangaroosCarnage;
//----		2.3.3 Compute injuries = Ceiling of fractional part of total
        kangaroosInjuries = (int) Math.ceil(kangaroosCarnage % 1);

//----3. Display reults
//----	3.1 Display number killed
        System.out.println("Expected number of kills is : " + kangaroosKills);
//----	3.2 Display number injured
        System.out.println("Expected number of injuries : " + kangaroosInjuries);

    } // end of the main method
//------------------------------------------------------------------------------------
} // end of the KangaroosKill class
//====================================================================================


