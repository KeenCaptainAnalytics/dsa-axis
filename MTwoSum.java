import java.util.HashMap;

public class MTwoSum {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int target = 9;
        HashMap<Integer , Integer>  map = new HashMap<>();
       
        for(int i =0  ;i <nums.length ; i++){
            int curr = nums[i];
            int diff = target -curr;

            if(map.containsKey(diff)){
                int arr[] = new int[2];
                arr[0] =i ;
                arr[1] = map.get(diff);
                System.out.println(arr[0] + " -- "+arr[1]);
                break;
            }
            else{
                map.put(curr, i);
            }
        }
    }
}
