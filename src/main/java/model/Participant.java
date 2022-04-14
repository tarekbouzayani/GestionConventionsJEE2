package main.java.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String type;
    private Date date;

    @ManyToMany(mappedBy = "participants")
    private List<Convention> conventions;

    public Participant(String name, String type, Date date) {
        this.name = name;
        this.type = type;
        this.date = date;
    }

    public Participant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Convention> getConventions() {
        return conventions;
    }

    public void setConventions(List<Convention> conventions) {
        this.conventions = conventions;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                ", conventions=" + conventions +
                '}';
    }
}
