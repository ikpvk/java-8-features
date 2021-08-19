package interview;

public class SingletonTest {
    private static String username="";
    private static String password="";

    private static SingletonTest singletonTest = null;

    private SingletonTest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static SingletonTest getConnection(String username, String password) {
        if(null==singletonTest) {
            singletonTest = new SingletonTest(username,password);
        }
        return singletonTest;
    }

}
