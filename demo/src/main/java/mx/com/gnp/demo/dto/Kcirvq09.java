package mx.com.gnp.demo.dto;
import gnp.ae.distribucion.*;

import gnp.pe.ModeloDatos.Kpergico;
import gnp.pe.ModeloDatos.Kpergido;
import mx.com.gnp.demo.dto.Kmcrge26;
import mx.com.gnp.demo.dto.Kmcrge25;

public class Kcirvq09 
{

public Kcirvinc[] multierr = new Kcirvinc[25];
public String cdnumpol;
public int ctvrspol;


public Kcirvq09()
{
	super();
		for (int i0=0;i0 < 25; i0++) {
	multierr[i0] = new Kcirvinc();
	}
	cdnumpol = new String();


}
/****************************
 * Metodos Get
 ****************************/
public Kcirvinc[] getMultierr() 
{
	return this.multierr;
} 

public String getCdnumpol() 
{
	return this.cdnumpol;
} 

public int getCtvrspol() 
{
	return this.ctvrspol;
} 



/****************************
 * Metodos Set
 ****************************/
public void setMultierr(Kcirvinc[] multierr) 
{
	this.multierr=multierr;
} 

public void setCdnumpol(String cdnumpol) 
{
	this.cdnumpol=cdnumpol;
} 

public void setCtvrspol(int ctvrspol) 
{
	this.ctvrspol=ctvrspol;
} 


}