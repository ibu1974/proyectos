package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeIda;
import mx.com.gnp.demo.dto.Kciriq05;
import mx.com.gnp.demo.dto.Kcirreen;

public class Kciliq05 extends AqMensajeIda {

    public Kciriq05 entrada;

    public Kcirreen parmimpr;

    public Kciliq05() {
        super();
        entrada = new Kciriq05();

        parmimpr = new Kcirreen();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public Kciriq05 getEntrada() {
        return this.entrada;
    }

    public Kcirreen getParmimpr() {
        return this.parmimpr;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setEntrada(Kciriq05 entrada) {
        this.entrada = entrada;
    }

    public void setParmimpr(Kcirreen parmimpr) {
        this.parmimpr = parmimpr;
    }

}