package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] quotes = new String[10];
        quotes[0] = "\"The only limit to our realization of tomorrow is our doubts of today\" – Franklin D. Roosevelt";
        quotes[1] = "\"In the middle of difficulty lies opportunity\" – Albert Einstein";
        quotes[2] = "\"Do not wait to strike till the iron is hot, but make it hot by striking\" – William Butler Yeats";
        quotes[3] = "\"Whether you think you can or you think you can’t, you’re right\" – Henry Ford";
        quotes[4] = "\"Success is not final, failure is not fatal: it is the courage to continue that counts\" – Winston Churchill";
        quotes[5] = "\"The journey of a thousand miles begins with one step\" – Lao Tzu";
        quotes[6] = "\"It always seems impossible until it’s done\" – Nelson Mandela";
        quotes[7] = "\"If you want to lift yourself up, lift up someone else\" – Booker T. Washington";
        quotes[8] = "\"You miss 100% of the shots you don’t take\" – Wayne Gretzky";
        quotes[9] = "\"Happiness depends upon ourselves\" – Aristotle";

        try {
            System.out.print("Select a quote (1 - 10): ");
            int userInput = input.nextInt();

            System.out.println("\n" + quotes[userInput - 1]);
        } catch (Exception e) {
            System.out.println("Invalid selection.");
            input.nextLine();
        }

/*        if (userInput >= 1 && userInput <= 10) {
            System.out.println("\n" + quotes[userInput - 1]);
        } else {
            System.out.println("\nInvalid selection.");
        }*/

        /*for (int i = 1; i < 10; i++) {
            String currentQuote = quotes[userInput];
            if (i == userInput) {
                System.out.println(quotes[i]);
            }
        }*/

    }
}
