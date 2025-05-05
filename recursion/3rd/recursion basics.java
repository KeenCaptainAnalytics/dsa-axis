class TestRec{

    static void print(int n ){
        if(n==0){//terminating case
            return;
        }
        // print(n-1); // func call (head rec)
        System.out.println(n); //logic
       print(n-1);
    }
    
    static int getSum(int num){
        if(num ==0 ){
            return 0;
        }
        int result = getSum(num/10);
        return num%10 + result;
        
    }

    static int  fact(int n){

        if(n == 0){
            return 1;
        }
        int result = n* fact(n-1);
        return result;
    }

    static int pattern(int n){
        if(n == 1){
            return 5;
        }
       return  n*(n+1)+(n+2) + pattern(n-1);
    }

    static int count(int arr[] , int i){
        if(arr.length==i){
            return 0;
        }
        int c = count(arr, i+1);
        if(arr[i]==0){
            return c+1;
        }
        else{
            return c;
        }
        // return arr[i]==0 ? c+1 : c ;

        

    }

    static void reverse(int arr[],int i){
        if(i>=(arr.length/2)){
            return ;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-i-1] = temp;

        reverse(arr, i+1);

    }
    static int getvowelCount(String s, int i){
        if(i == s.length()){
            return 0;
        }

        int result = getvowelCount(s, i+1);
        if(s.charAt(i)=='a' ||  s.charAt(i)=='e'|| s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'  ){
           result = result +1 ; 
        }

        return result;
    }
    public static void main(String[] args) {

        String s ="ashfiashfiefnasn";
        System.out.println(getvowelCount(s, 0));

        // int arr[] = {1,2,3,4,5,6,7};
        // reverse(arr, 0);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println(pattern(5));
        // f(n) = ?
        // f(1) = 1*2+3 (base case)
        // pattern  =  1*2+3 + 2*3+4 +3*4+5 +4*5+6......n*(n+1)+(n+2)

        // f(n) = n *(n+1)+(n+2) + f(n-1);
        // f(1) =5;

        pattern(5);

        // int result = fact(5);
        // System.out.println("factorial of 5 = "+ result);
        // fact(n) = n* fact(n-1);
        // f(n)= n * f(n-1);
        // 4! = 4 * 3!
        // 3! = 3 * 2!
        // 2! = 2 * 1!
        // 1! = 1 * 0!;
        // 0! = 1
        // recursive fun they only concentrate on soling subproblem

        // int num = 34535;
        // System.out.println(getSum(num));
        // int sum = doSum(num);

        // print(10);
        // for(int i=0;i<5;i++){
        //     System.out.println("hello world");
        // }
    }
}
