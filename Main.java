public class Main{
public static void main(String[] args) {
    /* ListStacks<String> mystack = new ListStacks<>();
    mystack.push("A");
    mystack.push("B");
    mystack.pop();
    mystack.push("C");
    mystack.peek();
    System.out.println(mystack.toString());
    System.out.println(mystack.peek());
    */
        Palindrome palindrome = new Palindrome();

        // Example 1: Check if "radar" is a palindrome
        String input1 = "radar";
        System.out.println("Is \"" + input1 + "\" a palindrome? " + palindrome.isPalindrome(input1));

        // Example 2: Check if "hello" is a palindrome
        String input2 = "hello";
        System.out.println("Is \"" + input2 + "\" a palindrome? " + palindrome.isPalindrome(input2));
    }
}




