package testhouse;

public class Salary extends Employee{

    private double salary;
    public Salary(String id, String name, String address,double salary) {
        super(id, name, address);
        setSalary(salary);
    }

    public Double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary>0.0){
            salary=newSalary;
        }


    }

    public double computePay(){
        System.out.println("Computing salary for "+getName());
        return salary/52;
    }


}
