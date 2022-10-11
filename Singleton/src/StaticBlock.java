public class StaticBlock {
    private static StaticBlock instance;
    private int counter;

    private StaticBlock(){}

    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e){
            throw new RuntimeException("Exception");
        }
    }

    public static StaticBlock getInstance(){
        return instance;
    }

    public void printAndIncrement(){
        System.out.println("StaticBlock Singleton: " + counter++);
    }
}
