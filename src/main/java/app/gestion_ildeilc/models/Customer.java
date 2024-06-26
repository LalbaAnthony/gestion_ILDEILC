package app.gestion_ildeilc.models;

import java.time.LocalDate;

public class Customer {

    private final String id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private final LocalDate creationDate;

    public Customer(String id, String firstName, String lastName, String email, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.creationDate = LocalDate.now();
    }

    // ================ Getters ================

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    // ================ Setters ================

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // ================ Methods ================

    public String getNiceName() {
        return firstName + " " + lastName;
    }
}
