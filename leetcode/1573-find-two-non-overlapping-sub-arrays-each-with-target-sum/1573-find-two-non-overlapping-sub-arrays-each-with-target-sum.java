class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        // minLen[i] stores the minimum length of a valid sub-array ending at or before index i
        int[] minLen = new int[n];
        
        int INF = 1000000000;
        java.util.Arrays.fill(minLen, INF);
        
        int currentSum = 0;
        int left = 0;
        int ans = INF;
        int minSoFar = INF;
        
        for (int right = 0; right < n; right++) {
            currentSum += arr[right];
            
            // Shrink window if sum exceeds target
            while (currentSum > target) {
                currentSum -= arr[left];
                left++;
            }
            
            // Found a valid sub-array
            if (currentSum == target) {
                int currentLen = right - left + 1;
                
                // If there's a valid non-overlapping sub-array before `left`
                if (left > 0 && minLen[left - 1] != INF) {
                    ans = Math.min(ans, currentLen + minLen[left - 1]);
                }
                
                minSoFar = Math.min(minSoFar, currentLen);
            }
            
            // Update DP array for the current index
            minLen[right] = minSoFar;
        }
        
        return ans == INF ? -1 : ans;
    }
}