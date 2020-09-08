package testhouse;

public class StudentM {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId("101");
        System.out.println(student.getId());

        /*student.setName("ABC");
        student.setAge("Tvm");*/

        System.out.println(student.getName());
        System.out.println(student.getCity());
    }
}
