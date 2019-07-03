package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeIda;
import mx.com.gnp.demo.dto.Kcim06t;
import mx.com.gnp.demo.dto.Kciricom;
import mx.com.gnp.demo.dto.Kcirinte;
import mx.com.gnp.demo.dto.Kciriq02;

public class Kciliq02 extends AqMensajeIda {

    public String intarifi;

    public String inchkcec;

    public Kcim06t datos;

    public Kciriq02 datadici;

    public Kciricom datgesco;

    public Kcirinte datinter;

    public Kciliq02() {
        super();
        intarifi = new String();

        inchkcec = new String();

        datos = new Kcim06t();

        datadici = new Kciriq02();

        datgesco = new Kciricom();

        datinter = new Kcirinte();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public String getIntarifi() {
        return this.intarifi;
    }

    public String getInchkcec() {
        return this.inchkcec;
    }

    public Kcim06t getDatos() {
        return this.datos;
    }

    public Kciriq02 getDatadici() {
        return this.datadici;
    }

    public Kciricom getDatgesco() {
        return this.datgesco;
    }

    public Kcirinte getDatinter() {
        return this.datinter;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setIntarifi(String intarifi) {
        this.intarifi = intarifi;
    }

    public void setInchkcec(String inchkcec) {
        this.inchkcec = inchkcec;
    }

    public void setDatos(Kcim06t datos) {
        this.datos = datos;
    }

    public void setDatadici(Kciriq02 datadici) {
        this.datadici = datadici;
    }

    public void setDatgesco(Kciricom datgesco) {
        this.datgesco = datgesco;
    }

    public void setDatinter(Kcirinte datinter) {
        this.datinter = datinter;
    }

}