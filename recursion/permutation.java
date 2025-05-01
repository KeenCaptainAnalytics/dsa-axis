import java.util.ArrayList;

public class PermutationArray {

    static void permutation(String arr, ArrayList<Integer> tempAns, ArrayList<ArrayList<Integer>> ans){

        if(arr.length()==0){
            ans.add(new ArrayList<>(tempAns));
            return;
        }

        for(int i=0;i<arr.length();i++){
            tempAns.add((int)arr.charAt(i)-'0');
        
            permutation(arr.substring(0, i)+arr.substring(i+1), tempAns, ans);

            tempAns.remove(tempAns.size()-1);
        }


    }
   public static void main(String[] args) {
    int arr[] = {1,2,3};
    String a="";
    for(int i=0;i<arr.length;i++){
        a = a+arr[i];
    }

    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> tempAns =  new ArrayList<>();
    permutation(a,tempAns, ans );

    System.out.println(ans);
   } 
}
