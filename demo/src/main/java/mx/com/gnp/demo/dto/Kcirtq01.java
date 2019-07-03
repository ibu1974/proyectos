package mx.com.gnp.demo.dto;

import gnp.pe.ModeloDatos.Kpergico;

public class Kcirtq01 {

    public String tcinclie;

    public String nocomdom;

    public Kpergico teleftom;

    public Kcirtq01() {
        super();
        tcinclie = new String();

        nocomdom = new String();

        teleftom = new Kpergico();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public String getTcinclie() {
        return this.tcinclie;
    }

    public String getNocomdom() {
        return this.nocomdom;
    }

    public Kpergico getTeleftom() {
        return this.teleftom;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setTcinclie(String tcinclie) {
        this.tcinclie = tcinclie;
    }

    public void setNocomdom(String nocomdom) {
        this.nocomdom = nocomdom;
    }

    public void setTeleftom(Kpergico teleftom) {
        this.teleftom = teleftom;
    }

}