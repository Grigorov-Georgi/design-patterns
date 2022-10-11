public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();
    private int counter = 0;

    private EagerInitialization(){};

    public static EagerInitialization getInstance(){
        return instance;
    }

    public void printAndIncrement(){
        System.out.println("EagerInitialization Singleton: " + counter++);
    }
}
