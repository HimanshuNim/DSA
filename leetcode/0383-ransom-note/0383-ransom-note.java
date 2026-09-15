class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> magzin=new HashMap<>();

        for(int i=0;i<magazine.length();i++){
            char m= magazine.charAt(i);

            int currentCount=magzin.getOrDefault(m,0);
            magzin.put(m,currentCount+1);
        }
        for(int i=0;i<ransomNote.length();i++) {
            char n=ransomNote.charAt(i);

            int currentCount=magzin.getOrDefault(n,0);
            if(currentCount==0){
                return false;
            }
            magzin.put(n,currentCount-1);
        }

        return true;


    }
}