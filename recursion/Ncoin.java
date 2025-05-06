import java.util.ArrayList;

public class Ncoin {

    static int noWays(int target, int currentSum, String ans, ArrayList<String> list){
        if(target == currentSum){
            list.add(ans);
            return 1;
        }
        else if(currentSum > target){
            return 0;
        }

        int ways1 =noWays(target, currentSum+1, ans+"1", list);
        int ways2 =noWays(target, currentSum+2, ans+"2", list);
        int ways5 = noWays(target, currentSum+5, ans+"5", list);
        int total = ways1+ ways2+ ways5;
        return total;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int result = noWays(5, 0, "", list);

        System.out.println(list);
        System.out.println(result);
    }
}
