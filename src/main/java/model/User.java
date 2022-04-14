package main.java.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;
    private String address;
    private String login;
    private String password;

    @ManyToMany(mappedBy = "users")
    private List<Convention> conventions;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.login = "";
        this.password = "";
    }

    public User(String firstName, String lastName, String address, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.login = login;
        this.password = password;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Convention> getConventions() {
        return conventions;
    }

    public void setConventions(List<Convention> conventions) {
        this.conventions = conventions;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", conventions=" + conventions +
                '}';
    }
}