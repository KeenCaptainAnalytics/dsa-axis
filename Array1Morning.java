class Array1Morning{

    
    static void reverse(int nums[]){
        int i =0 ;
        int j = nums.length-1;
        while(i<j){
            int temp  = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    static void print(int [] nums){
        for(int i =0 ;i< nums.length ;i++){
            System.out.print(nums[i]+" ");
        }
    }

    static void reverseTheNum(int num){
    
        int rev=0;

        while(num>0){
            int digit = num%10;//4, 3, 2,1
            rev = rev*10 + digit;//0 +4, 40 + 3=43, 430 + 2, 4320+1
            num = num/10;//123, 12,1, 0
        }
        System.out.println(rev);
    }
    static void twoLargest(int nums[]){
        int max = nums[0];
        int secondMax = nums[1];

        for(int i=1;i<nums.length ; i++){
            if(nums[i]>max){
                secondMax = max;
                max= nums[i];
            }
            else if (secondMax > nums[i]){
                secondMax = nums[i];
            }
        }

        System.out.println(max + " --- "+secondMax);
    }

    static void threeLargest(int nums[]){
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];

        for(int i =1;i<nums.length ;i++){
            if(nums[i]>first){
                third = second ;
                second = first ;
                first = nums[i];
            }
            else if(nums[i]> second){
                third = second;
                second = nums[i];
            }
            else if(third < nums[i]){
                third = nums[i];
            }
        }
        System.out.println(first + " -- "+second + " -- "+third);
    }
   public static void main(String[] para) {

                
    int arr[] = {0,1,2,3,5,4};
    int n = arr.length;
    

    // int arr[] = {1,5,8,2,4,9,12,56,23,78};


    // threeLargest(arr);
    //twoLargest(arr);

    // int n = 10;

    // int arr[] = new int[n];
    // arr[0] = 0;
    // arr[1] = 1;

    // for(int i =2;i<n ;i++){
    //     arr[i] = arr[i-1]+arr[i-2];
    // }

    // print(arr);



    // fibo = > first = 0 , second = 1, 
    // 0, 1, 1 , 2 , 3, 5,  8, 13, ......

    // reverse this number
    // int num = 12334;
    // reverseTheNum(num);

    // int students[] = {1,2,3,4,5,6,7};
    
    // Ques 1 = > reverse the array

    // reverse(students);
    // print(students);



    //  int students[] =  new int[5];

    // students[0] = 23;
    // students[1] = 34;
    // students[2] = 45;
    // students[3] = 78;
    // students[4] =90;

    // //  traversing 
    // for(int i =0 ;i < students.length; i++){
    //     System.out.println(students[i]);
    // }



   } 
}
