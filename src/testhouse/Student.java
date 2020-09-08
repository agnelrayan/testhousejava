package testhouse;

public class Student {
    private String id;
    private String name="IJK";
    private String city="Kochi";

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public String getCity() {
        return city;
    }

   /* public void setAge(String city) {
        this.city = city;
    }*/



    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }
}
