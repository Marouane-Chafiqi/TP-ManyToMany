/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ens.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author X1 YOGA
 */

@Entity
public class Etudiant extends User{
    private String cne;
    @ManyToMany( fetch = FetchType.EAGER)
    private List<Cours> courses;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom,String cne) {
        super(nom, prenom);
        this.cne = cne;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public List<Cours> getCourses() {
        return courses;
    }

    public void setCourses(List<Cours> courses) {
        this.courses = courses;
    }
    
    
}
