class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char mn = s.charAt(0), mx = s.charAt(0);
        boolean isSorted = true;

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (c < s.charAt(i - 1)) {
                isSorted = false;
            }
            if (c < mn) mn = c;
            if (c > mx) mx = c;
        }

        // Case 0: Already sorted
        if (isSorted) return 0;

        // Edge Case: Length 2 cannot be sorted unless already sorted
        if (n == 2) return -1;

        // Case 1: Minimum is already at the start or Maximum is already at the end
        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) return 1;

        // Case 2: An inner min or max exists
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == mn || s.charAt(i) == mx) {
                return 2;
            }
        }

        // Case 3: Extrema are swapped at the ends and no inner anchors exist
        return 3;
    }
}