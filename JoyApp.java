package javaCode;

import java.util.*;



public class JoyApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Joy's app! \n What is your name?");
		String name = sc.nextLine();

        System.out.println("Nice to meet you " + name + "!");
        System.out.println("Joy is a woman in tech. What would you like her to know about you?");
        String info = sc.nextLine();

        System.out.println("Now, I Joy knows that " + info + ", and would remember that the next time you are here.");
        System.out.println("On a scale of 1 to 10, rate your experience with Joy's app.");
        int rating = sc.nextInt();

        while(rating < 0 || rating > 10) {
            System.out.println("Kindly enter a valid rating between 1 and 10");
            rating = sc.nextInt();
        }

        if(rating < 6) {
            System.out.println("We appreciate your feedback and would like to do better. Kindly leave us a note below on what to improve on.");
            String note = sc.nextLine();
            System.out.println("We would work on " + note + " and deliver a better service next time.");
        }
        sc.close();
        System.out.println("Thanks for your feedback. See you later!");
	}
}
