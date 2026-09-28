/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ens.entities;

import javax.persistence.Entity;

/**
 *
 * @author X1 YOGA
 */

@Entity
public class Employe extends User{
    
    private String matricule;

    public Employe() {
    }

    public Employe(String matricule, String nom, String prenom) {
        super(nom, prenom);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    
    
    
}
