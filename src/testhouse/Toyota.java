package testhouse;

public class Toyota extends Car{
    public Toyota(String name){
        super(name);
        //this.name=name;
    }
    @Override
    public void carColor() {
        System.out.println("Color in Toyoto...");
    }

    @Override
    public void carType() {
        System.out.println("Car type in Toyota...");

    }

    @Override
    public void carEngine() {

        System.out.println("Engine in Toyota...");
    }

    public void methodToyota(){
        System.out.println("Toyota Method...");
    }



}
