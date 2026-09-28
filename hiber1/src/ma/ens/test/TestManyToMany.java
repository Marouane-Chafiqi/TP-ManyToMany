package ma.ens.test;

import java.util.ArrayList;
import ma.ens.entities.Cours;
import ma.ens.entities.Etudiant;
import ma.ens.services.CoursService;
import ma.ens.services.EtudiantService;

/**
 * Had test kayssnaa data b rasso (ma3ndouch ids hard-coded).
 *
 * @author X1 YOGA
 */
public class TestManyToMany {
    public static void main(String[] args) {
        EtudiantService es = new EtudiantService();
        CoursService cs = new CoursService();

        // 1) creer un etudiant w 3 cours
        Etudiant e = new Etudiant("Rami", "Ali", "CNE" + System.currentTimeMillis());
        es.create(e);

        Cours java = new Cours("Java");
        Cours cpp = new Cours("C++");
        Cours php = new Cours("PHP");
        cs.create(java);
        cs.create(cpp);
        cs.create(php);

        // 2) inscrire l'etudiant f Java w C++
        e.setCourses(new ArrayList<Cours>());
        e.getCourses().add(java);
        e.getCourses().add(cpp);
        es.update(e);

        // 3) relire mn la base w 3rd
        Etudiant e2 = es.findById(e.getId());
        if (e2 == null) {
            System.out.println("Etudiant introuvable, chouf la connexion MySQL.");
            return;
        }
        System.out.println("Cours dyal " + e2.getNom() + " " + e2.getPrenom() + " :");
        for (Cours c : e2.getCourses()) {
            System.out.println(" - " + c.getIntitule());
        }
    }
}
