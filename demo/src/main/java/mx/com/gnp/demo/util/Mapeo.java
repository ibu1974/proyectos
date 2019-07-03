package mx.com.gnp.demo.util;
import mx.com.gnp.demo.dto.*;        

public class Mapeo {

	public Kciliq01 ida (EntradaRequest Ida) {
		Kciliq01 idl;
		idl = new Kciliq01();	
		idl.setCdnumpol(Ida.getCdnumpol());
		idl.setCtvrspol(Ida.getCtvrspol());
		idl.setIntippol(Ida.getIntippol());
		return idl;
	}
	
	
	public EntradaResponse vuelta (Kcilvq01 Vuelta) {
		EntradaResponse datosRespuesta;
		datosRespuesta = new EntradaResponse(); 
		
		datosRespuesta.setCdnumpol(Vuelta.getDatpoli().getCdnumpol());
		datosRespuesta.setCtvrspol(Vuelta.getDatpoli().getCtvrspol());
		datosRespuesta.setIntippol(Vuelta.getDatpoli().getInultsit());
		datosRespuesta.setCdprodte(Vuelta.getDatpoli().getCdprodte());
		datosRespuesta.setCdprodco(Vuelta.getDatpoli().getCdprodco());
		datosRespuesta.setDsproduct(Vuelta.getDescprod().getNoproduc());
		return datosRespuesta; 
	}
	public Kciliq05 emisonIda(EmisionRequest ida) {
		Kciliq05 idl;
		idl = new Kciliq05();
		idl.getEntrada().setCdnumpol(ida.getCdnumpol());
		idl.getEntrada().setTctipmov("1");
		idl.getEntrada().setTcmomovp("115");
		idl.getEntrada().setIngrpmvt("PN");
		idl.getEntrada().setInd01("N");
		idl.getEntrada().setInd02("S");
		idl.getEntrada().setInd03("S");
		idl.getEntrada().setInd04("N");
		idl.getEntrada().setInd05("S");
		idl.getEntrada().setInd06("A");
		idl.getEntrada().setInd07("");
		idl.getEntrada().setInd08("1");
		idl.getEntrada().setInd09("N");
		idl.getEntrada().setInd10("");
		idl.getParmimpr().getImpresio().setIntipocd("D");
		idl.getParmimpr().getImpresio().setCdimpres("NO-IMPRIME");
		idl.getParmimpr().getImpresio().setNucopiad((short) 1);
		idl.getParmimpr().getImpresio().setIninmdif("I");
		idl.getParmimpr().getImpresio().setIndemisi("E");
		

		return idl;
	}
	
	
	public EmisionResponse emisionVuelta(Kcilvq05 Vuelta) {
		EmisionResponse datosRespuesta;
		datosRespuesta = new EmisionResponse();
		datosRespuesta.setCdnumpol(Vuelta.getSalida().getCdnumpol());
		datosRespuesta.setCtvrspol(Vuelta.getSalida().getCtvrspol());
		return datosRespuesta;
	}
	
}
