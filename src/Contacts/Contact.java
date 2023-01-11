package Contacts;

public class Contact {
    public String name;
    public int number;
    // constructor
    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.number = phoneNumber;
    }

    public String getName(){
        // return the person's name
        return this.name;
    }

    public int getNumber(){
        // return the person's name
        return this.number;
    }

    public void setName(String name){
        // change the name field to the passed value
        this.name = name;
    }

    public void setNumber(int number){
        // change the number field to the passed value
        this.name = name;
    }
}
