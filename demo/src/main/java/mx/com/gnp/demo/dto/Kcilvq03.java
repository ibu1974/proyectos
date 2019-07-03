package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeVta;
import mx.com.gnp.demo.dto.Kcim16t;

public class Kcilvq03 extends AqMensajeVta {

    public short nuocurre;

    public String inultpag;

    public Kcim16t[] cdlisreg = new Kcim16t[10];

    public Kcilvq03() {
        super();
        inultpag = new String();

        for (int i0 = 0; i0 < 10; i0++) {
            cdlisreg[i0] = new Kcim16t();
        }

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public short getNuocurre() {
        return this.nuocurre;
    }

    public String getInultpag() {
        return this.inultpag;
    }

    public Kcim16t[] getCdlisreg() {
        return this.cdlisreg;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setNuocurre(short nuocurre) {
        this.nuocurre = nuocurre;
    }

    public void setInultpag(String inultpag) {
        this.inultpag = inultpag;
    }

    public void setCdlisreg(Kcim16t[] cdlisreg) {
        this.cdlisreg = cdlisreg;
    }

}