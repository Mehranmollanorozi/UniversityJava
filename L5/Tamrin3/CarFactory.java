package tamrin3;

public class CarFactory {
    public Car getCar(Integer Cartype){
        if (Cartype == null){
            return null;
        }
        else if (Cartype==1){
            return new Bmv();
        }
        else if (Cartype==2){
            return new Benz();
        }
        else if (Cartype==3){
            return new Ferrari();
        }
        return null;
    }
}
