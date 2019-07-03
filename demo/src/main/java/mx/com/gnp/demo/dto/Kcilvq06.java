package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeVta;
import mx.com.gnp.demo.dto.Kcim06t;
import mx.com.gnp.demo.dto.Kcirdq01;
import mx.com.gnp.demo.dto.Kcirgq01;
import mx.com.gnp.demo.dto.Kcirmq01;
import mx.com.gnp.demo.dto.Kcirnq01;
import mx.com.gnp.demo.dto.Kciroq01;
import mx.com.gnp.demo.dto.Kcirpq01;
import mx.com.gnp.demo.dto.Kcirtq01;

public class Kcilvq06 extends AqMensajeVta {

    public Kcim06t datpoli;

    public Kcirmq01 mediador;

    public Kciroq01 descofic;

    public Kcirdq01 descdivi;

    public Kcirpq01 descprod;

    public Kcirtq01 tomador;

    public Kcirgq01 pagador;

    public Kcirnq01 inpoliza;

    public Kcilvq06() {
        super();
        datpoli = new Kcim06t();

        mediador = new Kcirmq01();

        descofic = new Kciroq01();

        descdivi = new Kcirdq01();

        descprod = new Kcirpq01();

        tomador = new Kcirtq01();

        pagador = new Kcirgq01();

        inpoliza = new Kcirnq01();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public Kcim06t getDatpoli() {
        return this.datpoli;
    }

    public Kcirmq01 getMediador() {
        return this.mediador;
    }

    public Kciroq01 getDescofic() {
        return this.descofic;
    }

    public Kcirdq01 getDescdivi() {
        return this.descdivi;
    }

    public Kcirpq01 getDescprod() {
        return this.descprod;
    }

    public Kcirtq01 getTomador() {
        return this.tomador;
    }

    public Kcirgq01 getPagador() {
        return this.pagador;
    }

    public Kcirnq01 getInpoliza() {
        return this.inpoliza;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setDatpoli(Kcim06t datpoli) {
        this.datpoli = datpoli;
    }

    public void setMediador(Kcirmq01 mediador) {
        this.mediador = mediador;
    }

    public void setDescofic(Kciroq01 descofic) {
        this.descofic = descofic;
    }

    public void setDescdivi(Kcirdq01 descdivi) {
        this.descdivi = descdivi;
    }

    public void setDescprod(Kcirpq01 descprod) {
        this.descprod = descprod;
    }

    public void setTomador(Kcirtq01 tomador) {
        this.tomador = tomador;
    }

    public void setPagador(Kcirgq01 pagador) {
        this.pagador = pagador;
    }

    public void setInpoliza(Kcirnq01 inpoliza) {
        this.inpoliza = inpoliza;
    }

}