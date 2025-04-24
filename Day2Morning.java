class Day2Morning{

    public  int[] twoSum(int[] nums, int target) {
        int i =0;
        while(i<nums.length){
            int j = i+1;
            int diff = target- nums[i];
            while(j<nums.length){
                if(nums[j]==diff){
                    int result[] = new int[2];
                    result[0]= i;
                    result[1] = j;
                    return result;
                }
                j++;
            }
            i++;
        }
        return null;
    }
    public static void main(String[] args) {
        int nums[] ={2,7,11,15};
        int target = 9;

        // Day2Morning obj = new Day2Morning();
        // int arr[] = obj.twoSum(nums, target);

        // System.out.println(arr[0] + "--"+ arr[1]);

    }
}