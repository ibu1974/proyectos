package mx.com.gnp.demo.dto;

public class Kciroq01 {

    public String dstippdt;

    public String dspdtora;

    public String dstipgst;

    public String dsgstora;

    public String dsestruc;

    public Kciroq01() {
        super();
        dstippdt = new String();

        dspdtora = new String();

        dstipgst = new String();

        dsgstora = new String();

        dsestruc = new String();

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public String getDstippdt() {
        return this.dstippdt;
    }

    public String getDspdtora() {
        return this.dspdtora;
    }

    public String getDstipgst() {
        return this.dstipgst;
    }

    public String getDsgstora() {
        return this.dsgstora;
    }

    public String getDsestruc() {
        return this.dsestruc;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setDstippdt(String dstippdt) {
        this.dstippdt = dstippdt;
    }

    public void setDspdtora(String dspdtora) {
        this.dspdtora = dspdtora;
    }

    public void setDstipgst(String dstipgst) {
        this.dstipgst = dstipgst;
    }

    public void setDsgstora(String dsgstora) {
        this.dsgstora = dsgstora;
    }

    public void setDsestruc(String dsestruc) {
        this.dsestruc = dsestruc;
    }

}