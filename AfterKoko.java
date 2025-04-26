public class AfterKoko {


    static int getMax(int arr[]){
        int max =arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }

        return max;

    }

    static int findHoursTakenByKoko(int count, int []arr){
        int hours =0 ;
        for(int i=0;i<arr.length ;i++){
            if(arr[i]%count == 0){
                hours = hours + arr[i]/count;
            }
            else{
                hours = hours + arr[i]/count+1;
            }
        }
        return hours;
    }
    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
        int h = 8;

        int max = getMax(piles);
        
        int lo = 1;
        int high = max;

        while(lo<=high){
            int mid= (lo+high)/2;
            int kokoHours = findHoursTakenByKoko(mid, piles);

            System.out.println(kokoHours);
            if(kokoHours == h){
                System.out.println("koko allowed count = "+mid);
                return;
            }
            else if(kokoHours > h){
                lo = mid+1;
            }
            else if(kokoHours<h){
                high = mid-1;
            }
        }
    }
}
