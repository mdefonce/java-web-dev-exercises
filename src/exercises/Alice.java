package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Provide a search term:");
        String searchTerm = input.nextLine();

        System.out.println(firstSentence.toLowerCase().contains(searchTerm.toLowerCase()));
        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");

        String newSentence = firstSentence.replace(searchTerm, "");
        System.out.println(newSentence);

    }
}
