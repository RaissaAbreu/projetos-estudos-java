

public class Solution {
    public boolean isPalindrome(int x) {
        // Números negativos nunca são palíndromos
        if (x < 0) return false;

        String original = Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
}

