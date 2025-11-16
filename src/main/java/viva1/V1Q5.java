package viva1;

import java.util.Random;
import java.util.Scanner;

public class V1Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Spacecraft Name: ");
        String name = input.nextLine();
        double fuelUsed, distance;
        int type;

        while(!name.equalsIgnoreCase("STOP")){
            
        System.out.print("Enter distance travelled (km):");
        distance = input.nextDouble();
        if(distance <= 0){
            System.out.println("Invalid input! Distance travelled must be greater than zero.");
            return;
        } else {
        System.out.print("Enter fuel used:");
        fuelUsed = input.nextDouble();
      
        if(fuelUsed <= 0){
            System.out.println("Invalid input! Fuel used must be greater than zero.");
            return;
        } 
    } 
    System.out.print("Select spacecraft type (1 - Shuttle, 2 - Rocket, 3 - Probe): ");
      type = input.nextInt();
      if (type != 1 && type != 2 && type != 3){
        System.out.println("Invalid input! Spacecraft type must be 1, 2, or 3.");
        return;
      } 
    System.out.println();
     System.out.print("--- Spacecraft Report ---\n");
      switch (type){
        case 1 :
        System.out.println("Spacecraft Name: " + name);
        System.out.println("Spacecraft Type: Shuttle");
        break;

        case 2 :
        System.out.println("Spacecraft Name: " + name);
        System.out.println("Spacecraft Type: Rocket");
        break;

        case 3 :
        System.out.println("Spacecraft Name: " + name);
        System.out.println("Spacecraft Type: Probe");
        break;

      }

      double efficiency = (double) distance / (double) fuelUsed;
      System.out.printf("Fuel Efficiency: %.2f km/l\n", efficiency);
      
      if (efficiency > 10){
        System.out.println("Performance : Outstanding performance! Minimal fuel usage.");
      } else if (efficiency >= 5){
        System.out.println("Good performance! Efficient mission.");
      } else {
        System.out.println("Needs improvement! High fuel consumption.");
      }

    int mission_tip = new Random().nextInt(4);
    switch (mission_tip) {
    case 0:
    System.out.println("Mission tip: Always monitor fuel ratios before takeoff!");
    break;

    case 1:
    System.out.println("Mission tip: Run a full comms check with ground control!");
    break;

    case 2:
    System.out.println("Mission tip: Verify oxygen levels before sealing the cabin!");
    break;

    case 3:
    System.out.println("Mission tip: Secure all instruments before incognition!");
    break;
    }
    input.nextLine(); // Consume newline
    System.out.println();
    System.out.print("Enter Spacecraft Name (or type 'STOP' to finish): ");
    name = input.nextLine();
    }
    System.out.println("Program terminated.");
    input.close();
  }
}
