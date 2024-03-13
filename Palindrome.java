import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome {
    private static Deque<Character> fillStack(String inputString) {
        Deque<Character> charStack = new ArrayDeque<Character>();
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }
        return charStack;
    }

    public String buildReverse(String inputString) {
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        return result.toString();
    }

    public boolean isPalindrome(String inputString) {
        String reversedString = buildReverse(inputString);
        return inputString.equals(reversedString);
    }
}
