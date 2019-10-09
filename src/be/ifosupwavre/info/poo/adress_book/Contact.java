package be.ifosupwavre.info.poo.adress_book; //Attention au package!

import java.time.LocalDate;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private int zipcode;
    private String phoneNumber;
    private String email;
    private LocalDate birthday;


    Contact(String firstName, String lastName, String address, String city, int zipcode, String phoneNumber, String email, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
    }

    public Contact(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
