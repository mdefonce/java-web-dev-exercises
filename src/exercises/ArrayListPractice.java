package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(6);
        arr.add(4);
        arr.add(9);
        arr.add(1);
        arr.add(11);
        arr.add(34);
        arr.add(5);
        arr.add(4);
        System.out.println(sumEven(arr));

        ArrayList<String> str = new ArrayList<>();
        str.add("five");
        str.add("facts");
        str.add("right");
        str.add("nope");
//        System.out.println(fiveLetters(str));

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] strSplit = phrase.split(" ");
        ArrayList<String> strList = new ArrayList<String>(
//                Arrays.asList(phrase.split(" ")));
                Arrays.asList(strSplit));
//        for (String s : strList)
            System.out.println(strList);

    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList fiveLetters(ArrayList<String> str) {
        ArrayList<String> stringArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (String string : str) {
            if (string.length() == numChars) {
                stringArray.add(string);
            }
        }
        return stringArray;
    }

}