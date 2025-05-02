public class Queue {
    int arr[];
    int front;
    int rear;
    Queue(int size){
        arr= new int[size];
        front= -1;
        rear = -1;
    }

    void enqueue(int data){
        if((this.rear+1)%arr.length != front){
            arr[rear+1] = data;
            rear = rear+1;
            if(rear == 0 && front==-1){
                front=0;
            }
        }
        else{
            System.out.println("overflow");
        }
    }

    void dequeue(){
        if(front!=-1){
            if(front==rear){
                front=-1;
                rear=-1;
            }
            front = (front+1)%arr.length;
        }
        else{
            System.out.println("underflow");
        }
    }
    Integer top(){
        if(front==-1){
            return null;
        }
        else{
            return arr[front];
        }
    }

    int size(){
        if(front< rear){
            return rear-front+1;
        }
        else if(front == rear ){
            return 1;
        }
        else{
            return arr.length-front + rear+1;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        System.out.println(q.top());
        System.out.println(q.size());
        
    }
}
