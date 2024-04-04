import java.util.HashMap;
import java.util.Map;

public class wordCount {

    public static void countWords(String str) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the string
        String[] words = str.split(" ");

        for (String word : words) {

            // count the word
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // display the count of word
        System.out.println("Word counts:");
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
        
    }

    public static void main(String[] args) {
        String inputString = "This is a simple Java Program ";
        countWords(inputString);
       }
}
