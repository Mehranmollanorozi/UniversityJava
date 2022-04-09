package tamrin3;

public class MainClass {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        Car car1=carFactory.getCar(1);
        car1.start();
        car1.stop();
        car1.speed();
        Car car2=carFactory.getCar(2);
        car2.start();
        car2.stop();
        car2.speed();
        Car car3=carFactory.getCar(3);
        car3.start();
        car3.stop();
        car3.speed();
    }
}