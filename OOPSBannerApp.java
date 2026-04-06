import java.util.HashMap;

/**
 * OOPSBannerApp UC8 – Use Map for Character Patterns
 *
 * This use case improves UC7 by using HashMap for efficient
 * storage and retrieval of character patterns.
 *
 * @author Developer
 * @version 8.0
 */
public class OOPSBannerApp {

    // Create character map
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        charMap.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        charMap.put('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        return charMap;
    }

    // Display banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int height = charMap.get('O').length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";

        displayBanner(message, charMap);
    }
}