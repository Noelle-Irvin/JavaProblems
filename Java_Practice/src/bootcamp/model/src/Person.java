public class Person{

    String name;
    String email;
    String phone;

//constructor

    public Person(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        System.out.println(email);
        return email;
    }
    public String getPhoneNumber() {
        System.out.println(phone);
        return phone;
    }
    public void setPhoneNumber (String phone) {
        this.phone = phone;
    }
    public void printGreeting(Person x){
        System.out.println("Hello "+ x.getName()+", im "+ name + ".");
    }
}







