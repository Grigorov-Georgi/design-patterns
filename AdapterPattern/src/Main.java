public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(200);
        MovableAdapter movableAdapter = new MovableAdapterImpl(mercedes);

        System.out.printf("Top speed in mph: %.2f\n", mercedes.getSpeed());
        System.out.printf("Top speed in km/h: %.2f\n", movableAdapter.getSpeed());
    }
}
