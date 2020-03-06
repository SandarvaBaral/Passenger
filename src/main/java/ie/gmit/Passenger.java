package ie.gmit;

public class Passenger {

    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public Passenger(String title, String name, String id, String phone, int age){
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }

    public void setTitle(String title) {
        if(title == "Mr" || title == "Mrs" || title == "Ms"){
            this.title = title;
        }else
            throw new IllegalArgumentException("Invalid title provided");
    }

    public void setName(String name) {
        if(name.length() >=3 ){
            this.name = name;
        }else
            throw new IllegalArgumentException("Name must have a minimum of 3 characters");
    }

    public void setId(String id) {
        if(id.length() >= 10){
            this.id = id;
        }else
            throw new IllegalArgumentException("ID must have a minimum of 10 characters");
    }

    public void setPhone(String phone) {
        if(phone.length() >= 10) {
            this.phone = phone;
        }else
            throw new IllegalArgumentException("Phone number must have a minimum of 10 characters");
    }

    public void setAge(int age) {
        if(age > 16) {
            this.age = age;
        }else
            throw new IllegalArgumentException("Passenger must be older than 16 to fly");
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
