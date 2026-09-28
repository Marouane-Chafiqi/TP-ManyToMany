/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ens.test;

import ma.ens.entities.Salle;
import ma.ens.services.SalleService;
import org.hibernate.Hibernate;
import util.HibernateUtil;

/**
 *
 * @author X1 YOGA
 */
public class Test {
    
    public static void main(String[] args) {
        SalleService ss = new SalleService();
        ss.create(new Salle("A1", "A1"));
        
//        System.out.println(ss.findById(1).getCode());
       // ss.delete(ss.findById(1));
        
        for(Salle s : ss.findAll())
            System.out.println(s.getCode());
    }
    
}
