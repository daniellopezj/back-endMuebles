package com.mycompany.mueblesuptc.servicios;

import com.mycompany.mueblesuptc.logica.transaccionLogica;
import com.mycompany.mueblesuptc.persistencia.entities.Producto;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("compra")
public class ServicioCompra {
      @EJB
    private transaccionLogica pl;

    @GET
    public List<Producto> getProdcutos() {
        return pl.obtenerProductoLogica();
    }
    
     @GET
    @Path("/")
    @Produces({MediaType.TEXT_PLAIN})
    public Response index() {
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .entity("")
                .build();
    }
}
