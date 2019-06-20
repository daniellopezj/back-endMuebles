package com.mycompany.mueblesuptc.persistencia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tarjeta {
    static final double valormonto = 5000000;
    @Id                 
    private int id_tarjeta;
    private Double monto;
   
    public int getId_tarjeta() {
        return id_tarjeta;
    }

    public void setId_tarjeta(int id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}