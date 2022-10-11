public class Main {
    public static void main(String[] args) {
        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        eagerInitialization.printAndIncrement();
        eagerInitialization.printAndIncrement();
        System.out.println("--------------------------------------");
        StaticBlock staticBlock = StaticBlock.getInstance();
        staticBlock.printAndIncrement();
        staticBlock.printAndIncrement();
        System.out.println("--------------------------------------");
        LazyInitialization lazyInitialization = LazyInitialization.getInstance();
        lazyInitialization.printAndIncrement();
        lazyInitialization.printAndIncrement();
        System.out.println("--------------------------------------");
        ThreadSafe threadSafe = ThreadSafe.getInstance();
        threadSafe.printAndIncrement();
        threadSafe.printAndIncrement();
        System.out.println("--------------------------------------");
        EnumSingleton.doSomething();
    }
}
