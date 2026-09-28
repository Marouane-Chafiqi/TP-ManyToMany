/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ens.services;

import java.util.List;
import ma.ens.dao.IDao;
import ma.ens.entities.Employe;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author X1 YOGA
 */
public class EmployeService extends AbstractFacade<Employe>{

    public EmployeService() {
        super(Employe.class);
    }

   
}
