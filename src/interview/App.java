package interview;

public class App {
    public static void main(String[] args) {
        SingletonTest t1 = SingletonTest.getConnection("Tony","P1");
        SingletonTest t2 = SingletonTest.getConnection("Steve","P2");
        System.out.println(t1==t2);
    }
}
