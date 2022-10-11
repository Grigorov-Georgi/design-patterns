public class MovableAdapterImpl implements MovableAdapter{
    private Movable car;

    public MovableAdapterImpl(Movable car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertSpeed(car.getSpeed());
    }

    private double convertSpeed(double speed){
        return speed * 1.60934;
    }
}
