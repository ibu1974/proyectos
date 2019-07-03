package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeIda;

public class Kciliq06 extends AqMensajeIda {

    public String intialta;

    public String inplanti;

    public String cdnumpol;

    public int ctvrspol;

    public String cdprodte;

    public String cdprodco;

    public String cdnumcon;

    public String intipcon;

    public String cdestruc;

    public String tcmomovp;

    public Kciliq06() {
        super();
        intialta = new String();

        inplanti = new String();

        cdnumpol = new String();

        cdprodte = new String();

        cdprodco = new String();

        cdnumcon = new String();

        intipcon = new String();

        cdestruc = new String();

        tcmomovp = new String();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public String getIntialta() {
        return this.intialta;
    }

    public String getInplanti() {
        return this.inplanti;
    }

    public String getCdnumpol() {
        return this.cdnumpol;
    }

    public int getCtvrspol() {
        return this.ctvrspol;
    }

    public String getCdprodte() {
        return this.cdprodte;
    }

    public String getCdprodco() {
        return this.cdprodco;
    }

    public String getCdnumcon() {
        return this.cdnumcon;
    }

    public String getIntipcon() {
        return this.intipcon;
    }

    public String getCdestruc() {
        return this.cdestruc;
    }

    public String getTcmomovp() {
        return this.tcmomovp;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setIntialta(String intialta) {
        this.intialta = intialta;
    }

    public void setInplanti(String inplanti) {
        this.inplanti = inplanti;
    }

    public void setCdnumpol(String cdnumpol) {
        this.cdnumpol = cdnumpol;
    }

    public void setCtvrspol(int ctvrspol) {
        this.ctvrspol = ctvrspol;
    }

    public void setCdprodte(String cdprodte) {
        this.cdprodte = cdprodte;
    }

    public void setCdprodco(String cdprodco) {
        this.cdprodco = cdprodco;
    }

    public void setCdnumcon(String cdnumcon) {
        this.cdnumcon = cdnumcon;
    }

    public void setIntipcon(String intipcon) {
        this.intipcon = intipcon;
    }

    public void setCdestruc(String cdestruc) {
        this.cdestruc = cdestruc;
    }

    public void setTcmomovp(String tcmomovp) {
        this.tcmomovp = tcmomovp;
    }

}