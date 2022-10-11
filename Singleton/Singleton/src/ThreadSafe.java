public class ThreadSafe {
    private static ThreadSafe instance;
    private int counter;

    private ThreadSafe(){}

    public static synchronized ThreadSafe getInstance(){
        if (instance == null){
            instance = new ThreadSafe();
        }
        return instance;
    }

    public void printAndIncrement(){
        System.out.println("ThreadSafe Singleton: " + counter++);
    }
}
