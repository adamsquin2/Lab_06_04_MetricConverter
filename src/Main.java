import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double measurementInMeters = 0;


        Scanner in = new Scanner(System.in);

        System.out.print("Enter the meaurment in meters: ");
         measurementInMeters = in.nextDouble();

        double measurementInInches = measurementInMeters * 39.370079;
        double measurementInFeet = measurementInMeters * 3.28084;
        double measurementInMiles = measurementInMeters * 0.000621;


        System.out.println("The measurement from meters to inches is: " + measurementInInches);
        System.out.println("The measurement from meters to feet is: " + measurementInFeet);
        System.out.println("The measurement from meters to miles is: " + measurementInMiles);
    }
}