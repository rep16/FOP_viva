package viva1;

import java.util.Scanner;
import java.util.Random;

public class V1Q1 {
    public static void main(String[] args) {
        // Program ask student to enter their hours studied, slept, and numbers of breaks taken
        // Then, calculate and display their productivity score based on the formula below: score = (hours studied * 2) + (hours slept) - (number of breaks taken * 0.5)
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter hours studied: ");
        double hours_studied = input.nextDouble(); 
        System.out.println("Enter hours slept: ");
        double hours_slept = input.nextDouble();   
        System.out.println("Enter number of breaks taken: "); 
        double number_of_breaks = input.nextDouble();
        input.close();

        if (hours_studied < 0  || hours_slept  < 0 || number_of_breaks < 0) {
            System.out.println("Invalid input! Values cannot be negative.");
            return;
        } else { 
            if (hours_studied > 24 || hours_slept > 24) {
                System.out.println("Invalid input! Hours cannot exceed 24.");
                return;
            } else if (number_of_breaks > 10) {
                System.out.println("Invalid input! Breaks cannot exceed 10.");
                return;
            }
        }
        //I used ladder and nested if-else to validate the inputs

        System.out.println();
        System.out.println("Hello " + name + "!");

        double score = (hours_studied * 2) + (hours_slept) - (number_of_breaks * 0.5);
        System.out.printf("Your productivity score is: %.2f\n", score);

        if (score > 25) {
            System.out.println("Productivity Level: High");
            System.out.println("Excellent bro! Keep up the good work!");
        } else if (score >= 15) {
            System.out.println("Productivity Level: Medium");
            System.out.println("Good job! But keep pushing to improve your productivity.");
        } else {
            System.out.println("Productivity Level: Low");
            System.out.println("Sila usaha lebih sikit plissss.");
        }
        int randomTip = new Random().nextInt(7);
        switch (randomTip) {
            case 0:
                System.out.println("Tip of THE DAY: You can create a study schedule to manage your time effectively.");
                break;
            case 1:
                System.out.println("Tip of THE DAY: You can take short breaks during study sessions to stay focused.");
                break;
            case 2:
                System.out.println("Tip of THE DAY: You can find a quiet and comfortable study environment.");
                break;
            case 3:
                System.out.println("Tip of THE DAY: You can set specific goals for each study session.");
                break;
            case 4:
                System.out.println("Tip of THE DAY: You can use active learning techniques like summarizing and questioning.");
                break;
            case 5:
                System.out.println("Tip of THE DAY: You can stay hydrated and eat nutritious meals to boost concentration.");
                break;
            case 6:
                System.out.println("Tip of THE DAY: You can get enough sleep to improve memory and cognitive function.");
                break;
        }
        System.out.println("Reminder: Santai kawan, belajar demi masa depan tak akan merugikan, ingat tu " +name +"!");
    }
}

