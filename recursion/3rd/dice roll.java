public class RollDice {

    static void helperDice(int currSum , int target){
        if(currSum == target){
            System.out.println("there is one way");
            return ;
        }
        if(currSum> target){
            System.out.println("-----");
            return;
        }
        helperDice(currSum+1, target);
        helperDice(currSum+2, target);
        helperDice(currSum+3, target);
        helperDice(currSum+4, target);
        helperDice(currSum+5, target);
        helperDice(currSum+6, target);
    } 
    public static void main(String[] args) {
        helperDice(0, 4);
    }
}
