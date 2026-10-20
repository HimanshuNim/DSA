class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            boolean ok = true;
            int prevMax = 0; // nums[i] >= 1, so 0 is a safe floor

            for (int start = 0; start < n && ok; start += k) {
                int desc = 0;
                int descPos = -1;

                for (int j = 0; j < k; j++) {
                    int a = nums[start + j];
                    int b = nums[start + (j + 1) % k];
                    if (a > b) {
                        desc++;
                        descPos = j;
                        if (desc > 1) break;
                    }
                }

                if (desc > 1) {
                    ok = false;
                    break;
                }

                int blkMin, blkMax;
                if (desc == 0) {
                    blkMin = blkMax = nums[start];
                } else {
                    blkMax = nums[start + descPos];
                    blkMin = nums[start + (descPos + 1) % k];
                }

                if (blkMin < prevMax) {
                    ok = false;
                    break;
                }
                prevMax = blkMax;
            }

            if (ok) ans += k;
        }

        return ans;
    }
}