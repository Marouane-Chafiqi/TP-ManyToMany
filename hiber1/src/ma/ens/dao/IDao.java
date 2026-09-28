/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.ens.dao;

import java.util.List;

/**
 *
 * @author X1 YOGA
 */
public interface IDao <T> {
    
    public abstract boolean create (T o);
    boolean delete (T o);
    boolean update (T o);
    T findById (long id);
    List<T> findAll ();
    
    
}
