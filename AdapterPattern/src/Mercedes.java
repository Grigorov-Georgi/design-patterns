public class Mercedes implements Movable{
    private double topSpeed;

    public Mercedes(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public double getSpeed() {
        return topSpeed;
    }
}
