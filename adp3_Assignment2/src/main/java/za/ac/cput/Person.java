package za.ac.cput;

//for Testing Object Identity
public class Person {
    String name, surname;

    public String name(String name){
        this.name = name;
        return name;
    }

    public String surname(String surname){
        this.surname = surname;
        return surname;
    }
}
