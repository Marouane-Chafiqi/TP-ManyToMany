/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ens.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author X1 YOGA
 */
@Entity
public class Machine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marque;
    @Temporal(TemporalType.DATE)
    private Date dateAchat;
    private double prix;
    @ManyToOne
    private Salle salle;

    public Machine() {
    }

    public Machine(String marque, Date dateAchat, double prix, Salle salle) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.salle = salle;
    }

  
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
    
    

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", marque=" + marque + ", dateAchat=" + dateAchat + ", prix=" + prix + '}';
    }
    
    
    
}
