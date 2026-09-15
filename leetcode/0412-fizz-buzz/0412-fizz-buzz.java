class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer=new ArrayList<>(n);

        for(int i=1;i<=n;i++) {

            boolean deviBy3 = i % 3==0;
            boolean deviBy5 = i % 5==0;

            if(deviBy3 && deviBy5){
                answer.add("FizzBuzz");
            }else if(deviBy3){
                answer.add("Fizz");
            }else if(deviBy5){
                answer.add("Buzz");
            }else{
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}