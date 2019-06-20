package com.mycompany.mueblesuptc.logica;

import com.mycompany.mueblesuptc.persistencia.QueryDao;
import com.mycompany.mueblesuptc.persistencia.entities.Cliente;
import com.mycompany.mueblesuptc.persistencia.entities.Factura;
import com.mycompany.mueblesuptc.persistencia.entities.Producto;
import com.mycompany.mueblesuptc.persistencia.entities.Tarjeta;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class transaccionLogica {
    
    @EJB
    private QueryDao dao;
    
    public List<Producto> obtenerProductoLogica() {
        return dao.getProductoDao();
    }
    
    public List<Factura> obtenerComprasLogica() {
        return dao.getComprasDao();
    }
    
    public Cliente iscliente(Cliente c) {
    return dao.getClienteDao(c);
    }

     public List<String> createCliente(Cliente f) {
        return dao.createCliente(f);
    }
    public List<String> createFactura(Factura f) {
        return dao.createFactura(f);
    }
    
      public List<String> createtarjeta(Tarjeta f) {
        return dao.createtarjeta(f);
    }
}
