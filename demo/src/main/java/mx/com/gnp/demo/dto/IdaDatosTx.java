package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeIda;

public class IdaDatosTx extends AqMensajeIda {

    public String cdnumpol;

    public int ctvrspol;

    public String intippol;

    public String inblopol;

    public IdaDatosTx() {
        super();
        cdnumpol = new String();

        intippol = new String();

        inblopol = new String();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public String getCdnumpol() {
        return this.cdnumpol;
    }

    public int getCtvrspol() {
        return this.ctvrspol;
    }

    public String getIntippol() {
        return this.intippol;
    }

    public String getInblopol() {
        return this.inblopol;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setCdnumpol(String cdnumpol) {
        this.cdnumpol = cdnumpol;
    }

    public void setCtvrspol(int ctvrspol) {
        this.ctvrspol = ctvrspol;
    }

    public void setIntippol(String intippol) {
        this.intippol = intippol;
    }

    public void setInblopol(String inblopol) {
        this.inblopol = inblopol;
    }

}
