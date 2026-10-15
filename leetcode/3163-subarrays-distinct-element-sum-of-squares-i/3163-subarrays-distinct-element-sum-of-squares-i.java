class Solution {
    public int sumCounts(List<Integer> nums) {

        int totalSum = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            Set<Integer> elements = new HashSet<>();

            for (int j = i; j < n; j++) {
                elements.add(nums.get(j));
                int count = elements.size();

                totalSum += count * count;
            }
        }
        return totalSum;
    }
}