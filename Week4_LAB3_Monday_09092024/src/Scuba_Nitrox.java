import java.util.Scanner;

public class Scuba_Nitrox {
    //----------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    // STATIC VARIABLES:
    private static final byte FEET_PER_ATM = 33;
    private static final double MAX_O2_PRESSURE = 1.4;
    private static final double CONTINGENCY_O2_PRESSURE = 1.6;

    //----------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variables to hold input values
        int depthInFeet;
        int percentageO2InGas;
        double o2Pressure;

//----1. Input data
        System.out.print("Enter depth and percentage O2	: ");
//----	1.1 Input depth
        depthInFeet = keyboard.nextInt();
//----		1.2 Input percentage O2
        percentageO2InGas = keyboard.nextInt();

//----2. Compute PPO2
        o2Pressure = computePPO2(depthInFeet, percentageO2InGas);
//----3. Display warnings
        displayWarnings(o2Pressure);
    } // end of the main method

    //----------------------------------------------------------------------------
    private static double computePPO2(int depthInFeet, int percentageO2InGas) {

        double ambientPressure, o2Pressure;
//----		2.1 Compute ambient pressure = (depth / 33) + 1
        ambientPressure = 1 + (double) depthInFeet / FEET_PER_ATM;
//----	2.2 Compute PPO2 = ambient * (percentage O2 / 100)
        o2Pressure = (double) percentageO2InGas / 100 * ambientPressure;
//----	2.3 Display ambient pressure, PPO2
        System.out.println("Ambient pressure	: " + ambientPressure);
        System.out.println("O2 pressure	: " + o2Pressure);

        return (o2Pressure);
    } // end of the computePPO2 method

    //----------------------------------------------------------------------------
    private static void displayWarnings(double o2Pressure) {

        char o2Group;
        boolean exceedsMaxO2Pressure, exceedsContingencyO2Pressure;

//----	3.1 Compute OPG
//----	3.1.1 N = integer part of PPO2 * 10
//----	3.1.2 Take Nth letter after 'A'
        o2Group = (char) ((int) (o2Pressure * 10) + (int) 'A');
//----	3.2 Display OPG
        System.out.println("O2 group	: " + o2Group);
//----	3.3 Display exceed status values
//----		3.2.1 Exceed maximal = PPO2 > 1.4
        //exceedsMaxO2Pressure = o2Pressure > MAX_O2_PRESSURE;

        if ( o2Pressure > MAX_O2_PRESSURE){
            exceedsMaxO2Pressure = true;
        }else{
            exceedsMaxO2Pressure = false;
        }

       // exceedsMaxO2Pressure = true ? o2Pressure > MAX_O2_PRESSURE : false;



//----		3.2.2 Exceed contingency = PPO2 > 1.6
        exceedsContingencyO2Pressure = o2Pressure > CONTINGENCY_O2_PRESSURE;
//----	3.2.3 Print those Boolean values
        System.out.println("Exceeds maximal O2 pressure	: " + exceedsMaxO2Pressure);
        System.out.println("Exceeds contingency O2 pressure : " + exceedsContingencyO2Pressure);
    } // end of the displayWarnings method
    //----------------------------------------------------------------------------
} // end of the Scuba_Nitrox class
//================================================================================
