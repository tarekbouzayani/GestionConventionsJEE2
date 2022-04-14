package main.java.model;


import main.java.enumeration.TypeConventionEnum;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Convention {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private TypeConventionEnum type;
    private String objet;
    private Date dateEdition;
    private Date dateVigueur;
    private Date dateExpiration;

    @ManyToMany
    private List<User> users;

    @ManyToMany
    private List<Participant> participants;


    public Convention() {
    }

    public TypeConventionEnum getType() {
        return type;
    }

    public void setType(TypeConventionEnum type) {
        this.type = type;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Date getDateEdition() {
        return dateEdition;
    }

    public void setDateEdition(Date dateEdition) {
        this.dateEdition = dateEdition;
    }

    public Date getDateVigueur() {
        return dateVigueur;
    }

    public void setDateVigueur(Date dateVigueur) {
        this.dateVigueur = dateVigueur;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Convention{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", objet='" + objet + '\'' +
                ", dateEdition=" + dateEdition +
                ", dateVigueur=" + dateVigueur +
                ", dateExpiration=" + dateExpiration +
                ", users=" + users +
                ", participants=" + participants +
                '}';
    }
}

