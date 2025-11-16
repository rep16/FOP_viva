package viva1;
import java.util.Scanner;
/**
 *
 * @author Naqiuddin
 */
public class V1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        
        System.out.println("Enter a non-negative integer: ");                
        if (!sc.hasNextInt()){
            System.out.println("Invalid input! Please enter a number between 0 and 20.");
            return;
        }
        int num = sc.nextInt();
        
        if (num < 0 || num > 20){
            System.out.println("Invalid input! Please enter a number between 0 and 20.");
            return;
        }        
        
        long factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }    
        System.out.println("Choose mode: '1' for Combinatoric, '2' for Security, '3' for Game");
        int mode = sc.nextInt();
        
        System.out.println("The factorial of " +num+ " is: "+factorial);
        
        switch (mode) {
            case 1:
                System.out.println("In Combinatoric mode: You can calculate " +factorial+ " number of ways of to arrange " +num+ " unique items");
                break;
            case 2:
                System.out.println("In Security mode: You can create " +factorial+ " unique password combinations using " +num+ " characters.");
                break;
            case 3:
                System.out.println("In Game mode: There are " +factorial+ " unique level arrangements that can be made from " +num+ " elements.");                
                break; 
            default:
                System.out.println("Please enter number 1, 2 or 3 ");
        }
        System.out.println("Tip of the Day: Factorials grow very fast; optimize your code for efficiency!");
    }
}
