package com.springproyectodos.business;

/**
 * Clase PerlLanguaje
 *
 * @author Netasystems / Gonzalo
 * @version 1.0.0 Fecha 05/09/2018
 *
 */
public class PerlLanguaje implements Languaje{

    /**
     * Variable String descripcion Lenguaje
     */
    private String descriptionLanguage;


	/**
	 * Valor a obtener
	 * @return El valor descriptionLanguage
	 */
	public String getDescriptionLanguage() {
		return descriptionLanguage;
	}


	/**
	 * Valor asignar
	 * @param descriptionLanguage La descriptionLanguage asignar
	 */
	public void setDescriptionLanguage(String descriptionLanguage) {
		this.descriptionLanguage = descriptionLanguage;
	}


	public String descripcion() {
        return descriptionLanguage;
    }
    
}
