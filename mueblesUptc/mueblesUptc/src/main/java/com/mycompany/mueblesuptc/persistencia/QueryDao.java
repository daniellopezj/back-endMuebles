package com.mycompany.mueblesuptc.persistencia;

import com.mycompany.mueblesuptc.persistencia.entities.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class QueryDao {

    @PersistenceContext
    private EntityManager em;

    public List<Producto> getProductoDao() {
        ArrayList<Producto> p =  new ArrayList<>();
        String query = "Select c from  Producto c";
         return em.createQuery(query).getResultList();
    }
}