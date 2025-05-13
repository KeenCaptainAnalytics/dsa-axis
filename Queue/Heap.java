import java.util.ArrayList;

public class Heap {

   static void  insertIntoMaxHeap(ArrayList<Integer> list, int data){

        list.add(data);
        int index = list.size()-1;

        while(index>=0){
            int parentIndex = (index-1)/2;
            if(parentIndex>=0 && list.get(parentIndex)<list.get(index)){
                int parentEle = list.get(parentIndex);
                int childElement = list.get(index);
                
                list.add(parentIndex, childElement);
                list.add(index , parentEle);
                list.remove(parentIndex+1);
                list.remove(index+1);
                index= parentIndex;

            }
            else{
                break;
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        insertIntoMaxHeap(list, 10);
        insertIntoMaxHeap(list, 20);
        insertIntoMaxHeap(list, 30);
        insertIntoMaxHeap(list, 40);
        insertIntoMaxHeap(list, 50);
        insertIntoMaxHeap(list, 60);

        for(int i =0 ;i < list.size() ;i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
