public class permutation {
    static void add(String option, String ans){

        if(ans.length()==3){
            System.out.println(ans);
            return;
        }
        for(int i= 0;i<option.length();i++){
            add(option, ans+option.charAt(i));
        }
        // add(option, ans+option.charAt(0));
        // add(option, ans+option.charAt(1));
        // add(option, ans+option.charAt(2));
    }
    static int getWays(int target, int currentSum){
        if(target==currentSum){
            return 1;
        }
        if(currentSum>target){
            return 0;
        }

       int way1 =  getWays(target, currentSum+1);
       int way2 = getWays(target, currentSum+2);
       int way3 = getWays(target, currentSum+5);
       int result = way1+way2+way3;
       return result;

    }
    public static void main(String[] args) {
       
        // String s ="abcd";
        // add(s,"");
        // System.out.println(getWays(5, 0));;
        staircase => 5 steps 
        1 2 => total ways
    }
}
