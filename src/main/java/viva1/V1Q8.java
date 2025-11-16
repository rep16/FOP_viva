package viva1;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author USER
 */
public class V1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
         int steps;
         int totalSteps = 0;
         double average;
         int maxSteps = 1, maxDay = 0;
         int motivation;
         
        for( int i = 1 ; i <= 7 ; i++ ){
            
            do{
                System.out.println("Enter steps for Day " + i + " : ");
                steps = sc.nextInt();
                
                if(steps > maxSteps){
                    maxSteps = steps;
                    maxDay = i;
                }
                if(steps <= 0 || steps > 50000){
                    System.out.println("Invalid input , please enter steps within range 0-50000 ");
                }
                
            }while(steps <= 0 || steps > 50000);
            
            totalSteps += steps;
        }
        average = totalSteps / 7;
        
        System.out.println("Total Steps This Week: " + totalSteps);
        System.out.println("Average Daily Step: "+ average);
        System.out.println("Most Active Day: Day " + maxDay + " with "+ maxSteps + " steps.");
        
        motivation = random.nextInt(5); 
        switch(motivation){
            case 0 :
                System.out.println("Tip of the Day: Consistency is key! Even a short 10-minute walk is a victory for your health.");
                break;
            case 1 :
                System.out.println("Tip of the Day: Good shoes make a big difference! Wearing supportive footwear helps prevent injuries.");
                break;
            case 2 : 
                System.out.println("Tip of the Day: Listen to a podcast or your favorite music to make the time fly by on your walk");
                break;
            case 3 :
                System.out.println("Tip of the Day: Mix up your route! Exploring a new path can make your daily walk more exciting");
                break;
            case 4 :
                System.out.println("Tip of the Day: A good night's sleep is crucial for recovery and having energy for your next walk.");
                break;
        }
        
    }
}
