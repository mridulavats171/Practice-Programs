package Recursion;

public class SkipCharacter {
    public static void main(String[] args) {
        Skip("hello", 'l');
    }

    private static void Skip(String string, char s) {
        if (string.isEmpty()) {
            return;
        }

        char ch = string.charAt(0);

        if (ch != s) {
            System.out.print(ch);
        }

        Skip(string.substring(1), s);
    }
}
