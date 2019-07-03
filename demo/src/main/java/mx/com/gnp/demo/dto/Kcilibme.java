package mx.com.gnp.demo.dto;

import gnp.ae.distribucion.AqMensajeIda;

public class Kcilibme extends AqMensajeIda{

    public short cderror;

    public String dsarg1;

    public String dsarg2;

    public String dsarg3;

	public short getCderror() {
		return cderror;
	}

	public void setCderror(short cderror) {
		this.cderror = cderror;
	}

	public String getDsarg1() {
		return dsarg1;
	}

	public void setDsarg1(String dsarg1) {
		this.dsarg1 = dsarg1;
	}

	public String getDsarg2() {
		return dsarg2;
	}

	public void setDsarg2(String dsarg2) {
		this.dsarg2 = dsarg2;
	}

	public String getDsarg3() {
		return dsarg3;
	}

	public void setDsarg3(String dsarg3) {
		this.dsarg3 = dsarg3;
	}
	
}
