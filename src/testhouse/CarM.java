package testhouse;

public class CarM {
    public static void main(String[] args) {
        //Car car = new Car();


        BMW bmw = new BMW("BMW");
        bmw.carColor();
        bmw.carEngine();
        bmw.carType();
        bmw.methodBMW();

        Toyota toyota = new Toyota("Toyota");
        toyota.carColor();
        toyota.carEngine();
        toyota.carType();
        toyota.methodToyota();

        toyota.carShow();
        bmw.carShow();


        //Calendar cal = Calendar.getInstance();
    }
}