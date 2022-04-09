package tamrin3;

public class Bmv implements Car{
    @Override
    public void start() {
        System.out.println("Bmw start");
    }

    @Override
    public void stop() {
        System.out.println("Bmw stop");
    }

    @Override
    public void speed() {
        System.out.println("Bmw speed");
    }
}
