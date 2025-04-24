import java.util.HashMap;

public class ALeetcode1HAshMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {2,5,6,9,12},target = 21;
        
        for(int i=0;i<arr.length ;i++){
            int curr = arr[i];
            int diff = target-curr;
            if(map.containsKey(diff)){
                System.out.println(i+"--"+map.get(diff));
                return ;
            }
            else{
                map.put(arr[i], i);
            }
        }
    }
}
