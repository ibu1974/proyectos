package mx.com.gnp.demo.dto;

import mx.com.gnp.demo.dto.Kmcrge25;
import mx.com.gnp.demo.dto.Kmcrge26;

public class Kcirreen {

    public String inenvio;

    public Kmcrge25 impresio;

    public Kmcrge26[] tabenvio = new Kmcrge26[10];

    public short nuocurre;

    public Kcirreen() {
        super();
        inenvio = new String();

        impresio = new Kmcrge25();

        for (int i0 = 0; i0 < 10; i0++) {
            tabenvio[i0] = new Kmcrge26();
        }

    }

    /***************************************************************************
     * Metodos Get
     **************************************************************************/
    public String getInenvio() {
        return this.inenvio;
    }

    public Kmcrge25 getImpresio() {
        return this.impresio;
    }

    public Kmcrge26[] getTabenvio() {
        return this.tabenvio;
    }

    public short getNuocurre() {
        return this.nuocurre;
    }

    /***************************************************************************
     * Metodos Set
     **************************************************************************/
    public void setInenvio(String inenvio) {
        this.inenvio = inenvio;
    }

    public void setImpresio(Kmcrge25 impresio) {
        this.impresio = impresio;
    }

    public void setTabenvio(Kmcrge26[] tabenvio) {
        this.tabenvio = tabenvio;
    }

    public void setNuocurre(short nuocurre) {
        this.nuocurre = nuocurre;
    }

}