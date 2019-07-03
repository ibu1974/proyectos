package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeIda;
import mx.com.gnp.demo.dto.Kcim52t;
import mx.com.gnp.demo.dto.Kciricom;

public class Kciliq04 extends AqMensajeIda {

    public short nuocurre;

    public String inultpag;

    public Kcim52t[] cdlisreg = new Kcim52t[10];

    public Kciricom datgesco;

    public Kciliq04() {
        super();
        inultpag = new String();

        for (int i0 = 0; i0 < 10; i0++) {
            cdlisreg[i0] = new Kcim52t();
        }
        datgesco = new Kciricom();

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

    public Kcim52t[] getCdlisreg() {
        return this.cdlisreg;
    }

    public Kciricom getDatgesco() {
        return this.datgesco;
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

    public void setCdlisreg(Kcim52t[] cdlisreg) {
        this.cdlisreg = cdlisreg;
    }

    public void setDatgesco(Kciricom datgesco) {
        this.datgesco = datgesco;
    }

}