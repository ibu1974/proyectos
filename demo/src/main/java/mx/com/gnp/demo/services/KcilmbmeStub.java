package mx.com.gnp.demo.services;

import gnp.ae.aplicacion.AqCtes;
import gnp.ae.aplicacion.AqObjMensaje;
import gnp.ae.distribucion.AqMensajeIda;
import gnp.ae.distribucion.analizadorIDL.AqConvDatosCics;
import gnp.ae.distribucion.analizadorIDL.AqStubClienteCics;
import gnp.ae.presentacion.ventanaMarco.AqSistema;
import mx.com.gnp.demo.dto.*;

public class KcilmbmeStub extends AqStubClienteCics {
    public Kcilvbme ObtenerError(Kcilibme mensajeIda) throws AqObjMensaje {
        /***********************************************************************
         * Posicionamiento de reloj
         **********************************************************************/

        /***********************************************************************
         * Declaraci�n de variables
         **********************************************************************/

        Kcilvbme mensajeVta = new Kcilvbme();

        //Datos espec�ficos del servicio

        int tamComIdaArq = AqCtes.TAM_CAB_ARQ_IDA;
        int tamComVtaArq = AqCtes.TAM_CAB_ARQ_VTA;

        int tamComIdaApl = 51;
        int tamComVtaApl = 581;

        String transaccion = "KI42";

        byte[] comIdaArq;
        byte[] comVtaArq = new byte[tamComVtaArq];
        byte[] comIdaApl = new byte[tamComIdaApl];
        byte[] comVtaApl = new byte[tamComVtaApl];

        try {

            /*******************************************************************
             * Establecemos el nombre del servicio
             ******************************************************************/

            setNoServicioCics(obtenerNombreServicio("KCILMBME", mensajeIda));

            /*******************************************************************
             * Exit de Comunicaciones- Se llama al m�todo que permite no
             * realizar la llamada en caso de que le interese a la aplicaci�n.
             * Si se ha de ejecutar el servicio devuelve true.
             ******************************************************************/

            if (!exitInicio("ObtenerError", mensajeIda, mensajeVta)) {
                // Vuelta a la normalidad del cursor

                ocultarReloj();
                return (mensajeVta);
            }

            /*******************************************************************
             * FIN Exit de Comunicaciones
             ******************************************************************/

            /*******************************************************************
             * Se comprueba si el env�o va a ser Asincrono
             ******************************************************************/

            if (isAsincrono() == true) {
                envioAsincrono(mensajeIda, this, mensajeVta, "ObtenerError");
                return null;
            }

            /*******************************************************************
             * Inicio de traza
             ******************************************************************/

            inicioTraza();

            /*******************************************************************
             * Introduccion de los parametros de Ida
             ******************************************************************/

            // Escritura de datos de Arquitectura
            comIdaArq = escribirCabecera(tamComIdaArq, tamComVtaArq, tamComIdaApl, tamComVtaApl, (AqMensajeIda) mensajeIda);

            // Escritura de datos de aplicaci�n
            // Obtenci�n de datos de aplicaci�n
            // Clase utilizada para la conversi�n de datos COMP-3.
            AqConvDatosCics conv = new AqConvDatosCics();
            // Variable utilizada para determinar la posici�n del dato en la
            // commarea
            int pos = 0;
            pos = setShort(mensajeIda.getCderror(), comIdaApl, pos, 3, 4, "S9(4)");
          
            pos = setString(mensajeIda.getDsarg1(), comIdaApl, pos, 16);

            pos = setString(mensajeIda.getDsarg2(), comIdaApl, pos, 16);

            pos = setString(mensajeIda.getDsarg3(), comIdaApl, pos, 16);
            

            /*******************************************************************
             * Realiza la llamada al mainframe
             ******************************************************************/

            enviar(comIdaArq, tamComIdaArq, comIdaApl, tamComIdaApl, comVtaArq, tamComVtaArq, comVtaApl, tamComVtaApl, AqSistema.getSesionActiva().getCdUsuario(), AqSistema.getSesionActiva().getDsPassword(), AqSistema.getCdEntorno(), transaccion);

            /*******************************************************************
             * Extraccion de los datos de vuelta
             ******************************************************************/

            // Obtenci�n de datos de Arquitectura
            leerCabecera(comVtaArq, mensajeVta);

            // Comprobaci�n transacci�n segura

            //    transaccionSegura(mensajeVta);

            pos = 0;
            mensajeVta.setDsdareg(getString(comVtaApl, pos, 580));
            pos = pos + 3;

            /*******************************************************************
             * Fin de traza
             ******************************************************************/

            finTraza(mensajeVta);

            /*******************************************************************
             * Llamada a Fin de Exit de Comunicaciones
             ******************************************************************/

            exitFin("ObtenerError", mensajeIda, mensajeVta);

            /*******************************************************************
             * FIN de la llamada de finalizaci�n del Exit de Comunicaciones
             ******************************************************************/

            // Vuelta a la normalidad del cursor
            ocultarReloj();

            // Retorno el mensaje de vuelta
            return mensajeVta;

        }
        /***********************************************************************
         * Tratamiento de errores
         **********************************************************************/

        catch (Exception e) {
            // Cierre de sesi�n

            ocultarReloj();
            tratarExcepcion(e);
            return null;
        }
    }

}