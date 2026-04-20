package com.pluralsight;

// import scanner
import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {
        // add scanner
        Scanner scanner = new Scanner(System.in);

      try {
          // insert quites 1-10 to be chosen in array
          String[] favQuotes = {
                  "I am the stone that the builder refused, I am the visionary that made the lady sing her blues.",
                  "Where your values lie, that's where your boundaries will be.",
                  "Choose growth over complacency; no matter how fearful you feel.",
                  "Listen to your intuition always, you'll rarely be lead astray",
                  "Be yourself, there wont be anyone else like you again!",
                  "Don't rob the world of your light, don't self sabotage",
                  "I rather bite off more than I can chew and learn to chew it than choose to stay the same",
                  "When in doubt, consider Hannah's prayer",
                  "Remember always that you have free will, but aren't free from the consequences",
                  "Be the change you want to see"
          };
          // allow user choose a selection and get a response
          System.out.println("Select a number between 1 and 10: ");
          int index = scanner.nextInt();

          index--;

          System.out.println(favQuotes[index]);
      }
    catch (Exception error) {
          // add sout error that catches numbers out of bounds
        System.out.println("Try a number between 1 - 10 to get a given quote!");
    }
    }
}
