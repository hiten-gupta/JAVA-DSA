import java.util.*;

public class checkUpper{
    public static String toTitleCase(String str) {
        if (str.length() < 3) {
            // If the string length is less than 3, convert the entire string to lowercase
            return str.toLowerCase();
        }

        StringBuilder result = new StringBuilder();

        // Convert the first character to uppercase
        result.append(Character.toUpperCase(str.charAt(0)));

        // Iterate through the remaining characters
        for (int i = 1; i < str.length(); i++) {
            // If the current character is a space
            if (str.charAt(i) == ' ') {
                // Append the space
                result.append(' ');
                // Move to the next character
                i++;
                // Convert the next character to uppercase
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // Convert the character to lowercase and append
                char currentChar = str.charAt(i);
                if (i >= 2 && str.charAt(i - 1) == ' ' && str.charAt(i - 2) == ' ') {
                    // If the current character is part of a multi-word space-separated substring
                    result.append(Character.toLowerCase(currentChar));
                } else if (i >= 3 && str.charAt(i - 1) == ' ' && str.charAt(i - 2) != ' ') {
                    // If the current character is part of a multi-word space-separated substring
                    String previousWord = str.substring(i - 3, i).toLowerCase();
                    if (previousWord.equals("of") || previousWord.equals("the") || previousWord.equals("and") || previousWord.equals("or")) {
                        // If the previous word is one of the words to ignore, keep the current character lowercase
                        result.append(Character.toLowerCase(currentChar));
                    } else {
                        // Otherwise, convert the character to uppercase
                        result.append(Character.toUpperCase(currentChar));
                    }
                } else {
                    // Convert the character to uppercase
                    result.append(Character.toUpperCase(currentChar));
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = scanner.nextLine();
        System.out.println(toTitleCase(input));
        scanner.close();
    }
}
