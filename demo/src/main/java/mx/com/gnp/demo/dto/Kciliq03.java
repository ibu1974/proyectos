
package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeIda;
import mx.com.gnp.demo.dto.Kciriq03;
import mx.com.gnp.demo.dto.Kciruq03;

public class Kciliq03 extends AqMensajeIda {

    public Kciriq03 criterio;

    public Kciruq03 cdultreg;

    public Kciliq03() {
        super();
        criterio = new Kciriq03();

        cdultreg = new Kciruq03();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public Kciriq03 getCriterio() {
        return this.criterio;
    }

    public Kciruq03 getCdultreg() {
        return this.cdultreg;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setCriterio(Kciriq03 criterio) {
        this.criterio = criterio;
    }

    public void setCdultreg(Kciruq03 cdultreg) {
        this.cdultreg = cdultreg;
    }

}