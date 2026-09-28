/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ens.test;

import ma.ens.entities.Employe;
import ma.ens.entities.Etudiant;
import ma.ens.services.EmployeService;
import ma.ens.services.EtudiantService;

/**
 *
 * @author X1 YOGA
 */
public class TestUser {
    
    public static void main(String[] args) {
        EmployeService es = new EmployeService();
        EtudiantService ees = new EtudiantService();
        
        es.create(new Employe("3333", "Alami", "siham"));
        ees.create(new Etudiant("Rami", "Ali", "3432423542"));
    }
    
}
