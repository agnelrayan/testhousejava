package testhouse;

public class Employee {
    private String id;
    private String name;
    private String address;

    public Employee(String id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
        System.out.println("Employee Constructor is called...");

    }

    public double computePay(){
        System.out.println("Inside Employee ComputePay");
        return 0.0;
    }

    public void mailCheck(){
        System.out.println("Mailing Check: "+this.id+" " +this.address);
    }

    public String toString(){
        return id + " " +name+ " " +address;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;

    }

}
