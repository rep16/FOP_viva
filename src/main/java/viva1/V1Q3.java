/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;
import java.util.Scanner;
/**
 *
 * @author Naqiuddin
 */
public class V1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int num;
        
        while (true) {
        System.out.println("Enter a non-negative integer: ");                
        if (!sc.hasNextInt()){
            System.out.println("Invalid input! Don't input number with decimal!");
            sc.next();
            continue;
        }
        num = sc.nextInt();
        
        if (num < 0){
            System.out.println("Invalid input! Do you know what non-negative means!?");
            continue;
           }  
        if (num > 20){
            System.out.println("Invalid input! Above 20 is too large for you, beginners!");
            continue;
           }
            break; 
        }
        
        long factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }    

        int mode;
        
       do{
        System.out.println("Choose mode: '1' for Combinatoric, '2' for Security, '3' for Game");
        mode = sc.nextInt();
        if(mode <1 ||  mode>3){
            System.out.println("Error! Please enter number 1, 2 or 3 only");
        }else{break;}
       }while(mode <1 || mode>3);
       
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
