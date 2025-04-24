import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MRep {
    public static void main(String[] args) {

        String s = "bbcbbbccaacccaaa"; //abc //bca
        //b-0 , c-0, a-0
        //bca
        int freq[] = new int[26];

        for(int i = 0 ; i< s.length();i++){
            char c = s.charAt(i);
            freq[c-'a'] += 1; 

        }

        for(int i =0;i<26;i++){
            System.out.println((char)(i+'a')+" --> "+freq[i]);
        }

        


        // techniques 2
        // int nums[] = {4,3,2,2,7,8,2,3,1};
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<nums.length ;i++){
        //     if(map.containsKey(nums[i])){
        //         int count = map.get(nums[i]);
        //         map.put(nums[i], count+1);
        //     }
        //     else{
        //         map.put(nums[i], 1);
        //     }
        // }

        //System.out.println(map);


        // int nums[] = {4,3,2,2,7,8,2,3,1};
        // HashSet<Integer> set = new HashSet<>();

        // Arrays.sort(nums);

        // for(int i =0; i< nums.length-1 ;i++){
        //     if(nums[i]==nums[i+1]){
        //         set.add(nums[i]);
        //     }
        // }

        // System.out.println(set);
    }
}
