class SubArraySum{

    static void bruteForceHelper(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int size=1;size<nums.length;size++ ){ // it is checking size of subarray
                int j =0;
                int k = j+size-1; // 0+3-1
            while(k<nums.length){
                

                int sum =0;
                for(int t = j ; t<=k ;t++){
                    sum= sum + nums[t];
                }
                if(max<sum){
                    max = sum;
                }
                j = j+1;
                k = j+size-1;

            }
        }

        System.out.println("maximum sum = "+ max);
    }


    static void kedane(int nums[]){
        int currSum =0;
        int max =0;
        int i =0;
        while(i< nums.length){
            currSum = currSum + nums[i];
            if(currSum> max){
                max = currSum;
            }
            if(currSum < 0){
                currSum = 0 ;
            }
            i++;
        }

        System.out.println("maximum sum : "+max);
    }

    static void sortHelper(int nums[]){
        int i =0;
        int j =nums.length-1;
        while(i<=j){
            if(nums[i]==1){
                nums[j] =1;
                nums[i] =0;
                j--;
            }
            i++;
        }
    }

    static void sortHelper2(int nums[]){

        int i =0; //next 0
        int j =nums.length-1;
        int k = 0;

        while(k<=j){
            if(nums[k]==0){
                int temp = nums[i];
                nums[i]= nums[k];
                nums[k]= temp;
                i++;
            }
            else if(nums[k]==1){
                k++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {

        int nums[] = {1,0 ,2,2,1,1,0,0,0};
        sortHelper2(nums);

      

         for(int i =0;i<nums.length ;i++){
             System.out.print(nums[i]+"  ");
        }
        // int nums[]= {-2,1,-3,4,-1,2,1,-5,4};

        // kedane(nums);


        // String s = "abc";
        // bruteForceHelper(nums);

    }
}