package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeVta;
import mx.com.gnp.demo.dto.Kcirvq05;

public class Kcilvq05 extends AqMensajeVta {

    public Kcirvq05 salida;

    public Kcilvq05() {
        super();
        salida = new Kcirvq05();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public Kcirvq05 getSalida() {
        return this.salida;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setSalida(Kcirvq05 salida) {
        this.salida = salida;
    }

}