import java.util.HashMap;
import java.util.Map;

public class duplicate {

    public static void findDuplicateCharacters(String str) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        char[] charArr = str.toCharArray();
        
        for (char c : charArr) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        
        

        System.out.println("Duplicate characters: ");
        charCountMap.forEach((character, count) -> {
            if ( count > 1 ) {
                System.out.println(character + " - " + count + " times");  
            }
        });

    }

    public static void main(String[] args) {
        String inputString = "This ";
        findDuplicateCharacters(inputString);
    }
}
