class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0; // Minimum possible open brackets needed
        int maxOpen = 0; // Maximum possible open brackets needed

        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { // c == '*'
                minOpen--; // Treat '*' as ')'
                maxOpen++; // Treat '*' as '('
            }

           
            if (maxOpen < 0) {
                return false;
            }

            
            if (minOpen < 0) {
                minOpen = 0;
            }
        }

        
        return minOpen == 0;
    }
}