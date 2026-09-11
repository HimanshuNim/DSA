class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        HashSet<Integer> unique=new HashSet<>();

        for(int i=0;i<n;i++) {
            if(digits[i]==0) continue;

            for(int j=0;j<n;j++) {
                if(i==j) continue;

                for(int k=0;k<n;k++) {
                    if(i==k||j==k) continue;

                    if(digits[k]%2==0) {
                        int nums=digits[i]*100+digits[j]*10+digits[k];

                        unique.add(nums);

                    }
                }
            }
        }
        return unique.size();
    }
}