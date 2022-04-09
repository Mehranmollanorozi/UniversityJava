package tamrin3;

public class Benz implements Car{
    @Override
    public void start() {
        System.out.println("Benz start");
    }
    @Override
    public void stop() {
        System.out.println("Benz stop");
    }

    @Override
    public void speed() {
        System.out.println("Benz speed");
    }
}
