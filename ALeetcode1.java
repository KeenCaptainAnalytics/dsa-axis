public class ALeetcode1 {
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5};
        int target = 9;

        for(int i=0;i<nums.length-1; i++){

            int diff= target - nums[i];
            for(int j= i+1; j<nums.length;j++){
                if(diff== nums[j]){
                    System.out.println(i + "--"+j);
                    int ans[] = {i,j};
                    return;
                }
            }

        }

    }
}
