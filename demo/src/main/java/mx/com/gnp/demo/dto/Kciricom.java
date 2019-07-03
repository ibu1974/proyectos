package mx.com.gnp.demo.dto;

public class Kciricom {

    public String gescomsn;

    public String cdestcmp;

    public String cdtunctr;

    public String cdunictr;

    public String cdtunrol;

    public String cdunirol;

    public Kciricom() {
        super();
        gescomsn = new String();

        cdestcmp = new String();

        cdtunctr = new String();

        cdunictr = new String();

        cdtunrol = new String();

        cdunirol = new String();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public String getGescomsn() {
        return this.gescomsn;
    }

    public String getCdestcmp() {
        return this.cdestcmp;
    }

    public String getCdtunctr() {
        return this.cdtunctr;
    }

    public String getCdunictr() {
        return this.cdunictr;
    }

    public String getCdtunrol() {
        return this.cdtunrol;
    }

    public String getCdunirol() {
        return this.cdunirol;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setGescomsn(String gescomsn) {
        this.gescomsn = gescomsn;
    }

    public void setCdestcmp(String cdestcmp) {
        this.cdestcmp = cdestcmp;
    }

    public void setCdtunctr(String cdtunctr) {
        this.cdtunctr = cdtunctr;
    }

    public void setCdunictr(String cdunictr) {
        this.cdunictr = cdunictr;
    }

    public void setCdtunrol(String cdtunrol) {
        this.cdtunrol = cdtunrol;
    }

    public void setCdunirol(String cdunirol) {
        this.cdunirol = cdunirol;
    }

}