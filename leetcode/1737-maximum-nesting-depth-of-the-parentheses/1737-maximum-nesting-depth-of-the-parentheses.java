class Solution {
    public int maxDepth(String s) {
        int currentdept=0;
        int maxdept=0;

        for(char c: s.toCharArray()) {
            if(c=='('){
                currentdept++;
                if(currentdept>maxdept) {
                    maxdept=currentdept;
                }
            }else if(c==')'){
                currentdept--;
            }
        }
        return maxdept;
    }
}