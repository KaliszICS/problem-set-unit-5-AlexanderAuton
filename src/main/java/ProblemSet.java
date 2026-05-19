/**

        * File: Problem Set Ch5

        * Author: Auton

        * Date Created: May 11, 2026

        * Date Last Modified: May 19, 2026

        */
//hereWeGoOneLastTimePre-Culminating
import java.util.Scanner;


public class ProblemSet {

	public static void main(String args[]) {
		 Scanner scanner = new Scanner(System.in);


        System.out.println("Here is the the Text Analyzer.");


        System.out.print("\nEnter a phrase or text block: ");
        String phrase = scanner.nextLine();


        int characters = phrase.length();
        int space = 0;
        int vowel = 0;
//countersForOurFutureLoops

        String lC = phrase.toLowerCase();


        for (int i = 0; i < lC.length(); i++) {
            char ch = lC.charAt(i);


            if (ch == ' ') {
                space++;
            }


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++; //doingThisManuallyWasBoringAsHell
            }
        }


        String cleaned = "";
//alwaysNeedAnEmptyStringAsTheBasicForm
        for (int i = 0; i < lC.length(); i++) {
            char ch = lC.charAt(i);


            if ((ch >= 'a' && ch <= 'z') || ch == ' ') {
                cleaned = cleaned + ch;
            }
        }


        String[] words = cleaned.split(" ");
        int amountPhrase = 0;


        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                amountPhrase++;
            }
        }


        String[] uniquePhrases = new String[words.length];
        int[] counts = new int[words.length];
        int uniquesCounted = 0;


        for (int i = 0; i < words.length; i++) {
            String word = words[i];


            if (!word.equals("") &&
                !word.equals("the") &&
                !word.equals("a") &&
                !word.equals("an") &&
                !word.equals("and") &&
                !word.equals("is")) {
//thisWasPainfulToDoManually

                boolean found = false;


                for (int j = 0; j < uniquesCounted; j++) {
                    if (word.equals(uniquePhrases[j])) {
                        counts[j]++;
                        found = true;
                    }
                }


                if (!found) {
                    uniquePhrases[uniquesCounted] = word;
                    counts[uniquesCounted] = 1;
                    uniquesCounted++;
                }
            }
        }


        System.out.println("\nTotal Characters: " + characters);
        System.out.println("Total Words: " + uniquesCounted);
        System.out.println("Total Vowels: " + vowel);
        System.out.println("Total Spaces: " + space);


        System.out.println("\nWord Frequency:\n");


        for (int i = 0; i < uniquesCounted; i++) {
            System.out.println(uniquePhrases[i] + " - " + counts[i]);
        }

	}

}
//weMadeItBoys