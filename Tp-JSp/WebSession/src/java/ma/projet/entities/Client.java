/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.projet.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import ma.projet.util.Utils;

/**
 *
 * @author YahyaMrd
 */

@Entity
public class Client extends User {
    private String nom;
    private String prenom;
    private Date dateNaissance;

    public Client() {
    }

    public Client(String nom, String prenom, Date dateNaissance, String email, String password) {
        super(email, password);
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

   
    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + '}';
    }
    
    
    }
