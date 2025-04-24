
import java.util.HashMap;
import java.util.Map;

public class ARepeatSorted {

    static void removeDuplicates(int arr[]){
        int j=0;
        int counter =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){

            }
            else{
                arr[j]= arr[i];
                j++;
                counter++;;
            }
        }

        arr[j]=arr[arr.length-1];

        for(int i=0;i<=counter ;i++){
            System.out.print(arr[i]+" - ");
        }
    }
    static void countFreq(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length ;i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1 );
            }
            else{
                map.put(arr[i], 1);
            }
        }

         System.out.println(map);
        int sum =0 ; 
       for(Map.Entry<Integer, Integer> en :  map.entrySet()){
          
            if(en.getValue()%2==0){
                sum = sum +en.getKey();
            }
       }
       System.out.println(sum);
    }
    public static void main(String[] args) {

        // find the freq of all the elements
        int arr[] ={1,2,3,2,1,2,3,3,4,3,1,4,4,3,2,3,2,2};
        countFreq(arr);

        // int arr[]= {0,0,1,1,1,1,1,2,2,2,3,3,3,3,3,4,5,5,5};

        // removeDuplicates(arr);

    }
}
