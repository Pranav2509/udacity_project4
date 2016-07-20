package com.example;

import java.util.Random;

public class Joker {

    public String tellMeAJoke(){

        int num = getRandomNumberBetween1and6();
        System.out.print("num : " + num);

        switch(num){

            case 0:

            case 1: return "Sardar had twins. He named them Tin and Martin.\n" +
                    "Again had twins and named them Peter and Repeater.";


            case 2: return "Again twins and named them Max and Climax.\n" +
                    "Again the same. Disgusted Sardar named them Tired & Retired.";


            case 3: return "What did Tarzan think when he saw a dead Cheetah?";


            case 4: return "CIRCUIT : Oye Short Circuit yeh light bulb pe baap ka naam kyu likh raha hai?\n" +
                    "SHORT CIRCUIT : Apun baap ka naam roshan kar rehle hai.";


            case 5: return "A Sardar went to a bank to open a S.B. A/C.\n" +
                    "After seeing the form he had gone to Delhi for filling it up.\n" +
                    "You know why?\n" +
                    "Form said: “Fill Up In Capital”.";


            case 6: return "TEACHER : PAPPU, go to the map and find North America.\n" +
                    "PAPPU : Here it is!\n" +
                    "TEACHER : Correct. Now, class, who discovered America?\n" +
                    "CLASS : PAPPU!";
        }
        return " ";

    }

    private int getRandomNumberBetween1and6() {

        Random rand = new Random();
        int randomNumber = rand.nextInt(6);
        return randomNumber;
    }
}
