package pl.edu.agh.java.exercises.strings;

/**
 * Given a string, return the longest substring that appears at both the beginning and end of the string without
 * overlapping. For example, sameEnds("abXab") is "ab".
 * <p>
 * Dla danego ciągu znaków zwróć najdłuższy podciąg, który występuje na początku i na końcu, bez nachodzenia na siebie.
 * Przykłądowo, sameEnds("abXab") to "ab".
 *
 * @see http://codingbat.com/prob/p131516
 */
public class StringSameEnds {
    public String sameEnds(String string) {
        String start = "";
        String end = "";
        String result = "";

        for (int i = 0; i < string.length() / 2; i++) {
            start += string.charAt(i);
            end = string.charAt(string.length() - i - 1) + end;
            if (start.equals(end)) {
                result = start;
            }
        }
        return result;
    }
}
