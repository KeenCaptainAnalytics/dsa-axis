class Stack{
    int arr[];
    int top;

    Stack(int size){
        arr = new int[size];
        this.top =-1;
    }
    Stack(){
        arr= new int[5];
        this.top =-1;
    }

    void push(int data){
        this.top = this.top +1;
        if(this.top<=arr.length-1){
            this.arr[top]= data;
        }
        else{
            this.top = this.top -1;
            System.out.println("Stack Overflow");
            return;
        }
    }

    Integer peek(){
        if(top==-1){
            System.out.println("stack underflow");
            return null;
        }
        return arr[top];
    }
    void pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return;
        }
        else{
            
            top = top -1;
        }
    }
    int size(){
        return top+1;
    }
}

public class Stack1{
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        st.push(40);
        System.out.println(st.peek());
        st.push(50);
        System.out.println(st.peek());
        System.out.println(st.size());
        // st.push(10);
        st.pop();
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
