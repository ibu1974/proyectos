package mx.com.gnp.demo.util;



/**
 * 
 * @author RBH
 *
 */
public final class Constantes {
	 /** 
	 * Constructor Constantes.
	 * 
	 */
	private Constantes() {
		
	}
	/**
	 * Estatus HTTP Exitoso.
	 * 
	 */
	public static final int EXITOSO = 201;

	/**
	 * Estatus HTTP Exitoso.
	 * 
	 */
	public static final int ERROR_SERVER = 500;
	
	/**
	 * Estatus HTTP Bad request.
	 * 
	 */
	public static final int BAD_REQUEST = 400;
	
	/**
	 * tamanio del campo.
	 * 
	 */
	public static final int SIZE_3 = 3;
	
	/**
	 * tamanio de elementos adicionales.
	 * 
	 */
	public static final int SIZE_ELEMADIC = 90;
	/**
	 * tamanio del objeto asegurado.
	 * 
	 */
	public static final int SIZE_OBJASEG = 150;
	/**
	 * tamanio de las coberturas.
	 * 
	 */
	public static final int SIZE_COB = 110;
	/**
	 * codigo error negocio.
	 * 
	 */
	public static final int ERROR_NEGOCIO = 3333;	
	/**
	 * usuario de conexion info.
	 * 
	 */
	public static final String USER_INFO = "#{environment['ENV_USER_INFO']}";
	/**
	 * pass de conexion info.
	 * 
	 */
	public static final String PASS_INFO = "#{environment['ENV_PASS_INFO']}";
	/**
	 * ambiente info.
	 * 
	 */
	public static final String AMBIENTE_INFO = "#{environment['ENV_AMBIENTE_INFO']}";


}
