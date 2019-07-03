package mx.com.gnp.demo.dto;

public class Kpergido {

	public String tctipvia;

	public String novidici;

	public String nuvia;

	public String txinfadi;

	public String nopobl;

	public String tccopine;

	public String noprovin;

	public String tccopost;

	public String tccopais;

	public Kpergico[] estidtel = new Kpergico[3];

	public int nummet2;

	public String indopral;

	public String tccopert;

	public String nopercon;

	public String indidiom;

	public String cdsecdom;

	public String tctipdom;

	public String tccldomi;

	public String tctiasen;

	public String txasient;

	public String cdzonsmm;

	public String nuinteri;

	public Kpergido() {
		super();
		tctipvia = new String();

		novidici = new String();

		nuvia = new String();

		txinfadi = new String();

		nopobl = new String();

		tccopine = new String();

		noprovin = new String();

		tccopost = new String();

		tccopais = new String();

		for (int i0 = 0; i0 < 3; i0++) {
			estidtel[i0] = new Kpergico();
		}
		indopral = new String();

		tccopert = new String();

		nopercon = new String();

		indidiom = new String();

		cdsecdom = new String();

		tctipdom = new String();

		tccldomi = new String();

		tctiasen = new String();

		txasient = new String();

		cdzonsmm = new String();

		nuinteri = new String();

	}

	/****************************
	 * Metodos Get
	 ****************************/
	public String getTctipvia() {
		return this.tctipvia;
	}

	public String getNovidici() {
		return this.novidici;
	}

	public String getNuvia() {
		return this.nuvia;
	}

	public String getTxinfadi() {
		return this.txinfadi;
	}

	public String getNopobl() {
		return this.nopobl;
	}

	public String getTccopine() {
		return this.tccopine;
	}

	public String getNoprovin() {
		return this.noprovin;
	}

	public String getTccopost() {
		return this.tccopost;
	}

	public String getTccopais() {
		return this.tccopais;
	}

	public Kpergico[] getEstidtel() {
		return this.estidtel;
	}

	public int getNummet2() {
		return this.nummet2;
	}

	public String getIndopral() {
		return this.indopral;
	}

	public String getTccopert() {
		return this.tccopert;
	}

	public String getNopercon() {
		return this.nopercon;
	}

	public String getIndidiom() {
		return this.indidiom;
	}

	public String getCdsecdom() {
		return this.cdsecdom;
	}

	public String getTctipdom() {
		return this.tctipdom;
	}

	public String getTccldomi() {
		return this.tccldomi;
	}

	public String getTctiasen() {
		return this.tctiasen;
	}

	public String getTxasient() {
		return this.txasient;
	}

	public String getCdzonsmm() {
		return this.cdzonsmm;
	}

	public String getNuinteri() {
		return this.nuinteri;
	}

	/****************************
	 * Metodos Set
	 ****************************/
	public void setTctipvia(String tctipvia) {
		this.tctipvia = tctipvia;
	}

	public void setNovidici(String novidici) {
		this.novidici = novidici;
	}

	public void setNuvia(String nuvia) {
		this.nuvia = nuvia;
	}

	public void setTxinfadi(String txinfadi) {
		this.txinfadi = txinfadi;
	}

	public void setNopobl(String nopobl) {
		this.nopobl = nopobl;
	}

	public void setTccopine(String tccopine) {
		this.tccopine = tccopine;
	}

	public void setNoprovin(String noprovin) {
		this.noprovin = noprovin;
	}

	public void setTccopost(String tccopost) {
		this.tccopost = tccopost;
	}

	public void setTccopais(String tccopais) {
		this.tccopais = tccopais;
	}

	public void setEstidtel(Kpergico[] estidtel) {
		this.estidtel = estidtel;
	}

	public void setNummet2(int nummet2) {
		this.nummet2 = nummet2;
	}

	public void setIndopral(String indopral) {
		this.indopral = indopral;
	}

	public void setTccopert(String tccopert) {
		this.tccopert = tccopert;
	}

	public void setNopercon(String nopercon) {
		this.nopercon = nopercon;
	}

	public void setIndidiom(String indidiom) {
		this.indidiom = indidiom;
	}

	public void setCdsecdom(String cdsecdom) {
		this.cdsecdom = cdsecdom;
	}

	public void setTctipdom(String tctipdom) {
		this.tctipdom = tctipdom;
	}

	public void setTccldomi(String tccldomi) {
		this.tccldomi = tccldomi;
	}

	public void setTctiasen(String tctiasen) {
		this.tctiasen = tctiasen;
	}

	public void setTxasient(String txasient) {
		this.txasient = txasient;
	}

	public void setCdzonsmm(String cdzonsmm) {
		this.cdzonsmm = cdzonsmm;
	}

	public void setNuinteri(String nuinteri) {
		this.nuinteri = nuinteri;
	}

}
