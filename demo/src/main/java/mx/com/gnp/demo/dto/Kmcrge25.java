package mx.com.gnp.demo.dto;

public class Kmcrge25 {

	public String intipocd;

	public String cdimpres;

	public short nucopiad;

	public String ininmdif;

	public String indemisi;

	public Kmcrge25() {
		super();
		intipocd = new String();

		cdimpres = new String();

		ininmdif = new String();

		indemisi = new String();

	}

	/****************************
	 * Metodos Get
	 ****************************/
	public String getIntipocd() {
		return this.intipocd;
	}

	public String getCdimpres() {
		return this.cdimpres;
	}

	public short getNucopiad() {
		return this.nucopiad;
	}

	public String getIninmdif() {
		return this.ininmdif;
	}

	public String getIndemisi() {
		return this.indemisi;
	}

	/****************************
	 * Metodos Set
	 ****************************/
	public void setIntipocd(String intipocd) {
		this.intipocd = intipocd;
	}

	public void setCdimpres(String cdimpres) {
		this.cdimpres = cdimpres;
	}

	public void setNucopiad(short nucopiad) {
		this.nucopiad = nucopiad;
	}

	public void setIninmdif(String ininmdif) {
		this.ininmdif = ininmdif;
	}

	public void setIndemisi(String indemisi) {
		this.indemisi = indemisi;
	}

}
