package viva1;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author TUF
 */
public class V1Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("--- Water Billing System ---");
        System.out.println("Enter '0' for Liters Consumed at any time to quit.");
        
        while (true) {
            

            double litersConsumed;
            while (true) {
                System.out.println("[STEP 1] Enter liters of water consumed (L): ");
                if (scanner.hasNextDouble()) {
                    litersConsumed = scanner.nextDouble();
                    //scanner.nextLine(); 
                    
                    if (litersConsumed == 0) {
                        System.out.println("Thank you for using the Water Billing System. Goodbye!");
                        return; 
                    }
                    
                    if (litersConsumed > 0 && litersConsumed <= 50000) {
                        break; 
                    } else {
                        System.out.println("ERROR: Liters must be between 1 and 50,000.");
                    }
                } else {
                    String invalidInput = scanner.nextLine();
                    if (invalidInput.equals("0")) {
                        System.out.println("Thank you for using the Water Billing System. Goodbye!");
                        return;
                    }
                    System.out.println("ERROR: Invalid input. Please enter a number for liters.");
                }
            }

            String customerType;
            while (true) {
                System.out.print("[STEP 2] Enter customer type (residential/commercial): ");
                customerType = scanner.nextLine().trim();

                if (customerType.equalsIgnoreCase("residential") || customerType.equalsIgnoreCase("commercial")) {
                    break; 
                } else {
                    System.out.println("ERROR: Invalid customer type. Please enter 'residential' or 'commercial'.");
                }
            }
            
            double totalBill = 0.0;
            double remainingLiters = litersConsumed; 
            
            if (customerType.equalsIgnoreCase("residential")) {
                
                if (remainingLiters > 5000) {
                    double tier3Consumption = remainingLiters - 5000;
                    totalBill += tier3Consumption * 0.08;
                    remainingLiters = 5000; 
                } 
                
                if (remainingLiters > 1000) {
                    double tier2Consumption = remainingLiters - 1000;
                    totalBill += tier2Consumption * 0.05;
                    remainingLiters = 1000; 
                }
                
                if (remainingLiters > 0) {
                    totalBill += remainingLiters * 0.02;
                }

            } else if (customerType.equalsIgnoreCase("commercial")) {
                
                if (remainingLiters > 10000) {
                    double tier2Consumption = remainingLiters - 10000;
                    totalBill += tier2Consumption * 0.10;
                    remainingLiters = 10000; 
                }
                
                if (remainingLiters > 0) {
                    totalBill += remainingLiters * 0.06;
                }
            }
            
            System.out.println("\n*** BILLING SUMMARY ***");
            System.out.println("Customer Type: " + customerType.substring(0, 1).toUpperCase() + customerType.substring(1).toLowerCase());
            System.out.println("Total liters of water consumed: "+ litersConsumed);
            System.out.println("Total Monthly Bill: RM " + df.format(totalBill));
            System.out.println("***********************");
        }
    }
}
