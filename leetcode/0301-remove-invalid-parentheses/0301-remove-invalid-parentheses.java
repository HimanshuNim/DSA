import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        int leftRem = 0, rightRem = 0;
        
        // Step 1: Count the minimum number of misplaced '(' and ')'
        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftRem++;
            } else if (c == ')') {
                if (leftRem > 0) {
                    leftRem--;
                } else {
                    rightRem++;
                }
            }
        }
        
        Set<String> result = new HashSet<>();
        backtrack(s, 0, 0, 0, leftRem, rightRem, new StringBuilder(), result);
        return new ArrayList<>(result);
    }
    
    private void backtrack(String s, int index, int leftCount, int rightCount, 
                           int leftRem, int rightRem, StringBuilder path, Set<String> result) {
        if (index == s.length()) {
            if (leftRem == 0 && rightRem == 0 && leftCount == rightCount) {
                result.add(path.toString());
            }
            return;
        }
        
        char c = s.charAt(index);
        int len = path.length();
        
        // Option 1: Skip (remove) the current parenthesis if allowed
        if (c == '(' && leftRem > 0) {
            backtrack(s, index + 1, leftCount, rightCount, leftRem - 1, rightRem, path, result);
        } else if (c == ')' && rightRem > 0) {
            backtrack(s, index + 1, leftCount, rightCount, leftRem, rightRem - 1, path, result);
        }
        
        // Option 2: Keep the current character
        path.append(c);
        if (c != '(' && c != ')') {
            backtrack(s, index + 1, leftCount, rightCount, leftRem, rightRem, path, result);
        } else if (c == '(') {
            backtrack(s, index + 1, leftCount + 1, rightCount, leftRem, rightRem, path, result);
        } else if (rightCount < leftCount) { // Only add ')' if it balances a preceding '('
            backtrack(s, index + 1, leftCount, rightCount + 1, leftRem, rightRem, path, result);
        }
        path.setLength(len); // Backtrack
    }
}