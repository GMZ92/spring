package com.springproyectodos.business;

/**
 * Clase JavaLanguage
 *
 * @author Netasystems / Gonzalo
 * @version 1.0.0 Fecha 05/09/2018
 *
 */
public class JavaLanguage implements Languaje{
	
	/**
	 * Metodo descripción
	 */
	public String descripcion() {
		return "PHP";
	}

	/** 
	 * Metodo Version
	 */
	@Override
	public String version() {
		
		return "version 1";
	}
	
	
	
}
