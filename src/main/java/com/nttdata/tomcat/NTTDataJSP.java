package com.nttdata.tomcat;

/**
 * Primer JSP
 * 
 * @author Christian
 *
 */
public class NTTDataJSP {

	/**
	 * Constructor por defecto
	 */
	public NTTDataJSP() {

	}

	/**
	 * Saludo mediante JSP
	 * 
	 * @param msg
	 * @return
	 */
	public static String helloNTTDataDual(final String msg) {
		return "Bienvenido Tellez " + msg;
	}
}
