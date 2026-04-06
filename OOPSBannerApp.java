/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class improves UC2 by using String.join() instead of + operator
 * for better memory efficiency and cleaner code.
 *
 * It prints the word "OOPS" as a banner using ASCII characters.
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " ***** ", " ***** ", " ****** ", " ***** "));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*     *", "*     *"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*     *", "*"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "****** ", " *****"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*", "      *"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*", "*     *"));

        System.out.println(String.join(" ",
                " ***** ", " ***** ", "*", " *****"));
    }
}