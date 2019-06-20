package com.mycompany.mueblesuptc.servicios;

import com.mycompany.mueblesuptc.logica.transaccionLogica;
import com.mycompany.mueblesuptc.persistencia.entities.Cliente;
import com.mycompany.mueblesuptc.persistencia.entities.Factura;
import com.mycompany.mueblesuptc.persistencia.entities.Tarjeta;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("compra")
public class ServicioCompra {

    @EJB
    private transaccionLogica pl;

    @GET
    public List<Factura> getCompras() {
        return pl.obtenerComprasLogica();
    }

    @POST
    public List<String> insertarCompra(Factura f) {
        System.out.println("hola entre a " + f);
        return pl.createFactura(f);
    }

    @POST
    @Path("/t")
    public List<String> ins(Tarjeta f) {
        return pl.createtarjeta(f);
    }

    @POST
    @Path("/c")
    public List<String> InsertarCliente(Cliente c) {
        return pl.createCliente(c);
    }

    @POST
    @Path("/prueba")
    public Cliente ConsultarCliente(Cliente c) {
        return pl.iscliente(c);
    }

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
