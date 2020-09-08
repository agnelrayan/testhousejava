package testhouse;

public abstract class Car {
    public abstract void carColor();

    public abstract void carType();
    public abstract void carEngine();
    String name;

    public Car(String name){
        this.name=name;
        System.out.println("Car Name is: "+name);
    }


    public void carShow(){
        System.out.println("Car show Method...");
    }


}