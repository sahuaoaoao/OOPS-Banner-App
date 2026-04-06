/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case improves UC4 by combining array declaration and initialization
 * using String.join() in a single statement, making the code more concise.
 *
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization
        String[] lines = {
            String.join(" ", " ***** ", " ***** ", " ****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*     *", "*     *", "*"),
            String.join(" ", "*     *", "*     *", "****** ", " *****"),
            String.join(" ", "*     *", "*     *", "*", "      *"),
            String.join(" ", "*     *", "*     *", "*", "*     *"),
            String.join(" ", " ***** ", " ***** ", "*", " *****")
        };

        // Loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}