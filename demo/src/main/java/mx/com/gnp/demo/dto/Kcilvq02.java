package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeVta;
import mx.com.gnp.demo.dto.Kcirvinc;

public class Kcilvq02 extends AqMensajeVta {

    public Kcirvinc[] multierr = new Kcirvinc[25];

    public short nuobjvig;

    public short nuobjpen;

    public short nuobjanu;

    public String tsultmod;

    public Kcilvq02() {
        super();
        for (int i0 = 0; i0 < 25; i0++) {
            multierr[i0] = new Kcirvinc();
        }
        tsultmod = new String();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public Kcirvinc[] getMultierr() {
        return this.multierr;
    }

    public short getNuobjvig() {
        return this.nuobjvig;
    }

    public short getNuobjpen() {
        return this.nuobjpen;
    }

    public short getNuobjanu() {
        return this.nuobjanu;
    }

    public String getTsultmod() {
        return this.tsultmod;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setMultierr(Kcirvinc[] multierr) {
        this.multierr = multierr;
    }

    public void setNuobjvig(short nuobjvig) {
        this.nuobjvig = nuobjvig;
    }

    public void setNuobjpen(short nuobjpen) {
        this.nuobjpen = nuobjpen;
    }

    public void setNuobjanu(short nuobjanu) {
        this.nuobjanu = nuobjanu;
    }

    public void setTsultmod(String tsultmod) {
        this.tsultmod = tsultmod;
    }

}