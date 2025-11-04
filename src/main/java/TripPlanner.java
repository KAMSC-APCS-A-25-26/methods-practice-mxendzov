import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        // TODO: Get user input for trip details
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter trip distance (miles): ");
        double miles = sc.nextDouble();
        System.out.print("Enter average speed (mph): ");
        double avgSpeed = sc.nextDouble();
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double mpg = sc.nextDouble();
        System.out.print("Enter fuel price per gallon ($): ");
        double perGallon = sc.nextDouble();
        // - Distance (miles)
        // - Average speed (mph)
        // - Fuel efficiency (miles per gallon)
        // - Fuel price per gallon



        
        // TODO: Calculate travel time using a return method
        double distance = calculateTravelTime(miles, avgSpeed);

        // TODO: Calculate fuel needed using a return method
        double fuelN = calculateFuelNeeded(miles,  mpg);

        // TODO: Calculate trip cost using a return method
        double tripCost = calculateTripCost(fuelN, perGallon);
        // TODO: Display results using a void method
        displayResults(distance, fuelN, tripCost);
    }
    public static double calculateTravelTime( double miles, double avgSpeed){
    return miles / avgSpeed;
    }
    public static double calculateFuelNeeded( double miles, double mpg){
        return miles / mpg;
    }
    public static double calculateTripCost( double fuelN, double perGallon){
        return fuelN * perGallon;
    }
    public static void displayResults(double travelTime, double fuelN, double tripCost) {
        System.out.println("\nResults:");
        System.out.printf("Travel Time: %.2f hours%n", travelTime);
        System.out.printf("Fuel Needed: %.2f gallons%n", fuelN);
        System.out.printf("Trip Cost: $%.2f%n", tripCost);

    // TODO: Implement calculateTravelTime method
    
    // TODO: Implement calculateFuelNeeded method
    
    // TODO: Implement calculateTripCost method
    
    // TODO: Implement displayResults method
    
}}
