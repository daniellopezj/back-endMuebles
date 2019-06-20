package com.mycompany.mueblesuptc.persistencia;

import com.mycompany.mueblesuptc.persistencia.entities.Cliente;
import com.mycompany.mueblesuptc.persistencia.entities.Factura;
import com.mycompany.mueblesuptc.persistencia.entities.Producto;
import com.mycompany.mueblesuptc.persistencia.entities.Tarjeta;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class QueryDao {

    @PersistenceContext(unitName = "com.mycompany_mueblesUptc_war_1.0-SNAPSHOTPU")
    private EntityManager em;
    @PersistenceContext(unitName = "com.mycompany_mueblesUptc_war_1.0-SNAPSHOTPU2")
    private EntityManager emf;
    

    public List<Producto> getProductoDao() {
        ArrayList<Producto> p = new ArrayList<>();
        String query = "Select c from  Producto c";
        return em.createQuery(query).getResultList();
    }

    public List<Factura> getComprasDao() {
        ArrayList<Factura> p = new ArrayList<>();
        String query = "Select c from Factura c";
        return em.createQuery(query).getResultList();
    }

    public Cliente getClienteDao(Cliente c) {
        List<Cliente> p = new ArrayList<>();
        String query = "Select c from  Cliente c";
        p = em.createQuery(query).getResultList();
        for (Cliente cliente : p) {
            if (cliente.getDocumento().equals(c.getDocumento())) {
                return cliente;
            }
        }
        c.setId_cliente(p.size() + 1);
        em.persist(c);
        return c;
    }

    public List<String> createFactura(Factura f) {
        em.persist(f);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }
    
     public List<String> createCliente(Cliente f) {
        em.persist(f);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }
    
     public List<String> createtarjeta(Tarjeta f) {
        em.persist(f);
        List l = new ArrayList();
        l.add("OK");
        return l;
    }
}
