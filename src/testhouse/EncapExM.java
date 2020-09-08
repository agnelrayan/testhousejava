package testhouse;

public class EncapExM {
    public static void main(String[] args) {
        EncapEx en = new EncapEx();
        en.setId("101");
        en.setName("Abc");
        en.setAge(23);

        System.out.println("Id is: " +en.getId()+ " Name Is:" +en.getName()+ " Age is: "+en.getAge());
    }
}
