package oop;

public class University {

    private String name;
    private String address;


    public String getName() {
        return name;
    }

    public University setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public University setAddress(String address) {
        this.address = address;
        return this;
    }
}
