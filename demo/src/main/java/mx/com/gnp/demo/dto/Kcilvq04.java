package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeVta;
import mx.com.gnp.demo.dto.Kcirvinc;

public class Kcilvq04 extends AqMensajeVta {

    public Kcirvinc[] multierr = new Kcirvinc[25];

    public Kcilvq04() {
        super();
        for (int i0 = 0; i0 < 25; i0++) {
            multierr[i0] = new Kcirvinc();
        }

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public Kcirvinc[] getMultierr() {
        return this.multierr;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setMultierr(Kcirvinc[] multierr) {
        this.multierr = multierr;
    }

}