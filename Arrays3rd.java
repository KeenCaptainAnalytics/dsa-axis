public class Arrays3rd {

    static int[] reverse1(int nums[]){
        int brr[] = new int[nums.length];
        int i = 0; //nums;
        int j = nums.length-1;//brr
        while(i<nums.length){
            brr[j]= nums[i];
            j--;
            i++;
        }
        return brr;
    }

    static void print(int nums[]){
        for(int i=0;i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    static void reverse2(int nums[]){
        int i=0;
        int j= nums.length-1;

        while(i<j){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    static void twoLargest(int nums[]){
        int max= nums[0];
        int secondMax = nums[0];
        for(int i =1; i<nums.length;i++){
            if(nums[i]>max){
                secondMax = max;
                max = nums[i];
            }
            else if(nums[i]>secondMax){
                secondMax = nums[i];
            }
        }

        System.out.println(max +" -- "+secondMax);
    }

    static void threeLargest(int nums[]){
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];

        for(int i =1;i<nums.length ;i++){
            if(nums[i]>first){
                third= second;
                second = first;
                first = nums[i];
            }
            else if(nums[i]> second){
                third = second ;
                second = nums[i];
            }
            else if(nums[i]> third){
                third = nums[i];
            }
        }

        System.out.println(first + " --- "+second + " --- "+third);
    }
    static void zeroesToTheEnd(int nums[]){
        int i =0;
        int j= nums.length-1;

        while(i<=j){
            if(nums[i]!=0){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }

    static void shiftEle(int nums[]){
        int i =0; // traversal
        int j= 0; // next position of neg value

        while(i<nums.length){
            if(nums[i]<0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;    
            }
            i++;

        }
    }
    public static void main(String[] args) {

        int arr[]= {1,0,2,2,2,0,0,0,1,1,0,0,2};

        // int arr[] ={-1, 3,4, -5, 12};

        // shiftEle(arr);
        // print(arr);
        // put zeroes to theend of the array
        // int arr[] ={2,0,3,0,2,2,3,5,2,43,430,0,0,0,0};
        // zeroesToTheEnd(arr);
        // print(arr);
        // int nums[] ={2,4,1,6,4,6,34,3,545,23,4,324324};

        // threeLargest(nums);
        // int n = 17;
        // int arr[]=  new int[n];

        // arr[0] = 0;
        // arr[1] = 1;
        // for(int i =2 ; i<n ;i++){
        //     arr[i] = arr[i-1]+arr[i-2];
        // }

        // print(arr);

        // 0,1, 1,,2,3,5,8,13,21....
        // n= 6
        // [0,1,1,2,3,5]


        // int nums [] = {1,2,3,4,5,6};
        // reverse2(nums);
        // print(nums);

        // int nums[] = new int[5];
        // nums[0] = 20;
        // nums[1] = 34;
        // nums[2] = 67;
        // nums[3] = 56;
        // nums[4] = 63;

        // for(int i =0 ;i<nums.length ;i++){
        //     System.out.print(nums[i]+" ");
        // }


    }
}
