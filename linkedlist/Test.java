public class Test {
    // call stack

    static void doSomethingEvenMore(){
        System.out.println("line 7");
    }
    static void doSomethingMore(){
        System.out.println("line 5");
        doSomethingEvenMore();
        System.out.println("line 6");
    }
    static void doSomething(){
        System.out.println("line 3");
        doSomethingMore();
        System.out.println("line 4");
    }
    public static void main(String[] args) {
        System.out.println("line 1");
        doSomething();
        System.out.println("line 2");

    }
}
