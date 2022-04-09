package tamrin3;

public class Ferrari implements Car {

    @Override
    public void start() {
        System.out.println("Ferrari start");
    }

    @Override
    public void stop() {
        System.out.println("Ferrari stop");
    }

    @Override
    public void speed() {
        System.out.println("Ferrari speed");
    }
}
