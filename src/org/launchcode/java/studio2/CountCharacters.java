package org.launchcode.java.studio2;

import java.util.*;

public class CountCharacters {

    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String newString = input.nextLine().toLowerCase();
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();
//        Arrays.sort(charactersInString);
//        Character singleChar;
        Integer numOfChar = 0;

//        for (int i = 0; i<charactersInString.length; i++) {
//            char singleChar = charactersInString[i];
//            if (charCount.containsKey(singleChar) == false) {
//                charCount.put(singleChar, 1);
//            } else {
//                numOfChar = charCount.get(singleChar);
//                numOfChar += 1;
//                charCount.put(singleChar, numOfChar);
//            }
//        }

//        System.out.println(charCount);

        for (char character : charactersInString) {
//            charCount.put(character, 1);
            if (!Character.isLetter(character)) {
            }

            else if (charCount.containsKey(character)) {
//                numOfChar += 1;
                charCount.put(character, charCount.get(character)+1);
            } else {
//                numOfChar += 1;
                charCount.put(character, 1);
            }
        }


        for (HashMap.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }

}
