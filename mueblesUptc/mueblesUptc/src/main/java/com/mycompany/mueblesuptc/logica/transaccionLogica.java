package com.mycompany.mueblesuptc.logica;

import com.mycompany.mueblesuptc.persistencia.QueryDao;
import com.mycompany.mueblesuptc.persistencia.entities.Producto;
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
}
