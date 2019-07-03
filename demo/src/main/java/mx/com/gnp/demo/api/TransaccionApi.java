package mx.com.gnp.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.gnp.demo.dto.*;
import mx.com.gnp.demo.services.*;
import mx.com.gnp.demo.util.*;
import gnp.ae.aplicacion.AqObjMensaje;
import gnp.ae.distribucion.AqCabeceraArquitectura;


@RestController
public class TransaccionApi {

	@RequestMapping(value="/transaccion", method=RequestMethod.POST)
	public EntradaResponse ejecuta(@RequestBody  EntradaRequest msgEntrada){
	    
	    
		
		Mapeo mapeos;
//		IdaDatosTx msgIda;
//		VueltaDatosTx msgVta;
//		msgIda = new IdaDatosTx();
//		msgVta = new VueltaDatosTx(); 

		Kciliq01 msgIda;
		Kcilvq01 msgVta;
		
		msgIda = new Kciliq01();
		msgVta = new Kcilvq01(); 

		mapeos = new Mapeo();

		
		msgIda=mapeos.ida(msgEntrada);

/*		Inicio de Ejecuci�n de la transaccion           */
      	String strENTORNO = "PR1";		
		String strUSER = "USRHVERS";
		String strPASS = "GNP07GNP";
		
		AqCabeceraArquitectura aq = new AqCabeceraArquitectura();
		aq.setCdentorn(strENTORNO);
		aq.setCdusuari(strUSER);
		aq.setCdidioma("ES");
		aq.setCdaplic("AE");
		msgIda.setCabeceraArquitectura(aq);
		PolizaDatoStub stub = new PolizaDatoStub();
		stub.setVacontraSM(strPASS);
		stub.setConexionWeb(true);		
		try {
			msgVta = stub.consulta(msgIda);
			if (msgVta.getCderror()== 0 ) {
				return mapeos.vuelta(msgVta);
			}
		}
			catch (Exception e){
				
		}
		return mapeos.vuelta(msgVta);
	
	}


/***********************************************************************************
 * 	Emision de una poliza
 ***********************************************************************************/
	

@RequestMapping(value="/emision", method=RequestMethod.POST)
public EmisionResponse emision(@RequestBody  EmisionRequest msgEntrada){
		Mapeo mapeos;
	
		Kciliq05 msgIda;
		Kcilvq05 msgVta;
		Kcilibme msgIdadesc;
		Kcilvbme msgVtadesc;
		
		
		msgIda = new Kciliq05();
		msgVta = new Kcilvq05(); 
		msgIdadesc = new Kcilibme();
		msgVtadesc= new Kcilvbme(); 
	
		
		mapeos = new Mapeo();
	
		
		msgIda=mapeos.emisonIda(msgEntrada);
	
	/*		Inicio de Ejecuci�n de la transaccion           */
	  	String strENTORNO = "PR1";		
		String strUSER = "USRHVERS";
		String strPASS = "GNP07GNP";
		
		AqCabeceraArquitectura aq = new AqCabeceraArquitectura();
		aq.setCdentorn(strENTORNO);
		aq.setCdusuari(strUSER);
		aq.setCdidioma("ES");
		aq.setCdaplic("AE");
		msgIda.setCabeceraArquitectura(aq);
		PolizaDatoStub stub = new PolizaDatoStub();
		stub.setVacontraSM(strPASS);
		stub.setConexionWeb(true);		
		try {
			msgVta = stub.emision(msgIda,"");
			if (msgVta.getCderror()== 0 ) {
				return mapeos.emisionVuelta(msgVta);
				
			} else {
					
				}
		}
			catch (Exception e){
				
		}
			return mapeos.emisionVuelta(msgVta);
	}



@RequestMapping(value="/descriperror", method=RequestMethod.POST)
public DescripcionResponse descriperror(@RequestBody  DescripcionRequest msgEntrada){
	
		Kcilibme msgIdadesc;
		Kcilvbme msgVtadesc;
		
		
		msgIdadesc = new Kcilibme();
		msgVtadesc= new Kcilvbme(); 
	
		DescripcionResponse respuesta = new DescripcionResponse();
	
	/*		Inicio de Ejecuci�n de la transaccion           */
	  	String strENTORNO = "PRE";       		
		String strUSER = "USRHVERS";
		String strPASS = "GNP07GNP";
		
		AqCabeceraArquitectura aq = new AqCabeceraArquitectura();
		aq.setCdentorn(strENTORNO);
		aq.setCdusuari(strUSER);
		aq.setCdidioma("ES");
		aq.setCdaplic("AE");
		msgIdadesc.setCabeceraArquitectura(aq);
		KcilmbmeStub stub = new KcilmbmeStub();
		stub.setVacontraSM(strPASS);
		stub.setConexionWeb(true);		
/*inicio                 */
		msgIdadesc.setCderror((short)8039);
		msgIdadesc.setDsarg1("");
		msgIdadesc.setDsarg2("");
		msgIdadesc.setDsarg3("");
		
/*final                 */		
		try {
			msgVtadesc = stub.ObtenerError(msgIdadesc);
			if (msgVtadesc.getCderror()== 0 ) {
				respuesta.setDsdareg(msgVtadesc.getDsdareg());
				return respuesta;
				
			} 
			}
			catch (Exception e){
			respuesta.setDsdareg(e.getCause().getMessage().toString());
		}
		return respuesta;
	}
}

