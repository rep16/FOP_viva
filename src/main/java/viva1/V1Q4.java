package viva1;

import java.util.Scanner;
public class V1Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String code;
        int ironManCount = 0, capCount = 0;
        int ironManSum = 0, capSum = 0;
        int totalCodes = 0; 
        System.out.println("Enter binary code (type 'STOP' to finish):");  
        while (true) {
            code = input.nextLine().trim();
            // Stop condition
            if (code.equalsIgnoreCase("STOP")) {
                break;
            }
            // Validate binary (only 0s and 1s)
            if (!code.matches("[01]+")) {
                System.out.println("Invalid code: must contain only 0s and 1s");
                continue;
            }
            // Limit number of binary codes
            if (totalCodes >= 20) {
                System.out.println("Maximum of 20 codes reached!");
                break;
            }  
            // Convert binary to decimal manually
            int decimalValue = 0;
            int power = 1;  // represents 2^0
            
            for (int i = code.length() - 1; i >= 0; i--) {
                int bit = code.charAt(i) - '0';
                decimalValue += bit * power;
                power *= 2;
            }
            // Determine team
            if (decimalValue % 2 == 0) {
                System.out.println("Code " + code + " --> Decimal " + decimalValue + " --> Iron Man's Team");
                ironManCount++;
                ironManSum += decimalValue;
            } else {
                System.out.println("Code " + code + " --> Decimal " + decimalValue + " --> Captain America's Team");
                capCount++;
                capSum += decimalValue;
            }
            totalCodes++;
        }
        // Display final results
        System.out.println();
        if (ironManCount > 0)
            System.out.println("Iron Man Team: " + ironManCount + " codes | Average Power: " + (ironManSum / ironManCount));
        else
            System.out.println("Iron Man Team: 0 codes | Average Power: 0"); 
        if (capCount > 0)
            System.out.println("Captain America Team: " + capCount + " codes | Average Power: " + (capSum / capCount));
        else
            System.out.println("Captain America Team: 0 codes | Average Power: 0");
        System.out.println("Mission Accomplished: Message Decrypted!"); 
        input.close();
    }
}
