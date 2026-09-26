class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();
        for(List<String> pair:knowledge){
            map.put(pair.get(0),pair.get(1));
        }

        StringBuilder result=new StringBuilder();
        int n=s.length();
        int i=0;

        while(i<n){
            char ch=s.charAt(i);

            if(ch=='('){
                i++;
                int start=i;
                while(i<n && s.charAt(i)!=')'){
                    i++;
                }
                String key=s.substring(start,i);
                result.append(map.getOrDefault(key,"?"));
            }else{
                result.append(ch);
            }
            i++;
        }
        return result.toString();
    }
}