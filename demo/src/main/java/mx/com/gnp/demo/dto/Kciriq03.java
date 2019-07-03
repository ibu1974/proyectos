package mx.com.gnp.demo.dto;

public class Kciriq03 {

    public String cdnumpol;

    public int ctvrspol;

    public String inpzaci;

    public Kciriq03() {
        super();
        cdnumpol = new String();

        inpzaci = new String();

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

    public String getInpzaci() {
        return this.inpzaci;
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

    public void setInpzaci(String inpzaci) {
        this.inpzaci = inpzaci;
    }

}