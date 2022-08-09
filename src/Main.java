public class Main {
    public static void main(String[] args) {


        Person person= new Person();

        person.setAge(20);
        person.setName("Ariel");
        person.setPhoneNumber(4499990);
        System.out.println("Name: "+ person.getName());
        System.out.println("Age: "+ person.getAge());
        System.out.println("Phone Number: "+ person.getPhoneNumber());


    }
}

class Person{
    private int age;
    private String name;
    private int phoneNumber;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}