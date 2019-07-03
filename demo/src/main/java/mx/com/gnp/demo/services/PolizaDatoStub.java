package mx.com.gnp.demo.services;

/*******************************************************************************
 ********************************************************************************
 *
 * CUIDADO!!! Cuando se regenere este STUB hay que agregar el metodo getTransaccion
 * y considerar las modificaciones al metodo emision(KCILIQ05,String)
 *
 ********************************************************************************
 *******************************************************************************/

import gnp.ae.aplicacion.AqCtes;
import gnp.ae.aplicacion.AqObjMensaje;
import gnp.ae.datos.AqTablaCodigos;
import gnp.ae.distribucion.AqMensajeIda;
import gnp.ae.distribucion.analizadorIDL.AqConvDatosCics;
import gnp.ae.distribucion.analizadorIDL.AqStubClienteCics;
import mx.com.gnp.demo.dto.*;

/*******************************************************************************
 ********************************************************************************
 *
 * EJEMPLO DE IDL PARA SERVICIOS  DE DISTRIBUCION
 *
 ********************************************************************************
 *******************************************************************************/

/*******************************************************************************
 *DEF. INTERFAZ
 *******************************************************************************/

//interface PolizaDato
//{
/*******************************************************************************
 * DEFINICION DE CONSTANTES
 *******************************************************************************/

//const string <008> PolizaDato_SERVIDOR="KCITRQ00";
//const string <008> consulta_SERVICIO="KCILMQ01";
//const string <008> mantenimiento_SERVICIO="KCILMQ02";
//const string <008> listaAdicionales_SERVICIO="KCILMQ03";
//const string <008> mtoAdicional_SERVICIO="KCILMQ04";
//const string <008> emision_SERVICIO="KCILMQ05";
//const string <008> alta_SERVICIO="KCILMQ06";
//const string <008> suplemento_SERVICIO="KCILMQ07";
//const short NUMMET2_LEN=00007;
//const short CDERROR_LEN=00004;
//const short NUPOSICP_LEN=00005;
//const short NUCOPIAD_LEN=00003;
//const short CTVRSPOL_LEN=00005;
//const short CTSECINT_LEN=00005;
//const short POPARPOL_LENENT=00001;
//const short POPARPOL_LENDEC=006;
//const short POCESCOM_LENENT=00001;
//const short POCESCOM_LENDEC=006;
//const short POPARCOM_LENENT=00001;
//const short POPARCOM_LENDEC=006;
//const short NUOBJVIG_LEN=00003;
//const short NUOBJPEN_LEN=00003;
//const short NUOBJANU_LEN=00003;
//const short NUSUPLEM_LEN=00004;
//const short CDNIVDIV_LEN=00005;
//const short CDNIVSUB_LEN=00005;
//const short FEANULFP_LEN=00008;
//const short FECAMEST_LEN=00008;
//const short NUDUPREC_LEN=00003;
//const short HOEFTINI_LEN=00006;
//const short FEINIPOL_LEN=00008;
//const short FEEFTONA_LEN=00008;
//const short FEEFTOMO_LEN=00008;
//const short FEVENCIM_LEN=00008;
//const short FEFINEFE_LEN=00008;
//const short FEMISION_LEN=00008;
//const short FEULTSTR_LEN=00008;
//const short FEREGUPO_LEN=00008;
//const short INANCACO_LEN=00002;
//const short POCOASEG_LENENT=00001;
//const short POCOASEG_LENDEC=006;
//const short FECAMBIO_LEN=00008;
//const short POREVALZ_LENENT=00001;
//const short POREVALZ_LENDEC=006;
//const short IMMINREC_LENENT=00012;
//const short IMMINREC_LENDEC=003;
//const short CTVRSANT_LEN=00005;
//const short CTVRSPAD_LEN=00005;
//const short CTVRSAGR_LEN=00005;
//const short NUFRAPRI_LEN=00003;
//const short POFACDIV_LENENT=00001;
//const short POFACDIV_LENDEC=006;
//const short POFACPRI_LENENT=00001;
//const short POFACPRI_LENDEC=006;
//const short POFACCOM_LENENT=00001;
//const short POFACCOM_LENDEC=006;
//const short POFACSIN_LENENT=00001;
//const short POFACSIN_LENDEC=006;
//const short POFACGIA_LENENT=00001;
//const short POFACGIA_LENDEC=006;
//const short CTVRSSAC_LEN=00005;
//const short TCNUMCOP_LEN=00003;
//const short NUOCURRE_LEN=00002;
//const short POCOMIS_LENENT=00001;
//const short POCOMIS_LENDEC=006;
//const short NURELREP_LEN=00003;
//const short IMCAAP02_LENENT=00012;
//const short IMCAAP02_LENDEC=003;
//const short IMCAAP03_LENENT=00012;
//const short IMCAAP03_LENDEC=003;
//const short IMCAAP04_LENENT=00012;
//const short IMCAAP04_LENDEC=003;
//const short IMCAAP05_LENENT=00008;
//const short IMCAAP05_LENDEC=003;
//const short IMCAAP06_LENENT=00008;
//const short IMCAAP06_LENDEC=003;
//const short IMCAAP07_LEN=00008;
//const short IMCAAP08_LEN=00008;
//const short IMCAAP10_LEN=00003;
//const short IMCAAP11_LEN=00003;
//const short IMCAAP13_LENENT=00001;
//const short IMCAAP13_LENDEC=006;
//const short IMCAAP14_LENENT=00001;
//const short IMCAAP14_LENDEC=006;
//const short IMCAAP15_LENENT=00005;
//const short IMCAAP15_LENDEC=006;
//const short IMCAAP16_LEN=00001;
//const short POCAAP21_LENENT=00005;
//const short POCAAP21_LENDEC=006;
/*******************************************************************************
 *ESTRUCTURAS  DE DATOS
 *******************************************************************************/

//        struct KPERGICO {
//          string  <00002> TCTICOM1;
//          string  <00003> TCPREPA1;
//          string  <00010> NUTELF1 ;
//          string  <00010> NUEXTEL1;
//          string  <00003> NUPRECL1;
//          string  <00003> NUPRECD1;
//          }
//        struct KPERGIDO {
//          string  <00002> TCTIPVIA;
//          string  <00040> NOVIDICI;
//          string  <00009> NUVIA   ;
//          string  <00035> TXINFADI;
//          string  <00035> NOPOBL  ;
//          string  <00011> TCCOPINE;
//          string  <00035> NOPROVIN;
//          string  <00005> TCCOPOST;
//          string  <00003> TCCOPAIS;
//          sequence <KPERGICO,003> ESTIDTEL;
//          long NUMMET2 ;
//          string  <00001> INDOPRAL;
//          string  <00001> TCCOPERT;
//          string  <00050> NOPERCON;
//          string  <00002> INDIDIOM;
//          string  <00003> CDSECDOM;
//          string  <00001> TCTIPDOM;
//          string  <00001> TCCLDOMI;
//          string  <00003> TCTIASEN;
//          string  <00080> TXASIENT;
//          string  <00001> CDZONSMM;
//          string  <00009> NUINTERI;
//          }
//        struct KCIRVINC {
//          short CDERROR ;
//          string  <00002> CDAPLIC ;
//          string  <00016> DSARG1  ;
//          string  <00016> DSARG2  ;
//          string  <00016> DSARG3  ;
//          }
//        struct KMCRGE26 {
//          string  <00001> INTIPENV;
//          string  <00040> DSENVIO ;
//          long NUPOSICP;
//          }
//        struct KMCRGE25 {
//          string  <00001> INTIPOCD;
//          string  <00030> CDIMPRES;
//          short NUCOPIAD;
//          string  <00001> ININMDIF;
//          string  <00001> INDEMISI;
//          }
//        struct KCIRIP06 {
//          string  <00014> CDNUMPOL;
//          long CTVRSPOL;
//          string  <00010> CDINTERM;
//          long CTSECINT;
//          string  <00001> TCCSINTE;
//          string  <00001> TCCDFUNC;
//          string  <00001> ESINTERM;
//          string  <00004> CDESTRUC;
//          string  <00004> CDTIPHIJ;
//          string  <00010> CDUNIHIJ;
//          string  <00001> INPRIFUN;
//          string  <00002> INTIPBAS;
//          float POPARPOL;
//          float POCESCOM;
//          float POPARCOM;
//          string  <00010> CDGERZON;
//          string  <00008> NUFLANUM;
//          string  <00002> CDOPERAC;
//          string  <00001> TCTIPCOM;
//          string  <00001> INAFNAL ;
//          }
//        struct KCIRNQ01 {
//          short NUOBJVIG;
//          short NUOBJPEN;
//          short NUOBJANU;
//          }
//        struct KCIRGQ01 {
//          string  <00001> TCPEFIJU;
//          string  <00001> TCDOCPAG;
//          string  <00020> CDIDFISC;
//          string  <00030> DNAP1RZS;
//          string  <00030> DNAP2RZS;
//          string  <00040> DNNOMRZS;
//          string  <00001> TCINCLIE;
//          string  <00003> CDSECDOM;
//          string  <00060> NOCOMDOM;
//          KPERGICO TELEFPAG;
//          KPERGIDO DOMICPAG;
//          string  <00001> INMULPAG;
//          }
//        struct KCIRTQ01 {
//          string  <00001> TCINCLIE;
//          string  <00060> NOCOMDOM;
//          KPERGICO TELEFTOM;
//          }
//        struct KCIRPQ01 {
//          string  <00020> NOPRODUC;
//          }
//        struct KCIRDQ01 {
//          string  <00100> DSNIVDIV;
//          string  <00100> DSNIVSUB;
//          }
//        struct KCIROQ01 {
//          string  <00050> DSTIPPDT;
//          string  <00050> DSPDTORA;
//          string  <00050> DSTIPGST;
//          string  <00050> DSGSTORA;
//          string  <00050> DSESTRUC;
//          }
//        struct KCIRMQ01 {
//          string  <00050> DSCANALD;
//          }
//        struct KCIM06T  {
//          string  <00014> CDNUMPOL;
//          long CTVRSPOL;
//          string  <00005> CDNUMCON;
//          short NUSUPLEM;
//          string  <00001> INULTSIT;
//          string  <00001> INBLOPOL;
//          string  <00010> CDPRODTE;
//          string  <00010> CDPRODCO;
//          string  <00010> CDCANALD;
//          string  <00005> TCCODTAR;
//          string  <00003> TCFORCON;
//          long CDNIVDIV;
//          long CDNIVSUB;
//          string  <00004> CDESTRUC;
//          string  <00004> CDESTRUG;
//          string  <00004> CLGESTI ;
//          string  <00010> CLGESUN ;
//          string  <00004> CLPROTI ;
//          string  <00010> CLPROUN ;
//          string  <00004> CDESTRUO;
//          string  <00004> CLOPETI ;
//          string  <00010> CLOPEUN ;
//          string  <00010> CDSUSCRI;
//          string  <00005> TCCOPOFI;
//          string  <00001> TCPROPOL;
//          string  <00005> CDCODCAM;
//          string  <00014> NUPROCOF;
//          string  <00001> TCTIMOVP;
//          string  <00003> TCMOMOVP;
//          string  <00001> DUCONTRA;
//          string  <00001> ESPOLIZA;
//          string  <00001> INANULFP;
//          long FEANULFP;
//          string  <00003> TCMOCAES;
//          long FECAMEST;
//          string  <00001> INEMREPO;
//          string  <00001> INAVSVTO;
//          string  <00001> INGERECI;
//          short NUDUPREC;
//          string  <00001> INNIVELR;
//          string  <00001> INNIVDRE;
//          string  <00001> TICONESP;
//          string  <00001> TCFORPAG;
//          string  <00001> TCFOPASU;
//          long HOEFTINI;
//          long FEINIPOL;
//          long FEEFTONA;
//          long FEEFTOMO;
//          long FEVENCIM;
//          long FEFINEFE;
//          long FEMISION;
//          long FEULTSTR;
//          string  <00001> INFREREG;
//          long FEREGUPO;
//          string  <00001> INEXOBSE;
//          string  <00001> INIMPMAL;
//          string  <00001> TCINFISC;
//          short INANCACO;
//          string  <00002> INTIPBAS;
//          float POCESCOM;
//          string  <00001> INTICOAS;
//          string  <00001> INRECUNI;
//          float POCOASEG;
//          string  <00001> INREAACE;
//          string  <00001> TCINTIPE;
//          string  <00010> CLFILTOM;
//          string  <00003> CLSECTOM;
//          string  <00001> TCNIFTOM;
//          string  <00001> TCDOCTOM;
//          string  <00020> CDNIFTOM;
//          string  <00040> NOTOMPOL;
//          string  <00030> NOTOMP01;
//          string  <00030> NOTOMP02;
//          string  <00002> TCVIATOM;
//          string  <00040> NODIRTOM;
//          string  <00009> NUDIRTOM;
//          string  <00035> CLACCADT;
//          string  <00035> NOPOBTOM;
//          string  <00035> NOPROTOM;
//          string  <00011> TCPOBTOM;
//          string  <00005> TCCOPTOM;
//          string  <00003> TCPASTOM;
//          string  <00001> INTARZUR;
//          string  <00010> CLFILPAG;
//          string  <00003> CLSECPAG;
//          string  <00005> TCCOPPAG;
//          string  <00001> TCTIPCOM;
//          string  <00010> TCCANCO1;
//          string  <00010> TCCANCOS;
//          string  <00003> TCCDMONE;
//          string  <00001> CDTIPCAM;
//          long FECAMBIO;
//          string  <00002> INIDIOMA;
//          string  <00001> INTIPREF;
//          float POREVALZ;
//          double IMMINREC;
//          long CTVRSANT;
//          string  <00001> INGENEXT;
//          string  <00001> INGENDOC;
//          string  <00014> CDINTCEC;
//          string  <00001> INCECPAC;
//          string  <00004> TCCDSBU ;
//          string  <00002> CDCIAGRU;
//          string  <00002> TCSEGMEN;
//          string  <00001> INREGULA;
//          string  <00001> INREACED;
//          string  <00001> INREFACU;
//          string  <00001> INVENMAS;
//          string  <00001> INRENCAR;
//          string  <00001> INPOLPAD;
//          string  <00014> CDPOLPAD;
//          long CTVRSPAD;
//          long CTVRSAGR;
//          string  <00015> CLREFCAR;
//          string  <00020> CLREFERE;
//          string  <00020> CLREFLIB;
//          string  <00001> INPOLFLO;
//          string  <00001> INPOLPAI;
//          string  <00010> CLNUMFOL;
//          string  <00001> INFRAREC;
//          short NUFRAPRI;
//          string  <00001> INFICPAG;
//          string  <00001> INDIVIDE;
//          string  <00001> TCFORPAD;
//          float POFACDIV;
//          float POFACPRI;
//          float POFACCOM;
//          float POFACSIN;
//          float POFACGIA;
//          string  <00010> CDCONSAC;
//          long CTVRSSAC;
//          string  <00004> TCUBIENT;
//          string  <00002> TCTIPORD;
//          short TCNUMCOP;
//          string  <00010> CDUSUARI;
//          string  <00004> CDEMPUSU;
//          string  <00008> NOPROGRA;
//          string  <00026> TSULTMOD;
//          }
//        struct KCIRVQ05 {
//          sequence <KCIRVINC,025> MULTIERR;
//          string  <00014> CDNUMPOL;
//          long CTVRSPOL;
//          }
//        struct KCIRREEN {
//          string  <00001> INENVIO ;
//          KMCRGE25 IMPRESIO;
//          sequence <KMCRGE26,010> TABENVIO;
//          short NUOCURRE;
//          }
//        struct KCIRIQ05 {
//          string  <00014> CDNUMPOL;
//          string  <00001> TCTIPMOV;
//          string  <00003> TCMOMOVP;
//          string  <00002> INGRPMVT;
//          string  <00001> IND01   ;
//          string  <00001> IND02   ;
//          string  <00001> IND03   ;
//          string  <00001> IND04   ;
//          string  <00001> IND05   ;
//          string  <00001> IND06   ;
//          string  <00001> IND07   ;
//          string  <00001> IND08   ;
//          string  <00001> IND09   ;
//          string  <00001> IND10   ;
//          float POCOMIS ;
//          }
//        struct KCIRICOM {
//          string  <00001> GESCOMSN;
//          string  <00004> CDESTCMP;
//          string  <00004> CDTUNCTR;
//          string  <00010> CDUNICTR;
//          string  <00004> CDTUNROL;
//          string  <00010> CDUNIROL;
//          }
//        struct KCIM52T  {
//          string  <00014> CDNUMPOL;
//          long CTVRSPOL;
//          short NURELREP;
//          string  <00010> CDPRODTE;
//          string  <00010> CDPRODCO;
//          string  <00001> INULTSIT;
//          long FEFINEFE;
//          long FEEFTOMO;
//          string  <00045> TXCAAP01;
//          double IMCAAP02;
//          double IMCAAP03;
//          double IMCAAP04;
//          double IMCAAP05;
//          double IMCAAP06;
//          long IMCAAP07;
//          long IMCAAP08;
//          string  <00006> TXCAAP09;
//          short IMCAAP10;
//          short IMCAAP11;
//          string  <00002> TXCAAP12;
//          float IMCAAP13;
//          float IMCAAP14;
//          double IMCAAP15;
//          short IMCAAP16;
//          string  <00001> TXCAAP17;
//          string  <00001> TXCAAP18;
//          string  <00001> TXCAAP19;
//          string  <00080> TXCAAP20;
//          double POCAAP21;
//          string  <00010> CDUSUARI;
//          string  <00004> CDEMPUSU;
//          string  <00008> NOPROGRA;
//          string  <00026> TSULTMOD;
//          }
//        struct KCIM16T  {
//          string  <00014> CDNUMPOL;
//          long CTVRSPOL;
//          short NURELREP;
//          string  <00010> CDPRODTE;
//          string  <00010> CDPRODCO;
//          string  <00001> INULTSIT;
//          long FEFINEFE;
//          long FEEFTOMO;
//          string  <00045> TXCAAP01;
//          double IMCAAP02;
//          double IMCAAP03;
//          double IMCAAP04;
//          double IMCAAP05;
//          double IMCAAP06;
//          long IMCAAP07;
//          long IMCAAP08;
//          string  <00006> TXCAAP09;
//          short IMCAAP10;
//          short IMCAAP11;
//          string  <00002> TXCAAP12;
//          float IMCAAP13;
//          float IMCAAP14;
//          double IMCAAP15;
//          short IMCAAP16;
//          string  <00001> TXCAAP17;
//          string  <00001> TXCAAP18;
//          string  <00001> TXCAAP19;
//          string  <00080> TXCAAP20;
//          double POCAAP21;
//          string  <00010> CDUSUARI;
//          string  <00004> CDEMPUSU;
//          string  <00008> NOPROGRA;
//          string  <00026> TSULTMOD;
//          }
//        struct KCIRUQ03 {
//          short NURELREP;
//          }
//        struct KCIRIQ03 {
//          string  <00014> CDNUMPOL;
//          long CTVRSPOL;
//          string  <00001> INPZACI ;
//          }
//        struct KCIRINTE {
//          sequence <KCIRIP06,001> DATINTER;
//          string  <00001> INTIPOOP;
//          }
//        struct KCIRIQ02 {
//          string  <00003> CDSECDOM;
//          }
//        struct KCILIQ01 {
//          string  <00014> CDNUMPOL;
//          long CTVRSPOL;
//          string  <00001> INTIPPOL;
//          string  <00001> INBLOPOL;
//          }
//        struct KCILVQ01 {
//          KCIM06T  DATPOLI ;
//          KCIRMQ01 MEDIADOR;
//          KCIROQ01 DESCOFIC;
//          KCIRDQ01 DESCDIVI;
//          KCIRPQ01 DESCPROD;
//          KCIRTQ01 TOMADOR ;
//          KCIRGQ01 PAGADOR ;
//          KCIRNQ01 INPOLIZA;
//          }
//        struct KCILIQ02 {
//          string  <00001> INTARIFI;
//          string  <00001> INCHKCEC;
//          sequence <KCIM06T,001> DATOS   ;
//          sequence <KCIRIQ02,001> DATADICI;
//          sequence <KCIRICOM,001> DATGESCO;
//          sequence <KCIRINTE,001> DATINTER;
//          }
//        struct KCILVQ02 {
//          sequence <KCIRVINC,025> MULTIERR;
//          short NUOBJVIG;
//          short NUOBJPEN;
//          short NUOBJANU;
//          string  <00026> TSULTMOD;
//          }
//        struct KCILIQ03 {
//          sequence <KCIRIQ03,001> CRITERIO;
//          sequence <KCIRUQ03,001> CDULTREG;
//          }
//        struct KCILVQ03 {
//          short NUOCURRE;
//          string  <00001> INULTPAG;
//          sequence <KCIM16T,010> CDLISREG;
//          }
//        struct KCILIQ04 {
//          short NUOCURRE;
//          string  <00001> INULTPAG;
//          sequence <KCIM52T,010> CDLISREG;
//          sequence <KCIRICOM,001> DATGESCO;
//          }
//        struct KCILVQ04 {
//          sequence <KCIRVINC,025> MULTIERR;
//          }
//        struct KCILIQ05 {
//          KCIRIQ05 ENTRADA ;
//          KCIRREEN PARMIMPR;
//          }
//        struct KCILVQ05 {
//          KCIRVQ05 SALIDA  ;
//          }
//        struct KCILIQ06 {
//          string  <00001> INTIALTA;
//          string  <00001> INPLANTI;
//          string  <00014> CDNUMPOL;
//          long CTVRSPOL;
//          string  <00010> CDPRODTE;
//          string  <00010> CDPRODCO;
//          string  <00005> CDNUMCON;
//          string  <00001> INTIPCON;
//          string  <00004> CDESTRUC;
//          string  <00003> TCMOMOVP;
//          }
//        struct KCILVQ06 {
//          sequence <KCIM06T,001> DATPOLI ;
//          sequence <KCIRMQ01,001> MEDIADOR;
//          sequence <KCIROQ01,001> DESCOFIC;
//          sequence <KCIRDQ01,001> DESCDIVI;
//          sequence <KCIRPQ01,001> DESCPROD;
//          sequence <KCIRTQ01,001> TOMADOR ;
//          sequence <KCIRGQ01,001> PAGADOR ;
//          sequence <KCIRNQ01,001> INPOLIZA;
//          }
//        struct KCILIQ07 {
//          string  <00001> TCTIMOVP;
//          string  <00014> CDNUMPOL;
//          long CTVRSPOL;
//          long FEEFTOMO;
//          long FEFINEFE;
//          long FEVENCIM;
//          string  <00001> ESPOLIZA;
//          string  <00003> TCMOMOVP;
//          string  <00001> INGENEXT;
//          string  <00001> INGENDOC;
//          string  <00001> INNIVVAL;
//          string  <00256> DSOBSSUP;
//          }
//        struct KCILVQ07 {
//          sequence <KCIM06T,001> DATPOLI ;
//          sequence <KCIRMQ01,001> MEDIADOR;
//          sequence <KCIROQ01,001> DESCOFIC;
//          sequence <KCIRDQ01,001> DESCDIVI;
//          sequence <KCIRPQ01,001> DESCPROD;
//          sequence <KCIRTQ01,001> TOMADOR ;
//          sequence <KCIRGQ01,001> PAGADOR ;
//          sequence <KCIRNQ01,001> INPOLIZA;
//          }
/*******************************************************************************
 * OPERACIONES DEL INTERFAZ
 ******************************************************************************/

//      KCILVQ01 consulta (in KCILIQ01);
//      KCILVQ02 mantenimiento (in KCILIQ02);
//      KCILVQ03 listaAdicionales (in KCILIQ03);
//      KCILVQ04 mtoAdicional (in KCILIQ04);
//      KCILVQ05 emision (in KCILIQ05);
//      KCILVQ06 alta (in KCILIQ06);
//      KCILVQ07 suplemento (in KCILIQ07);
//}
public class PolizaDatoStub extends AqStubClienteCics {
    public Kcilvq06 alta(Kciliq06 mensajeIda) throws AqObjMensaje {
        /***********************************************************************
         * Posicionamiento de reloj
         **********************************************************************/

        mostrarReloj();

        /***********************************************************************
         * Declaraci�n de variables
         **********************************************************************/

        Kcilvq06 mensajeVta = new Kcilvq06();

        //Datos espec�ficos del servicio

        int tamComIdaArq = AqCtes.TAM_CAB_ARQ_IDA;
        int tamComVtaArq = AqCtes.TAM_CAB_ARQ_VTA;

        int tamComIdaApl = 52;
        int tamComVtaApl = 2104;

        String transaccion = "KI58";

        setNuevaGeneracion(true);

        byte[] comIdaArq;
        byte[] comVtaArq = new byte[tamComVtaArq];
        byte[] comIdaApl = new byte[tamComIdaApl];
        byte[] comVtaApl = new byte[tamComVtaApl];

        try {

            /*******************************************************************
             * Establecemos el nombre del servicio
             ******************************************************************/

            setNoServicioCics(obtenerNombreServicio("KCILMQ06", mensajeIda));

            /*******************************************************************
             * Exit de Comunicaciones- Se llama al m�todo que permite no
             * realizar la llamada en caso de que le interese a la aplicaci�n.
             * Si se ha de ejecutar el servicio devuelve true.
             ******************************************************************/

            if (!exitInicio("alta", mensajeIda, mensajeVta)) {
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
                envioAsincrono(mensajeIda, this, mensajeVta, "alta");
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

            pos = setString(mensajeIda.getIntialta(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getInplanti(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getCdnumpol(), comIdaApl, pos, 14);
            pos = setInt(mensajeIda.getCtvrspol(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getCdprodte(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getCdprodco(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getCdnumcon(), comIdaApl, pos, 5);

            pos = setString(mensajeIda.getIntipcon(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getCdestruc(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getTcmomovp(), comIdaApl, pos, 3);

            /*******************************************************************
             * Realiza la llamada al mainframe
             ******************************************************************/

            enviar(comIdaArq, tamComIdaArq, comIdaApl, tamComIdaApl, comVtaArq, tamComVtaArq, comVtaApl, tamComVtaApl, mensajeIda.getCabeceraArquitectura().getCdusuari(), mensajeIda.getCabeceraArquitectura().getCdentorn(), transaccion);

            /*******************************************************************
             * Extraccion de los datos de vuelta
             ******************************************************************/

            // Obtenci�n de datos de Arquitectura
            leerCabecera(comVtaArq, mensajeVta);

            // Comprobaci�n transacci�n segura

            //    transaccionSegura(mensajeVta);

            pos = 0;

            Kcim06t datpoli = mensajeVta.getDatpoli();
            datpoli.setCdnumpol(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setCtvrspol(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCdnumcon(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setNusuplem(conv.comp3ToShort(comVtaApl, pos, 3, 4, "S9(4)"));
            pos = pos + 3;
            datpoli.setInultsit(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInblopol(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdprodte(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdprodco(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdcanald(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccodtar(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTcforcon(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setCdnivdiv(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCdnivsub(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCdestruc(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setCdestrug(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClgesti(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClgesun(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setClproti(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClproun(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdestruo(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClopeti(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClopeun(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdsuscri(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccopofi(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTcpropol(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdcodcam(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setNuprocof(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setTctimovp(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcmomovp(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setDucontra(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setEspoliza(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInanulfp(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setFeanulfp(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setTcmocaes(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setFecamest(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInemrepo(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInavsvto(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setIngereci(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setNuduprec(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            datpoli.setInnivelr(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInnivdre(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTiconesp(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcforpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcfopasu(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setHoeftini(conv.comp3ToInt(comVtaApl, pos, 4, 6, "S9(6)"));
            pos = pos + 4;
            datpoli.setFeinipol(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFeeftona(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFeeftomo(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFevencim(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFefinefe(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFemision(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFeultstr(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInfrereg(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setFeregupo(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInexobse(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInimpmal(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcinfisc(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInancaco(conv.comp3ToShort(comVtaApl, pos, 2, 2, "S9(2)"));
            pos = pos + 2;
            datpoli.setIntipbas(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setPocescom(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setInticoas(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInrecuni(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setPocoaseg(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setInreaace(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcintipe(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setClfiltom(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setClsectom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setTcniftom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcdoctom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdniftom(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            datpoli.setNotompol(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            datpoli.setNotomp01(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            datpoli.setNotomp02(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            datpoli.setTcviatom(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setNodirtom(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            datpoli.setNudirtom(getString(comVtaApl, pos, 9));
            pos = pos + 9;
            datpoli.setClaccadt(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            datpoli.setNopobtom(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            datpoli.setNoprotom(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            datpoli.setTcpobtom(getString(comVtaApl, pos, 11));
            pos = pos + 11;
            datpoli.setTccoptom(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTcpastom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setIntarzur(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setClfilpag(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setClsecpag(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setTccoppag(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTctipcom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTccanco1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccancos(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccdmone(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setCdtipcam(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setFecambio(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInidioma(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setIntipref(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setPorevalz(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setImminrec(conv.comp3ToDoubleDec(comVtaApl, pos, 8, 12, 3, "S9(12)V9(3)"));
            pos = pos + 8;
            datpoli.setCtvrsant(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setIngenext(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setIngendoc(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdintcec(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setIncecpac(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTccdsbu(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setCdciagru(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setTcsegmen(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setInregula(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInreaced(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInrefacu(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInvenmas(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInrencar(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInpolpad(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdpolpad(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setCtvrspad(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCtvrsagr(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setClrefcar(getString(comVtaApl, pos, 15));
            pos = pos + 15;
            datpoli.setClrefere(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            datpoli.setClreflib(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            datpoli.setInpolflo(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInpolpai(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setClnumfol(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setInfrarec(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setNufrapri(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            datpoli.setInficpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setIndivide(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcforpad(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setPofacdiv(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofacpri(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofaccom(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofacsin(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofacgia(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setCdconsac(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCtvrssac(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setTcubient(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setTctipord(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setTcnumcop(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            datpoli.setCdusuari(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdempusu(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setNoprogra(getString(comVtaApl, pos, 8));
            pos = pos + 8;
            datpoli.setTsultmod(getString(comVtaApl, pos, 26));
            pos = pos + 26;
            Kcirmq01 mediador = mensajeVta.getMediador();
            mediador.setDscanald(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            Kciroq01 descofic = mensajeVta.getDescofic();
            descofic.setDstippdt(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDspdtora(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDstipgst(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDsgstora(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDsestruc(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            Kcirdq01 descdivi = mensajeVta.getDescdivi();
            descdivi.setDsnivdiv(getString(comVtaApl, pos, 100));
            pos = pos + 100;
            descdivi.setDsnivsub(getString(comVtaApl, pos, 100));
            pos = pos + 100;
            Kcirpq01 descprod = mensajeVta.getDescprod();
            descprod.setNoproduc(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            Kcirtq01 tomador = mensajeVta.getTomador();
            tomador.setTcinclie(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            tomador.setNocomdom(getString(comVtaApl, pos, 60));
            pos = pos + 60;
            gnp.pe.ModeloDatos.Kpergico teleftom = tomador.getTeleftom();
            teleftom.setTcticom1(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            teleftom.setTcprepa1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            teleftom.setNutelf1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            teleftom.setNuextel1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            teleftom.setNuprecl1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            teleftom.setNuprecd1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            Kcirgq01 pagador = mensajeVta.getPagador();
            pagador.setTcpefiju(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            pagador.setTcdocpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            pagador.setCdidfisc(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            pagador.setDnap1rzs(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            pagador.setDnap2rzs(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            pagador.setDnnomrzs(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            pagador.setTcinclie(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            pagador.setCdsecdom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            pagador.setNocomdom(getString(comVtaApl, pos, 60));
            pos = pos + 60;
            gnp.pe.ModeloDatos.Kpergico telefpag = pagador.getTelefpag();
            telefpag.setTcticom1(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            telefpag.setTcprepa1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            telefpag.setNutelf1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            telefpag.setNuextel1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            telefpag.setNuprecl1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            telefpag.setNuprecd1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            gnp.pe.ModeloDatos.Kpergido domicpag = pagador.getDomicpag();
            domicpag.setTctipvia(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            domicpag.setNovidici(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            domicpag.setNuvia(getString(comVtaApl, pos, 9));
            pos = pos + 9;
            domicpag.setTxinfadi(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            domicpag.setNopobl(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            domicpag.setTccopine(getString(comVtaApl, pos, 11));
            pos = pos + 11;
            domicpag.setNoprovin(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            domicpag.setTccopost(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            domicpag.setTccopais(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            gnp.pe.ModeloDatos.Kpergico[] estidtel0 = domicpag.getEstidtel();
            for (int i1 = 0; i1 < 3; i1++) {
                estidtel0[i1].setTcticom1(getString(comVtaApl, pos, 2));
                pos = pos + 2;
                estidtel0[i1].setTcprepa1(getString(comVtaApl, pos, 3));
                pos = pos + 3;
                estidtel0[i1].setNutelf1(getString(comVtaApl, pos, 10));
                pos = pos + 10;
                estidtel0[i1].setNuextel1(getString(comVtaApl, pos, 10));
                pos = pos + 10;
                estidtel0[i1].setNuprecl1(getString(comVtaApl, pos, 3));
                pos = pos + 3;
                estidtel0[i1].setNuprecd1(getString(comVtaApl, pos, 3));
                pos = pos + 3;
            }
            domicpag.setNummet2(conv.comp3ToInt(comVtaApl, pos, 4, 7, "S9(7)"));
            pos = pos + 4;
            domicpag.setIndopral(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setTccopert(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setNopercon(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            domicpag.setIndidiom(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            domicpag.setCdsecdom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            domicpag.setTctipdom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setTccldomi(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setTctiasen(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            domicpag.setTxasient(getString(comVtaApl, pos, 80));
            pos = pos + 80;
            domicpag.setCdzonsmm(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setNuinteri(getString(comVtaApl, pos, 9));
            pos = pos + 9;
            pagador.setInmulpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            Kcirnq01 inpoliza = mensajeVta.getInpoliza();
            inpoliza.setNuobjvig(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            inpoliza.setNuobjpen(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            inpoliza.setNuobjanu(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;

            /*******************************************************************
             * Fin de traza
             ******************************************************************/

            finTraza(mensajeVta);

            /*******************************************************************
             * Llamada a Fin de Exit de Comunicaciones
             ******************************************************************/

            exitFin("alta", mensajeIda, mensajeVta);

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

    public Kcilvq01 consulta(Kciliq01 mensajeIda) throws AqObjMensaje {
        /***********************************************************************
         * Posicionamiento de reloj
         **********************************************************************/

        mostrarReloj();

        /***********************************************************************
         * Declaraci�n de variables
         **********************************************************************/

        Kcilvq01 mensajeVta = new Kcilvq01();

        //Datos espec�ficos del servicio

        int tamComIdaArq = AqCtes.TAM_CAB_ARQ_IDA;
        int tamComVtaArq = AqCtes.TAM_CAB_ARQ_VTA;

        int tamComIdaApl = 19;
        int tamComVtaApl = 2104;

        String transaccion = "KI52";

        setNuevaGeneracion(true);

        byte[] comIdaArq;
        byte[] comVtaArq = new byte[tamComVtaArq];
        byte[] comIdaApl = new byte[tamComIdaApl];
        byte[] comVtaApl = new byte[tamComVtaApl];

        try {

            /*******************************************************************
             * Establecemos el nombre del servicio
             ******************************************************************/

            setNoServicioCics(obtenerNombreServicio("KCILMQ01", mensajeIda));

            /*******************************************************************
             * Exit de Comunicaciones- Se llama al m�todo que permite no
             * realizar la llamada en caso de que le interese a la aplicaci�n.
             * Si se ha de ejecutar el servicio devuelve true.
             ******************************************************************/

            if (!exitInicio("consulta", mensajeIda, mensajeVta)) {
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
                envioAsincrono(mensajeIda, this, mensajeVta, "consulta");
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

            pos = setString(mensajeIda.getCdnumpol(), comIdaApl, pos, 14);
            pos = setInt(mensajeIda.getCtvrspol(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getIntippol(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getInblopol(), comIdaApl, pos, 1);

            /*******************************************************************
             * Realiza la llamada al mainframe
             ******************************************************************/

            enviar(comIdaArq, tamComIdaArq, comIdaApl, tamComIdaApl, comVtaArq, tamComVtaArq, comVtaApl, tamComVtaApl, mensajeIda.getCabeceraArquitectura().getCdusuari(), mensajeIda.getCabeceraArquitectura().getCdentorn(), transaccion);

            /*******************************************************************
             * Extraccion de los datos de vuelta
             ******************************************************************/

            // Obtenci�n de datos de Arquitectura
            leerCabecera(comVtaArq, mensajeVta);

            // Comprobaci�n transacci�n segura

            //    transaccionSegura(mensajeVta);

            pos = 0;

            Kcim06t datpoli = mensajeVta.getDatpoli();
            datpoli.setCdnumpol(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setCtvrspol(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCdnumcon(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setNusuplem(conv.comp3ToShort(comVtaApl, pos, 3, 4, "S9(4)"));
            pos = pos + 3;
            datpoli.setInultsit(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInblopol(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdprodte(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdprodco(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdcanald(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccodtar(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTcforcon(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setCdnivdiv(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCdnivsub(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCdestruc(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setCdestrug(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClgesti(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClgesun(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setClproti(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClproun(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdestruo(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClopeti(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClopeun(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdsuscri(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccopofi(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTcpropol(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdcodcam(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setNuprocof(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setTctimovp(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcmomovp(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setDucontra(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setEspoliza(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInanulfp(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setFeanulfp(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setTcmocaes(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setFecamest(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInemrepo(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInavsvto(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setIngereci(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setNuduprec(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            datpoli.setInnivelr(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInnivdre(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTiconesp(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcforpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcfopasu(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setHoeftini(conv.comp3ToInt(comVtaApl, pos, 4, 6, "S9(6)"));
            pos = pos + 4;
            datpoli.setFeinipol(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFeeftona(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFeeftomo(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFevencim(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFefinefe(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFemision(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFeultstr(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInfrereg(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setFeregupo(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInexobse(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInimpmal(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcinfisc(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInancaco(conv.comp3ToShort(comVtaApl, pos, 2, 2, "S9(2)"));
            pos = pos + 2;
            datpoli.setIntipbas(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setPocescom(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setInticoas(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInrecuni(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setPocoaseg(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setInreaace(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcintipe(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setClfiltom(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setClsectom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setTcniftom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcdoctom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdniftom(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            datpoli.setNotompol(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            datpoli.setNotomp01(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            datpoli.setNotomp02(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            datpoli.setTcviatom(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setNodirtom(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            datpoli.setNudirtom(getString(comVtaApl, pos, 9));
            pos = pos + 9;
            datpoli.setClaccadt(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            datpoli.setNopobtom(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            datpoli.setNoprotom(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            datpoli.setTcpobtom(getString(comVtaApl, pos, 11));
            pos = pos + 11;
            datpoli.setTccoptom(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTcpastom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setIntarzur(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setClfilpag(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setClsecpag(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setTccoppag(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTctipcom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTccanco1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccancos(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccdmone(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setCdtipcam(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setFecambio(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInidioma(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setIntipref(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setPorevalz(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setImminrec(conv.comp3ToDoubleDec(comVtaApl, pos, 8, 12, 3, "S9(12)V9(3)"));
            pos = pos + 8;
            datpoli.setCtvrsant(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setIngenext(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setIngendoc(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdintcec(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setIncecpac(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTccdsbu(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setCdciagru(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setTcsegmen(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setInregula(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInreaced(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInrefacu(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInvenmas(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInrencar(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInpolpad(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdpolpad(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setCtvrspad(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCtvrsagr(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setClrefcar(getString(comVtaApl, pos, 15));
            pos = pos + 15;
            datpoli.setClrefere(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            datpoli.setClreflib(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            datpoli.setInpolflo(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInpolpai(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setClnumfol(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setInfrarec(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setNufrapri(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            datpoli.setInficpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setIndivide(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcforpad(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setPofacdiv(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofacpri(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofaccom(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofacsin(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofacgia(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setCdconsac(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCtvrssac(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setTcubient(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setTctipord(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setTcnumcop(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            datpoli.setCdusuari(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdempusu(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setNoprogra(getString(comVtaApl, pos, 8));
            pos = pos + 8;
            datpoli.setTsultmod(getString(comVtaApl, pos, 26));
            pos = pos + 26;
            Kcirmq01 mediador = mensajeVta.getMediador();
            mediador.setDscanald(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            Kciroq01 descofic = mensajeVta.getDescofic();
            descofic.setDstippdt(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDspdtora(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDstipgst(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDsgstora(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDsestruc(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            Kcirdq01 descdivi = mensajeVta.getDescdivi();
            descdivi.setDsnivdiv(getString(comVtaApl, pos, 100));
            pos = pos + 100;
            descdivi.setDsnivsub(getString(comVtaApl, pos, 100));
            pos = pos + 100;
            Kcirpq01 descprod = mensajeVta.getDescprod();
            descprod.setNoproduc(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            Kcirtq01 tomador = mensajeVta.getTomador();
            tomador.setTcinclie(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            tomador.setNocomdom(getString(comVtaApl, pos, 60));
            pos = pos + 60;
            gnp.pe.ModeloDatos.Kpergico teleftom = tomador.getTeleftom();
            teleftom.setTcticom1(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            teleftom.setTcprepa1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            teleftom.setNutelf1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            teleftom.setNuextel1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            teleftom.setNuprecl1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            teleftom.setNuprecd1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            Kcirgq01 pagador = mensajeVta.getPagador();
            pagador.setTcpefiju(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            pagador.setTcdocpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            pagador.setCdidfisc(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            pagador.setDnap1rzs(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            pagador.setDnap2rzs(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            pagador.setDnnomrzs(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            pagador.setTcinclie(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            pagador.setCdsecdom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            pagador.setNocomdom(getString(comVtaApl, pos, 60));
            pos = pos + 60;
            gnp.pe.ModeloDatos.Kpergico telefpag = pagador.getTelefpag();
            telefpag.setTcticom1(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            telefpag.setTcprepa1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            telefpag.setNutelf1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            telefpag.setNuextel1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            telefpag.setNuprecl1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            telefpag.setNuprecd1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            gnp.pe.ModeloDatos.Kpergido domicpag = pagador.getDomicpag();
            domicpag.setTctipvia(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            domicpag.setNovidici(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            domicpag.setNuvia(getString(comVtaApl, pos, 9));
            pos = pos + 9;
            domicpag.setTxinfadi(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            domicpag.setNopobl(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            domicpag.setTccopine(getString(comVtaApl, pos, 11));
            pos = pos + 11;
            domicpag.setNoprovin(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            domicpag.setTccopost(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            domicpag.setTccopais(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            gnp.pe.ModeloDatos.Kpergico[] estidtel0 = domicpag.getEstidtel();
            for (int i1 = 0; i1 < 3; i1++) {
                estidtel0[i1].setTcticom1(getString(comVtaApl, pos, 2));
                pos = pos + 2;
                estidtel0[i1].setTcprepa1(getString(comVtaApl, pos, 3));
                pos = pos + 3;
                estidtel0[i1].setNutelf1(getString(comVtaApl, pos, 10));
                pos = pos + 10;
                estidtel0[i1].setNuextel1(getString(comVtaApl, pos, 10));
                pos = pos + 10;
                estidtel0[i1].setNuprecl1(getString(comVtaApl, pos, 3));
                pos = pos + 3;
                estidtel0[i1].setNuprecd1(getString(comVtaApl, pos, 3));
                pos = pos + 3;
            }
            domicpag.setNummet2(conv.comp3ToInt(comVtaApl, pos, 4, 7, "S9(7)"));
            pos = pos + 4;
            domicpag.setIndopral(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setTccopert(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setNopercon(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            domicpag.setIndidiom(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            domicpag.setCdsecdom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            domicpag.setTctipdom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setTccldomi(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setTctiasen(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            domicpag.setTxasient(getString(comVtaApl, pos, 80));
            pos = pos + 80;
            domicpag.setCdzonsmm(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setNuinteri(getString(comVtaApl, pos, 9));
            pos = pos + 9;
            pagador.setInmulpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            Kcirnq01 inpoliza = mensajeVta.getInpoliza();
            inpoliza.setNuobjvig(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            inpoliza.setNuobjpen(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            inpoliza.setNuobjanu(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;

            /*******************************************************************
             * Fin de traza
             ******************************************************************/

            finTraza(mensajeVta);

            /*******************************************************************
             * Llamada a Fin de Exit de Comunicaciones
             ******************************************************************/

            exitFin("consulta", mensajeIda, mensajeVta);

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

    public Kcilvq05 emision(Kciliq05 mensajeIda, String ramo) throws AqObjMensaje {
        /***********************************************************************
         * Posicionamiento de reloj
         **********************************************************************/

        mostrarReloj();

        /***********************************************************************
         * Declaraci�n de variables
         **********************************************************************/

        Kcilvq05 mensajeVta = new Kcilvq05();

        //Datos espec�ficos del servicio

        int tamComIdaArq = AqCtes.TAM_CAB_ARQ_IDA;
        int tamComVtaArq = AqCtes.TAM_CAB_ARQ_VTA;

        int tamComIdaApl = 512;
        int tamComVtaApl = 1342;

        String transaccion = "KI56";

        setNuevaGeneracion(true);

        byte[] comIdaArq;
        byte[] comVtaArq = new byte[tamComVtaArq];
        byte[] comIdaApl = new byte[tamComIdaApl];
        byte[] comVtaApl = new byte[tamComVtaApl];

        try {

            /*******************************************************************
             * Establecemos el nombre del servicio
             ******************************************************************/

            setNoServicioCics(obtenerNombreServicio("KCILMQ05", mensajeIda));

            /*******************************************************************
             * Exit de Comunicaciones- Se llama al m�todo que permite no
             * realizar la llamada en caso de que le interese a la aplicaci�n.
             * Si se ha de ejecutar el servicio devuelve true.
             ******************************************************************/

            if (!exitInicio("emision", mensajeIda, mensajeVta)) {
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
                envioAsincrono(mensajeIda, this, mensajeVta, "emision");
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

            pos = setString(mensajeIda.getEntrada().getCdnumpol(), comIdaApl, pos, 14);

            pos = setString(mensajeIda.getEntrada().getTctipmov(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getTcmomovp(), comIdaApl, pos, 3);

            pos = setString(mensajeIda.getEntrada().getIngrpmvt(), comIdaApl, pos, 2);

            pos = setString(mensajeIda.getEntrada().getInd01(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getInd02(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getInd03(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getInd04(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getInd05(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getInd06(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getInd07(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getInd08(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getInd09(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getEntrada().getInd10(), comIdaApl, pos, 1);
            pos = setFloat(mensajeIda.getEntrada().getPocomis(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");

            pos = setString(mensajeIda.getParmimpr().getInenvio(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getParmimpr().getImpresio().getIntipocd(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getParmimpr().getImpresio().getCdimpres(), comIdaApl, pos, 30);
            pos = setShort(mensajeIda.getParmimpr().getImpresio().getNucopiad(), comIdaApl, pos, 2, 3, "S9(3)");

            pos = setString(mensajeIda.getParmimpr().getImpresio().getIninmdif(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getParmimpr().getImpresio().getIndemisi(), comIdaApl, pos, 1);
            Kmcrge26[] tabenvio0 = mensajeIda.getParmimpr().getTabenvio();
            for (int i1 = 0; i1 < 10; i1++) {
                pos = setString(tabenvio0[i1].getIntipenv(), comIdaApl, pos, 1);

                pos = setString(tabenvio0[i1].getDsenvio(), comIdaApl, pos, 40);

                pos = setInt(tabenvio0[i1].getNuposicp(), comIdaApl, pos, 3, 5, "S9(5)");

            }
            pos = setShort(mensajeIda.getParmimpr().getNuocurre(), comIdaApl, pos, 2, 2, "S9(2)");

            /*******************************************************************
             * Obtiene transacci�n por linea de negocio
             ******************************************************************/
//ibumod    transaccion = getTransaccion(ramo, mensajeIda.getEntrada().getIngrpmvt());

            /*******************************************************************
             * Realiza la llamada al mainframe
             ******************************************************************/

            enviar(comIdaArq, tamComIdaArq, comIdaApl, tamComIdaApl, comVtaArq, tamComVtaArq, comVtaApl, tamComVtaApl, mensajeIda.getCabeceraArquitectura().getCdusuari(), mensajeIda.getCabeceraArquitectura().getCdentorn(), transaccion);

            /*******************************************************************
             * Extraccion de los datos de vuelta
             ******************************************************************/

            // Obtenci�n de datos de Arquitectura
            leerCabecera(comVtaArq, mensajeVta);

            // Comprobaci�n transacci�n segura

            //    transaccionSegura(mensajeVta);

            pos = 0;

            Kcirvq05 salida = mensajeVta.getSalida();
            Kcirvinc[] multierr1 = salida.getMultierr();
            for (int i1 = 0; i1 < 25; i1++) {
                multierr1[i1].setCderror(conv.comp3ToShort(comVtaApl, pos, 3, 4, "S9(4)"));
                pos = pos + 3;
                multierr1[i1].setCdaplic(getString(comVtaApl, pos, 2));
                pos = pos + 2;
                multierr1[i1].setDsarg1(getString(comVtaApl, pos, 16));
                pos = pos + 16;
                multierr1[i1].setDsarg2(getString(comVtaApl, pos, 16));
                pos = pos + 16;
                multierr1[i1].setDsarg3(getString(comVtaApl, pos, 16));
                pos = pos + 16;
            }
            salida.setCdnumpol(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            salida.setCtvrspol(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;

            /*******************************************************************
             * Fin de traza
             ******************************************************************/

            finTraza(mensajeVta);

            /*******************************************************************
             * Llamada a Fin de Exit de Comunicaciones
             ******************************************************************/

            exitFin("emision", mensajeIda, mensajeVta);

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

    /**
     * Insert the method's description here. Creation date: (06/07/2005 05:48:19
     * p.m.)
     * 
     * @return java.lang.String
     * @param ramo
     *            java.lang.String
     * @param movimiento
     *            java.lang.String
     */
//    private String getTransaccion(String ramo, String movimiento) {
//
//    	AqTablaCodigos tablaTR = (AqTablaCodigos)mx.com.gnp.info.catalogos.utils.Generator.getCatalogInstance("gnp.tablas", "KCITTRG"); //GNPSR00084573-20150914_LGR
//        //gnp.tablas.TCodigoKCITTRG tablaTR = new gnp.tablas.TCodigoKCITTRG();
//        String codigo = ramo.trim() + movimiento.trim();
//        String descripcion = tablaTR.getDescripcion(codigo);
//        if (descripcion == null || "".equals( descripcion )/*rafs*/)
//            return "KI56";
//        else
//            return descripcion.trim();
//    }

    public Kcilvq03 listaAdicionales(Kciliq03 mensajeIda) throws AqObjMensaje {
        /***********************************************************************
         * Posicionamiento de reloj
         **********************************************************************/

        mostrarReloj();

        /***********************************************************************
         * Declaraci�n de variables
         **********************************************************************/

        Kcilvq03 mensajeVta = new Kcilvq03();

        //Datos espec�ficos del servicio

        int tamComIdaArq = AqCtes.TAM_CAB_ARQ_IDA;
        int tamComVtaArq = AqCtes.TAM_CAB_ARQ_VTA;

        int tamComIdaApl = 20;
        int tamComVtaApl = 3053;

        String transaccion = "KI54";

        setNuevaGeneracion(true);

        byte[] comIdaArq;
        byte[] comVtaArq = new byte[tamComVtaArq];
        byte[] comIdaApl = new byte[tamComIdaApl];
        byte[] comVtaApl = new byte[tamComVtaApl];

        try {

            /*******************************************************************
             * Establecemos el nombre del servicio
             ******************************************************************/

            setNoServicioCics(obtenerNombreServicio("KCILMQ03", mensajeIda));

            /*******************************************************************
             * Exit de Comunicaciones- Se llama al m�todo que permite no
             * realizar la llamada en caso de que le interese a la aplicaci�n.
             * Si se ha de ejecutar el servicio devuelve true.
             ******************************************************************/

            if (!exitInicio("listaAdicionales", mensajeIda, mensajeVta)) {
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
                envioAsincrono(mensajeIda, this, mensajeVta, "listaAdicionales");
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

            pos = setString(mensajeIda.getCriterio().getCdnumpol(), comIdaApl, pos, 14);
            pos = setInt(mensajeIda.getCriterio().getCtvrspol(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getCriterio().getInpzaci(), comIdaApl, pos, 1);
            pos = setShort(mensajeIda.getCdultreg().getNurelrep(), comIdaApl, pos, 2, 3, "S9(3)");

            /*******************************************************************
             * Realiza la llamada al mainframe
             ******************************************************************/

            enviar(comIdaArq, tamComIdaArq, comIdaApl, tamComIdaApl, comVtaArq, tamComVtaArq, comVtaApl, tamComVtaApl, mensajeIda.getCabeceraArquitectura().getCdusuari(), mensajeIda.getCabeceraArquitectura().getCdentorn(), transaccion);

            /*******************************************************************
             * Extraccion de los datos de vuelta
             ******************************************************************/

            // Obtenci�n de datos de Arquitectura
            leerCabecera(comVtaArq, mensajeVta);

            // Comprobaci�n transacci�n segura

            //    transaccionSegura(mensajeVta);

            pos = 0;

            mensajeVta.setNuocurre(conv.comp3ToShort(comVtaApl, pos, 2, 2, "S9(2)"));
            pos = pos + 2;
            mensajeVta.setInultpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            Kcim16t[] cdlisreg0 = mensajeVta.getCdlisreg();
            for (int i1 = 0; i1 < 10; i1++) {
                cdlisreg0[i1].setCdnumpol(getString(comVtaApl, pos, 14));
                pos = pos + 14;
                cdlisreg0[i1].setCtvrspol(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
                pos = pos + 3;
                cdlisreg0[i1].setNurelrep(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
                pos = pos + 2;
                cdlisreg0[i1].setCdprodte(getString(comVtaApl, pos, 10));
                pos = pos + 10;
                cdlisreg0[i1].setCdprodco(getString(comVtaApl, pos, 10));
                pos = pos + 10;
                cdlisreg0[i1].setInultsit(getString(comVtaApl, pos, 1));
                pos = pos + 1;
                cdlisreg0[i1].setFefinefe(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
                pos = pos + 5;
                cdlisreg0[i1].setFeeftomo(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
                pos = pos + 5;
                cdlisreg0[i1].setTxcaap01(getString(comVtaApl, pos, 45));
                pos = pos + 45;
                cdlisreg0[i1].setImcaap02(conv.comp3ToDoubleDec(comVtaApl, pos, 8, 12, 3, "S9(12)V9(3)"));
                pos = pos + 8;
                cdlisreg0[i1].setImcaap03(conv.comp3ToDoubleDec(comVtaApl, pos, 8, 12, 3, "S9(12)V9(3)"));
                pos = pos + 8;
                cdlisreg0[i1].setImcaap04(conv.comp3ToDoubleDec(comVtaApl, pos, 8, 12, 3, "S9(12)V9(3)"));
                pos = pos + 8;
                cdlisreg0[i1].setImcaap05(conv.comp3ToDoubleDec(comVtaApl, pos, 6, 8, 3, "S9(8)V9(3)"));
                pos = pos + 6;
                cdlisreg0[i1].setImcaap06(conv.comp3ToDoubleDec(comVtaApl, pos, 6, 8, 3, "S9(8)V9(3)"));
                pos = pos + 6;
                cdlisreg0[i1].setImcaap07(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
                pos = pos + 5;
                cdlisreg0[i1].setImcaap08(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
                pos = pos + 5;
                cdlisreg0[i1].setTxcaap09(getString(comVtaApl, pos, 6));
                pos = pos + 6;
                cdlisreg0[i1].setImcaap10(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
                pos = pos + 2;
                cdlisreg0[i1].setImcaap11(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
                pos = pos + 2;
                cdlisreg0[i1].setTxcaap12(getString(comVtaApl, pos, 2));
                pos = pos + 2;
                cdlisreg0[i1].setImcaap13(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
                pos = pos + 4;
                cdlisreg0[i1].setImcaap14(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
                pos = pos + 4;
                cdlisreg0[i1].setImcaap15(conv.comp3ToDoubleDec(comVtaApl, pos, 6, 5, 6, "S9(5)V9(6)"));
                pos = pos + 6;
                cdlisreg0[i1].setImcaap16(conv.comp3ToShort(comVtaApl, pos, 1, 1, "S9(1)"));
                pos = pos + 1;
                cdlisreg0[i1].setTxcaap17(getString(comVtaApl, pos, 1));
                pos = pos + 1;
                cdlisreg0[i1].setTxcaap18(getString(comVtaApl, pos, 1));
                pos = pos + 1;
                cdlisreg0[i1].setTxcaap19(getString(comVtaApl, pos, 1));
                pos = pos + 1;
                cdlisreg0[i1].setTxcaap20(getString(comVtaApl, pos, 80));
                pos = pos + 80;
                cdlisreg0[i1].setPocaap21(conv.comp3ToDoubleDec(comVtaApl, pos, 6, 5, 6, "S9(5)V9(6)"));
                pos = pos + 6;
                cdlisreg0[i1].setCdusuari(getString(comVtaApl, pos, 10));
                pos = pos + 10;
                cdlisreg0[i1].setCdempusu(getString(comVtaApl, pos, 4));
                pos = pos + 4;
                cdlisreg0[i1].setNoprogra(getString(comVtaApl, pos, 8));
                pos = pos + 8;
                cdlisreg0[i1].setTsultmod(getString(comVtaApl, pos, 26));
                pos = pos + 26;
            }

            /*******************************************************************
             * Fin de traza
             ******************************************************************/

            finTraza(mensajeVta);

            /*******************************************************************
             * Llamada a Fin de Exit de Comunicaciones
             ******************************************************************/

            exitFin("listaAdicionales", mensajeIda, mensajeVta);

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

    public Kcilvq02 mantenimiento(Kciliq02 mensajeIda) throws AqObjMensaje {
        /***********************************************************************
         * Posicionamiento de reloj
         **********************************************************************/

        mostrarReloj();

        /***********************************************************************
         * Declaraci�n de variables
         **********************************************************************/

        Kcilvq02 mensajeVta = new Kcilvq02();

        //Datos espec�ficos del servicio

        int tamComIdaArq = AqCtes.TAM_CAB_ARQ_IDA;
        int tamComVtaArq = AqCtes.TAM_CAB_ARQ_VTA;

        int tamComIdaApl = 971;
        int tamComVtaApl = 1357;

        String transaccion = "KI53";

        setNuevaGeneracion(true);

        byte[] comIdaArq;
        byte[] comVtaArq = new byte[tamComVtaArq];
        byte[] comIdaApl = new byte[tamComIdaApl];
        byte[] comVtaApl = new byte[tamComVtaApl];

        try {

            /*******************************************************************
             * Establecemos el nombre del servicio
             ******************************************************************/

            setNoServicioCics(obtenerNombreServicio("KCILMQ02", mensajeIda));

            /*******************************************************************
             * Exit de Comunicaciones- Se llama al m�todo que permite no
             * realizar la llamada en caso de que le interese a la aplicaci�n.
             * Si se ha de ejecutar el servicio devuelve true.
             ******************************************************************/

            if (!exitInicio("mantenimiento", mensajeIda, mensajeVta)) {
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
                envioAsincrono(mensajeIda, this, mensajeVta, "mantenimiento");
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

            pos = setString(mensajeIda.getIntarifi(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getInchkcec(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getCdnumpol(), comIdaApl, pos, 14);
            pos = setInt(mensajeIda.getDatos().getCtvrspol(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getDatos().getCdnumcon(), comIdaApl, pos, 5);
            pos = setShort(mensajeIda.getDatos().getNusuplem(), comIdaApl, pos, 3, 4, "S9(4)");

            pos = setString(mensajeIda.getDatos().getInultsit(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInblopol(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getCdprodte(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getCdprodco(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getCdcanald(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getTccodtar(), comIdaApl, pos, 5);

            pos = setString(mensajeIda.getDatos().getTcforcon(), comIdaApl, pos, 3);
            pos = setInt(mensajeIda.getDatos().getCdnivdiv(), comIdaApl, pos, 3, 5, "S9(5)");
            pos = setInt(mensajeIda.getDatos().getCdnivsub(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getDatos().getCdestruc(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatos().getCdestrug(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatos().getClgesti(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatos().getClgesun(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getClproti(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatos().getClproun(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getCdestruo(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatos().getClopeti(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatos().getClopeun(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getCdsuscri(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getTccopofi(), comIdaApl, pos, 5);

            pos = setString(mensajeIda.getDatos().getTcpropol(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getCdcodcam(), comIdaApl, pos, 5);

            pos = setString(mensajeIda.getDatos().getNuprocof(), comIdaApl, pos, 14);

            pos = setString(mensajeIda.getDatos().getTctimovp(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTcmomovp(), comIdaApl, pos, 3);

            pos = setString(mensajeIda.getDatos().getDucontra(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getEspoliza(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInanulfp(), comIdaApl, pos, 1);
            pos = setInt(mensajeIda.getDatos().getFeanulfp(), comIdaApl, pos, 5, 8, "S9(8)");

            pos = setString(mensajeIda.getDatos().getTcmocaes(), comIdaApl, pos, 3);
            pos = setInt(mensajeIda.getDatos().getFecamest(), comIdaApl, pos, 5, 8, "S9(8)");

            pos = setString(mensajeIda.getDatos().getInemrepo(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInavsvto(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getIngereci(), comIdaApl, pos, 1);
            pos = setShort(mensajeIda.getDatos().getNuduprec(), comIdaApl, pos, 2, 3, "S9(3)");

            pos = setString(mensajeIda.getDatos().getInnivelr(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInnivdre(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTiconesp(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTcforpag(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTcfopasu(), comIdaApl, pos, 1);
            pos = setInt(mensajeIda.getDatos().getHoeftini(), comIdaApl, pos, 4, 6, "S9(6)");
            pos = setInt(mensajeIda.getDatos().getFeinipol(), comIdaApl, pos, 5, 8, "S9(8)");
            pos = setInt(mensajeIda.getDatos().getFeeftona(), comIdaApl, pos, 5, 8, "S9(8)");
            pos = setInt(mensajeIda.getDatos().getFeeftomo(), comIdaApl, pos, 5, 8, "S9(8)");
            pos = setInt(mensajeIda.getDatos().getFevencim(), comIdaApl, pos, 5, 8, "S9(8)");
            pos = setInt(mensajeIda.getDatos().getFefinefe(), comIdaApl, pos, 5, 8, "S9(8)");
            pos = setInt(mensajeIda.getDatos().getFemision(), comIdaApl, pos, 5, 8, "S9(8)");
            pos = setInt(mensajeIda.getDatos().getFeultstr(), comIdaApl, pos, 5, 8, "S9(8)");

            pos = setString(mensajeIda.getDatos().getInfrereg(), comIdaApl, pos, 1);
            pos = setInt(mensajeIda.getDatos().getFeregupo(), comIdaApl, pos, 5, 8, "S9(8)");

            pos = setString(mensajeIda.getDatos().getInexobse(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInimpmal(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTcinfisc(), comIdaApl, pos, 1);
            pos = setShort(mensajeIda.getDatos().getInancaco(), comIdaApl, pos, 2, 2, "S9(2)");

            pos = setString(mensajeIda.getDatos().getIntipbas(), comIdaApl, pos, 2);
            pos = setFloat(mensajeIda.getDatos().getPocescom(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");

            pos = setString(mensajeIda.getDatos().getInticoas(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInrecuni(), comIdaApl, pos, 1);
            pos = setFloat(mensajeIda.getDatos().getPocoaseg(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");

            pos = setString(mensajeIda.getDatos().getInreaace(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTcintipe(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getClfiltom(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getClsectom(), comIdaApl, pos, 3);

            pos = setString(mensajeIda.getDatos().getTcniftom(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTcdoctom(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getCdniftom(), comIdaApl, pos, 20);

            pos = setString(mensajeIda.getDatos().getNotompol(), comIdaApl, pos, 40);

            pos = setString(mensajeIda.getDatos().getNotomp01(), comIdaApl, pos, 30);

            pos = setString(mensajeIda.getDatos().getNotomp02(), comIdaApl, pos, 30);

            pos = setString(mensajeIda.getDatos().getTcviatom(), comIdaApl, pos, 2);

            pos = setString(mensajeIda.getDatos().getNodirtom(), comIdaApl, pos, 40);

            pos = setString(mensajeIda.getDatos().getNudirtom(), comIdaApl, pos, 9);

            pos = setString(mensajeIda.getDatos().getClaccadt(), comIdaApl, pos, 35);

            pos = setString(mensajeIda.getDatos().getNopobtom(), comIdaApl, pos, 35);

            pos = setString(mensajeIda.getDatos().getNoprotom(), comIdaApl, pos, 35);

            pos = setString(mensajeIda.getDatos().getTcpobtom(), comIdaApl, pos, 11);

            pos = setString(mensajeIda.getDatos().getTccoptom(), comIdaApl, pos, 5);

            pos = setString(mensajeIda.getDatos().getTcpastom(), comIdaApl, pos, 3);

            pos = setString(mensajeIda.getDatos().getIntarzur(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getClfilpag(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getClsecpag(), comIdaApl, pos, 3);

            pos = setString(mensajeIda.getDatos().getTccoppag(), comIdaApl, pos, 5);

            pos = setString(mensajeIda.getDatos().getTctipcom(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTccanco1(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getTccancos(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getTccdmone(), comIdaApl, pos, 3);

            pos = setString(mensajeIda.getDatos().getCdtipcam(), comIdaApl, pos, 1);
            pos = setInt(mensajeIda.getDatos().getFecambio(), comIdaApl, pos, 5, 8, "S9(8)");

            pos = setString(mensajeIda.getDatos().getInidioma(), comIdaApl, pos, 2);

            pos = setString(mensajeIda.getDatos().getIntipref(), comIdaApl, pos, 1);
            pos = setFloat(mensajeIda.getDatos().getPorevalz(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");
            pos = setDouble(mensajeIda.getDatos().getImminrec(), comIdaApl, pos, 8, 12, 3, "S9(12)V9(3)");
            pos = setInt(mensajeIda.getDatos().getCtvrsant(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getDatos().getIngenext(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getIngendoc(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getCdintcec(), comIdaApl, pos, 14);

            pos = setString(mensajeIda.getDatos().getIncecpac(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTccdsbu(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatos().getCdciagru(), comIdaApl, pos, 2);

            pos = setString(mensajeIda.getDatos().getTcsegmen(), comIdaApl, pos, 2);

            pos = setString(mensajeIda.getDatos().getInregula(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInreaced(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInrefacu(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInvenmas(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInrencar(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInpolpad(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getCdpolpad(), comIdaApl, pos, 14);
            pos = setInt(mensajeIda.getDatos().getCtvrspad(), comIdaApl, pos, 3, 5, "S9(5)");
            pos = setInt(mensajeIda.getDatos().getCtvrsagr(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getDatos().getClrefcar(), comIdaApl, pos, 15);

            pos = setString(mensajeIda.getDatos().getClrefere(), comIdaApl, pos, 20);

            pos = setString(mensajeIda.getDatos().getClreflib(), comIdaApl, pos, 20);

            pos = setString(mensajeIda.getDatos().getInpolflo(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getInpolpai(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getClnumfol(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getInfrarec(), comIdaApl, pos, 1);
            pos = setShort(mensajeIda.getDatos().getNufrapri(), comIdaApl, pos, 2, 3, "S9(3)");

            pos = setString(mensajeIda.getDatos().getInficpag(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getIndivide(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatos().getTcforpad(), comIdaApl, pos, 1);
            pos = setFloat(mensajeIda.getDatos().getPofacdiv(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");
            pos = setFloat(mensajeIda.getDatos().getPofacpri(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");
            pos = setFloat(mensajeIda.getDatos().getPofaccom(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");
            pos = setFloat(mensajeIda.getDatos().getPofacsin(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");
            pos = setFloat(mensajeIda.getDatos().getPofacgia(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");

            pos = setString(mensajeIda.getDatos().getCdconsac(), comIdaApl, pos, 10);
            pos = setInt(mensajeIda.getDatos().getCtvrssac(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getDatos().getTcubient(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatos().getTctipord(), comIdaApl, pos, 2);
            pos = setShort(mensajeIda.getDatos().getTcnumcop(), comIdaApl, pos, 2, 3, "S9(3)");

            pos = setString(mensajeIda.getDatos().getCdusuari(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatos().getCdempusu(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatos().getNoprogra(), comIdaApl, pos, 8);

            pos = setString(mensajeIda.getDatos().getTsultmod(), comIdaApl, pos, 26);

            pos = setString(mensajeIda.getDatadici().getCdsecdom(), comIdaApl, pos, 3);

            pos = setString(mensajeIda.getDatgesco().getGescomsn(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatgesco().getCdestcmp(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatgesco().getCdtunctr(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatgesco().getCdunictr(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatgesco().getCdtunrol(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatgesco().getCdunirol(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatinter().getDatinter().getCdnumpol(), comIdaApl, pos, 14);
            pos = setInt(mensajeIda.getDatinter().getDatinter().getCtvrspol(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getDatinter().getDatinter().getCdinterm(), comIdaApl, pos, 10);
            pos = setInt(mensajeIda.getDatinter().getDatinter().getCtsecint(), comIdaApl, pos, 3, 5, "S9(5)");

            pos = setString(mensajeIda.getDatinter().getDatinter().getTccsinte(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatinter().getDatinter().getTccdfunc(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatinter().getDatinter().getEsinterm(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatinter().getDatinter().getCdestruc(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatinter().getDatinter().getCdtiphij(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatinter().getDatinter().getCdunihij(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatinter().getDatinter().getInprifun(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatinter().getDatinter().getIntipbas(), comIdaApl, pos, 2);
            pos = setFloat(mensajeIda.getDatinter().getDatinter().getPoparpol(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");
            pos = setFloat(mensajeIda.getDatinter().getDatinter().getPocescom(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");
            pos = setFloat(mensajeIda.getDatinter().getDatinter().getPoparcom(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");

            pos = setString(mensajeIda.getDatinter().getDatinter().getCdgerzon(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatinter().getDatinter().getNuflanum(), comIdaApl, pos, 8);

            pos = setString(mensajeIda.getDatinter().getDatinter().getCdoperac(), comIdaApl, pos, 2);

            pos = setString(mensajeIda.getDatinter().getDatinter().getTctipcom(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatinter().getDatinter().getInafnal(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatinter().getIntipoop(), comIdaApl, pos, 1);

            /*******************************************************************
             * Realiza la llamada al mainframe
             ******************************************************************/

            enviar(comIdaArq, tamComIdaArq, comIdaApl, tamComIdaApl, comVtaArq, tamComVtaArq, comVtaApl, tamComVtaApl, mensajeIda.getCabeceraArquitectura().getCdusuari(), mensajeIda.getCabeceraArquitectura().getCdentorn(), transaccion);

            /*******************************************************************
             * Extraccion de los datos de vuelta
             ******************************************************************/

            // Obtenci�n de datos de Arquitectura
            leerCabecera(comVtaArq, mensajeVta);

            // Comprobaci�n transacci�n segura

            //    transaccionSegura(mensajeVta);

            pos = 0;

            Kcirvinc[] multierr0 = mensajeVta.getMultierr();
            for (int i1 = 0; i1 < 25; i1++) {
                multierr0[i1].setCderror(conv.comp3ToShort(comVtaApl, pos, 3, 4, "S9(4)"));
                pos = pos + 3;
                multierr0[i1].setCdaplic(getString(comVtaApl, pos, 2));
                pos = pos + 2;
                multierr0[i1].setDsarg1(getString(comVtaApl, pos, 16));
                pos = pos + 16;
                multierr0[i1].setDsarg2(getString(comVtaApl, pos, 16));
                pos = pos + 16;
                multierr0[i1].setDsarg3(getString(comVtaApl, pos, 16));
                pos = pos + 16;
            }
            mensajeVta.setNuobjvig(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            mensajeVta.setNuobjpen(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            mensajeVta.setNuobjanu(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            mensajeVta.setTsultmod(getString(comVtaApl, pos, 26));
            pos = pos + 26;

            /*******************************************************************
             * Fin de traza
             ******************************************************************/

            finTraza(mensajeVta);

            /*******************************************************************
             * Llamada a Fin de Exit de Comunicaciones
             ******************************************************************/

            exitFin("mantenimiento", mensajeIda, mensajeVta);

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

    public Kcilvq04 mtoAdicional(Kciliq04 mensajeIda) throws AqObjMensaje {
        /***********************************************************************
         * Posicionamiento de reloj
         **********************************************************************/

        mostrarReloj();

        /***********************************************************************
         * Declaraci�n de variables
         **********************************************************************/

        Kcilvq04 mensajeVta = new Kcilvq04();

        //Datos espec�ficos del servicio

        int tamComIdaArq = AqCtes.TAM_CAB_ARQ_IDA;
        int tamComVtaArq = AqCtes.TAM_CAB_ARQ_VTA;

        int tamComIdaApl = 3086;
        int tamComVtaApl = 1325;

        String transaccion = "KI55";

        setNuevaGeneracion(true);

        byte[] comIdaArq;
        byte[] comVtaArq = new byte[tamComVtaArq];
        byte[] comIdaApl = new byte[tamComIdaApl];
        byte[] comVtaApl = new byte[tamComVtaApl];

        try {

            /*******************************************************************
             * Establecemos el nombre del servicio
             ******************************************************************/

            setNoServicioCics(obtenerNombreServicio("KCILMQ04", mensajeIda));

            /*******************************************************************
             * Exit de Comunicaciones- Se llama al m�todo que permite no
             * realizar la llamada en caso de que le interese a la aplicaci�n.
             * Si se ha de ejecutar el servicio devuelve true.
             ******************************************************************/

            if (!exitInicio("mtoAdicional", mensajeIda, mensajeVta)) {
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
                envioAsincrono(mensajeIda, this, mensajeVta, "mtoAdicional");
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

            pos = setShort(mensajeIda.getNuocurre(), comIdaApl, pos, 2, 2, "S9(2)");

            pos = setString(mensajeIda.getInultpag(), comIdaApl, pos, 1);
            Kcim52t[] cdlisreg0 = mensajeIda.getCdlisreg();
            for (int i1 = 0; i1 < 10; i1++) {
                pos = setString(cdlisreg0[i1].getCdnumpol(), comIdaApl, pos, 14);

                pos = setInt(cdlisreg0[i1].getCtvrspol(), comIdaApl, pos, 3, 5, "S9(5)");

                pos = setShort(cdlisreg0[i1].getNurelrep(), comIdaApl, pos, 2, 3, "S9(3)");

                pos = setString(cdlisreg0[i1].getCdprodte(), comIdaApl, pos, 10);

                pos = setString(cdlisreg0[i1].getCdprodco(), comIdaApl, pos, 10);

                pos = setString(cdlisreg0[i1].getInultsit(), comIdaApl, pos, 1);

                pos = setInt(cdlisreg0[i1].getFefinefe(), comIdaApl, pos, 5, 8, "S9(8)");

                pos = setInt(cdlisreg0[i1].getFeeftomo(), comIdaApl, pos, 5, 8, "S9(8)");

                pos = setString(cdlisreg0[i1].getTxcaap01(), comIdaApl, pos, 45);

                pos = setDouble(cdlisreg0[i1].getImcaap02(), comIdaApl, pos, 8, 12, 3, "S9(12)V9(3)");

                pos = setDouble(cdlisreg0[i1].getImcaap03(), comIdaApl, pos, 8, 12, 3, "S9(12)V9(3)");

                pos = setDouble(cdlisreg0[i1].getImcaap04(), comIdaApl, pos, 8, 12, 3, "S9(12)V9(3)");

                pos = setDouble(cdlisreg0[i1].getImcaap05(), comIdaApl, pos, 6, 8, 3, "S9(8)V9(3)");

                pos = setDouble(cdlisreg0[i1].getImcaap06(), comIdaApl, pos, 6, 8, 3, "S9(8)V9(3)");

                pos = setInt(cdlisreg0[i1].getImcaap07(), comIdaApl, pos, 5, 8, "S9(8)");

                pos = setInt(cdlisreg0[i1].getImcaap08(), comIdaApl, pos, 5, 8, "S9(8)");

                pos = setString(cdlisreg0[i1].getTxcaap09(), comIdaApl, pos, 6);

                pos = setShort(cdlisreg0[i1].getImcaap10(), comIdaApl, pos, 2, 3, "S9(3)");

                pos = setShort(cdlisreg0[i1].getImcaap11(), comIdaApl, pos, 2, 3, "S9(3)");

                pos = setString(cdlisreg0[i1].getTxcaap12(), comIdaApl, pos, 2);

                pos = setFloat(cdlisreg0[i1].getImcaap13(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");

                pos = setFloat(cdlisreg0[i1].getImcaap14(), comIdaApl, pos, 4, 1, 6, "S9(1)V9(6)");

                pos = setDouble(cdlisreg0[i1].getImcaap15(), comIdaApl, pos, 6, 5, 6, "S9(5)V9(6)");

                pos = setShort(cdlisreg0[i1].getImcaap16(), comIdaApl, pos, 1, 1, "S9(1)");

                pos = setString(cdlisreg0[i1].getTxcaap17(), comIdaApl, pos, 1);

                pos = setString(cdlisreg0[i1].getTxcaap18(), comIdaApl, pos, 1);

                pos = setString(cdlisreg0[i1].getTxcaap19(), comIdaApl, pos, 1);

                pos = setString(cdlisreg0[i1].getTxcaap20(), comIdaApl, pos, 80);

                pos = setDouble(cdlisreg0[i1].getPocaap21(), comIdaApl, pos, 6, 5, 6, "S9(5)V9(6)");

                pos = setString(cdlisreg0[i1].getCdusuari(), comIdaApl, pos, 10);

                pos = setString(cdlisreg0[i1].getCdempusu(), comIdaApl, pos, 4);

                pos = setString(cdlisreg0[i1].getNoprogra(), comIdaApl, pos, 8);

                pos = setString(cdlisreg0[i1].getTsultmod(), comIdaApl, pos, 26);

            }

            pos = setString(mensajeIda.getDatgesco().getGescomsn(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDatgesco().getCdestcmp(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatgesco().getCdtunctr(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatgesco().getCdunictr(), comIdaApl, pos, 10);

            pos = setString(mensajeIda.getDatgesco().getCdtunrol(), comIdaApl, pos, 4);

            pos = setString(mensajeIda.getDatgesco().getCdunirol(), comIdaApl, pos, 10);

            /*******************************************************************
             * Realiza la llamada al mainframe
             ******************************************************************/

            enviar(comIdaArq, tamComIdaArq, comIdaApl, tamComIdaApl, comVtaArq, tamComVtaArq, comVtaApl, tamComVtaApl, mensajeIda.getCabeceraArquitectura().getCdusuari(), mensajeIda.getCabeceraArquitectura().getCdentorn(), transaccion);

            /*******************************************************************
             * Extraccion de los datos de vuelta
             ******************************************************************/

            // Obtenci�n de datos de Arquitectura
            leerCabecera(comVtaArq, mensajeVta);

            // Comprobaci�n transacci�n segura

            //    transaccionSegura(mensajeVta);

            pos = 0;

            Kcirvinc[] multierr1 = mensajeVta.getMultierr();
            for (int i1 = 0; i1 < 25; i1++) {
                multierr1[i1].setCderror(conv.comp3ToShort(comVtaApl, pos, 3, 4, "S9(4)"));
                pos = pos + 3;
                multierr1[i1].setCdaplic(getString(comVtaApl, pos, 2));
                pos = pos + 2;
                multierr1[i1].setDsarg1(getString(comVtaApl, pos, 16));
                pos = pos + 16;
                multierr1[i1].setDsarg2(getString(comVtaApl, pos, 16));
                pos = pos + 16;
                multierr1[i1].setDsarg3(getString(comVtaApl, pos, 16));
                pos = pos + 16;
            }

            /*******************************************************************
             * Fin de traza
             ******************************************************************/

            finTraza(mensajeVta);

            /*******************************************************************
             * Llamada a Fin de Exit de Comunicaciones
             ******************************************************************/

            exitFin("mtoAdicional", mensajeIda, mensajeVta);

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

    public Kcilvq07 suplemento(Kciliq07 mensajeIda) throws AqObjMensaje {
        /***********************************************************************
         * Posicionamiento de reloj
         **********************************************************************/

        mostrarReloj();

        /***********************************************************************
         * Declaraci�n de variables
         **********************************************************************/

        Kcilvq07 mensajeVta = new Kcilvq07();

        //Datos espec�ficos del servicio

        int tamComIdaArq = AqCtes.TAM_CAB_ARQ_IDA;
        int tamComVtaArq = AqCtes.TAM_CAB_ARQ_VTA;

        int tamComIdaApl = 296;
        int tamComVtaApl = 2104;

        String transaccion = "KI59";

        setNuevaGeneracion(true);

        byte[] comIdaArq;
        byte[] comVtaArq = new byte[tamComVtaArq];
        byte[] comIdaApl = new byte[tamComIdaApl];
        byte[] comVtaApl = new byte[tamComVtaApl];

        try {

            /*******************************************************************
             * Establecemos el nombre del servicio
             ******************************************************************/

            setNoServicioCics(obtenerNombreServicio("KCILMQ07", mensajeIda));

            /*******************************************************************
             * Exit de Comunicaciones- Se llama al m�todo que permite no
             * realizar la llamada en caso de que le interese a la aplicaci�n.
             * Si se ha de ejecutar el servicio devuelve true.
             ******************************************************************/

            if (!exitInicio("suplemento", mensajeIda, mensajeVta)) {
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
                envioAsincrono(mensajeIda, this, mensajeVta, "suplemento");
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

            pos = setString(mensajeIda.getTctimovp(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getCdnumpol(), comIdaApl, pos, 14);
            pos = setInt(mensajeIda.getCtvrspol(), comIdaApl, pos, 3, 5, "S9(5)");
            pos = setInt(mensajeIda.getFeeftomo(), comIdaApl, pos, 5, 8, "S9(8)");
            pos = setInt(mensajeIda.getFefinefe(), comIdaApl, pos, 5, 8, "S9(8)");
            pos = setInt(mensajeIda.getFevencim(), comIdaApl, pos, 5, 8, "S9(8)");

            pos = setString(mensajeIda.getEspoliza(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getTcmomovp(), comIdaApl, pos, 3);

            pos = setString(mensajeIda.getIngenext(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getIngendoc(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getInnivval(), comIdaApl, pos, 1);

            pos = setString(mensajeIda.getDsobssup(), comIdaApl, pos, 256);

            /*******************************************************************
             * Realiza la llamada al mainframe
             ******************************************************************/

            enviar(comIdaArq, tamComIdaArq, comIdaApl, tamComIdaApl, comVtaArq, tamComVtaArq, comVtaApl, tamComVtaApl, mensajeIda.getCabeceraArquitectura().getCdusuari(), mensajeIda.getCabeceraArquitectura().getCdentorn(), transaccion);

            /*******************************************************************
             * Extraccion de los datos de vuelta
             ******************************************************************/

            // Obtenci�n de datos de Arquitectura
            leerCabecera(comVtaArq, mensajeVta);

            // Comprobaci�n transacci�n segura

            //    transaccionSegura(mensajeVta);

            pos = 0;

            Kcim06t datpoli = mensajeVta.getDatpoli();
            datpoli.setCdnumpol(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setCtvrspol(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCdnumcon(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setNusuplem(conv.comp3ToShort(comVtaApl, pos, 3, 4, "S9(4)"));
            pos = pos + 3;
            datpoli.setInultsit(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInblopol(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdprodte(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdprodco(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdcanald(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccodtar(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTcforcon(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setCdnivdiv(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCdnivsub(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCdestruc(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setCdestrug(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClgesti(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClgesun(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setClproti(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClproun(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdestruo(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClopeti(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setClopeun(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdsuscri(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccopofi(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTcpropol(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdcodcam(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setNuprocof(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setTctimovp(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcmomovp(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setDucontra(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setEspoliza(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInanulfp(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setFeanulfp(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setTcmocaes(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setFecamest(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInemrepo(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInavsvto(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setIngereci(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setNuduprec(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            datpoli.setInnivelr(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInnivdre(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTiconesp(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcforpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcfopasu(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setHoeftini(conv.comp3ToInt(comVtaApl, pos, 4, 6, "S9(6)"));
            pos = pos + 4;
            datpoli.setFeinipol(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFeeftona(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFeeftomo(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFevencim(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFefinefe(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFemision(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setFeultstr(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInfrereg(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setFeregupo(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInexobse(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInimpmal(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcinfisc(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInancaco(conv.comp3ToShort(comVtaApl, pos, 2, 2, "S9(2)"));
            pos = pos + 2;
            datpoli.setIntipbas(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setPocescom(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setInticoas(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInrecuni(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setPocoaseg(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setInreaace(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcintipe(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setClfiltom(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setClsectom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setTcniftom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcdoctom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdniftom(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            datpoli.setNotompol(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            datpoli.setNotomp01(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            datpoli.setNotomp02(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            datpoli.setTcviatom(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setNodirtom(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            datpoli.setNudirtom(getString(comVtaApl, pos, 9));
            pos = pos + 9;
            datpoli.setClaccadt(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            datpoli.setNopobtom(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            datpoli.setNoprotom(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            datpoli.setTcpobtom(getString(comVtaApl, pos, 11));
            pos = pos + 11;
            datpoli.setTccoptom(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTcpastom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setIntarzur(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setClfilpag(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setClsecpag(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setTccoppag(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            datpoli.setTctipcom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTccanco1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccancos(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setTccdmone(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            datpoli.setCdtipcam(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setFecambio(conv.comp3ToInt(comVtaApl, pos, 5, 8, "S9(8)"));
            pos = pos + 5;
            datpoli.setInidioma(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setIntipref(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setPorevalz(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setImminrec(conv.comp3ToDoubleDec(comVtaApl, pos, 8, 12, 3, "S9(12)V9(3)"));
            pos = pos + 8;
            datpoli.setCtvrsant(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setIngenext(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setIngendoc(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdintcec(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setIncecpac(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTccdsbu(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setCdciagru(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setTcsegmen(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setInregula(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInreaced(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInrefacu(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInvenmas(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInrencar(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInpolpad(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setCdpolpad(getString(comVtaApl, pos, 14));
            pos = pos + 14;
            datpoli.setCtvrspad(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setCtvrsagr(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setClrefcar(getString(comVtaApl, pos, 15));
            pos = pos + 15;
            datpoli.setClrefere(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            datpoli.setClreflib(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            datpoli.setInpolflo(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setInpolpai(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setClnumfol(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setInfrarec(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setNufrapri(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            datpoli.setInficpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setIndivide(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setTcforpad(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            datpoli.setPofacdiv(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofacpri(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofaccom(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofacsin(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setPofacgia(conv.comp3ToFloatDec(comVtaApl, pos, 4, 1, 6, "S9(1)V9(6)"));
            pos = pos + 4;
            datpoli.setCdconsac(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCtvrssac(conv.comp3ToInt(comVtaApl, pos, 3, 5, "S9(5)"));
            pos = pos + 3;
            datpoli.setTcubient(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setTctipord(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            datpoli.setTcnumcop(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            datpoli.setCdusuari(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            datpoli.setCdempusu(getString(comVtaApl, pos, 4));
            pos = pos + 4;
            datpoli.setNoprogra(getString(comVtaApl, pos, 8));
            pos = pos + 8;
            datpoli.setTsultmod(getString(comVtaApl, pos, 26));
            pos = pos + 26;
            Kcirmq01 mediador = mensajeVta.getMediador();
            mediador.setDscanald(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            Kciroq01 descofic = mensajeVta.getDescofic();
            descofic.setDstippdt(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDspdtora(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDstipgst(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDsgstora(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            descofic.setDsestruc(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            Kcirdq01 descdivi = mensajeVta.getDescdivi();
            descdivi.setDsnivdiv(getString(comVtaApl, pos, 100));
            pos = pos + 100;
            descdivi.setDsnivsub(getString(comVtaApl, pos, 100));
            pos = pos + 100;
            Kcirpq01 descprod = mensajeVta.getDescprod();
            descprod.setNoproduc(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            Kcirtq01 tomador = mensajeVta.getTomador();
            tomador.setTcinclie(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            tomador.setNocomdom(getString(comVtaApl, pos, 60));
            pos = pos + 60;
            gnp.pe.ModeloDatos.Kpergico teleftom = tomador.getTeleftom();
            teleftom.setTcticom1(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            teleftom.setTcprepa1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            teleftom.setNutelf1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            teleftom.setNuextel1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            teleftom.setNuprecl1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            teleftom.setNuprecd1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            Kcirgq01 pagador = mensajeVta.getPagador();
            pagador.setTcpefiju(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            pagador.setTcdocpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            pagador.setCdidfisc(getString(comVtaApl, pos, 20));
            pos = pos + 20;
            pagador.setDnap1rzs(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            pagador.setDnap2rzs(getString(comVtaApl, pos, 30));
            pos = pos + 30;
            pagador.setDnnomrzs(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            pagador.setTcinclie(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            pagador.setCdsecdom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            pagador.setNocomdom(getString(comVtaApl, pos, 60));
            pos = pos + 60;
            gnp.pe.ModeloDatos.Kpergico telefpag = (gnp.pe.ModeloDatos.Kpergico) pagador.getTelefpag();
            telefpag.setTcticom1(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            telefpag.setTcprepa1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            telefpag.setNutelf1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            telefpag.setNuextel1(getString(comVtaApl, pos, 10));
            pos = pos + 10;
            telefpag.setNuprecl1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            telefpag.setNuprecd1(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            gnp.pe.ModeloDatos.Kpergido domicpag = (gnp.pe.ModeloDatos.Kpergido) pagador.getDomicpag();
            domicpag.setTctipvia(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            domicpag.setNovidici(getString(comVtaApl, pos, 40));
            pos = pos + 40;
            domicpag.setNuvia(getString(comVtaApl, pos, 9));
            pos = pos + 9;
            domicpag.setTxinfadi(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            domicpag.setNopobl(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            domicpag.setTccopine(getString(comVtaApl, pos, 11));
            pos = pos + 11;
            domicpag.setNoprovin(getString(comVtaApl, pos, 35));
            pos = pos + 35;
            domicpag.setTccopost(getString(comVtaApl, pos, 5));
            pos = pos + 5;
            domicpag.setTccopais(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            gnp.pe.ModeloDatos.Kpergico[] estidtel0 = domicpag.getEstidtel();
            for (int i1 = 0; i1 < 3; i1++) {
                estidtel0[i1].setTcticom1(getString(comVtaApl, pos, 2));
                pos = pos + 2;
                estidtel0[i1].setTcprepa1(getString(comVtaApl, pos, 3));
                pos = pos + 3;
                estidtel0[i1].setNutelf1(getString(comVtaApl, pos, 10));
                pos = pos + 10;
                estidtel0[i1].setNuextel1(getString(comVtaApl, pos, 10));
                pos = pos + 10;
                estidtel0[i1].setNuprecl1(getString(comVtaApl, pos, 3));
                pos = pos + 3;
                estidtel0[i1].setNuprecd1(getString(comVtaApl, pos, 3));
                pos = pos + 3;
            }
            domicpag.setNummet2(conv.comp3ToInt(comVtaApl, pos, 4, 7, "S9(7)"));
            pos = pos + 4;
            domicpag.setIndopral(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setTccopert(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setNopercon(getString(comVtaApl, pos, 50));
            pos = pos + 50;
            domicpag.setIndidiom(getString(comVtaApl, pos, 2));
            pos = pos + 2;
            domicpag.setCdsecdom(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            domicpag.setTctipdom(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setTccldomi(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setTctiasen(getString(comVtaApl, pos, 3));
            pos = pos + 3;
            domicpag.setTxasient(getString(comVtaApl, pos, 80));
            pos = pos + 80;
            domicpag.setCdzonsmm(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            domicpag.setNuinteri(getString(comVtaApl, pos, 9));
            pos = pos + 9;
            pagador.setInmulpag(getString(comVtaApl, pos, 1));
            pos = pos + 1;
            Kcirnq01 inpoliza = mensajeVta.getInpoliza();
            inpoliza.setNuobjvig(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            inpoliza.setNuobjpen(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;
            inpoliza.setNuobjanu(conv.comp3ToShort(comVtaApl, pos, 2, 3, "S9(3)"));
            pos = pos + 2;

            /*******************************************************************
             * Fin de traza
             ******************************************************************/

            finTraza(mensajeVta);

            /*******************************************************************
             * Llamada a Fin de Exit de Comunicaciones
             ******************************************************************/

            exitFin("suplemento", mensajeIda, mensajeVta);

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