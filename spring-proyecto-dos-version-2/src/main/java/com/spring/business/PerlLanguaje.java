package com.spring.business;

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
     * Variable version lenguaje
     */
    private String versionLenguaje;


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

	
	

	/**
	 * Valor a obtener
	 * @return El valor versionLenguaje
	 */
	public String getVersionLenguaje() {
		return versionLenguaje;
	}


	/**
	 * Valor asignar
	 * @param versionLenguaje La versionLenguaje asignar
	 */
	public void setVersionLenguaje(String versionLenguaje) {
		this.versionLenguaje = versionLenguaje;
	}


	public String descripcion() {
        return descriptionLanguage;
    }


	@Override
	public String version() {
		
		return versionLenguaje;
	}
    
}
