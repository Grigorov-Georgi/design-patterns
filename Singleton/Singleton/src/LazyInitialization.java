public class LazyInitialization {
    private static LazyInitialization instance;
    private int counter;

    private LazyInitialization(){}

    public static LazyInitialization getInstance(){
        if (instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }

    public void printAndIncrement(){
        System.out.println("LazyInitialization Singleton: " + counter++);
    }
}
