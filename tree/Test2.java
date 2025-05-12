import java.util.LinkedList;
import java.util.Queue;

public class TESt2 {

    static Tree_Node insert(Tree_Node root, int data){
        Queue<Tree_Node> q = new LinkedList<>();
        if(root == null){
            return new Tree_Node(data);
        }
        q.add(root);
        while(q.size()!=0){
            int n = q.size();
            for(int i =0;i<n;i++){
                Tree_Node front = q.poll();
                if(front.left!=null){
                    q.add(front.left);
                }
                else{
                    front.left = new Tree_Node(data);
                    return root;
                }
                if(front.right!=null){
                    q.add(front.right);

                }
                else{
                    front.right = new Tree_Node(data);
                    return root;
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {

        Tree_Node root =null;
        root=  insert(root,10 );
        insert(root,20 );
        insert(root,30 );
        insert(root,40 );
        insert(root,50 );
        insert(root, 60);
        insert(root, 70);


        System.out.println(root.data);
        System.out.println(root.left.data + "   "+root.right.data);
         System.out.println(root.left.left.data +"  "+root.left.right.data+ "   "+root.right.left.data+"  "+root.right.right.data);
        // Tree_Node t = new Tree_Node(20);
        // t.left=  new Tree_Node(30);
        // t.right = new Tree_Node(40);
        // t.left.left = new Tree_Node(50);
        // t.left.right =new Tree_Node(60);

        // t.right.left= new Tree_Node(70);
        // t.right.right = new Tree_Node(80);

    }
}
