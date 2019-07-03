package mx.com.gnp.demo.dto;

public class Kcirvinc {

    public short cderror;

    public String cdaplic;

    public String dsarg1;

    public String dsarg2;

    public String dsarg3;

    public Kcirvinc() {
        super();
        cdaplic = new String();

        dsarg1 = new String();

        dsarg2 = new String();

        dsarg3 = new String();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public short getCderror() {
        return this.cderror;
    }

    public String getCdaplic() {
        return this.cdaplic;
    }

    public String getDsarg1() {
        return this.dsarg1;
    }

    public String getDsarg2() {
        return this.dsarg2;
    }

    public String getDsarg3() {
        return this.dsarg3;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setCderror(short cderror) {
        this.cderror = cderror;
    }

    public void setCdaplic(String cdaplic) {
        this.cdaplic = cdaplic;
    }

    public void setDsarg1(String dsarg1) {
        this.dsarg1 = dsarg1;
    }

    public void setDsarg2(String dsarg2) {
        this.dsarg2 = dsarg2;
    }

    public void setDsarg3(String dsarg3) {
        this.dsarg3 = dsarg3;
    }

}