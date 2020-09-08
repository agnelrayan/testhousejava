package testhouse;

public interface ICar {
    void start();
    void process();
    void stop();

    public default void methodOneIcar(){

        System.out.println("Default Method Icar...");

    }

    public static void methodTwoStatic(){
        System.out.println("Method Two in Icar");

    }
    public static void methodThree(){

    }



}
