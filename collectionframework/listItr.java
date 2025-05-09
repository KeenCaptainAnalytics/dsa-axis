import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class CollectionTest{
    public static void main(String[] args) {

       
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> itr = list.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
        // Iterator<Integer> cursor = list.iterator();

        // while(cursor.hasNext()){
        //     int ele = cursor.next();
        //     System.out.println(ele);
        //     if(ele==30){
        //         break;
        //     }
        // }

        // System.out.println("-----------------");
        // while(cursor.hasNext()){
        //     int ele = cursor.next();
        //     System.out.println(ele);
        //     if(ele==30){
        //         break;
        //     }
        // }

        // while(cursor.){
        //     System.out.println(cursor.next());
        // }
        


        // 10 elements sum
        // ArrayList<Integer> temp = new ArrayList<>();
        // temp.add(100);
        // temp.add(200);
        // temp.add(300);
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(20);
        // arr.add(30);
        // arr.add(40);
        // int ele = arr.get(1);
        // arr.addAll(temp);
        // System.out.println(arr);
        // arr.contains(20);
   



    //    ArrayList<Integer> list = new ArrayList<>(20);
    //     List<Integer> li2 = new ArrayList<>(20);
    //     Queue<Integer> 

        // ArrayList<Integer> arr=  new ArrayList<>();
        // LinkedList<Integer> list  = new LinkedList<>(
        // list.removeLast();
        // collection =>  list (traverse) => (arraylist linkedlist)
        // // Collection ref; 
        // ArrayList<Integer> arr= new ArrayList<>();
        // Collection<Integer> ref = new ArrayList<>();

        // collection framework of various data structure related classes and interface
        // collection - interface
    }
}
