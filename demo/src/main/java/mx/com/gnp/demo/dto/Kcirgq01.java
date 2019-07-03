package mx.com.gnp.demo.dto;

import gnp.pe.ModeloDatos.Kpergico;
import gnp.pe.ModeloDatos.Kpergido;

public class Kcirgq01 {

    public String tcpefiju;

    public String tcdocpag;

    public String cdidfisc;

    public String dnap1rzs;

    public String dnap2rzs;

    public String dnnomrzs;

    public String tcinclie;

    public String cdsecdom;

    public String nocomdom;

    public Kpergico telefpag;

    public Kpergido domicpag;

    public String inmulpag;

    public Kcirgq01() {
        super();
        tcpefiju = new String();

        tcdocpag = new String();

        cdidfisc = new String();

        dnap1rzs = new String();

        dnap2rzs = new String();

        dnnomrzs = new String();

        tcinclie = new String();

        cdsecdom = new String();

        nocomdom = new String();

        telefpag = new Kpergico();

        domicpag = new Kpergido();

        inmulpag = new String();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public String getTcpefiju() {
        return this.tcpefiju;
    }

    public String getTcdocpag() {
        return this.tcdocpag;
    }

    public String getCdidfisc() {
        return this.cdidfisc;
    }

    public String getDnap1rzs() {
        return this.dnap1rzs;
    }

    public String getDnap2rzs() {
        return this.dnap2rzs;
    }

    public String getDnnomrzs() {
        return this.dnnomrzs;
    }

    public String getTcinclie() {
        return this.tcinclie;
    }

    public String getCdsecdom() {
        return this.cdsecdom;
    }

    public String getNocomdom() {
        return this.nocomdom;
    }

    public Kpergico getTelefpag() {
        return this.telefpag;
    }

    public Kpergido getDomicpag() {
        return this.domicpag;
    }

    public String getInmulpag() {
        return this.inmulpag;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setTcpefiju(String tcpefiju) {
        this.tcpefiju = tcpefiju;
    }

    public void setTcdocpag(String tcdocpag) {
        this.tcdocpag = tcdocpag;
    }

    public void setCdidfisc(String cdidfisc) {
        this.cdidfisc = cdidfisc;
    }

    public void setDnap1rzs(String dnap1rzs) {
        this.dnap1rzs = dnap1rzs;
    }

    public void setDnap2rzs(String dnap2rzs) {
        this.dnap2rzs = dnap2rzs;
    }

    public void setDnnomrzs(String dnnomrzs) {
        this.dnnomrzs = dnnomrzs;
    }

    public void setTcinclie(String tcinclie) {
        this.tcinclie = tcinclie;
    }

    public void setCdsecdom(String cdsecdom) {
        this.cdsecdom = cdsecdom;
    }

    public void setNocomdom(String nocomdom) {
        this.nocomdom = nocomdom;
    }

    public void setTelefpag(Kpergico telefpag) {
        this.telefpag = telefpag;
    }

    public void setDomicpag(Kpergido domicpag) {
        this.domicpag = domicpag;
    }

    public void setInmulpag(String inmulpag) {
        this.inmulpag = inmulpag;
    }

}