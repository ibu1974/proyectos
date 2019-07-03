package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeVta;
import mx.com.gnp.demo.dto.Kcirvinc;

public class Kcilvq08 extends AqMensajeVta {

    public Kcirvinc vtaerror;

    public Kcilvq08() {
        super();
        vtaerror = new Kcirvinc();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public Kcirvinc getVtaerror() {
        return this.vtaerror;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setVtaerror(Kcirvinc vtaerror) {
        this.vtaerror = vtaerror;
    }

}