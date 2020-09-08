package testhouse;

public class EmployeeM {
    public static void main(String[] args) {
        Salary objOne = new Salary("101","Abc","Tvm",20000);
        Employee objTwo = new Salary("102","Ijk","Kochi",30000);
        objOne.getName();
        objOne.computePay();
        objOne.getSalary();
        objOne.mailCheck();
        objTwo.mailCheck();


    }
}
