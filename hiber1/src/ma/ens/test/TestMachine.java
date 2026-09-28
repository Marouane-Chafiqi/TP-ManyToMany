package ma.ens.test;

import java.sql.Date;
import ma.ens.entities.Machine;
import ma.ens.entities.Salle;
import ma.ens.services.MachineService;
import ma.ens.services.SalleService;

/**
 * Had test kayssnaa data b rasso (ma3ndouch ids hard-coded),
 * donc kaykhdem f ay base, 7ta ila kanet khawya.
 *
 * @author X1 YOGA
 */
public class TestMachine {
    public static void main(String[] args) {
        MachineService ms = new MachineService();
        SalleService ss = new SalleService();

        // 1) creer une salle (Hibernate kay3mmer s.getId() mn ba3d create)
        Salle s = new Salle("B1", "Salle B1");
        ss.create(s);

        // 2) creer 2 machines f had salle
        ms.create(new Machine("HP", Date.valueOf("2020-09-02"), 1000, s));
        ms.create(new Machine("Dell", Date.valueOf("2021-03-15"), 1200, s));

        // 3) relire la salle mn la base w 3rd machines dyalha
        Salle salle = ss.findById(s.getId());
        if (salle == null) {
            System.out.println("Salle introuvable, chouf la connexion MySQL.");
            return;
        }
        System.out.println("Machines dyal salle " + salle.getCode() + " :");
        for (Machine m : salle.getMachines()) {
            System.out.println(m);
        }
    }
}
