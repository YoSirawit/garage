
public class Channel {
    private Car car;
    public void addCar(Car car) {
        this.car = car;
    }
    public void removeCar() {
        this.car = null;
    }
    public Car getCar() {
        return this.car;
    }
}

