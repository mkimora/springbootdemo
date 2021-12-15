package com.mguissendiaye.springbootdemo.entity;

import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    @Column(name = "idUser", nullable = false)
    private Long idUser;
    private String user_prenom_nom;
    private String adresseUser;
    private String emailUser;
    private String password;



    public User() {
    }

    public User(Long idUser, String user_prenom_nom, String adresseUser, String emailUser, String password) {
        this.idUser = idUser;
        this.user_prenom_nom = user_prenom_nom;
        this.adresseUser = adresseUser;
        this.emailUser = emailUser;
        this.password = password;
    }

    public User(String user_prenom_nom, String adresseUser, String emailUser, String password) {
        this.user_prenom_nom = user_prenom_nom;
        this.adresseUser = adresseUser;
        this.emailUser = emailUser;
        this.password = password;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUser_prenom_nom() {
        return user_prenom_nom;
    }

    public void setUser_prenom_nom(String user_prenom_nom) {
        this.user_prenom_nom = user_prenom_nom;
    }

    public String getAdresseUser() {
        return adresseUser;
    }

    public void setAdresseUser(String adresseUser) {
        this.adresseUser = adresseUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
